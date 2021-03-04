package com.yida_02.Test;

import java.io.File;

/**
 * 需求：把C:\歌曲清单  文件夹里的歌曲改为：歌名_歌手.mp3,且不改变原歌曲目录。
 * 		比如：单车_[单车呀单车]_陈奕讯.mp3    改为    单车_陈奕讯.mp3
 * 
 * 思路：
 * 		A:封装歌曲目录
 * 		B:获取该目录下所有文件的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:拼接一个新的名称，然后重命名即可。
 */
public class C_Test {
	public static void main(String[] args) {
		File file = new File("C:\\歌曲清单");
		File[] arr = file.listFiles();
		for (File f : arr) {
			if (f.isFile()) {// 是文件的，就修改
				String name = f.getName();
				if (name.endsWith(".mp3") || name.endsWith(".MP3")) {// 判断是否是mp3文件
					// 单车_[单车呀单车]_陈奕讯.mp3
					String[] strAry = name.split("_");
					String newName = strAry[0] + "_" + strAry[strAry.length - 1];
					File desFile = new File(file, newName);
					boolean b = f.renameTo(desFile);
					if (b == true) {
						System.out.println(name + "--" + "重命名成功");
					}
				}
			}
		}
	}
}
