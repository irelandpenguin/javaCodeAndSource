/*
	类的组成：
		成员变量：
		构造方法：
		成员方法：
		
	而现在我们又讲解了继承，所以，我们就应该来考虑一下，类的组成部分的各自关系。
	
	继承中成员变量的关系:
		A:子类中的成员变量和父类中的成员变量名称不一样，直接访问就可以了。
		B:子类中的成员变量和父类中的成员变量名称一样，这个怎么玩呢?
			在子类方法中访问一个变量的查找顺序：
				a:在子类方法的局部范围找，有就使用
				b:在子类的成员范围找，有就使用
				c:在父类的成员范围找，有就使用
				d:如果还找不到，就报错。
				
	如果我想要把局部的，成员的，父类的成员变量一次性都访问了。怎么解决呢？
		这里需要使用关键字 this  super
		
	this和super的区别?
			this代表子类引用，可以操作子类的成员
			super代表父类引用,可以操作父类的成员

	怎么用呢?
		A:调用成员变量
			this.成员变量 调用本类的成员变量	
			super.成员变量 调用父类的成员变量
		B:调用构造方法
			this(...)	调用本类的构造方法
			super(...)	调用父类的构造方法		
		C:调用成员方法
			this.成员方法 调用本类的成员方法
			super.成员方法 调用父类的成员方法
*/

/*
class Father {
	public String name = "李四";
	public int age = 45;
	
	public void showFather() {
		System.out.println("姓名:"+name+",年龄:"+age);
	}
}

class Son extends Father {
	public String name2 = "李小四";
	public int age2 = 18;
	
	public void showSon() {
		System.out.println("姓名:"+name2+",年龄:"+age2);
	}
}
*/


class Father {
	public String name = "李四";
	public int age = 45;
	
	public void showFather() {
		System.out.println("姓名:"+name+",年龄:"+age);
	}
}

class Son extends Father {
	public String name = "李小四";
	public int age = 18;
	
	public void showSon() {
		//String name = "李小小四";
		//int age = 8;
		System.out.println("姓名:"+name+",年龄:"+age);
	}
	
	public void show() {
		String name = "李小小四";
		int age = 8;
		System.out.println("姓名:"+name+",年龄:"+age);//打印局部变量的
		System.out.println("姓名:"+this.name+",年龄:"+this.age);//打印成员变量的
		System.out.println("姓名:"+super.name+",年龄:"+super.age);//打印父类成员变量的
	}
}


class ExtendsDemo {
	public static void main(String[] args) {
		//Father fa = new Father();
		//fa.showFather();
		
		//System.out.println("---------");
		
		Son so = new Son();
		//so.showSon();
		
		//System.out.println("---------");
		
		so.show();
	}
}