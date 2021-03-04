package com.yida_04.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class D_TreeMap {

	public static void main(String[] args) {
		// 创建对象
		TreeMap<Dog, String> tm = new TreeMap<Dog, String>(new Comparator<Dog>() {
					@Override
					public int compare(Dog o1, Dog o2) {
						// 主要条件，按年龄从大到小到排序
						int num = o2.getAge() - o1.getAge();// 从大到小排序
						// 次要条件，年龄相同，并不代表姓名相同
						int num2 = num == 0 ? o2.getName().compareTo(
								o1.getName()) : num;
						return num2;
					}
				});

		// 创建学生对象
		Dog stu1 = new Dog("邓超", 41);
		Dog stu2 = new Dog("黄小明", 32);
		Dog stu3 = new Dog("文章", 35);
		Dog stu4 = new Dog("周润发", 54);
		Dog stu5 = new Dog("邓朝", 42);
		Dog stu6 = new Dog("黄晓明", 33);
		Dog stu7 = new Dog("邓超", 41);

		// 添加到集合
		tm.put(stu1, "dengchao");
		tm.put(stu2, "huangxiaoming");
		tm.put(stu3, "wenzhang");
		tm.put(stu4, "zhouruifa");
		tm.put(stu5, "dengchao");
		tm.put(stu6, "huangxiaoming");
		tm.put(stu7, "dengchao");

		// 增强for遍历(键找值)
		Set<Dog> set = tm.keySet();
		for (Dog key : set) {
			String value = tm.get(key);// 注意：这里是字符串，不是学生
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}

		System.out.println("------");

		// 增强for遍历(键-值对对象找键和值)
		Set<Map.Entry<Dog, String>> entrys = tm.entrySet();
		for (Map.Entry<Dog, String> en : entrys) {
			Dog key = en.getKey();
			String value = en.getValue();
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}
	}

}
