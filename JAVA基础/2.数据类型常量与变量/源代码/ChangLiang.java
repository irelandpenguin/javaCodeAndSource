/*
	常量：
		在程序执行过程中，其值不发生改变的量。
		
	分类：
		A:字面值常量
		B:自定义常量(后面讲)
		
	字面值常量
		A:字符串常量	用双引号括起来的内容。
			举例："hello","world","HelloWorld"
		B:整数常量	所有的整数
			举例：100,200
		C:小数常量(浮点常量)	所有的小数
			举例：3.14,11.23
		D:字符常量	用单引号括起来的内容
			举例：'a','A','0'
			错误的：'ab'
		E:布尔常量	比较特殊
			举例：true,false
		F:空常量	后面讲
			举例：null
*/
class ChangLiang {
	public static void main(String[] args){
		//字符串常量
		System.out.println("hello");
		System.out.println("world");
		System.out.println("HelloWorld");
		
		//整数常量
		System.out.println(100);
		System.out.println(200);
		
		//小数常量
		System.out.println(3.14);
		System.out.println(11.23);
		
		//字符常量
		System.out.println('a');
		System.out.println('A');
		System.out.println('0');
		System.out.println('+');
		System.out.println('=');
		
		//布尔常量
		System.out.println(true);
		System.out.println(false);
	}
	
}