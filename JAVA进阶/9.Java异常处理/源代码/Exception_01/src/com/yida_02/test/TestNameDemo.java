package com.yida_02.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestNameDemo {
	
	// 这些是已经注册的用户信息，来自数据库
	private static List<String> list = new ArrayList<String>();
	
	//通过代码块 从数据库中取数据
	static {
		list.add("huangxiaoming");
		list.add("dengchao");
		list.add("luhan");
		list.add("anglababy");
		list.add("hejiong");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入注册用户名：");
		String name = sc.nextLine();
		
		try {
			boolean exist = checkName(name);
			if (!exist) {
				list.add(name);
			}
		} catch (NameExistException e) {
			e.printStackTrace();
		}
		
		//打印
		for (String na : list) {
			System.out.println(na);
		}
	}
	
	//检查用户是否存在
	public static boolean checkName(String name) throws NameExistException {
		for (String n : list) {
			if (n.equals(name)) {
				throw new NameExistException(name+"已经存在了！");
			}
		}
		
		return false;
	}

}
