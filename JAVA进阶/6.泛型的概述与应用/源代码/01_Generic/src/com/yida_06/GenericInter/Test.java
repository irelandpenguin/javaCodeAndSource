package com.yida_06.GenericInter;

import java.util.ArrayList;

/**
 * ���Է��ͽӿ� 
 */
public class Test {

	public static void main(String[] args) {
		//�ӿ�ʵ���ָ࣬����������
		MyInter<String> mi = new MyInterImpl();
		mi.show("��ã�JAVA��");
		System.out.println(mi.print("��ã��˴"));

		System.out.println("--------");
		
		//�ӿ�ʵ���࣬δָ����������
		//ArrayList<String> list = new ArrayList<String>();
		//list.add("hello");
		//list.add("world");
		//list.add(Integer.valueOf(100));
		
		//String
		MyInter<String> mi2 = new WinInterImpl<String>();
		mi2.show("�⾩��ս��2����!");
		System.out.println(mi2.print("���ߵ���ȭҲ�ÿ�!"));
		
		//Integer
		MyInter<Integer> mi3 = new WinInterImpl<Integer>();
		mi3.show(100);//jdk5�����ԣ��Զ�װ��
		System.out.println(mi3.print(new Integer(200)));
		
		//Character
		MyInter<Character> mi4 = new WinInterImpl<Character>();
		mi4.show('A');
		System.out.println(mi4.print('B'));
		
		//Double
		MyInter<Double> mi5 = new WinInterImpl<Double>();
		mi5.show(3.14);//jdk5�����ԣ��Զ�װ��
		System.out.println(mi5.print(6.28));
		
		//Movie
		Movie mv = new Movie("�캣�ж�", "2018.2.8");
		MyInter<Movie> mi6 = new WinInterImpl<Movie>();
		mi6.show(mv);
		System.out.println(mi6.print(mv));
	
		
		// ���ͨ��API���鿴��ArrayList�����������ʵ�����ķ��ͽӿڵġ�
		
		
		int num = mi.sum(100, 20);
		System.out.println(num);
		
		num = mi6.sum(20, 40);
		System.out.println(num);
		
	}

}
