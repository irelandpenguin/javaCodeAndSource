/*
	类的组成：成员变量，成员方法
		今天我们又加入了一个新的成员：构造方法。
		以后再提类的组成：
			成员变量
			构造方法
			成员方法
		
		
	一个标准类的最终版。
	
	学生类：
		成员变量：
			name，age，sex
		构造方法：
			无参构造，带三个参数的构造
		成员方法：
			getXxx()/setXxx()
			show()：输出该类的所有成员变量值
			
	给成员变量赋值：
		A:setXxx()方法
		B:构造方法
		
	输出成员变量值的方式：
		A:通过getXxx()分别获取然后拼接
		B:通过调用show()方法搞定
*/
class Student {
	private String name;
	private int age;
	private char sex;
	
	//以下是构造方法
	public Student() {
		
	}
	
	public Student(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//以下是setXxx与getXxx方法
	//设置姓名
	public void setName(String name) {
		this.name = name;
	}
	
	//获取姓名
	public String getName() {
		return name;
	}
	
	//设置年龄
	public void setAge(int age) {
		this.age = age;
	}
	
	//获取年龄
	public int getAge() {
		return age;
	}
	
	//设置性别
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	//获取性别
	public char getSex() {
		return sex;
	}
	
	//显示学生详细信息
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age+",性别:"+sex);
	}
}


class StandardDemo2 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("宜达互联");
		stu.setAge(5);
		stu.setSex('男');
		System.out.println("姓名:"+stu.getName()+",年龄:"+stu.getAge()+",性别:"+stu.getSex());
		
		Student stu2 = new Student("王小平",28,'女');
		stu2.show();
	}
}