/*
	需求：在控制台输出九九乘法表。
	
	首先我们写出九九乘法表：
		1*1=1
		1*2=2	2*2=4
		1*3=3	2*3=6	3*3=9
		1*4=4	2*4=8	3*4=12	4*4=16
		...
		1*9=9	2*9=18	3*9=27	...
		
	我们先把这个九九乘法表看出是这样的一个形状：
		*
		**
		***
		****
		*****
		******
		*******
		********
		*********
*/
class XunHuanDemo3 {
	public static void main(String[] args) {
		for(int x = 1; x <= 9; x++) {//外层控制行
			for(int y = 1; y <= x; y++) {//里层控制列
				//System.out.print("*");
				System.out.print(y+"*"+x+"="+x*y+"\t");
			}
			System.out.println();
		}
	}
}