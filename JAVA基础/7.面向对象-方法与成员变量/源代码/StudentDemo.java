/*
	类 class
		定义：描述一个事物的具体信息。
		有2部分组成
			<1>.成员变量
			<2>.成员方法
					实例方法 不带static修饰的，由对象调用，属于对象的范畴
					静态方法 使用static修饰的，由类名调用，属于类本身
	
	类的使用
		如何创建对象呢?
			格式：类名 对象名 = new 类名();
			举例：Student stu = new Student();
		
		如何使用成员变量呢?
			对象名.变量名
			
		如何使用成员方法呢?
			对象名.方法名(...)
			
	我们在一个java文件中写两个类，一个学生类，一个测试类。来练习面向对象。
	注意：文件名称和测试类名称一致。这样在使用控制台编译时，即javac StudentDemo.java，
	会自动生成StudentDemo.class和Student.class两个字节码文件，供jvm使用。
	
*/
class Student {
	String name;//姓名，默认值为null
	int age;//年龄，默认值为0
	char sex;//性别，默认值为'\u0000'
	String address;//地址，默认值为null
	
	//实例方法
	public void hello() {//该方法的功能：打个招呼
		System.out.println("你好，我是一名学生");
	}
	
	public void show() {//该方法的功能：打印学生信息
		System.out.println("姓名:"+name+", 年龄:"+age+", 性别:"+sex+", 地址:"+address);
	}
	
	//静态方法(或者 类方法)
	public static void hi() {
		System.out.println("大家，新年好！！");
	}
}

class StudentDemo {
	public static void main(String[] args) {
		Student stu = new Student();
		 
		stu.hello();//打个招呼
		stu.show();//显示学生信息
		
		System.out.println("-----------");
		
		//设置学生信息
		stu.name = "宜达互联";
		stu.age = 5;
		stu.sex = 'M';
		stu.address = "福田车公庙，皇冠科技园2栋3楼";
		
		stu.show();//显示学生信息
		
		//再创建一个对象
		Student stu2 = new Student();
		stu2.name = "成龙";
		stu2.age = 60;
		stu2.sex = 'M';
		stu2.address = "香港";
		stu2.show();//调用实例方法
		
		//调用静态方法
		Student.hi();
		stu.hi();
		stu2.hi();
		//我们的静态方法(类方法)即可以由类名调用，也可以由对象调用！它比较友好！
		
		//Student.show();//实例方法只能由实例对象调用，不能由类名调用！！
	}
}