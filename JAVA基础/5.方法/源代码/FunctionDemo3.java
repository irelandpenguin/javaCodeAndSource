/*
	方法的实战练习
	
	方法格式：
		修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
			方法体语句;
			return 返回值; 
		}
*/
import java.util.Scanner;
class FunctionDemo3 {
	
	
	public static void main(String[] args) {
		
		/*
		//举例1：键盘输入一个三位数，求它的十位数。
		System.out.println("输入一个数字(100~999之间):");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int result = shiwei(x);
		if (result != 0) {
			System.out.println(x+"的十位为"+result);
		}
		*/
		
		/*
		//举例2：键盘输入2个数，求最大值。
		System.out.println("输入第一个数：");
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		System.out.println("输入第二个数：");
		int b = sc1.nextInt();
		int max = maxNum(a, b);
		System.out.println(a+", "+b+"最大值为"+max);
		*/
		
		
		//举例3：打印如下图案。
		// *
		// **
		// ***
		// ****
		//tuan();
		
		
		//举例4：打印九九乘法表。
		//chengfabiao(1,3);
		//chengfabiao(1,6);
		//chengfabiao(1,9);
		
		
		
		//举例5：键盘输入3个数，求最大值与最小值。
		System.out.println("输入第一个数：");
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		System.out.println("输入第二个数：");
		int b = sc1.nextInt();
		System.out.println("输入第三个数：");
		int c = sc1.nextInt();
		maxAndMinNum(a, b, c);
	
	}
	
	public static int shiwei(int num) {
		if (num >= 100 && num <= 999) {
			int m = num/10%10;//得到十位数
			return m;
		} else {
			System.out.println("你输入的数字不符合要求");
			return 0;
		}
	}
	
	public static int maxNum(int x, int y) {
		int max = x;
		if(max < y) {
			max = y;
		}
		return max;
	}
	
	public static void tuan() {
		for(int x= 0; x < 4; x++) {
			for(int y = 0; y <= x; y++) {
				System.out.print("*");//不换行的打印
			}
			System.out.println();//换行
		}
	}
	
	public static void chengfabiao(int a, int b) {
		for(int x= a; x <= b; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print(y+"*"+x+"="+y*x+"\t");//不换行的打印
			}
			System.out.println();//换行
		}
	}
	
	public static void maxAndMinNum(int x, int y, int z) {
		int max = x, min = x;
		//先找最大值
		if (max < y) {
			max = y;
		}
		if (max < z) {
			max = z;
		}
		System.out.println(x+","+y+","+z+"中最大值为"+max);
		
		//找最小值
		if (min > y) {
			min = y;
		}
		if (min > z) {
			min = z;
		}
		System.out.println(x+","+y+","+z+"中最小值为"+min);
	}
}
