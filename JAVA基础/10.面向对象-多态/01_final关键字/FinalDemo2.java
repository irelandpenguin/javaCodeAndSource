/*
	面试题：final修饰局部变量的问题
		基本类型：基本类型的值不能发生改变。
		引用类型：引用类型的地址值不能发生改变，但是，该对象的成员变量的值是可以改变的。
*/
class Son {
	public String name;
	public int age;
	
	public Son(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age);
	}
}

class FinalDemo2 {
	public static void main(String[] args) {
		//final修饰基本类型时，基本类型的值不能发生改变。
		int num = 10;
		final int num2 = 20;
		System.out.println("num="+num+",num2="+num2);
		num = 100;
		//num2 = 200;//报错！因为使用final修饰的值不能改变。
		System.out.println("num="+num+",num2="+num2);
		
		System.out.println("----------");
		
		//final修饰引用类型时，引用类型的地址值不能发生改变。但是，该对象的堆内存的值是可以改变的。
		final Son s = new Son("张小小", 12);
		s.show();
		
		//但是，该对象的堆内存的值是可以改变的。
		s.name = "张小";
		s.age = 14;
		s.show();
		
		//System.out.println("----------");
		
		//s = new Son("张小明", 16);//报错！因为final修饰的引用类型的地址不能发生改变。
		
	}
}