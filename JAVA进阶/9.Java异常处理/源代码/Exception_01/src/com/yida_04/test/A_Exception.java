package com.yida_04.test;

import java.text.ParseException;

/**
 * �쳣ע������:
 * A:������д���෽��ʱ������ķ��������׳���ͬ���쳣�����쳣������;
 * B:��������׳��˶���쳣,������д����ʱ,ֻ���׳���ͬ���쳣�����������Ӽ�,���಻���׳�����û�е��쳣;
 * C:�������д�ķ���û���쳣�׳�,��ô����ķ������Բ������׳��쳣,������෽�������쳣����,��ô����ֻ��try,����throws��
 */
public class A_Exception {

	public static void main(String[] args) {
		Zi zi = new Zi();
		try {
			zi.print();
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		/*try {
			zi.show();// �����׳����쳣�������߱��봦��
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		//zi.method();// ����û���׳��쳣�������߲��ô���
	}
}

class Fu {
	public void show() throws Exception {

	}
	
	public void print() throws NullPointerException,StringIndexOutOfBoundsException,ArrayIndexOutOfBoundsException,ParseException {
		
	}

	public void method() {

	}
}

class Zi extends Fu {
	@Override
	public void show() throws Exception {
		System.out.println("hello");
	}
	
	public void print() throws StringIndexOutOfBoundsException, ArrayIndexOutOfBoundsException, NullPointerException, ParseException {
		super.print();
		System.out.println("world");
	}
	
	@Override
	public void method() {
		try {
			
		} catch (Exception e) {
			
		}
	}

	/*@Override
	public void show() throws ParseException {
		String s = "2018-08-08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(s);
		System.out.println(date);
	}

	@Override
	public void method() {
		String s = "2018-08-08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date);
	}*/
}
