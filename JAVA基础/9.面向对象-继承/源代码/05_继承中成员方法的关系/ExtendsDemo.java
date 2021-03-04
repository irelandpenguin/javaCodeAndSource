/*
	继承中成员方法的关系:
		A:子类中的方法和父类中的方法声明不一样，这个太简单。
		B:子类中的方法和父类中的方法声明一样，这个该怎么玩呢?
			通过子类对象调用方法：
				a:先找子类中，有就使用
				b:再看父类中，有就使用
				c:如果都没有就报错。
*/

/*
class Father {
	public String name;
	public int age;
	
	public Father(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("姓名:"+name+",年龄:"+age);
	}
}

class Son extends Father {
	private char sex;
	
	public Son(String name, int age, char sex) {
		super(name, age);//显示调用父类的带参构造方法，来初始化自己的name和age
		this.sex = sex;
	}
	
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age+",性别:"+sex);
	}
}
*/


class Father {
	public String name;
	public int age;
	
	public Father(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age);
	}
}


class Son extends Father {
	private char sex;
	
	public Son(String name, int age, char sex) {
		super(name, age);//调用父类的构造方法，来初始化自己的name和age
		this.sex = sex;
	}
	
	//下面的注释掉，会调用父类的show()方法，来打印自己的name和age
	//不注释，则直接调用自己的show()方法，来打印自己的name, age和sex
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age+",性别:"+sex);
	}
}


class ExtendsDemo {
	public static void main(String[] args) {
		Son s = new Son("张三", 25, 'M');
		s.show();
	}
}