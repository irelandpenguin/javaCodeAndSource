/*
	键盘录入练习：
		(3).键盘录入三个数据，获取这三个数据中的最大值。
*/
import java.util.Scanner;
class ScannerDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = sc.nextInt();//获取键盘输入的数据
		System.out.println("请再输入一个整数");
		int b = sc.nextInt();//获取键盘输入的数据
		System.out.println("请输入第三个整数");
		int c = sc.nextInt();//获取键盘输入的数据
		
		int max = ((a>b)    ?   ((a>c) ? a : c)   :   ((b>c) ? b : c));
		System.out.println("max="+max);
	}
}