/*
	猫狗案例
*/
abstract class Animal {
	//成员变量
	private String name;
	private int age;
	
	//构造方法
	public Animal() {}
	public Animal(String name, int age) {
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
	
	public static void show(Animal an) {
		System.out.println(an.getName()+"--"+an.getAge()+"--"+an.eat()+"--"+an.playGame());
	}
	
	//抽象方法
	public abstract String eat();
	public abstract String playGame();
}

class Dog extends Animal {
	public Dog() {}
	public Dog(String name, int age) {
		super(name, age);//调用父类的构造方法，初始化父类数据
	}
	
	public String eat() {
		return "吃骨头";
	}
	
	public String playGame() {
		return "看家";
	}
}

class Cat extends Animal {
	public Cat() {}
	public Cat(String name, int age) {
		super(name, age);//调用父类的构造方法，初始化父类数据
	}
	
	public String eat() {
		return "吃小鱼";
	}
	
	public String playGame() {
		return "玩捉迷藏";
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		Animal an = new Dog();//多态的体现
		an.setName("黑虎");
		an.setAge(3);
		System.out.println(an.getName()+"--"+an.getAge()+"--"+an.eat()+"--"+an.playGame());
		
		System.out.println("----------");
		
		an = new Dog("豹子", 5);
		Animal.show(an);
		
		System.out.println("----------");
		
		an = new Cat();
		an.setName("花花");
		an.setAge(1);
		System.out.println(an.getName()+"--"+an.getAge()+"--"+an.eat()+"--"+an.playGame());
		
		System.out.println("----------");
		
		an = new Cat("美美", 2);
		Animal.show(an);
	}
}