/*
 * Hashtable与HashMap使用上是一样的。v1.2版本就有了。因为早期就有的类，所以命名上也不规范。
 * HashMap就是用来替代Hashtable的。
 * 
 * 1:Hashtable和HashMap的区别?
 * 	Hashtable:线程安全，效率低。不允许null键和null值
 * 	HashMap:线程不安全，效率高。允许null键和null值
 * 
 * 2:List,Set,Map等接口是否都继承子Map接口?
 * 	List，Set继承自Collection接口; Map接口本身就是一个顶层接口。
 */
package com.yida_06.Hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class A_Hashtable {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		// HashMap<String, String> ht = new HashMap<String, String>();
		ht.put("201710", "张三");
		ht.put("201702", "李四");
		// ht.put("201703", null);// 报错，NullPointerException
		// ht.put(null, "王五");// 报错，NullPointerException
		// ht.put(null, null);// 报错，NullPointerException

		// 增强for遍历(键找值)
		Set<String> set = ht.keySet();
		for (String key : set) {
			String value = ht.get(key);
			System.out.println(key + "---" + value);
		}

		System.out.println("------");

		// 增强for遍历(键-值对对象找键和值)
		Set<Map.Entry<String, String>> entrys = ht.entrySet();
		for (Map.Entry<String, String> en : entrys) {
			String key = en.getKey();
			String value = en.getValue();
			System.out.println(key + "---" + value);
		}
	}

}
