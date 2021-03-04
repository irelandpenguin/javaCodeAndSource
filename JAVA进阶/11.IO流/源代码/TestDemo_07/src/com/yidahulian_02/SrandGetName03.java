package com.yidahulian_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * 需求：有一个文本文件中存储了几个姓名，请大家写一个程序实现随机获取一个人的名字。
 * 
 * 分析：
 * 		A:把文本文件中的数据存储到集合中
 * 		B:随机产生一个索引
 * 		C:根据该索引获取一个值
 */
public class SrandGetName03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("name.txt"));
		ArrayList<String> list = new ArrayList<String>();
		String s = null;
		while ((s = br.readLine()) != null) {
			list.add(s);
		}
		br.close();

		// 产生一个随机数
		int count = list.size();
		Random r = new Random();
		int index = r.nextInt(count);//0~count之间的索引，但不包含count

		// 根据索引获取姓名
		System.out.println(list.get(index));
	}

}
