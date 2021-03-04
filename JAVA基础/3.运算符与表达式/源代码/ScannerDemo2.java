/*
	键盘录入练习：
		(1).键盘录入两个数据，并对这两个数据求和，输出其结果。
*/
import java.util.Scanner;
class ScannerDemo2 {
	public static void main(String[] args) {
		//(1).键盘录入两个数据，并对这两个数据求和，输出其结果。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = sc.nextInt();
		System.out.println("请再输入一个整数");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("sum="+sum);
	}
}
