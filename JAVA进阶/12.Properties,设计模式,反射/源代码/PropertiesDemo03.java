package com.yidahulian_08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * 这里的集合必须是Properties集合，而且集合里的key-value键值对必须是字符串。否则保存文件失败!
 * public void load(Reader reader):把文件中的数据读取到集合中
 * public void store(Writer writer,String comments):把集合中的数据存储到文件
 */
public class PropertiesDemo03 {

	public static void main(String[] args) throws IOException {
		storeStringProperties();// 写(字符串键-值对 存到 文件中)
		loadStringProperties();// 读 (从文件中读取 字符串键-值对)
	}

	public static void storeStringProperties() throws IOException {
		// 创建集合对象
		Properties prop = new Properties();

		// 添加元素
		prop.setProperty("张三", "40");
		prop.setProperty("李四", "27");
		prop.setProperty("王五", "38");
		prop.setProperty("赵六", "45");

		// 集合对象保存到文件中
		FileWriter w = new FileWriter("prop.txt");// 多态
		prop.store(w, null);
		w.close();
	}

	public static void loadStringProperties() throws IOException {
		// 创建集合对象
		Properties prop = new Properties();

		// 从文件中读取集合对象
		FileReader r = new FileReader("prop.txt");
		prop.load(r);
		r.close();

		// 获取keys
		Set<String> set = prop.stringPropertyNames();

		// 遍历集合
		for (String key : set) {
			System.out.println(key + "---" + prop.getProperty(key));
		}
	}

}
