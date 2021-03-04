/*
	写以下程序的执行结果。
	
	"我是StudentDemo的静态代码块，只走一次哟"
	c = 8
	"我是Student静态代码块，只走一次哟"
	"宜达5岁了"
	"宜达5岁了"
	"宜达5岁了"
	"宜达互联6岁了"
*/

class Student {
	private String name;
	private int age;
	
	//构造代码块
	{
		name = "宜达";
		age = 5;
		System.out.println(name+age+"岁了");
	}
	
	//静态代码块
	static {
		System.out.println("我是Student静态代码块，只走一次哟");
	}
	
	public Student() { }//无参构造
	public Student(String name, int age) {//带参构造
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name+age+"岁了");
	}
}

class StudentDemo {
	//静态代码块
	static {
		System.out.println("我是StudentDemo的静态代码块，只走一次哟");
	}
	
	public static void main(String[] args) {
		//局部代码块
		{
			int a = 3, b = 5, c;
			c = a+b;
			System.out.println("c="+c);
		}
		
		Student stu1 = new Student();
		stu1.show();
		Student stu2 = new Student("宜达互联", 6);
		stu2.show();
	}
}

//我是StudentDemo的静态代码块，只走一次哟
//c=8
//我是Student静态代码块，只走一次哟
//宜达5岁了
//宜达5岁了
//宜达5岁了
//宜达互联6岁了
