/*
	继承的注意事项：
		A:子类只能继承父类所有非私有的成员(成员方法和成员变量)
		B:子类不能继承父类的构造方法，但是可以通过super关键字去访问父类构造方法。(后面讲)
		
	那么，我们什么时候考虑使用继承呢?
		继承是一种关系："is a"。比如：
			Person
				Student
				Teacher
			水果(Fruits)
				苹果(Apple)
				香蕉
				橘子
		采用假设法，只要符合我们的生活常识，就可以使用继承。
		
			不符合生活常识的，不能使用继承。比如：
			电脑(Computer)
				Student（不符合）
				Mac Air(符合)
			狗(Dog)
				Person(不符合)
				狼狗(符合)
*/

class Father {
	private String name;//私有的成员，不能继承
	public int age;//公有的成员，可以继承
	
	private void show1() {//私有的，不能继承
		System.out.println("姓名:"+name+",年龄:"+age);
	}
	
	public void show2() {//公有的，可以继承
		System.out.println("姓名:"+name+",年龄:"+age);
	}
}

class Son extends Father {
	private char sex;
	
	public void setInfo(String name, int age, char sex) {
		//this.name = name;//因为name是私有的，子类没有继承，所以，这里找不到name，导致报错!
		this.age = age;//因为age是公有的，子类继承了。所以可以正常使用
		this.sex = sex;
	}
	
	
	public void showSon() {
		//this.show1();//因为show1()是私有的，子类没有继承，所以，这里找不到show1()方法，导致报错！
		this.show2();//show2()方法是公有的，所以子类能直接调用，也是正确的
		System.out.println("性别:"+sex);
	}
	
}

class ExendsDemo {
	public static void main(String[] args) {
		Son so = new Son();
		so.setInfo("张三", 30, '男');
		so.showSon();
	}
}