/*
	继承概述：
		把多个类中相同的内容给提取出来定义到一个类中。
		
	继承的特点：
		java语言只支持单继承，不支持多继承。
		但java语言支持多层继承，比如：儿子继承父亲，父亲继承爷爷。
		class grandfather {public int num;}
		class father extends grandfather {}
		class son extends father {}
		
		
	如何实现继承呢?	
		Java提供了关键字：extends
		
	格式：
		class 子类名 extends 父类名 {}
		
	好处：
		A:提高了代码的复用性
		B:提高了代码的维护性
		C:让类与类之间产生了关系
	
	类与类产生了关系，其实也是继承的一个弊端：
		类的耦合性增强了。
		
		开发的原则：低耦合，高内聚。
		耦合：类与类的关系
		内聚：就是自己完成某件事情的能力
*/

//继承前
/*
//学生类
class Student {
	public String name;
	public int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age);
	}
}

//老师类
class Teacher {
	public String name;
	public int age;
	
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age);
	}
}
*/

//继承后
class Person {
	public String name;//这里不能用private，因为java语法规定私有的不能继承
	public int age;
	
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age);
	}
}

class Student extends Person {
	public Student(String name, int age) {//java语法规定，构造方法不能继承
		this.name = name;
		this.age = age;
	}
}

class Teacher extends Person {
	public Teacher(String name, int age) {//java语法规定，构造方法不能继承
		this.name = name;
		this.age = age;
	}
}

//测试类
class ExtendsDemo {
	public static void main(String[] args) {
		Student stu = new Student("张三", 27);
		stu.show();
		
		Teacher tea = new Teacher("Jerry", 33);
		tea.show();
	}
}



