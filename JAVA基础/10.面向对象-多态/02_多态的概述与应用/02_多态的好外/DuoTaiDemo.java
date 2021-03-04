/*
	多态的好处：
		A:提高了代码的维护性(继承保证)
		B:提高了代码的扩展性(由多态保证)
*/
class Fu {
	//创建成员变量...
	
	//创建构造方法...
	
	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
	
	/*
	//写个通用方法
	public static void eatAndSleep(Fu f) {//参数是父类引用
		f.eat();
		f.sleep();
	}
	*/
}

class SonOne extends Fu {
	//创建成员变量...
	
	//创建构造方法...
	
	public void eat() {
		System.out.println("吃青菜");
	}
	public void sleep() {
		System.out.println("趴着睡觉");
	}
}

class SonTwo extends Fu {
	//创建成员变量...
	
	//创建构造方法...
	
	public void eat() {
		System.out.println("吃牛肉");
	}
	public void sleep() {
		System.out.println("侧着睡觉");
	}
}

class SonThree extends Fu {
	//创建成员变量...
	
	//创建构造方法...
	
	public void eat() {
		System.out.println("喝粥");
	}
	public void sleep() {
		System.out.println("睁眼睡觉");
	}
}

class DuoTaiDemo {
	public static void main(String[] args) {
		SonOne so = new SonOne();
		//so.eat();
		//so.sleep();
		
		//System.out.println("----------");
		
		SonTwo st = new SonTwo();
		//st.eat();
		//st.sleep();
		
		//System.out.println("----------");
		
		SonThree se = new SonThree();
		//se.eat();
		//se.sleep();
		
		//System.out.println("----------");
		
		
		//创建了3个对象，每个对象都要调用eat()和sleep()，太麻烦，能不能简化一点呢？
		//改进方案：可以在父类中创建一个静态成员方法，参数为父类引用，这样，可以利用多态，来实现功能扩展。即多态的扩展性
		//Fu.eatAndSleep(so);
		//Fu.eatAndSleep(st);
		//Fu.eatAndSleep(se);
		
	}
}