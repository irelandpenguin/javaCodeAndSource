package com.yidahulian_05;

/*
 * ����ģʽ��
 * 		����ʽ����һ���ؾʹ�������
 * 			�������°�ص��ң�����һ����ͷ��һ�ڳ��ꡣ(����һ���࣬������������)
 * 		����ʽ���õ�ʱ�򣬲�ȥ��������
 * 			������������������һ�̣��������ǿ���ͷ��(�õ���ʱ�򣬲�ȥ��������)
 * 
 * �����⣺����ģʽ��˼����ʲô?��дһ���������֡�
 * 
 * 		����ʹ�ã�����ʽ(�ǲ��������ĵ���ģʽ -- cpuִ�е�ԭ���Ա�֤)
 * 		����ʹ�ã�����ʽ(���ܻ������ĵ���ģʽ -- ���߳�ͬʱ��������(����synchronized���))
 * 			A:������(�ӳټ��أ����û�����)	
 * 			B:�̰߳�ȫ����(����synchronized���)
 */
public class TeacherDemo {

	public static void main(String[] args) {
		Teacher tea1 = Teacher.getTeacher();
		Teacher tea2 = Teacher.getTeacher();
		if (tea1 == tea2) {
			System.out.println(tea1);
			System.out.println(tea2);
			System.out.println("ͬһ������");
		}
	}

}
