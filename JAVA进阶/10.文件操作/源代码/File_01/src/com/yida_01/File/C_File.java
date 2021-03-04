package com.yida_01.File;

import java.io.File;
import java.io.IOException;

/**
 * 删除功能:public boolean delete()
 * 
 * 注意： A:如果你创建文件或者文件夹忘了写盘符路径，那么，默认在当前项目路径下。 B:Java中的删除不走回收站，一定要十分小心！！！
 * C:要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹！
 */
public class C_File {
	public static void main(String[] args) {
		// test1();// 在c盘创建一个hello.txt文件
		// test2();// 一不小心，我忘记写盘符了。创建的文件放哪里去了？
		// test3();// 在c盘创建一组文件夹
		// test4();// 一不小心，我忘记写盘符了。创建的这组放哪里去了？

		// 删除功能：我要删除c盘里的hello.txt这个文件
		// File file = new File("c:\\hello.txt");
		// boolean isOK = file.delete();
		// if (isOK) {
		// System.out.println("文件删除成功");
		// } else {
		// System.out.println("文件删除失败");
		// }

		// 删除功能：我要删除项目里的hello.txt这个文件
		// File file = new File("hello.txt");
		// boolean isOK = file.delete();
		// if (isOK) {
		// System.out.println("文件删除成功");
		// } else {
		// System.out.println("文件删除失败");
		// }

		// 删除功能：我要C盘里的删除ccc这个文件夹

		// File file = new File("c:\\aaa\\bbb\\ccc");
		// boolean isOK = file.delete();
		// if (isOK) {
		// System.out.println("文件夹删除成功");
		// } else {
		// System.out.println("文件夹删除失败");
		// }

		// 删除功能：我要删除C盘里的aaa这个文件夹
		// File file = new File("C:\\aaa");
		// boolean isOK = file.delete();// 这里是删除会失败，因为aaa文件夹里还包含bbb文件夹。
		// if (isOK) {
		// System.out.println("文件夹删除成功");
		// } else {
		// System.out.println("文件夹删除失败");
		// }

		// 要想删除aaa文件夹，必须先删除bbb文件夹，再删除aaa文件夹
		// File file = new File("c:\\aaa\\bbb");
		// System.out.println("delete:" + file.delete());
		// file = new File("c:\\aaa");
		// System.out.println("delete:" + file.delete());

		// 删除功能：我要删除项目里的aaa这个文件夹
		// File file = new File("aaa\\bbb\\ccc");// 先删ccc文件夹
		// System.out.println("delete:" + file.delete());
		// file = new File("aaa\\bbb");// 再删bbb文件夹
		// System.out.println("delete:" + file.delete());
		// file = new File("aaa");// 最后删aaa文件夹
		// System.out.println("delete:" + file.delete());
	}

	// 在c盘创建一个hello.txt文件
	public static void test1() {
		File file = new File("c:\\hello.txt");
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

	// 一不小心，我忘记写盘符了。创建的文件放哪里去了？
	public static void test2() {
		File file = new File("hello.txt");
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

		// 小结：如果你创建文件或者文件夹忘了写盘符路径，那么，默认在当前项目路径下。
	}

	// 在c盘创建一组文件夹
	public static void test3() {
		File file = new File("c:\\aaa\\bbb\\ccc");
		boolean isOK = file.mkdirs();
		if (isOK) {
			System.out.println("文件夹创建成功");
		} else {
			System.out.println("文件夹创建失败");
		}
	}

	// 一不小心，我忘记写盘符了。创建的这组放哪里去了？
	public static void test4() {
		File file = new File("aaa\\bbb\\ccc");
		boolean isOK = file.mkdirs();
		if (isOK) {
			System.out.println("文件夹创建成功");
		} else {
			System.out.println("文件夹创建失败");
		}

		// 小结：如果你创建文件或者文件夹忘了写盘符路径，那么，默认在当前项目路径下。
	}
}
