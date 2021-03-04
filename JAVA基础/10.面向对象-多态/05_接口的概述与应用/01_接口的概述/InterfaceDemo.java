/*
	接口的特点：
		A:接口用关键字interface表示	
			interface 接口名 {}
		B:类实现接口用implements表示
			class 类名 implements 接口名 {}
		C:接口不能实例化
			那么，接口如何实例化呢?
				使用接口的具体实现类来实例化。
		D:接口的实现类
			a:可以是抽象类。但是意义不大。
			b:可以是具体类。要重写接口中的所有抽象方法。(推荐方案)
	
	由此可见：
		A:具体类多态(几乎没有)
		B:抽象类多态(常用)
		C:接口多态(最常用)
*/
interface Person {
	public abstract void playFootBall();
}

//abstract class Footballer implements Person {}
class Footballer implements Person {
	public void playFootBall() {
		System.out.println("踢足球");
	}
}

class Basketballer implements Person {
	public void playFootBall() {
		System.out.println("打蓝球");
	}
}

class InterfaceDemo {
	public static void main(String[] args) {
		//Person p = new Person();//报错，接口不能实例化对象
		Person p = new Footballer();
		p.playFootBall();//这里可以类比着  多态对象调用成员方法 去理解。即：编译看左边，运行看右边
		
		p = new Basketballer();
		p.playFootBall();
	}
}