/*
	类型的默认转换
	
	+是一个运算符,做加法运算的。
	
	一般来说，我们在运算的时候，要求参与运算的数据类型必须一致。
	
	注意：
		boolean类型不能转换为其他的数据类型

	默认转换(从小到大的转换)
		A:byte,short,char —> int —> long —> float —> double
		B:byte,short,char相互之间不转换，他们参与运算首先转换为int类型
*/
class BianLiang3 {
	public static void main(String[] args) {
		int a = 3, b = 4, c;
		c = a+b;//这个没问题 
		System.out.println(c);
		
		byte m1 = 2;
		short m2 = 3;
		int m3 = m1+m2;//byte+short = int
		System.out.println("m3的值为"+m3);
		//m2 = m3+m1;//byte+int = short 报错了！！！
		//System.out.println("m2的值为"+m2);
		
		
		byte d = 3;
		int e = 4;
		//byte f = d+e;//这里有问题！byte + int = int 这是不符合默认转换的规则
		int f = d+e;//这就没有问题了 byte + int = int 符合默认转换的规则
		System.out.println(f);
		
		long g = d+e;//这里也没有问题 byte + int = long 符合默认转换的规则
		System.out.println(g);
		
		float f1 = 3.4F, f2 = 2.2F;
		float f3 = f1 + f2;//这里没问题，float + float = float 符合默认转换规
		System.out.println(f3);
		double f4 = f1+f2;
		System.out.println(f4);
		f1 = 3.0f;
		f2 = 2.0f;
		f3 = f1+f2;
		System.out.println(f3);
		f4 = f1+f2;
		System.out.println(f4);
		double ff1 = 3.4, ff2 = 2.2;
		double ff3 = ff1+ff2;
		System.out.println(ff3);
		
		
		double ff4 = 2.0;
		//f3 = f1 + f4;//这里有问题！float + double = double 这是默认转换的规则
		ff4 = f1 + f2;//这里没问题，float + float = double 符合默认转换的规则
		System.out.println(ff4);

	}
}