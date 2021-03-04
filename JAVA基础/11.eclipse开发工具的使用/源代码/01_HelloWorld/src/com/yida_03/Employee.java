package com.yida_03;

public class Employee extends Person {
	private int number;//员工号
	
	//无参构造
	public Employee(){}
	//带参构造
	public Employee(String name, int age, int number) {
		super(name,age);//调用父类带参构造，初始化父类数据(就是父类的name和age)
		this.number = number;
	}
	
	//get和set方法
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	
	//成员方法
	public void show() {//方法重写！！！
		//super.show();//打印姓名和年龄
		//System.out.println(number);//打印员工号
		
		System.out.println(getName()+"---"+getAge()+"---"+number);
	}
}
