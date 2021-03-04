/*
 * HashMap����Ƕ��ArrayList���ϲ�������
 *����
 *����HashMap���ϵ�Ԫ����ArrayList,��3����
 *ÿһ��ArrayList���ϴ洢�Ķ����ַ�����
 *
 *������
 *	ArrayList<String> : �洢��ɫ���������磺������
 *	HashMap<String, ArrayList<String>> �����ǵ��Ӿ����ƣ����磺�������塣ֵ�ǽ�ɫ�����б��ϡ�
 */
package com.yida_05.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C_Test {

	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("����");
		list1.add("���");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("�����");
		list2.add("��ƽ֮");

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("����");
		list3.add("���");

		hm.put("��������", list1);
		hm.put("Ц������", list2);
		hm.put("�������", list3);

		// ��ǿfor����(����ֵ)
		Set<String> set = hm.keySet();
		for (String key : set) {
			System.out.println(key);
			ArrayList<String> value = hm.get(key);
			for (String s : value) {
				System.out.println("\t" + s);
			}
		}

		System.out.println("------");

		// ��ǿfor����(��-ֵ�Զ����Ҽ���ֵ)
		Set<Map.Entry<String, ArrayList<String>>> entrys = hm.entrySet();
		for (Map.Entry<String, ArrayList<String>> en : entrys) {
			String key = en.getKey();
			System.out.println(key);
			ArrayList<String> value = en.getValue();
			for (String s : value) {
				System.out.println("\t" + s);
			}
		}
	}

}
