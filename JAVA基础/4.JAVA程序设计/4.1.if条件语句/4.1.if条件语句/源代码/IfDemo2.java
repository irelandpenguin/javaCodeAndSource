/*
	(2)if嵌套语句；
*/
class IfDemo2 {
	public static void main(String[] args) {
		//举例1：有一个字符变量'x'，判断该变量是否同时大于字符'a','n','b'，满足要求时才打印。
		char m = 'x';
		
		//方式一：使用if条件语句解决
		if (m > 'a' && m > 'n' && m > 'b') {
			System.out.println("字符"+m+"同时大于'a', 'n', 'b'");
		}
		
		
		//方式二：使用if嵌套语句解决
		if (m > 'a') {
			if (m > 'n') {
				if (m > 'b') {
					System.out.println("字符"+m+"同时大于'a', 'n', 'b'");
				}
			}
		}
		
		
		//举例2：求3个整数的最大值。
		int a = 120, b = 340, c = 20;
		int max;
		
		//方式一：还是使用我们之前学习的三目运算符
		max = ((a > b)   ?   ((a > c) ? a : c)   :   ((b > c) ? b : c));
		System.out.println("max="+max);
		
		//方式二：使用if嵌套语句解决
		if (a > b) {//a>b
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {//a <= b
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		System.out.println("max="+max);
	}
}