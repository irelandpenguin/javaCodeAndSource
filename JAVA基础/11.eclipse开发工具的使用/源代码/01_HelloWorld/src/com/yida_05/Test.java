package com.yida_05;
/**
 * 一个完整接口的创建与使用
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Father f = new Son("张三");//多态的体现(类比着记忆)
		f.song();//编译看左边，运行看右边
		f.dance();
		
		System.out.println("------------");
		
		f = new Daughter();
		Daughter d = (Daughter)f;//向下转型
		d.setName("张小红");
		d.song();
		d.dance();
		
		f = new Daughter("李小霞");
		f.song();//多态的体现
		f.dance();
	}

}
