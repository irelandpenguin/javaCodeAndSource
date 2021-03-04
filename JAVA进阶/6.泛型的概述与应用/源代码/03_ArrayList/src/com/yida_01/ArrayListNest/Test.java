/**
 * 集合的嵌套遍历
 * 需求：
 * 		我们班有多位学员，每位学员都是一个对象。所以我们可以使用一个集合来表示。即：ArrayList<Student>
 * 		但是呢，我想再开一个JAVA周末班，这个班是不是也是一个ArrayList<Student>。
 * 		那么，现在有多个ArrayList<Student>。也要用集合存储，怎么办呢?
 * 		可以这样用：ArrayList<ArrayList<Student>>
 */
package com.yida_01.ArrayListNest;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// 添加一班的学生信息
		ArrayList<Student> list1 = new ArrayList<Student>();
		Student stu1 = new Student("张三", 21);
		Student stu2 = new Student("李四", 32);
		Student stu3 = new Student("王五", 27);
		list1.add(stu1);
		list1.add(stu2);
		list1.add(stu3);

		// 添加二班的学生信息
		ArrayList<Student> list2 = new ArrayList<Student>();
		Student stu4 = new Student("吴京", 23);
		Student stu5 = new Student("李连杰", 22);
		Student stu6 = new Student("洪金宝", 20);
		list2.add(stu4);
		list2.add(stu5);
		list2.add(stu6);

		// 添加三班的学生信息
		ArrayList<Student> list3 = new ArrayList<Student>();
		Student stu7 = new Student("黄小明", 35);
		Student stu8 = new Student("邓超", 24);
		Student stu9 = new Student("鹿晗", 29);
		list3.add(stu7);
		list3.add(stu8);
		list3.add(stu9);

		// 把三个集合装到一个大集合里
		ArrayList<ArrayList<Student>> bigList = new ArrayList<ArrayList<Student>>();
		bigList.add(list1);
		bigList.add(list2);
		bigList.add(list3);

		// 增强for遍历
		for (ArrayList<Student> lit : bigList) {
			for (Student stu : lit) {
				System.out.println(stu);
			}
			System.out.println("------");
		}
		
		System.out.println("-------");
		
		//这里发散下思维：集合内嵌数组
		ArrayList<String[]> list4 = new ArrayList<String[]>();
		String[] arr1 = {"刘备","关于","曹操"};
		list4.add(arr1);
		String[] arr2 = {"hello","world","java"};
		list4.add(arr2);
		for(String[] arr : list4) {
			for(String s : arr) {
				System.out.println(s);
			}
		}
		
		
	}

}
