package com.yida_02.Test;

import java.io.File;

/**
 * 判断C盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 * 
 * 分析：
 * 		A:封装C盘目录
 * 		B:获取该目录下所有文件或者文件夹的File数组
 * 		C:遍历该File数组，得到每一个File对象，然后判断
 * 		D:是否是文件
 * 			是：继续判断是否以.jpg结尾
 * 				是：就输出该文件名称
 * 				否：不搭理它
 * 			否：不搭理它
 */
public class A_Test {
	public static void main(String[] args) {
		File file = new File("C:\\");
		File[] arr = file.listFiles();
		for (File f : arr) {
			if (f.isFile()) {
				String name = f.getName();
				if (name.endsWith(".jpg")) {
					System.out.println(name);
				}
			}
		}
	}
}
