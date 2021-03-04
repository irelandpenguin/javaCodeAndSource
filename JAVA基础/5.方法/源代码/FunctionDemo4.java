/*
	方法重载：
		在同一个类中，方法名相同，参数列表不同。
		
		参数列表不同：
			A:参数个数不同
			B:参数类型不同
			
		注意：方法重载与返回值类型无关。
		
		
	我们在之前讲，在同一个类中，方法名不能重复，否则程序编译失败！
		但是，它有一个前提：方法名，方法的参数，方法的返回类型全部一样时，才会发生重复，编译才会报错！
*/
class FunctionDemo4 {
	public static void main(String[] args) {
		int s = 0;
		s = sum(10, 5);
		System.out.println(s);//15
		s = sum(10, 5, 5);
		System.out.println(s);//20
		

		
		float m = sum(12.3F, 1.2F);
		System.out.println(m);
		
		
		long x = sum(100L, 200L);
		System.out.println(x);
		
	}
	
	public static int sum(int a, int b) {
		System.out.println("调用了两个int型参数的sum方法");
		return (a+b);
	}
	
	public static int sum(int a, int b, int c) {
		System.out.println("调用了三个int型参数的sum方法");
		return (a+b+c);
	}
	

	public static float sum(float a, float b) {
		System.out.println("调用了两个float型参数的sum方法");
		return (a+b);
	}
	
	public static long sum(long a, long b) {
		System.out.println("调用了两个long型参数的sum方法");
		return (a+b);
	}
}