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
			// \r\n表示回车换行
			if (by == '\r') {
				continue;
			}
			if (by == '\n') {
				return sb.toString();
			} else {
				sb.append((char) by);
			}
		}

		// 这里的判断很重要，如果没有，有时会导致最后一行数据读取不到。为什么呢？
		if (sb.length() > 0) {
			return sb.toString();
		}

		return null;
	}

	public void close() throws IOException {
		r.close();
	}
}
