package com.yidahulian_08;

import java.util.Properties;
import java.util.Set;

/*
 * Properties:属性集合类。是一个可以和IO流相结合使用的集合类。
 * Properties可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。 
 * 
 * 是Hashtable的子类，说明是一个Map集合。
 */
public class PropertiesDemo01 {

	public static void main(String[] args) {
		// 作为Map集合的使用
		// 下面这种用法是错误的，一定要看API，如果没有<>，就说明该类不是一个泛型类,在使用的时候就不能加泛型
		// Properties<String, String> prop = new Properties<String, String>();

		// 创建集合对象
		Properties prop = new Properties();

		// 添加元素
		prop.put("key1", "hello");
		prop.put("key2", "world");
		prop.put("key3", "java");

		System.out.println(prop);

		// 遍历集合
		Set<Object> set = prop.keySet();
		for (Object key : set) {
			System.out.println(key + "---" + prop.get(key));
		}
	}

}
