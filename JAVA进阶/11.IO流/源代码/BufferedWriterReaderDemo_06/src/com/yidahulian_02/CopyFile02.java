package com.yidahulian_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ���󣺰ѵ�ǰ��ĿĿ¼�µ�aa.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�bb.txt�С�Ҫ��ÿ�ζ�һ�У�дһ�С�
 * 
 * ����Դ��
 * 		aa.txt -- ��ȡ���� -- �ַ�ת���� -- BufferedReader
 * Ŀ�ĵأ�
 * 		bb.txt -- д������ -- �ַ�ת���� -- BufferedWriter 
 */
public class CopyFile02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("aa.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("bb.txt"));

		String s = null;
		while ((s = br.readLine()) != null) {
			bw.write(s);
			bw.newLine();// ���У���ΪreadLine()ÿ�ζ�ȡһ�����ݣ�����������β�Ļ��з������ԣ�����Ҫ��ӻ����Ҽ��ݶ�ƽ̨
			bw.flush();// ˢ�£�һ������Ҳ�кܶ��ַ������ԣ����ˢ��һ�¡�
		}

		// �ͷ���Դ
		bw.close();
		br.close();
	}
}
