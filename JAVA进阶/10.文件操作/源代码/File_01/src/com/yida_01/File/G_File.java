package com.yida_01.File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取功能：
 * public String getAbsolutePath()：获取绝对路径
 * public String getPath():获取相对路径
 * public String getName():获取名称
 * public long length():获取长度。字节数
 * public long lastModified():获取最后一次的修改时间，毫秒值
 * 
 * public String[] list():获取指定目录下的所有文件或者文件夹的名称
 * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File对象
 */
public class G_File {
	public static void main(String[] args) {
		// test1();// 获取绝对路径下的文件信息
		// test2();// 获取相对路径下的文件信息

		// test3();// 获取指定目录(绝对目录)下的所有文件或者文件夹的名称
		// test4();// 获取指定目录(相对目录)下的所有文件或者文件夹的名称

		// test5();// 获取指定目录(绝对目录)下的所有文件或者文件夹的File对象
		// test6();// 获取指定目录(相对目录)下的所有文件或者文件夹的File对象
	}

	// 获取绝对路径下的文件信息
	public static void test1() {
		File file = new File("C:\\test\\a.txt");
		System.out.println("绝对路径为：" + file.getAbsolutePath());
		System.out.println("相对路径为：" + file.getPath());
		System.out.println("文件名称：" + file.getName());
		System.out.println("文件的长度为：" + file.length());
		long time = file.lastModified();// 返回的是毫秒
		Date date = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String strTime = sdf.format(date);
		System.out.println("文件最后一次修改时间：" + strTime);
	}

	// 获取相对路径下的文件信息
	public static void test2() {
		File file = new File("test\\b.txt");
		System.out.println("项目里文件的绝对路径：" + file.getAbsolutePath());
		System.out.println("项目里文件的相对路径：" + file.getPath());
		System.out.println("项目里文件名称：" + file.getName());
		System.out.println("项目里文件长度：" + file.length());
		long time = file.lastModified();// 返回毫秒
		Date date = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strTime = sdf.format(date);
		System.out.println("项目里文件最后一次修改时间为：" + strTime);
	}

	// 获取指定目录(绝对目录)下的所有文件或者文件夹的名称
	public static void test3() {
		File file = new File("C:\\test");
		String[] arr = file.list();
		for (String name : arr) {
			System.out.println(name);
		}
	}

	// 获取指定目录(相对目录)下的所有文件或者文件夹的名称
	public static void test4() {
		File file = new File("yida");
		String[] arr = file.list();
		for (String name : arr) {
			System.out.println(name);
		}
	}

	// 获取指定目录(绝对目录)下的所有文件或者文件夹的File对象
	public static void test5() {
		File file = new File("C:\\test");
		File[] arr = file.listFiles();
		for (File f : arr) {
			System.out.println(f.getAbsolutePath() + "---" + f.getName());
		}
	}

	// 获取指定目录(相对目录)下的所有文件或者文件夹的File对象
	public static void test6() {
		File file = new File("yida");
		File[] arr = file.listFiles();
		for (File f : arr) {
			System.out.println(f.getAbsolutePath() + "---" + f.getName());
		}
	}
}
