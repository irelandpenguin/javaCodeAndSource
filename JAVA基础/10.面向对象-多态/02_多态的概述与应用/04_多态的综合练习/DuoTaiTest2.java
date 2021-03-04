/*
	看程序写结果
	
	多态的成员访问特点：
		方法：编译看左边，运行看右边。
		
	继承的时候：
		子类中有和父类中一样的方法，叫重写(或覆盖)。
		子类中没有父亲中出现过的方法，方法就被继承过来了。
*/
class A {
	public void show() {
		show2();
	}
	public void show2() {
		System.out.println("我");
	}
}
class B extends A {
	public void show2() {
		System.out.println("爱");
	}
}
class C extends B {
	public void show() {
		super.show();
	}
	public void show2() {
		System.out.println("JAVA");
	}
}
public class DuoTaiTest2 {
	public static void main(String[] args) {
		A a = new B();//此时的a是一个多态对象
		a.show();//爱
		
		
		B b = new C();//此时的b也是一个多态对象
		b.show();//JAVA
		
	}
}