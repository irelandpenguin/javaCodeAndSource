/*
	this : 是当前类的对象引用。简单的记，它就代表当前类的一个对象。
		注意：外界调哪个对象，this就代表那个对象。
		
	this的使用场景：
		用于解决局部变量隐藏成员变量。
*/
class Student {
	private String name;
	private int age;
	private char sex;
	
	//设置姓名
	public void setName(String name) {
		this.name = name;//这里的this就代表当前对象本身
	}
	
	//获取姓名
	public String getName() {
		return name;//隐式的调用成员变量，this关键字隐藏了
		//return this.name;//显示的调用成员变量
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
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//显示学生信息
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age+",性别:"+sex);
		//System.out.println("姓名:"+this.name+",年龄:"+this.age+",性别:"+this.sex);
	}
	
}

class StudentDemo2 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("王五");
		stu.setAge(28);
		stu.setSex('M');
		System.out.println("姓名:"+stu.getName()+",年龄:"+stu.getAge()+",性别:"+stu.getSex());
		
		
		Student stu2 = new Student();
		stu2.setInformation("宜达互联", 5, '男');
		stu2.show();
		
	}
}
