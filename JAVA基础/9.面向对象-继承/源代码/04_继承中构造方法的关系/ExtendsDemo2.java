/*
	如果把父类的构造方法都注释掉，请问父类还有构造方法吗？
		一定有！因为它本身自带有一个隐藏的无参构造方法。

	如果父类没有无参构造方法，那么子类的构造方法会出现什么现象呢?
		报错!!
	
	如何解决呢?	
		A:在父类中加一个无参构造方法
		B:通过使用super关键字去显示的调用父类的带参构造方法
			
	注意事项：
		this(...)或者super(...)必须出现在第一条语句上!!!
		如果不是放在第一条语句上，就可能对父类的数据进行了多次初始化，所以必须放在第一条语句上。
			public Son() {
				//这里会隐性的调用一次super();
				System.out.println("Son的无参构造方法");
				super();//如果放在这里，会多调用一次!
			}
			
	这里再复习下 继承的注意事项：
		A:子类只能继承父类所有非私有的成员(成员方法和成员变量)
		B:子类不能继承父类的构造方法，但是可以通过super关键字去访问父类构造方法。
*/
class Father {
	public String name;
	public int age;
	
	public Father() {
		System.out.println("Father的无参构造方法");
	}
	
	
	public Father(String name, int age) {
		System.out.println("Father的带参构造方法");
		this.name = name;
		this.age = age;
	}
	
}

class Son extends Father {
	public Son() {
		//super();//显示调用父类无参构造方法
		//super("",0);//显示调用父类带参构造方法
		System.out.println("Son的无参构造方法");
	}
	
	public Son(String name, int age) {
		//super(name, age);//显示调用父类带参构造方法
		System.out.println("Son的带参构造方法");
		this.name = name;
		this.age = age;
	}
}

class ExtendsDemo2 {
	public static void main(String[] args) {
		Son s = new Son();
		
		System.out.println("---------");
		
		Son s2 = new Son("张三", 27);
	}
}