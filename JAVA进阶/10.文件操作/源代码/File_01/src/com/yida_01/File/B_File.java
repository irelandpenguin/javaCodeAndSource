package com.yida_01.File;

import java.io.File;
import java.io.IOException;

/**
 *创建功能：
 *public boolean createNewFile():创建文件，如果该文件已存在，就不创建了
 *public boolean mkdir():创建单个文件夹，如果该文件夹已存在，就不创建了
 *public boolean mkdirs():创建一组文件夹，如果父文件夹不存在，会帮你自动创建出来
 *
 *注意：创建文件还是文件夹，方法不要调错了！
 */
public class B_File {
	public static void main(String[] args) {
		// test1();// 需求：我要在d盘目录下创建一个文件夹yida
		// test2();// 需求:我要在D盘目录下创建一个文件a.txt
		// test3();// 需求：我要在d盘目录test下创建一个文件b.txt
		// test4();// 需求:我要在d盘目录mytest下创建aaa目录,然后在aaa目录下创建bbb目录
		// test5();// mkdirs的使用注意事项
	}

	// 需求：我要在C盘目录下创建一个文件夹yida
	public static void test1() {
		File file = new File("c:\\yida");
		boolean isOK = file.mkdir();
		if (isOK) {
			System.out.println("文件夹创建成功");
		} else {
			System.out.println("文件夹创建失败");
		}
	}

	// 需求:我要在C盘目录下创建一个文件a.txt
	public static void test2() {
		File file = new File("C:\\a.txt");
		try {
			boolean isOK = file.createNewFile();
			if (isOK) {
				System.out.println("文件创建成功");
			} else {
				System.out.println("文件创建失败");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 需求：我要在C盘目录test下创建一个文件b.txt
	public static void test3() {
		// 注意：要想在某个目录下创建文件，该目录首先必须存在!
		/*File file = new File("C:\\test\\b.txt");
		try {
			boolean isOK = file.createNewFile();// 报错，java.io.IOException:系统找不到指定的路径。
			if (isOK) {
				System.out.println("文件创建成功");
			} else {
				System.out.println("文件创建失败");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}*/

		// 正确的做法如下：
		File file = new File("c:\\test");
		if (file.mkdir()) {
			File file2 = new File("c:\\test\\b.txt");
			// File file2 = new File("c:\\test", "b.txt");
			// File file2 = new File(file, "b.txt");
			try {
				boolean isOK = file2.createNewFile();
				if (isOK) {
					System.out.println("文件创建成功");
				} else {
					System.out.println("文件创建失败");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 小结：在指定目录里创建文件时，必须保证文件的父目录存在！
	}

	// 需求:我要在c盘目录mytest下创建aaa目录,然后在aaa目录下创建bbb目录
	public static void test4() {
		/*File file = new File("c:\\mytest\\aaa\\bbb");
		boolean isOK = file.mkdir();// 这样创建，会失败的。因为父级目录不存在
		if (isOK) {
			System.out.println("创建成功");
		} else {
			System.out.println("创建失败");
		}*/

		// 小结：创建多级目录时，必须保证父级目录存在！
		
		// 可以使用mkdirs来一次性创建多级目录，mkdirs会自动创建不存在的父级目录。
		File file = new File("c:\\mytest\\aaa\\bbb");
		boolean isOK = file.mkdirs();
		if (isOK) {
			System.out.println("文件夹创建成功");
		} else {
			System.out.println("文件夹创建失败");
		}
	}

	// mkdirs的使用注意事项
	public static void test5() {
		File file = new File("c:\\aaa\\bbb\\ccc");
		boolean isOK = file.mkdirs();
		if (isOK) {
			System.out.println("文件夹创建成功");
		} else {
			System.out.println("文件夹创建失败");
		}

		// 下面的写法是错误的，因为mkdirs是用于创建多目录的，不是用来创建文件的。
		/*File file2 = new File("d:\\aa\\hello.txt");
		isOK = file2.mkdirs();
		if (isOK) {
			System.out.println("文件创建成功");
		} else {
			System.out.println("文件创建失败");
		}*/
		
		// 小结：不要认为后缀为.txt, .mp3, .mp4等就是文本文件，它可能是文件夹。正所谓：骑白马的不一定是唐僧!
	}
}
