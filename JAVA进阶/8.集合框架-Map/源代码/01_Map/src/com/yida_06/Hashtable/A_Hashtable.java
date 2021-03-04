/*
 * Hashtable��HashMapʹ������һ���ġ�v1.2�汾�����ˡ���Ϊ���ھ��е��࣬����������Ҳ���淶��
 * HashMap�����������Hashtable�ġ�
 * 
 * 1:Hashtable��HashMap������?
 * 	Hashtable:�̰߳�ȫ��Ч�ʵ͡�������null����nullֵ
 * 	HashMap:�̲߳���ȫ��Ч�ʸߡ�����null����nullֵ
 * 
 * 2:List,Set,Map�Ƚӿ��Ƿ񶼼̳���Map�ӿ�?
 * 	List��Set�̳���Collection�ӿ�; Map�ӿڱ������һ������ӿڡ�
 */
package com.yida_06.Hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class A_Hashtable {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		// HashMap<String, String> ht = new HashMap<String, String>();
		ht.put("201710", "����");
		ht.put("201702", "����");
		// ht.put("201703", null);// ����NullPointerException
		// ht.put(null, "����");// ����NullPointerException
		// ht.put(null, null);// ����NullPointerException

		// ��ǿfor����(����ֵ)
		Set<String> set = ht.keySet();
		for (String key : set) {
			String value = ht.get(key);
			System.out.println(key + "---" + value);
		}

		System.out.println("------");

		// ��ǿfor����(��-ֵ�Զ����Ҽ���ֵ)
		Set<Map.Entry<String, String>> entrys = ht.entrySet();
		for (Map.Entry<String, String> en : entrys) {
			String key = en.getKey();
			String value = en.getValue();
			System.out.println(key + "---" + value);
		}
	}

}
