/*
	抽象类的概述：
		我们知道动物目前是不确定的，所以动物中的吃，睡等也不应该是具体的。
		我们把一个不是具体的功能称为抽象的功能，而一个类中如果有抽象的功能，该类必须是抽象类。
		
	抽象类的特点：
		A:抽象类和抽象方法必须用abstract关键字修饰
		B:抽象类中不一定有抽象方法,但是有抽象方法的类必须定义为抽象类
		C:抽象类不能实例化(不能实例化就是说不能创建对象)
			因为它不是具体的。
			抽象类有构造方法，但是不能实例化。
				那构造方法的作用是什么呢?
					用于子类初始化父类的数据
		D:抽象类的子类
			a:重写所有的抽象方法，这个时候子类是一个具体的类。
			b:如果不想重写抽象方法，该子类必须定义为一个抽象类。
			
		抽象类的实例化其实是靠具体的子类实现的。是多态的体现。
			Animal a = new Cat();
*/
abstract class Animal {
	//创建成员变量...
	
	//创建构造方法...
	
	public abstract void eat();
	public abstract void playGame();
}


class Cat extends Animal {
	//创建成员变量...
	
	//创建构造方法...
	
	public void eat() {
		System.out.println("猫吃小鱼");
	}
	
	public void playGame() {
		System.out.println("猫玩捉迷藏");
	}
}

abstract class Dog extends Animal {}

/*
class Dog extends Animal {
	//创建成员变量...
	
	//创建构造方法...
	
	public void eat() {
		System.out.println("狗吃骨头");
	}
	
	public void playGame() {
		System.out.println("狗看家");
	}
}
*/

class AbstractDemo {
	public static void main(String[] args) {
		//Animal a = new Animal();//报错， Animal是抽象的; 无法实例化
		
		
		Animal an = new Cat();
		an.eat();//多态对象访问成员方法，编译看左边，运行看右边
		an.playGame();
		
		System.out.println("----------");
		
		/*
		an = new Dog();
		an.eat();
		an.playGame();
		*/
	}
}