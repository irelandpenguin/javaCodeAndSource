/*
	抽象类的成员特点：
		成员变量：既可以是变量，也可以是常量。
		构造方法：用于子类初始化父类的数据。
		成员方法：既可以是抽象的，也可以是非抽象的。
		
	抽象类的成员方法特性：
		A:抽象方法，必须要求子类实现。
		B:非抽象方法，子类继承，提高代码复用性。
*/
abstract class Fu {
	//成员变量
	public String name;
	public int age;
	
	//成员常量
	public final char sex = '男';
	
	//构造方法
	public Fu() {}
	
	public Fu(String name, int age) {//因为sex用final修饰了，是不能更改的。所以，参数里不包括sex
		this.name = name;
		this.age = age;
	}
	
	//成员方法
	public abstract void eat();
	
	public void sleep() {
		System.out.println("天黑了，睡觉");
	}
}

class Zi extends Fu {
	//成员变量...
	
	//构造方法
	public Zi() {}//这里会隐式的调用父类无参构造
	
	public Zi(String name, int age) {
		super(name, age);//显示的调用父类的带参构造，初始化父类的数据
	}
	
	//成员方法
	public void eat() {
		System.out.println("吃牛排配米饭");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		Fu f = new Zi();//多态的体现
		f.name = "王五";
		f.age = 30;
		System.out.println(f.name+"---"+f.age+"---"+f.sex);
		f.eat();
		f.sleep();
		
		System.out.println("----------");
		
		
		f = new Zi("张三", 26);
		System.out.println(f.name+"---"+f.age+"---"+f.sex);
		f.eat();
		f.sleep();
		
	}
}
