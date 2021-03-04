/*
	成员变量和局部变量的区别?
		A:在类中的位置不同
			成员变量：在类中方法外
			局部变量：在方法定义中或者方法声明上(方法声明上，实际上就是参数)
		B:在内存中的位置不同
			成员变量：在堆内存(举例：客栈里的老板娘，一直存在着)
			局部变量：在栈内存(举例：客栈里的客人，头天来，明早走)
		C:生命周期不同
			成员变量：随着对象的创建而存在，随着对象的消失而消失
			局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
		D:初始化值不同
			成员变量：有默认初始化值
			局部变量：没有默认初始化值，必须定义并赋值，然后才能使用。
			
		注意事项：
			如果局部变量名称可以和成员变量名相同，在方法中使用时，采用"就近原则"。
			
			
	匿名对象
		定义：就是没有名字的对象。
	
		应用场景：
			A:调用方法，仅仅只调用一次的时候。
				注意：调用多次的时候，不适合。
			B:匿名对象可以作为实际参数传递(以后讲解)
		好处：
			匿名对象调用完毕就是垃圾。可以立即被垃圾回收器回收，节约内存。
*/
class Variable {
	int it;//默认值为0
	long lg;//默认值为0
	boolean bl;//默认值为false
	char cr;//默认值为'\u0000'
	double de;//默认值为0.0
	float ft;//默认值为0.0
	String sg;//默认值为null
	int[] ary;//默认值为null
	String[] strAry;//默认值为null
	
	int num = 20;//定义成员变量并初始化，其它类型也可以初始化
	
	public void show() {//打印成员的默认值
		System.out.println("int默认值为"+it);
		System.out.println("long默认值为"+lg);
		System.out.println("boolean默认值为"+bl);
		System.out.println("char默认值为"+cr);
		System.out.println("double默认值为"+de);
		System.out.println("float默认值为"+ft);
		System.out.println("String默认值为"+sg);
		System.out.println("int[]默认值为"+ary);
		System.out.println("String[]默认值为"+strAry);
	}
	
	
	public void hello() {
		//int num;//局部变量，不初始始会报错。这行报错！
		//这样把int依次换成long,boolean,char,double,float,String,int[],String[]看下效果，
		//你会发现都报错，都报未初始化的错误。试一试看。
		//System.out.println(num);
		
		
		int num = 900;
		System.out.println(num);
	}
	
}

class StudentDemo3 {
	public static void main(String[] args) {
		Variable ve = new Variable();
		ve.show();//打印成员的默认值
		
		
		ve.hello();//调用对象的方法，来打印局部变量的默认值
		
		
		//匿名对象的使用
		new Variable().show();//new Variable()就是匿名对象，因为它没有赋值给别的变量
	}
}