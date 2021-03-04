package com.yida_02.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestNameDemo {
	
	// ��Щ���Ѿ�ע����û���Ϣ���������ݿ�
	private static List<String> list = new ArrayList<String>();
	
	//ͨ������� �����ݿ���ȡ����
	static {
		list.add("huangxiaoming");
		list.add("dengchao");
		list.add("luhan");
		list.add("anglababy");
		list.add("hejiong");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ע���û�����");
		String name = sc.nextLine();
		
		try {
			boolean exist = checkName(name);
			if (!exist) {
				list.add(name);
			}
		} catch (NameExistException e) {
			e.printStackTrace();
		}
		
		//��ӡ
		for (String na : list) {
			System.out.println(na);
		}
	}
	
	//����û��Ƿ����
	public static boolean checkName(String name) throws NameExistException {
		for (String n : list) {
			if (n.equals(name)) {
				throw new NameExistException(name+"�Ѿ������ˣ�");
			}
		}
		
		return false;
	}

}
