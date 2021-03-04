/*	
		static关键字
		特点：
			A:它可以修饰成员变量，还可以修饰成员方法
			B:随着类的加载而加载,比如我们的main方法。
			C:被类的所有对象共享
			D:可以通过类名调用
				也可以通过对象名调用。
				推荐使用类名调用!
			
		静态修饰的成员，一般称为：类成员，比如：类成员变量，类成员方法。
		
		什么时候使用静态?	
	        如果某个成员变量或成员方法是被所有对象共享的，那么它就应该定义为静态的。
*/
class Student {
	private String name;
	private int age;
	//类成员变量
	public static String country;//国籍，static修饰，表示一个静态成员变量
	
	public Student() {}
	
	public Student(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
		//Student.country = country;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age+",国籍:"+country);
	}
	
	//类成员方法
	public static void hello() {
		System.out.println("你好！");
	}
}

class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("张三", 26, "中国");
		s1.show();
		
		Student s2 = new Student("李四", 34, "中国");
		s2.show();
		
		Student s3 = new Student("王五", 21, "中国");
		s3.show();
		
		
		System.out.println("----------");
		
		//接下来，修改下 张三的个人信息
		s1.setAge(28);
		//s1.country = "美国";
		Student.country = "美国";//推荐这样写，更好！
		
		//打印三人的信息
		s1.show();//张三 28 美国
		s2.show();//李四 34 中国
		s3.show();//王五 21 中国

		Student.hello();
	}
}