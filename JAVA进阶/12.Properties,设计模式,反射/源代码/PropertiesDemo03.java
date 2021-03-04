package com.yidahulian_08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * ����ļ��ϱ�����Properties���ϣ����Ҽ������key-value��ֵ�Ա������ַ��������򱣴��ļ�ʧ��!
 * public void load(Reader reader):���ļ��е����ݶ�ȡ��������
 * public void store(Writer writer,String comments):�Ѽ����е����ݴ洢���ļ�
 */
public class PropertiesDemo03 {

	public static void main(String[] args) throws IOException {
		storeStringProperties();// д(�ַ�����-ֵ�� �浽 �ļ���)
		loadStringProperties();// �� (���ļ��ж�ȡ �ַ�����-ֵ��)
	}

	public static void storeStringProperties() throws IOException {
		// �������϶���
		Properties prop = new Properties();

		// ���Ԫ��
		prop.setProperty("����", "40");
		prop.setProperty("����", "27");
		prop.setProperty("����", "38");
		prop.setProperty("����", "45");

		// ���϶��󱣴浽�ļ���
		FileWriter w = new FileWriter("prop.txt");// ��̬
		prop.store(w, null);
		w.close();
	}

	public static void loadStringProperties() throws IOException {
		// �������϶���
		Properties prop = new Properties();

		// ���ļ��ж�ȡ���϶���
		FileReader r = new FileReader("prop.txt");
		prop.load(r);
		r.close();

		// ��ȡkeys
		Set<String> set = prop.stringPropertyNames();

		// ��������
		for (String key : set) {
			System.out.println(key + "---" + prop.getProperty(key));
		}
	}

}
