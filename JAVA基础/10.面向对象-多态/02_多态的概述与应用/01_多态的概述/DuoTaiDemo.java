/*
	多态：同一个对象(事物)，在不同时刻体现出来的不同状态。
	举例：
		猫是猫，猫也是动物。
		水(液体，固体，气态)。
		
	多态的前提：
		A:要有继承关系。
		B:要有方法重写。
			其实没有也是可以的，只不过就没有意义了。
		C:要有父类引用指向子类对象。
			父 f =  new 子();
			
	用代码体现一下多态。
	
	多态中的成员访问特点：
		A:成员变量
			编译看左边，运行看左边。
		B:构造方法	     
			创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化。
		C:成员方法
			编译看左边，运行看右边。
			由于成员方法存在方法重写，所以它运行看右边。
		D:静态方法(类方法)
			编译看左边，运行看左边。
			(静态和类相关，算不上重写，所以，访问还是左边的)
			
	多态的弊端
		不能使用子类特有的方法。
*/
class Fu {
	public String name = "张三";
	public int age = 36;
	
	public Fu(){}
	public Fu(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age);
	}
	
	public static void hello() {
		System.out.println("hello! 宜达互联");
	}
}

class Zi extends Fu {
	public String name = "张小明";
	public int age = 3;
	public char sex = '男';
	
	//创建构造方法...
	
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age+",性别:"+sex);
	}
	public void show2() {
		System.out.println("儿子的姓名:"+name+",年龄:"+age+",性别:"+sex);
	}
	
	public static void hello() {
		System.out.println("hello! 宜达");
	}
}

class DuoTaiDemo {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
		z.show2();
		
		System.out.println("---------");
		
		//父 f =  new 子();
		Fu f = new Zi();//这里就使用了多态
		//System.out.println(f.name+"----"+f.age);//编译看左边，运行看左边。
		//System.out.println(f.name+"----"+f.age+"----"+f.sex);//报错，多态的成员变量 编译看左边，运行看左边
		//f.show();
		//f.show2();//报错，多态的成员方法，编译看左边,运行看右边。但多态类Fu中没有成员方法show2()
		
		
		//静态方法(类方法)不使用多态调用
		//Fu.hello();
		//Zi.hello();
		
		//静态方法(类方法)，使用多态调用
		f.hello();
	}
}
