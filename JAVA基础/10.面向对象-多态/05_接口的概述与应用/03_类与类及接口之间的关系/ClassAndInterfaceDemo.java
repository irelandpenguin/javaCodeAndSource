/*
	接口的成员特点：
		成员变量：必须是public static final 修饰的，必须赋值;
		构造方法：无构造方法
		成员方法：必须是public abstract 修饰的抽象方法。
		
	接口对象的创建：
		通过实现接口的具体类来实例化的。

	类与类：
		继承关系,只能单继承,可以多层继承。
	类与接口：
		实现关系,可以单实现,也可以多实现。
		并且还可以在继承一个类的同时实现多个接口。
	接口与接口：
		继承关系,可以单继承,也可以多继承。
*/
interface Footballer {
	//成员常量(默认修饰符public static final)
	
	//无构造方法
	
	//成员方法(默认修饰符public abstract)
	public abstract void playFootball();
}

interface Singer {
	//成员常量(默认修饰符public static final)
	
	//无构造方法
	
	//成员方法(默认修饰符public abstract)
	public abstract void canSinger();
}

/*
class DengChao implements Footballer,Singer {//虽然没有写extends 父类，但是，我们知道，它默认继承Object
	public void playFootball() {
		System.out.println("邓超踢足球");
	}
	
	public void canSinger() {
		System.out.println("邓超唱歌");
	}
}
*/

/*
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
	public abstract void eat();
	public void show() {
		System.out.println(name+"---"+age);
	}
}

class Actor extends Person implements Footballer, Singer {//演员类继承人类，同时实现足球员接口和歌手接口
	//成员变量...
	
	//构造方法
	public Actor(){}
	public Actor(String name, int age) {
		super(name, age);//调用父类构造方法，来初始化父类的数据
	}
	
	//成员方法
	public void playFootball() {
		System.out.println("踢足球");
	}
	
	public void canSinger() {
		System.out.println("唱歌");
	}
	
	public void eat() {
		System.out.println("吃牛肉饭");
	}
}
*/


interface MeiXi extends Footballer, Singer {//梅希 接口 继承足球员接口和歌手接口
	public abstract void playBasketBall();//打蓝球
}

class Actor2 implements MeiXi {
	//成员变量
	private String name;
	private int age;
	
	//构造方法
	public Actor2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//成员方法
	public void playFootball() {
		System.out.println("踢足球");
	}
	
	public void canSinger() {
		System.out.println("唱歌");
	}
	
	public void playBasketBall() {
		System.out.println("打蓝球");
	}
	
	public void show() {
		System.out.println(name+"---"+age);
	}
}


//==================================

class ClassAndInterfaceDemo {
	public static void main(String[] args) {
		/*
		DengChao dc = new DengChao();//多态的体现
		dc.playFootball();
		dc.canSinger();
		*/
		
		
		/*
		Footballer fb = new Actor();
		fb.playFootball();//问题：只能调此方法，其它方法不能调用，为啥? 
		//因为类比着多态对象调用成员方法的关系可知，编译看左边，但是呢，Footballer这个接口根本就没有以下两个方法
		//fb.canSinger();//报错！
		//fb.eat();//报错！
		
		System.out.println("----------");
		
		Singer sr = new Actor();
		sr.canSinger();//问题：只能调此方法，其它方法不能调用，为啥?
		//因为类比着多态对象调用成员方法的关系可知，编译看左边，但是呢，Footballer这个接口根本就没有以下两个方法
		
		System.out.println("----------");
		
		Person p = new Actor("邓超",35);
		p.show();
		p.eat();//问题：只能调此以上两个方法，其它方法不能调用，为啥?
		//因为根据多态对象调用成员方法的关系可知，编译看左边，但是呢，Person类没有其它方法的声明。
	
		System.out.println("----------");
		
		Actor ar = new Actor("黄小明", 30);
		ar.show();
		ar.eat();
		ar.playFootball();
		ar.canSinger();//问题：可以调用全部的方法，为啥？
		//因为Actor类已经全部实现了抽象类的所有抽象方法，而且还实现所有接口的接口方法。
		*/
		
		
		System.out.println("----------");
		
		Actor2 ac = new Actor2("周星驰", 42);
		ac.show();
		ac.playFootball();
		ac.canSinger();
		ac.playBasketBall();
	}
}