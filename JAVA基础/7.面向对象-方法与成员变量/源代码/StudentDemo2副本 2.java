/*
	static除了能够修饰成员变量，它还可以修饰成员方法。
	
	总结：
		(1).类方法只能调用类成员变量和类方法;
		(2).成员方法可以调用一切。
*/
class Student {
	private String name;
	private int age;
	private static String country;//国籍是静态的
	
	public Student(){}
	
	public Student(String name, int age, String country) {
		this.name = name;
		this.age = age;
		Student.country = country;//推荐使用类名调用
	}
	
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age+",国籍:"+country);
	}
	
	public void update1(String name, int age, String country) {
		this.name = name;
		this.age = age;
		Student.country = country;//推荐这样用。因为类成员变量本来就属于类，不属于某个对象。
		
		show();
		
		hello1();//这是隐式调用,推荐！！
		//this.hello1();//这样调用也对的，这是显示调用
		
		//hello2();//实例对象共享静态修饰的成员(成员变量，成员方法)
		Student.hello2();//推荐！！
	}
	
	public static void update2(String name, int age, String country) {
		/*
		this.name = name;//报错！！在静态方法中，不能使用this，因为类方法属于整个类，不属于某个对象! 这个要记住!
		this.age = age;
		this.country = country;
		*/
		
		
		Student.country = country;//可以！！在静态方法中，可以访问类成员变量。需要使用类名调用
		
		//hello1();//报错！！在静态方法中，不能访问成员方法
		//hello2();//可以！！在静态方法中，可以访问静态方法(我们也叫它类方法)
		//Student.hello2();//可以！！这个类方法也可以由类名调用，与类成员变量调用一样的。
	}
	
	public void hello1() {
		System.out.println("hello1");
	}	
	
	public static void hello2() {
		System.out.println("hello2");
	}
}

class StudentDemo2 {
	public static void main(String[] args) {
		Student s1 = new Student("张三", 26, "中国");
		s1.show();
		
		Student s2 = new Student("李四", 34, "中国");
		s2.show();
		
		Student s3 = new Student("王五", 21, "中国");
		s3.show();
		
		
		System.out.println("----------");
		
		s1.update1("张小生", 33, "埃及");
		
		
		System.out.println("----------");
		
		s1.update2("张大生", 43, "罗马帝国");
	}
}
