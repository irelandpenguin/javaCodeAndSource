/*
 * HashMap����Ƕ��HashMap���ϲ�������
 * ����
 *	����HashMap���ϵ�Ԫ����HashMap,��3����
 *
 * ������
 *	HashMap<Integer, String> ������ѧ�ţ����磺201701��ֵ�����������磺������
 *	HashMap<String, HashMap<Integer, String>> �� ���ǰ༶���ƣ����磺�����ࡣֵΪѧ����Ϣ�����磺������201701
 */
package com.yida_05.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D_Test {

	public static void main(String[] args) {
		HashMap<String, HashMap<Integer, String>> hm = new HashMap<String, HashMap<Integer, String>>();

		HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
		hmap1.put(201701, "����");
		hmap1.put(201702, "����");

		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		hmap2.put(201703, "����");
		hmap2.put(201704, "����");

		HashMap<Integer, String> hmap3 = new HashMap<Integer, String>();
		hmap3.put(201705, "��С��");
		hmap3.put(201706, "�˳�");

		hm.put("������", hmap1);
		hm.put("��ĩ��", hmap2);
		hm.put("��ҵ��", hmap3);

		// ��ǿfor����(����ֵ)
		Set<String> set = hm.keySet();
		for (String key : set) {
			System.out.println(key);
			HashMap<Integer, String> value = hm.get(key);
			Set<Integer> set2 = value.keySet();
			for (Integer key2 : set2) {
				String value2 = value.get(key2);
				System.out.println("\t" + key2 + "\t" + value2);
			}
		}

		System.out.println("------");

		// ��ǿfor����(��-ֵ�Զ����Ҽ���ֵ)
		Set<Map.Entry<String, HashMap<Integer, String>>> entrys = hm.entrySet();
		for (Map.Entry<String, HashMap<Integer, String>> en : entrys) {
			String key = en.getKey();
			System.out.println(key);
			HashMap<Integer, String> value = en.getValue();
			Set<Map.Entry<Integer, String>> entrys2 = value.entrySet();
			for (Map.Entry<Integer, String> en2 : entrys2) {
				Integer key2 = en2.getKey();
				String value2 = en2.getValue();
				System.out.println("\t" + key2 + "\t" + value2);
			}
		}
	}

}
