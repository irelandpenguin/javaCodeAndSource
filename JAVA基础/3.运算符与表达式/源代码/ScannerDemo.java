/*
	为了让程序的数据更符合开发，我们就加入了键盘录入。
	让程序更灵活一下。
	
	那么，我们如何实现键盘数据的录入呢?
		A:导包
			格式：
				import java.util.Scanner; 
			位置：
				在class上面。
		B:创建键盘录入对象
			格式：
				Scanner sc = new Scanner(System.in);
		C:通过对象获取数据	
			格式：
				int x = sc.nextInt();
*/
import java.util.Scanner;
class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//创建键盘录入对象
		System.out.println("请输入一个整数");
		int x = sc.nextInt();//获取键盘录入的整型数据
		System.out.println("输入的数据为："+x);
	}
}