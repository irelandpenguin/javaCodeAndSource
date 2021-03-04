/*
	数据类型：Java是一种强类型的语言，针对每一种数据都定义了明确的数据类型。
	
	数据类型分类：
		A:基本数据类型
		B:引用数据类型(类,接口,数值)
		
	基本数据类型:4类8种
		A:整数			占用字节数
			byte			1
			short			2
			int				4
			long			8
			
		B:浮点数
			float 			4
			double 			8
			
		C:字符
			char			2
		D:布尔
			boolean			1
		
		注意：
			整数默认是int类型
			浮点数默认是double类型。
			
			长整型后缀用L或者l标记。建议使用L。
			单精度浮点数用F或者f标记。建议使用F。
*/
class BiaoLiang {
	public static void main(String[] args){
		//定义变量的格式
		//数据类型 变量名 = 初始化值;
		
		//byte
		byte b = 8;
		System.out.println(b);
		
		//short
		short s = 100;
		System.out.println(s);
		
		//int
		int i = 23;
		System.out.println(i);
		//int x = 1000000000000;
		//System.out.println(x);
		
		//long
		long x = 1000000000000L;
		System.out.println(x);
		//long y = 100L;
		//System.out.println(y);
		
		
		//float
		float f = 3.14F;
		System.out.println(f);
		
		//double
		double d = 34.12;
		System.out.println(d);
		
		//char
		char ch = 'a';
		System.out.println(ch);
		
		//boolean
		boolean flag = true;
		System.out.println(flag);
		
	}
}