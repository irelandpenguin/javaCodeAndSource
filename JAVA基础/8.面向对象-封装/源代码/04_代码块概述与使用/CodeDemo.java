/*
	代码块：在Java中，使用{}括起来的代码被称为代码块。
	
	根据其位置和声明的不同，可以分为
		局部代码块:局部位置(方法里面),用于限定变量的生命周期。
		
		构造代码块:在类中的成员位置,用{}括起来的代码。每次调用构造方法前，都会先执行构造代码块。
			作用：可以把多个构造方法中的共同代码放到构造代码块中，达到简化构造方法的目的。
			
		静态代码块:在类中的成员位置,用{}括起来的代码,只不过它用static修饰了。
			作用：一般是对类进行初始化。
			特点：1）只走一次; 2）优先于构造代码块执行。
			
	面试题?
		静态代码块,构造代码块,构造方法的执行顺序?
		执行顺序: 静态代码块 -- 构造代码块 -- 构造方法
		静态代码块：只执行一次
		构造代码块：每次调用构造方法都执行
*/
class Code {
	private int num;
	private int num2;
	
	private int num3;
	private int num4;
	
	private static String country;
	
	//构造代码块(作用：把通用的代码集中放在一起，简化构造方法。)
	{
		System.out.println("我是构造代码块");
		
		num3 = 100;
		num4 = 200;
	}
	
	
	//静态代码块（作用：用于初始化类的）
	static {
		System.out.println("我是静态代码块，只走一次哟");
		country = "中国";
		hello();
	}
	
	
	public Code() {
		System.out.println("我是构造方法Code()");		
		
		//num3 = 100;
		//num4 = 200;
	}
	
	public Code(int a, int b) {
		System.out.println("我是构造方法Code(int a, int b)");
		num = a;
		num2 = b;
		
		//num3 = 100;
		//num4 = 200;
	}
	
	public static void hello() {
		System.out.println("新年好！中国！");
	}
}

class CodeDemo {
	public static void main(String[] args) {
		//局部代码块(作用：用于限定变量生期周期的或者说作用域的)
		{
			int num = 100;
			System.out.println("num="+num);
		}
		//System.out.println("num="+num);//这行报错，因为num的生命周期在局部代码块里，超出局部代码块，num内存地址被系统回收了。
		
		System.out.println("---------");//整个华丽分隔线
		
		//创建2个对象
		Code cd1 = new Code();
		Code cd2 = new Code(100, 200);
	}
}