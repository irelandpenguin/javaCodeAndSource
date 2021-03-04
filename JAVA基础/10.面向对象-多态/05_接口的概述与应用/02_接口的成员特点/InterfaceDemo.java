/*
	接口的特点：
		A：接口定义使用interface
			interface 接口类 {}
		B：接口的实现，使用implements
			class 类 implements 接口类 {}
		C：接口不能实例化
			如果需要实例化，需要使用实现接口的具体类来实例化。
		D：接口的实现类
			1）接口的抽象实现类(不常用)
			2）接口的具体实现类（推荐！！）

	接口成员特点
		成员变量：只能是常量，并且是静态的。
				默认修饰符：public static final
				建议：自己手动给出。
		构造方法：接口没有构造方法。
		成员方法：只能是抽象方法。
				默认修饰符：public abstract
				建议：自己手动给出。
		
	所有的类都默认继承自一个类：Object。
	类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。
*/
interface Person {
	//成员常量，默认修饰符为public static final
	int number = 9527;//默认的,会在int前面加上 public static final
	public static final String name = "C罗";
	public static final int age = 35;
	
	//没有构造方法
	
	//成员方方法，默认修饰符为public abstract
	public abstract void playFootball();//踢足球
}


//class Footballer extends Object implements Person
class Footballer implements Person {//这里Footballer默认继承Object,打开API说明文档查下看
	//成员变量...
	
	//构造方法
	public Footballer() {
		//super();//显示调用父类的方法，可父类在哪呢？解释一下
	}
	
	public void playFootball() {
		System.out.println("踢足球");
	}
	public void singer() {
		System.out.println("唱歌");
	}
}

class InterfaceDemo {
	public static void main(String[] args) {
		Person p = new Footballer();
		//p.name = "小贝";//报错，因为name是最终变量，不能修改
		//p.number = 9000;
		//Person.number = 9800;
		
		
		//System.out.println(p.name+"---"+p.age);//接口成员常量，编译看左边，运行看左边
		//System.out.println(Person.name+"---"+Person.age);
		//p.playFootball();//接口抽象方法，编译看左边，运行看右边
		
		System.out.println("----------");
		
		
		//Person pp = new Footballer();
		//pp.singer();//这行报错！原因：编译看左边，但Person接口里没有这个抽象方法
		//pp.playFootball();//多态的体现
		
		/*
		Footballer ff = (Footballer)pp;//强制换行
		ff.singer();
		ff.playFootball();
		*/
	}
}