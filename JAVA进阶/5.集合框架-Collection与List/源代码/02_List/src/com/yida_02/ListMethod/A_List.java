/**
 * List集合的特有功能：
 * A:添加功能
 * 		void add(int index,Object element):在指定位置添加元素
 * 		boolean addAll(int index,  Collection c):将集合所有元素插入到指定索引位置
 * B:获取功能
 * 		Object get(int index):获取指定位置的元素
 * C:查询功能
 * 		int indexOf(Object o):返回集合中第一次出现的指定元素的索引
 * 		int lastIndexOf(Object o):返回集合中最后一次出现的指定元素的索引
 * D:删除功能
 * 		Object remove(int index)：根据索引删除元素,返回被删除的元素
 * E:修改功能
 * 		Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
 * F:列表迭代器
 * 		ListIterator listIterator()：List集合特有的迭代器
 */
package com.yida_02.ListMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class A_List {

	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 添加元素
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("hello");

		// void add(int index,Object element):在指定位置添加元素
		//list.add(1, "yida");
		//System.out.println(list);
		//list.add(10, "hulian");//运行异常，IndexOutOfBoundsException
		//list.add(list.size(), "hulian");
		//System.out.println(list);
		
		/*Collection c = new ArrayList();
		c.add("黄小明");
		c.add("邓超");
		c.add("陈赫");
		list.addAll(list.size(), c);
		System.out.println(list);*/

		// Object get(int index):获取指定位置的元素
		//System.out.println(list.get(0));
		//System.out.println(list.get(list.size()-1));
		//System.out.println(list.get(10));//运行异常，IndexOutOfBoundsException

		// int indexOf(Object o):返回集合中第一次出现的指定元素的索引
		// int lastIndexOf(Object o):返回集合中最后一次出现的指定元素的索引
		//System.out.println(list.indexOf("world"));
		//System.out.println(list.lastIndexOf("hello"));
		//System.out.println(list.indexOf("yida"));// 找不到，返回-1

		// Object remove(int index)：根据索引删除元素,返回被删除的元素
		//System.out.println(list.remove(0));
		//System.out.println("list:" + list);
		//System.out.println(list.remove(10));//运行异常，IndexOutOfBoundsException

		// Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
		list.set(1, "javase");
		list.set(list.size()-1, "yidahulian");// 修改最后一个，记住：索引从0开始的
		System.out.println("list:" + list);
	}

}
