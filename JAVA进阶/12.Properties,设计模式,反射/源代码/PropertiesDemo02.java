package com.yidahulian_08;

import java.util.Properties;
import java.util.Set;

/*
 * ���⹦�ܣ�
 * public Object setProperty(String key,String value)�����Ԫ��
 * public String getProperty(String key):��ȡԪ��
 * public Set<String> stringPropertyNames():��ȡ���еļ��ļ���
 */
public class PropertiesDemo02 {

	public static void main(String[] args) {
		// �������϶���
		Properties prop = new Properties();

		// ���Ԫ��
		// public Object setProperty(String key,String value)�����Ԫ��
		prop.setProperty("����", "30");
		prop.setProperty("����", "45");
		prop.setProperty("����", "21");

		// public Set<String> stringPropertyNames():��ȡ���еļ��ļ���
		Set<String> set = prop.stringPropertyNames();

		// ��������
		for (String key : set) {
			// public String getProperty(String key):��ȡԪ��
			String value = prop.getProperty(key);
			System.out.println(key + "---" + value);
		}
	}

}
