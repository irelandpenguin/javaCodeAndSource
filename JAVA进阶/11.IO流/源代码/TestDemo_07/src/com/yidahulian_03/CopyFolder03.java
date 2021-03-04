package com.yidahulian_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：复制多层文件夹
 * 
 * 数据源：C:\\歌曲清单
 * 目的地：C:\\我喜爱的音乐
 * 
 * 分析：
 * 		A:封装数据源File
 * 		B:封装目的地File
 * 		C:判断该目的地文件夹是否存在，不存在则创建
 * 		D:获取该数据源File对象下的所有文件File对象以及子文件夹File对象
 * 		E:遍历得到每一个File对象数组
 * 		F:判断File对象是文件夹还是文件
 * 			a:是文件夹
 * 				回到C
 * 			b:是文件
 * 				就复制(字节流)
 */
public class CopyFolder03 {

	public static void main(String[] args) throws IOException {
		// A:封装数据源File
		File originFolder = new File("C:\\歌曲清单");
		// B:封装目的地File
		File destFolder = new File("C:\\我喜爱的音乐");
		copyFolders(originFolder, destFolder);// 复制多层文件夹
		
		System.out.println("over~~~");
	}

	// 复制多层文件夹
	public static void copyFolders(File originFolder, File destFolder) throws IOException {
		// C:判断该目的地文件夹是否存在，不存在则创建
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}

		// D:获取该数据源File对象下的所有文件File对象以及子文件夹File对象
		File[] arr = originFolder.listFiles();

		// E:遍历得到每一个File对象
		for (File origin : arr) {
			// F:判断File对象是文件夹还是文件
			if (origin.isDirectory()) {// a:是文件夹
				String dirName = origin.getName();// 获取文件夹名称
				File dest = new File(destFolder, dirName);// 设置目标子文件夹对象
				copyFolders(origin, dest);// 递规调用，回到C
			} else {// b:是文件
				// 就复制(字节流)
				String fileName = origin.getName();// 获取文件名称
				File destFile = new File(destFolder, fileName);// 设置目标文件对象
				copyFile(origin, destFile);// 复制文件
			}
		}
	}

	// 复制文件
	public static void copyFile(File originFile, File destFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

		byte[] by = new byte[1024];
		int len = 0;
		while ((len = bis.read(by)) != -1) {
			bos.write(by, 0, len);
		}

		bos.close();
		bis.close();
	}
}
