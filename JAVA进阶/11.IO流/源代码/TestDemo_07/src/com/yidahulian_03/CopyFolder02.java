package com.yidahulian_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：复制指定目录下的指定文件，并修改后缀名。
 * 
 * 指定的文件是：.java文件。
 * 指定的后缀名是：.txt
 * 指定的目录是：demo04
 * 
 * 数据源：c:\\demo03\\hello.java
 * 目的地：c:\\demo04\\hello.txt
 * 
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下的java文件的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:把该File进行复制
 * 		E:在目的地目录下改名
 * 
 * 后辍为.java的文件是字符文件，看的懂。所以，使用高效字符缓冲流复制。
 */
public class CopyFolder02 {

	public static void main(String[] args) throws IOException {
		File originFile = new File("c:\\demo03");
		File destFile = new File("c:\\demo04");

		// 不存在目的地，就创建
		if (!destFile.exists()) {
			destFile.mkdir();
		}

		// 筛选过滤出.java文件
		File[] arr = originFile.listFiles(new FileFilter() {

			@Override
			public boolean accept(File file) {
				boolean a = file.isFile();
				boolean b = file.getName().endsWith(".java");
				return a&&b;// a,b都为真时，才表示是一个后辍为.java文件
			}
		});

		// 遍历该File数组，得到每一个File对象
		for (File origin : arr) {
			File dest = new File(destFile, origin.getName());
			copyFile(origin, dest);
		}

		// 在目的地目录改名
		File[] arr2 = destFile.listFiles();
		for (File f : arr2) {
			String name = f.getName();
			String newName = name.replace(".java", ".txt");
			f.renameTo(new File(destFile, newName));
		}
		
		System.out.println("over~~");
	}

	// 高效字符缓冲流 复制文件，一次复制一行
	public static void copyFile(File origin, File dest) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(origin));
		BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

		String s = null;
		while ((s = br.readLine()) != null) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}

		// 释放资源
		bw.close();
		br.close();
	}
}
