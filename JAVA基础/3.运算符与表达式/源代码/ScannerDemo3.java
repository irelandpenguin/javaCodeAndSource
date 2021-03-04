/*
	键盘录入练习：
		(2).键盘录入两个数据，获取这两个数据中的最大值。
*/
import java.util.Scanner;
class ScannerDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = sc.nextInt();//获取键盘输入的数据
		System.out.println("请再输入一个整数");
		int b = sc.nextInt();//获取键盘输入的数据
		
		int max = ((a > b) ? a : b);
		System.out.println("max="+max);
	}
}