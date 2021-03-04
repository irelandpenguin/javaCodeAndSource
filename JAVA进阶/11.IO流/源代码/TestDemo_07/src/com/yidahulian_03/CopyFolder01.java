package com.yidahulian_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：复制单层文件夹
 * 
 * 数据源：C:\\demo01
 * 目的地：C:\\demo02
 * 
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下的所有文件的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:把该File进行复制
 * 
 * 文件种类多，即有图片，又有文本文件。所以，应采用高效字节缓冲流复制。
 */
public class CopyFolder01 {

	public static void main(String[] args) throws IOException {
		File originFile = new File("C:\\demo01");// 数据源
		File destFile = new File("C:\\demo02");// 目的地

		// 目的地不存在，就创建
		if (!destFile.exists()) {
			destFile.mkdir();
		}

		// 获取数据源里的所有文件
		File[] arr = originFile.listFiles();
		for (File origin : arr) {
			String name = origin.getName();// 获取文件名称
			File dest = new File(destFile, name);// 设置目标文件对象
			copyFile(origin, dest);
		}
		
		System.out.println("复制完了~~~");
	}

	// 高效字节缓冲流 复制文件，一次复制一个字节数组
	public static void copyFile(File origin, File dest) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(origin));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

		byte[] by = new byte[1024];
		int len = 0;
		while ((len = bis.read(by)) != -1) {
			bos.write(by, 0, len);
		}

		// 释放资源
		bos.close();
		bis.close();
	}
}
