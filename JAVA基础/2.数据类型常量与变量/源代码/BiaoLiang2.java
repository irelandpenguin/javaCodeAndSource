/*
	使用变量的时候要注意的问题：
		A:作用域
			变量定义在哪个大括号内，它就在这个大括号内有效。
			并且，在同一个大括号内不能同时定义同名的变量。
			
		B:初始化值
			没有初始化值的变量不能直接使用。
			你只要在使用前给值就行，不一定非要在定义的时候立即给值。
			推荐在定义的时候给值。
			
			定义变量的格式：
				a:数据类型 变量名 = 初始化值;
				b:数据类型 变量名;
				  变量名 = 初始化值;
		
		C:在一行上建议只定义一个变量
			可以定义多个，但是不建议
*/
class BianLiang2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 1;
		int c;//定义一个变量，不给初值
		c = a+b;//用变量a和变量b的和来给变量c赋值
		System.out.println("c的值为"+c);
		
		{
			int d=2;
			int e = 20;
			System.out.println("d的值为"+d+",e的值为"+e);
		}
		
		{
			int f = 3;
			int h = 4;
			System.out.println("f的值为"+f+",h的值为"+h);
			//System.out.println("d的值为"+d+",e的值为"+e);//报错！因为变量超出了自己的作用域
			System.out.println("c的值为"+c);
		}
		
		//int c = 29;//报错，因为同一个作用域中，不允许重命的变量名
		
		Long x;//没有初始化
		Long y = 90L;
		x = 10L;
		Long z = x+y;
		System.out.println("z的值为"+z);
		
		int m = 90, n = 0, p = 89, i = 9000;//可以定义多个，但是不建议
		
	}
	
}