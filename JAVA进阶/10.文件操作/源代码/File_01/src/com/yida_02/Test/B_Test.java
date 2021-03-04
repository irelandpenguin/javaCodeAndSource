package com.yida_02.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 判断C盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称。
 * 	实现方式一:先获取所有的，然后遍历的时候，依次判断，如果满足条件就输出。这个已经实现了。
 *	实现方式二:获取的时候就已经是满足条件的了，然后输出即可。
 * 
 * 要想实现这个效果，就必须学习一个接口：文件名称过滤器
 * 	public String[] list(FilenameFilter filter)
 * 	public File[] listFiles(FilenameFilter filter)
 */
public class B_Test {
	public static void main(String[] args) {
		test();
		//test2();
	}

	public static void test() {
		File file = new File("C:\\");
		String[] arr = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// System.out.println(dir + "---" + name);
				File f = new File(dir, name);
				boolean b = f.isFile() && f.getName().endsWith(".jpg");
				return b;
			}
		});
		for (String s : arr) {
			System.out.println(s);
		}
	}

	public static void test2() {
		File file = new File("C:\\");
		File[] arr = file.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".jpg");
			}
		});
		for (File f : arr) {
			System.out.println(f.getName());
		}
	}
}
