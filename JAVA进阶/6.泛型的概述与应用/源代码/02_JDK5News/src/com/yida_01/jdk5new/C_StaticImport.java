/*
 * ��̬���룺
 * ��ʽ��import static ������.����.������;
 * ����ֱ�ӵ��뵽�����ļ���
 * 
 * ��̬�����ע�����
 * 		A:���������Ǿ�̬��
 * 		B:����ж��ͬ���ľ�̬���������ײ�֪��ʹ��˭?���ʱ��Ҫʹ�ã������ǰ׺���ɴ˿ɼ������岻������һ�㲻�ã�����Ҫ�ܿ�����
 */
package com.yida_01.jdk5new;

//��̬����
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class C_StaticImport {

	public static void main(String[] args) {
		System.out.println(Math.max(100, 50));//100
		System.out.println(Math.min(100, 50));//50
		System.out.println(Math.abs(-35));//35

		System.out.println("------");
		
		// ��Ҳ��������д
		System.out.println(java.lang.Math.max(100, 50));
		System.out.println(java.lang.Math.min(100, 50));
		System.out.println(java.lang.Math.abs(-35));

		System.out.println("------");

		// ��̬������ҾͿ�������д
		System.out.println(max(100, 50));//�������д�˸�ͬ��max���������б���
		System.out.println(min(100, 50));
		System.out.println(abs(-35));
		
		/*
		// ���洴��һ����̬����������Ϊmax��Ȼ�󿴱�����
		// �ᷢ�ֱ����ˣ�ͬ���ľ�̬��������������֪��ʹ��˭�ˡ�
		// ���ʱ��Ҫʹ�ã������ǰ׺���ɴ˿ɼ������岻������һ�㲻�á���Ҫ�ܿ�����
		System.out.println(java.lang.Math.max(100, 50));
		*/
	}

	/*public static void max() {
		System.out.println("hello");
	}*/
}
