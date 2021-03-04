/*
	关键字final表示 最终 的意思。
	
	final可以修饰类，方法，变量
	
	特点：
		final可以修饰类，不能被继承。
		final可以修饰方法，不能被重写。(覆盖)
		final可以修饰变量，不能被重新赋值。因为此时的变量其实是常量。
		
	常量：
		A:字面值常量
			"hello",10,true
		B:自定义常量
			final int x = 10;
*/

//final class Person {
class Person {
	/*final*/ public String name = "";
	public int age = 0;
	
	/*final*/ public void show() {
		System.out.println("姓名:"+name+",年龄:"+age);
	}
}

class Student extends Person {
	public void show() {
		System.out.println("学生的信息["+"姓名:"+name+",年龄:"+age+"]");
	}
}

class FinalDemo {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "宜达互联";
		stu.age = 5;
		stu.show();
	}
}