/**
 * 问题：我有一个集合，我想判断里面有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现。
 */
package com.yida_03.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A_Iterator {

	public static void main(String[] args) {
		List lt = new ArrayList();
		lt.add("hello");
		lt.add("world");
		lt.add("java");
		
		//第一种方式：普通for实现
		/*for (int i = 0; i < lt.size(); i++) {
			String s = (String)lt.get(i);
			if (s.equals("world")) {
				lt.add("javase");
			}
		}
		System.out.println(lt);*/
		
		//第二种方式：普通for+toArray()来实现
		/*Object[] arr = lt.toArray();
		for (int i = 0; i < arr.length; i++) {
			String s = (String)arr[i];
			if (s.equals("world")) {
				lt.add("javase");
			}
		}
		System.out.println(lt);*/
		
		
		// 迭代器遍历
		
		//使用iterator触发 并发修改异常 报错;    ConcurrentModificationException;
		//迭代器是集合的专用遍历 增加新的元素正好更改内容导致出错；
			
		/*Iterator it = lt.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			if (s.equals("world")) {
				lt.add("javase");// 运行报错，ConcurrentModificationException,并发修改异常
				// 产生的原因：迭代器是依赖于集合而存在的，在判断成功后，集合的中新添加了元素，而迭代器却不知道，所以就报错了。
				// 其实这个问题描述的是：迭代器遍历元素的时候，通过集合是不能修改元素的。
			}
		}*/

		// 如何解决呢?
		// A:迭代器迭代元素，迭代器添加元素。新添加的元素是跟在刚才迭代的元素后面的。
		// B:集合遍历元素，集合添加元素(普通for)。新添加的元素在最后添加的。

		// 方式一：迭代器迭代元素，迭代器添加元素
		// 而Iterator迭代器没有add()添加功能方法，所以我们使用其子接口ListIterator
		ListIterator itr = lt.listIterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			if (s.equals("world")) {
				itr.add("javase");//迭代器添加元素，就不会报异常了
			}
		}
		System.out.println(lt);

		System.out.println("------");

		// 方式2：集合遍历元素，集合修改元素(普通for)
		/*for (int i = 0; i < lt.size(); i++) {
			String s = (String) lt.get(i);
			if (s.equals("world")) {
				lt.add("javase");
			}
		}
		System.out.println(lt);*/
	}

}
