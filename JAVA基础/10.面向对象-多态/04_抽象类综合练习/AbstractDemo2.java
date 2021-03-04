/*
	老师案例
*/
abstract class Person {
	//成员变量
	private String name;
	private int age;
	
	//构造方法
	public Person(){}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//成员方法
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
	
	public void teach(String name) {
		System.out.println("课目:"+name);
	}
	
	//抽象方法
	public abstract void teachTime();
}

class YuWenTeacher extends Person {
	//构造方法
	public YuWenTeacher() {}
	public YuWenTeacher(String name, int age) {
		super(name, age);//调用父类构造方法，初始化父类的数据
	}
	
	//成员方法
	public void teachTime() {
		System.out.println("时间:周一~周五 早上10：30到下午3:00");
	}
}

class ShuXueTeacher extends Person {
	//构造方法
	public ShuXueTeacher() {}
	public ShuXueTeacher(String name, int age) {
		super(name, age);//调用父类构造方法，初始化父类的数据
	}
	
	//成员方法
	public void teachTime() {
		System.out.println("周二~周末 早上9：30到晚上6:00");
	}
}

class AbstractDemo2 {
	public static void main(String[] args) {
		Person p = new YuWenTeacher();//多态的体现
		p.setName("张老师");
		p.setAge(34);
		System.out.println(p.getName()+"--"+p.getAge());
		p.teach("论语");
		p.teachTime();
		
		System.out.println("---------");
		
		p = new YuWenTeacher("Mr Jerry", 31);
		System.out.println(p.getName()+"--"+p.getAge());
		p.teach("散文诗歌");
		p.teachTime();
		
		System.out.println("---------");
		
		p = new ShuXueTeacher();
		p.setName("李老师");
		p.setAge(30);
		System.out.println(p.getName()+"--"+p.getAge());
		p.teach("高等数学");
		p.teachTime();
		
		System.out.println("---------");
		
		p = new ShuXueTeacher("朱老师", 32);
		System.out.println(p.getName()+"--"+p.getAge());
		p.teach("函数");
		p.teachTime();
		
	}
}
