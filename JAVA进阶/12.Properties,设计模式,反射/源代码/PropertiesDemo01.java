package com.yidahulian_08;

import java.util.Properties;
import java.util.Set;

/*
 * Properties:���Լ����ࡣ��һ�����Ժ�IO������ʹ�õļ����ࡣ
 * Properties�ɱ��������л�����м��ء������б���ÿ���������Ӧֵ����һ���ַ����� 
 * 
 * ��Hashtable�����࣬˵����һ��Map���ϡ�
 */
public class PropertiesDemo01 {

	public static void main(String[] args) {
		// ��ΪMap���ϵ�ʹ��
		// ���������÷��Ǵ���ģ�һ��Ҫ��API�����û��<>����˵�����಻��һ��������,��ʹ�õ�ʱ��Ͳ��ܼӷ���
		// Properties<String, String> prop = new Properties<String, String>();

		// �������϶���
		Properties prop = new Properties();

		// ���Ԫ��
		prop.put("key1", "hello");
		prop.put("key2", "world");
		prop.put("key3", "java");

		System.out.println(prop);

		// ��������
		Set<Object> set = prop.keySet();
		for (Object key : set) {
			System.out.println(key + "---" + prop.get(key));
		}
	}

}
