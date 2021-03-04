/*
	继承中构造方法的关系
		A:子类中所有的构造方法默认都会访问父类中无参的构造方法！！！！
		B:为什么呢?
			因为子类会继承父类中的数据，可能还会使用父类的数据。
			所以，子类初始化之前，一定要先完成父类数据的初始化。
			
			注意：子类每一个构造方法的第一条语句默认都是：super(); 只不过隐藏起来了。
*/
class Father {
	public String name;
	public int age;
	
	public Father() {
		System.out.println("Father的无参构造方法");
	}
	
	public Father(String name, int age) {
		System.out.println("Father的带参构造方法");
		this.name = name;
		this.age = age;
	}
}

class Son extends Father {
	public Son() {
		//super();//这里，我显示的调用了父类的无参构造，此时，系统就不会再隐式调用父类的无参构造了
		System.out.println("Son的无参构造方法");
	}
	
	public Son(String name, int age) {
		//super();//这里，我显示的调用了父类的无参构造，此时，系统就不会再隐式调用父类的无参构造了
		//super(name,age);//这里，我显示调用了父类的带参构造，此时，系统就不会再隐式调用父类的无参构造了
		System.out.println("Son的带参构造方法");
		this.name = name;
		this.age = age;
	}
}

class ExtendsDemo1 {
	public static void main(String[] args) {
		Son s = new Son();
		
		//System.out.println("---------");
		
		Son s2 = new Son("张三", 27);
	}
}