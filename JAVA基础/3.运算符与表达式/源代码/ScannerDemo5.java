/*
	键盘录入练习：
		(4).键盘录入两个数据，比较这两个数据是否相等。
*/
import java.util.Scanner;
class ScannerDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = sc.nextInt();//获取键盘输入的数据
		System.out.println("请再输入一个整数");
		int b = sc.nextInt();//获取键盘输入的数据
		
		boolean m = ((a == b) ? true: false);
		System.out.println("m="+m);
	}
}