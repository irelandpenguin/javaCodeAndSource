/*
 * ArrayList����Ƕ��HashMap���ϲ�������
 *����
 *����ArrayList���ϵ�Ԫ����HashMap,��3����
 *ÿһ��HashMap���ϵļ������ֶ���ֵ���ַ�����
 *
 *������
 *	HashMap<Integer, String> �� �������䣬ֵ������
 *	ArrayList<HashMap<Integer, String>> ���洢����ѧ����Ϣ(����������)
 */
package com.yida_05.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class B_Test {

	public static void main(String[] args) {
		ArrayList<HashMap<Integer, String>> list = new ArrayList<HashMap<Integer, String>>();

		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(24, "����");
		hm1.put(30, "����");
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		hm2.put(27, "����");
		hm2.put(32, "����");
		HashMap<Integer, String> hm3 = new HashMap<Integer, String>();
		hm3.put(42, "�˳�");
		hm3.put(35, "��С��");

		list.add(hm1);
		list.add(hm2);
		list.add(hm3);

		// ��ǿfor����
		for (HashMap<Integer, String> hm : list) {
			Set<Integer> set = hm.keySet();
			for (Integer key : set) {
				String value = hm.get(key);
				System.out.println(key + "---" + value);
			}
		}

		System.out.println("------");

		// ����������
		Iterator<HashMap<Integer, String>> it = list.iterator();
		while (it.hasNext()) {
			HashMap<Integer, String> hm = it.next();
			Set<Integer> set = hm.keySet();
			for (Integer key : set) {
				String value = hm.get(key);
				System.out.println(key + "---" + value);
			}
		}
	}

}
