/*
 * Map集合的特点：
 * 		以键-值对的形式存储对象。键是唯一的，值可以重复。
 * 
 * Map集合和Collection集合的区别?
 * 		Map集合存储元素是成对出现的，可以把这个理解为：夫妻对
 * 		Collection集合存储元素是单独出现的，Collection的儿子Set是唯一的，List是可重复的。可以把这个理解为：光棍
 * 
 * 注意：
 * 		Map集合的键是唯一的，值是可重复的。
 * 		Map集合的数据结构只针对键有效，跟值无关。	
 *		Collection集合的数据结构只针对元素有效。
 * 
 * Map集合的功能概述：
 * 1:添加功能
 * 		V put(K key,V value):添加元素。这个其实还有另一个功能? 即：修改元素。
 * 			如果键是第一次存储，就直接存储元素，返回null
 * 			如果键不是第一次存储，就用新值替换旧值，返回旧值
 * 		void putAll(Map<? extends K,? extends V> m)：把一个集合的内容添加到另一个集合中，后面讲
 * 2:删除功能
 * 		void clear():移除所有的键-值对元素
 * 		V remove(Object key)：根据键删除键-值对元素，并把值返回
 * 3:判断功能
 * 		boolean containsKey(Object key)：判断集合是否包含指定的键
 * 		boolean containsValue(Object value):判断集合是否包含指定的值
 * 		boolean isEmpty()：判断集合是否为空
 * 		boolean equals(Object o)：判断两个集合是否相等，后面讲
 * 4:获取功能
 * 		Set<Map.Entry<K,V>> entrySet():获取map实体对象，后面讲
 * 		V get(Object key):根据键获取值
 * 		Set<K> keySet():获取所有键的集合
 * 		Collection<V> values():获取所有值的集合
 * 5：长度功能
 * 		int size()：返回集合中的键-值对的个数
 */
package com.yida_01.map;

import java.util.HashMap;
import java.util.Map;

public class A_Map {

	public static void main(String[] args) {
		// V put(K key,V value):添加元素。这个其实还有另一个功能? 即：修改元素。
		// 如果键是第一次存储，就直接存储元素，返回null;如果键不是第一次存储，就用新值替换旧值，返回旧值
		Map<Integer, String> map = new HashMap<Integer, String>();
		// 思考：1是数字，这里需要Integer类型。为什么可以直接写呢？ --JDK5新特性-自动装箱
		System.out.println(map.put(1, "张三"));// 第一次存储，返回null。此时的put是添加功能
		System.out.println(map.put(1, "张三疯"));// 不是第一次存储，就用新值替换旧值，返回旧值。此时的put是修改功能
		System.out.println(map);// 打印结果为{1=张三疯}，=前是key,=后是value

		map.put(1, "张三");// 姓名：张三，学号：1
		map.put(2, "李四");
		map.put(3, "王五");
		map.put(4, "赵六");
		System.out.println(map);
		System.out.println("------");

		// void clear():移除所有的键-值对元素
		// map.clear();
		// System.out.println(map);

		// V remove(Object key)：根据键删除键-值对元素，并把值返回
		// map.remove(3);
		// map.remove(30);// 此key没有，什么也不做。
		// System.out.println(map);

		// boolean containsKey(Object key)：判断集合是否包含指定的键
		// System.out.println(map.containsKey(2));//有，返回true
		// System.out.println(map.containsKey(20));//没有，返回false

		// boolean containsValue(Object value):判断集合是否包含指定的值
		// System.out.println(map.containsValue("李四"));//有，返回true
		// System.out.println(map.containsValue("李四成"));//没有，返回false

		// boolean isEmpty()：判断集合是否为空
		// System.out.println(map.isEmpty());//为空，返回true; 不为空，返回false

		// V get(Object key):根据键获取值
		// System.out.println(map.get(2));// 有，返回指定key对应的value
		// System.out.println(map.get(20));// 没有指定key，则返回null

		// Set<K> keySet():获取所有键的集合
		// Set<Integer> set = map.keySet();
		// // 增强for遍历
		// for (Integer key : set) {
		// System.out.println(key);
		// }
		// System.out.println("------");
		// // 迭代器遍历
		// Iterator<Integer> it = set.iterator();
		// while (it.hasNext()) {
		// Integer key = it.next();
		// System.out.println(key);
		// }

		// Collection<V> values():获取所有值的集合
		// Collection<String> c = map.values();
		// // 增强for遍历
		// for (String value : c) {
		// System.out.println(value);
		// }
		// System.out.println("------");
		// // 迭代器遍历
		// Iterator<String> it = c.iterator();
		// while (it.hasNext()) {
		// String value = it.next();
		// System.out.println(value);
		// }

		// int size()：返回集合中的键-值对的个数
		// System.out.println(map.size());
	}

}
