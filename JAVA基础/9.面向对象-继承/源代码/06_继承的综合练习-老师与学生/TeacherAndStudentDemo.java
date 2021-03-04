/*
	封装的综合练习
		老师与学生案例
		
	分析：
		老师，学生都属于人类，所以他们应于继承自人类。如下：
			Person
				Teacher 
				Student
*/
//定义一个人类
class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public String show() {
		String s = "姓名:"+name+",年龄:"+age;
		return s;
	}
}

//定义一个老师类
class Teacher extends Person {
	private int teacherNum;//教师编号
	
	public Teacher(String name, int age, int teacherNum) {
		super(name, age);//调用父类的构造方法，来初始化自己的name和age
		this.teacherNum = teacherNum;
	}
	
	public void showTeacher() {
		String info = super.show();//调用父类的show()方法，来获取自己的name和age
		System.out.println("老师信息["+info+",教师编号:"+teacherNum+"]");
	}
}

//定义一个学生类
class Student extends Person {
	private int studentNum;//学号
	
	public Student(String name, int age, int studentNum) {
		super(name, age);//调用父类的构造方法，来初始化自己的name和age
		this.studentNum = studentNum;
	}
	
	public void showStudent() {
		String info = super.show();//调用父类的show()方法，来获取自己的name和age
		System.out.println("学生信息["+info+",学号:"+studentNum+"]");
	}
}


class TeacherAndStudentDemo {
	public static void main(String[] args) {
		//创建一个学生对象
		Student stu = new Student("张三", 26, 9527);
		stu.showStudent();
		
		stu.setName("张三疯");
		stu.setAge(27);
		System.out.println(stu.getName()+", "+stu.getAge());
		
		System.out.println("----------");
		
		//创建一个老师对象
		Teacher tea = new Teacher("Jerry", 35, 20103305);
		tea.showTeacher();
		
		tea.setName("Mr. Jerry");
		tea.setAge(36);
		System.out.println(tea.getName()+", "+tea.getAge());
	}
}