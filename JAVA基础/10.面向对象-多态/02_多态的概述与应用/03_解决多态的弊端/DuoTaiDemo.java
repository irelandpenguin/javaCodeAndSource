/*
	多态的弊端：
		不能使用子类的特有功能。
		
	我就想使用子类的特有功能?行不行?
		行。
		
	怎么用呢?
		A:创建子类对象调用方法即可。(可以，但是很多时候不合理。而且，太占内存了)
		B:把父类的引用强制转换为子类的引用。(向下转型)
		
	对象间的转型问题：
		向上转型：
			Fu f = new Zi();
		向下转型：
			Zi z = (Zi)f; //要求该f必须是能够转换为Zi的。
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
}

class Zi extends Fu {
	//创建成员变量...
	
	//创建构造方法...
	
	public void eat() {
		System.out.println("吃牛肉配青菜");
	}
	
	public void sleep() {
		System.out.println("趴着睡觉");
	}
	
	public void play() {
		System.out.println("打游戏");
	}
}

class DuoTaiDemo {
	public static void main(String[] args) {
		//正常情况的
		Zi z = new Zi();
		z.eat();
		z.sleep();
		z.play();
		
		System.out.println("----------");
		
		//多态使用
		Fu f = new Zi();
		f.eat();
		f.sleep();
		//f.play();//报错，因为多态中成员方法编译看左边，运行看右边。但多态类Fu中没有play()方法。
		
		System.out.println("----------");
		
		//使用向下转行，解决这个弊端
		Zi zz = (Zi)f;
		zz.eat();
		zz.sleep();
		zz.play();
	}
}