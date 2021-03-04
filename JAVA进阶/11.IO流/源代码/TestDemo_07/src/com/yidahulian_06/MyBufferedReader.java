package com.yidahulian_06;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {
	private FileReader r;

	public MyBufferedReader(FileReader r) {
		super();
		this.r = r;
	}

	public String readLine() throws IOException {
		StringBuilder sb = new StringBuilder();
		int by = 0;
		while ((by = r.read()) != -1) {
			// \r\n��ʾ�س�����
			if (by == '\r') {
				continue;
			}
			if (by == '\n') {
				return sb.toString();
			} else {
				sb.append((char) by);
			}
		}

		// ������жϺ���Ҫ�����û�У���ʱ�ᵼ�����һ�����ݶ�ȡ������Ϊʲô�أ�
		if (sb.length() > 0) {
			return sb.toString();
		}

		return null;
	}

	public void close() throws IOException {
		r.close();
	}
}
