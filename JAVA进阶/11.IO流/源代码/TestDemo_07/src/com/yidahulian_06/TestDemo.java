package com.yidahulian_06;

import java.io.FileReader;
import java.io.IOException;

/**
 * �����⣺�Զ���һ��readLine()������
 * @author �˴ﻥ��-Mr Qain
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
