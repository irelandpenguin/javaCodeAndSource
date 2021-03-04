package com.yida_01.File;

import java.io.File;

/**
 * 判断功能:
 * public boolean isDirectory():判断是否是目录
 * public boolean isFile():判断是否是文件
 * public boolean exists():判断是否存在
 * public boolean canRead():判断是否可读
 * public boolean canWrite():判断是否可写
 * public boolean isHidden():判断是否隐藏
 */
public class F_File {
	public static void main(String[] args) {
		// public boolean isDirectory():判断是否是目录
		File file = new File("C:\\test");
		System.out.println("是否为文件夹:" + file.isDirectory());
		file = new File("hello");
		System.out.println("在项目里是否为文件夹：" + file.isDirectory());

		// public boolean isFile():判断是否是文件
		File file2 = new File("C:\\test\\photo4.jpg");
		System.out.println("是否为文件:" + file2.isFile());
		file2 = new File("photo1.jpg");
		System.out.println("在项目里是否为文件：" + file2.isFile());

		// public boolean exists():判断是否存在
		File file3 = new File("C:\\test");
		System.out.println("文件夹是否存在:" + file3.exists());
		file3 = new File("C:\\test\\photo4.jpg");
		System.out.println("文件是否存在:" + file3.exists());
		file3 = new File("hello");
		System.out.println("在项目里文件夹是否存在:" + file3.exists());
		file3 = new File("photo1.jpg");
		System.out.println("在项目里文件是否存在:" + file3.exists());

		// public boolean canRead():判断是否可读
		// public boolean canWrite():判断是否可写
		File file5 = new File("C:\\test");
		System.out.println("文件夹是否可读：" + file5.canRead());
		System.out.println("文件夹是否可写：" + file5.canWrite());
		file5 = new File("C:\\test\\photo4.jpg");
		System.out.println("文件是否可读：" + file5.canRead());
		System.out.println("文件是否可写：" + file5.canWrite());

		// public boolean isHidden():判断是否隐藏
		File file6 = new File("C:\\test");
		System.out.println("文件夹是否隐藏：" + file6.isHidden());
		file6 = new File("C:\\test\\photo4.jpg");
		System.out.println("文件是否隐藏：" + file6.isHidden());
	}
}
