/*
一个类如果没有抽象方法，可不可以定义为抽象类?如果可以，有什么意义?
	A:可以。
	B:意义是不让创建对象，因为抽象类不能实例化对象。

abstract不能和哪些关键字共存?
	private	冲突
	final	冲突	
	static	非法组合
*/
abstract class Fu {
	//private abstract void show2();//非法的修饰符组合: abstract和private
	//abstract final void show3();//非法的修饰符组合: abstract和final
	//public abstract static void show4();// 非法的修饰符组合: abstract和static 
	//解释:因为static修饰的方法属于静态方法，需要有方法体实现，而abstract又限制它不能写方法体。所以非法。
	
	public abstract void show();
	
	public static void hello() {
		System.out.println("hello");
	}
}

class Zi extends Fu {
	public void show() {
		System.out.println("你好");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		//Fu f = new Fu();//报错，因为抽象类是不能创建对象的
		Fu f = new Zi();
		f.show();//合法的
		Fu.hello();//合法的
	}
}