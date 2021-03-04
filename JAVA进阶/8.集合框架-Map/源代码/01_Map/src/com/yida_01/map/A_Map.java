/*
 * Map���ϵ��ص㣺
 * 		�Լ�-ֵ�Ե���ʽ�洢���󡣼���Ψһ�ģ�ֵ�����ظ���
 * 
 * Map���Ϻ�Collection���ϵ�����?
 * 		Map���ϴ洢Ԫ���ǳɶԳ��ֵģ����԰�������Ϊ�����޶�
 * 		Collection���ϴ洢Ԫ���ǵ������ֵģ�Collection�Ķ���Set��Ψһ�ģ�List�ǿ��ظ��ġ����԰�������Ϊ�����
 * 
 * ע�⣺
 * 		Map���ϵļ���Ψһ�ģ�ֵ�ǿ��ظ��ġ�
 * 		Map���ϵ����ݽṹֻ��Լ���Ч����ֵ�޹ء�	
 *		Collection���ϵ����ݽṹֻ���Ԫ����Ч��
 * 
 * Map���ϵĹ��ܸ�����
 * 1:��ӹ���
 * 		V put(K key,V value):���Ԫ�ء������ʵ������һ������? �����޸�Ԫ�ء�
 * 			������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
 * 			��������ǵ�һ�δ洢��������ֵ�滻��ֵ�����ؾ�ֵ
 * 		void putAll(Map<? extends K,? extends V> m)����һ�����ϵ�������ӵ���һ�������У����潲
 * 2:ɾ������
 * 		void clear():�Ƴ����еļ�-ֵ��Ԫ��
 * 		V remove(Object key)�����ݼ�ɾ����-ֵ��Ԫ�أ�����ֵ����
 * 3:�жϹ���
 * 		boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
 * 		boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
 * 		boolean isEmpty()���жϼ����Ƿ�Ϊ��
 * 		boolean equals(Object o)���ж����������Ƿ���ȣ����潲
 * 4:��ȡ����
 * 		Set<Map.Entry<K,V>> entrySet():��ȡmapʵ����󣬺��潲
 * 		V get(Object key):���ݼ���ȡֵ
 * 		Set<K> keySet():��ȡ���м��ļ���
 * 		Collection<V> values():��ȡ����ֵ�ļ���
 * 5�����ȹ���
 * 		int size()�����ؼ����еļ�-ֵ�Եĸ���
 */
package com.yida_01.map;

import java.util.HashMap;
import java.util.Map;

public class A_Map {

	public static void main(String[] args) {
		// V put(K key,V value):���Ԫ�ء������ʵ������һ������? �����޸�Ԫ�ء�
		// ������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null;��������ǵ�һ�δ洢��������ֵ�滻��ֵ�����ؾ�ֵ
		Map<Integer, String> map = new HashMap<Integer, String>();
		// ˼����1�����֣�������ҪInteger���͡�Ϊʲô����ֱ��д�أ� --JDK5������-�Զ�װ��
		System.out.println(map.put(1, "����"));// ��һ�δ洢������null����ʱ��put����ӹ���
		System.out.println(map.put(1, "������"));// ���ǵ�һ�δ洢��������ֵ�滻��ֵ�����ؾ�ֵ����ʱ��put���޸Ĺ���
		System.out.println(map);// ��ӡ���Ϊ{1=������}��=ǰ��key,=����value

		map.put(1, "����");// ������������ѧ�ţ�1
		map.put(2, "����");
		map.put(3, "����");
		map.put(4, "����");
		System.out.println(map);
		System.out.println("------");

		// void clear():�Ƴ����еļ�-ֵ��Ԫ��
		// map.clear();
		// System.out.println(map);

		// V remove(Object key)�����ݼ�ɾ����-ֵ��Ԫ�أ�����ֵ����
		// map.remove(3);
		// map.remove(30);// ��keyû�У�ʲôҲ������
		// System.out.println(map);

		// boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
		// System.out.println(map.containsKey(2));//�У�����true
		// System.out.println(map.containsKey(20));//û�У�����false

		// boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
		// System.out.println(map.containsValue("����"));//�У�����true
		// System.out.println(map.containsValue("���ĳ�"));//û�У�����false

		// boolean isEmpty()���жϼ����Ƿ�Ϊ��
		// System.out.println(map.isEmpty());//Ϊ�գ�����true; ��Ϊ�գ�����false

		// V get(Object key):���ݼ���ȡֵ
		// System.out.println(map.get(2));// �У�����ָ��key��Ӧ��value
		// System.out.println(map.get(20));// û��ָ��key���򷵻�null

		// Set<K> keySet():��ȡ���м��ļ���
		// Set<Integer> set = map.keySet();
		// // ��ǿfor����
		// for (Integer key : set) {
		// System.out.println(key);
		// }
		// System.out.println("------");
		// // ����������
		// Iterator<Integer> it = set.iterator();
		// while (it.hasNext()) {
		// Integer key = it.next();
		// System.out.println(key);
		// }

		// Collection<V> values():��ȡ����ֵ�ļ���
		// Collection<String> c = map.values();
		// // ��ǿfor����
		// for (String value : c) {
		// System.out.println(value);
		// }
		// System.out.println("------");
		// // ����������
		// Iterator<String> it = c.iterator();
		// while (it.hasNext()) {
		// String value = it.next();
		// System.out.println(value);
		// }

		// int size()�����ؼ����еļ�-ֵ�Եĸ���
		// System.out.println(map.size());
	}

}
