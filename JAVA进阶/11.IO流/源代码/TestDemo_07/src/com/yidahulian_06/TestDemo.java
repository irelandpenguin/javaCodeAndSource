package com.yidahulian_06;

import java.io.FileReader;
import java.io.IOException;

/**
 * 面试题：自定义一个readLine()方法。
 * @author 宜达互联-Mr Qain
 *
 */
public class TestDemo {

	public static void main(String[] args) throws IOException {
		MyBufferedReader mbr = new MyBufferedReader(new FileReader("name.txt"));
		String s = null;
		while ((s = mbr.readLine()) != null) {
			System.out.println(s);
		}
		mbr.close();
	}

}
