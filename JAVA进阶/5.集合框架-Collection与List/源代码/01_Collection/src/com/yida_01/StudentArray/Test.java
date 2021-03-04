package com.yida_01.StudentArray;
/**
 * 我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。
 *		 学生：Student
 *		 成员变量：name,age
 *		 构造方法：无参,带参
 *		 成员方法：getXxx()/setXxx()
 *		 如何存储学生的数组?
 * 分析：
 * 		A:创建学生类。
 * 		B:创建学生数组(对象数组)。
 * 		C:创建5个学生对象，并赋值。
 * 		D:把C步骤的元素，放到数组中。
 * 		E:遍历学生数组。
 */
public class Test {

	public static void main(String[] args) {
		//动态数组
		/*int[] a = new int[2];
		char[] b = new char[10];
		double[] c = new double[10];
		String[] d = new String[10];*/
		
		//静态数组
		/*int[] aa = {12, 21, 3, 45};
		char[] bb = new char[]{'a','b','c'};
		double[] cc = {3.13, 2.0,4.5};
		String[] dd = {"hello","world","yida"};*/
				
		Student[] arr = new Student[5];// 创建学生数组

		// 创建5个学生对象
		Student stu1 = new Student("张三", 24);
		Student stu2 = new Student("李四", 21);
		Student stu3 = new Student("王五", 32);
		Student stu4 = new Student("赵六", 29);
		Student stu5 = new Student("刘七", 26);

		// 把学生对象添加到数组里去
		arr[0] = stu1;
		arr[1] = stu2;
		arr[2] = stu3;
		arr[3] = stu4;
		arr[4] = stu5;

		// 打印数组元素
		for (int i = 0; i < arr.length; i++) {
			Student s = arr[i];
			System.out.println(s);
		}
	}

}
