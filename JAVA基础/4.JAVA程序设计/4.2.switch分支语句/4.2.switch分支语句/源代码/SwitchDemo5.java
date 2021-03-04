/*
	在JDK7及以后，switch后的表达式也可以字符串String, 这里我们举个例子。
	
	输入字符串用下面2行代码
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();表示输入字符串;
	
	\ 表示转义字符，用于转义以下特殊字符，比如：\"  \'
*/
import java.util.Scanner;
class SwitchDemo5 {
	public static void main(String[] args) {
		int x = 3, y = 4, z;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入字符串(\"+\", \"-\", \"*\", \"/\")");//这里的 / 代表转义字符，程序输出/后面的符号
		//System.out.println("输入字符(\'+\', \'-\', \'*\', \'/\')");
		String s = sc.nextLine();// nextLine方法，获取的是字符串
		
		//String s = "+";
		
		switch (s) {
			case "+":
				z = x+y;
				System.out.println("x+y="+z);
				break;
			case "-":
				z = x-y;
				System.out.println("x-y="+z);
				break;
			case "*":
				z = x*y;
				System.out.println("x*y="+z);
				break;
			case "/":
				z = x/y;
				System.out.println("x/y="+z);
				break;
			default:
				System.out.println("符号非法，不能计算");
		}
	}
}