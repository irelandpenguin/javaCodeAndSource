/*
	构造方法：
		给对象的数据进行初始化

	格式：
		A:方法名与类名相同
		B:没有返回值类型，连void都没有
		C:没有具体的返回值
		
	构造方法的注意事项:
		A:如果我们没有给出构造方法，系统将自动提供一个无参构造方法。
		B:如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
			注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出。建议永远自己给出无参构造方法!
		
	给成员变量赋值有三种方式：
		A:setXxx()
		B:构造方法
		C:带多个参数的普通方法
*/
class Student {
	private String name;
	private int age;
	private char sex;
	
	//构造方法(无参)
	public Student() {
		System.out.println("我是无参构造方法");
	}
	
	
	//构造方法(带3个参数)
	public Student(String name, int age, char sex) {
		System.out.println("我是带3个参数的构造方法");
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//设置姓名
	public void setName(String name) {
		this.name = name;
	}
	
	//获取姓名
	public String getName() {
		return name;
	}
	
	//设置年龄
	public void setAge(int age) {
		this.age = age;
	}
	
	//获取年龄
	public int getAge() {
		return age;
	}
	
	//设置性别
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	//获取性别
	public char getSex() {
		return sex;
	}
	
	//设置学生信息
	public void setInformation(String name, int age, char sex) {
		System.out.println("我是普通方法，只不过带了3个参数");
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//显示学生信息
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age+",性别:"+sex);
	}
}

class ConstructDemo {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("张三");
		stu.setAge(30);
		stu.setSex('男');
		System.out.println("姓名:"+stu.getName()+",年龄:"+stu.getAge()+",性别:"+stu.getSex());
		
		Student stu2 = new Student("李四",32,'女');
		System.out.println("姓名:"+stu2.getName()+",年龄:"+stu2.getAge()+",性别:"+stu2.getSex());
		
		Student stu3 = new Student();
		stu3.setInformation("王五",34,'男');
		stu3.show();
		
	}
}