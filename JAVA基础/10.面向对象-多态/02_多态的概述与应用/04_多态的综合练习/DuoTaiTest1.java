/*
	多态练习：猫狗吃饭，玩游戏。
*/
class Animal {
	//创建成员变量...
	
	//创建构造方法...
	
	public void eat() {
		System.out.println("动物吃饭");
	}
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

class Dog extends Animal {
	//创建成员变量...
	
	//创建构造方法...
	
	public void eat() {
		System.out.println("狗吃骨头");
	}
	
	public void playGame() {
		System.out.println("狗看门");
	}
}

class DuoTaiTest1 {
	public static void main(String[] args) {
		//多态使用
		Animal an = new Cat();
		an.eat();
		//an.playGame();//报错，因为成员方法编译看左边，运行看右边。但多态类Animal中根本没这个playGame()方法
		
		System.out.println("----------");
		
		//使用向下转型，解决此问题
		Cat c = (Cat)an;
		c.eat();
		c.playGame();
		
		
		System.out.println("----------");
		
		//使用刚创建的Animal接收Dog对象
		an = new Dog();
		an.eat();
		//an.playGame();//报错，因为成员方法编译看左边，运行看右边。但多态类Animal中根本没这个playGame()方法
		
		System.out.println("----------");
		
		Dog d = (Dog)an;
		d.eat();
		d.playGame();
		
		
		//这里如果这样转行，正确吗？
		//Cat cc = (Cat)an;//运行报错， java.lang.ClassCastException即类型转换异常。因为此时，an已经指向了Dog了。
	}
}
