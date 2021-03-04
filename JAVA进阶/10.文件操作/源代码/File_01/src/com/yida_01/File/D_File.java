package com.yida_01.File;

import java.io.File;

/**
 * 重命名功能:public boolean renameTo(File dest)
 * 		如果路径名相同，就是改名。
 * 		如果路径名不同，就是改名并剪切。
 * 
 * 概念：
 * 绝对路径:路径以盘符开始的，比如：c:\\aa\\bb\\a.txt
 * 相对路径：路径不以盘符开始的，比如：aa\\bb\\a.txt
 */
public class D_File {

	public static void main(String[] args) {
		// test1();// 需求：我想把项目里的 photo1.jpg 改名为 宜达互联.jpg
		// test2();// 需求：我想把项目包里的 photo2.jpg 改名为yida.jpg
		// test3();// 需求：我想把c盘里的photo1.jpg改名为 宜达互联.jpg
		// test4();// 需求：我想把c盘test目录里的photo2.jpg改名为 yida.jpg
		// test5();// 需求：我想把c盘test目录里的photo3.jpg改名为yidahulian.jpg并剪切到C盘根目录里
		// test6();// 需求：我想把c盘test目录里的hello文件夹剪切到c盘根目录里
	}

	// 需求：我想把项目里的 photo1.jpg 改名为 宜达互联.jpg
	public static void test1() {
		File file = new File("photo1.jpg");
		File desFile = new File("宜达互联.jpg");
		boolean isOK = file.renameTo(desFile);
		if (isOK) {
			System.out.println("改名成功");
		} else {
			System.out.println("改名失败");
		}
	}

	// 需求：我想把项目包里的 photo2.jpg 改名为yida.jpg
	public static void test2() {
		File file = new File("src\\com\\yida_01\\File\\photo2.jpg");
		File desFile = new File("src\\com\\yida_01\\yidahulian.jpg");
		boolean isOK = file.renameTo(desFile);
		if (isOK) {
			System.out.println("改名成功");
		} else {
			System.out.println("改名失败");
		}
	}

	// 需求：我想把c盘里的photo1.jpg改名为 宜达互联.jpg
	public static void test3() {
		File file = new File("c:\\photo1.jpg");
		File desFile = new File("c:\\宜达互联.jpg");
		boolean isOK = file.renameTo(desFile);
		if (isOK) {
			System.out.println("改名成功");
		} else {
			System.out.println("改名失败");
		}
	}

	// 需求：我想把C盘test目录里的photo2.jpg改名为 yida.jpg
	public static void test4() {
		File file = new File("C:\\test\\photo2.jpg");
		File desFile = new File("C:\\test\\yida.jpg");
		boolean isOK = file.renameTo(desFile);
		if (isOK) {
			System.out.println("改名成功");
		} else {
			System.out.println("改名失败");
		}
	}

	// 需求：我想把C盘test目录里的photo3.jpg改名为yidahulian.jpg并剪切到C盘根目录里
	public static void test5() {
		File file = new File("C:\\test\\photo3.jpg");
		File desFile = new File("C:\\yidahulian.jpg");
		boolean isOK = file.renameTo(desFile);
		if (isOK) {
			System.out.println("改名成功");
		} else {
			System.out.println("改名失败");
		}
	}

	// 需求：我想把C盘test目录里的hello文件夹剪切到C盘根目录里
	public static void test6() {
		File file = new File("C:\\test\\hello");
		File desFile = new File("C:\\hello");
		boolean isOK = file.renameTo(desFile);
		if (isOK) {
			System.out.println("文件夹剪切成功");
		} else {
			System.out.println("文件夹剪切失败");
		}
	}
}
