/*
	switch语句格式：
		switch(表达式) {
			case 值1:
				语句体1;
				break;
			case 值2:
				语句体2;
				break;
			...
			default:
				语句体n+1;
				break;
		}
		
	解释：
		表达式:这个地方的取值是有限定的,即switch括号里可以是：
			byte,short,int,char
			JDK5以后可以是枚举
			JDK7以后可以是字符串
		case:后面跟的是要和表达式进行比较的值
		语句体:要执行的代码
		break:表示中断，结束的意思，可以控制switch语句的结束。
		default:当所有的值都和表达式不匹配时，就执行default控制的语句。
		
	案例：
		键盘录入一个数，根据这个数，我们输出对应的星期?
*/
import java.util.Scanner;
class SwitchDemo {
	public static void main(String[] args) {
		System.out.println("输入一个(1~7)之间的整数");
		Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		switch (week) {//这里括号里的是int
			case 1:
				System.out.println("星期一");
				break;//中断，跳出switch语句
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期天");
				break;
			default:
				System.out.println("输入数据有误");
				//break;//这里的break可以不写
		}
	}
}


/*
	面试题：
		byte可以作为switch的表达式吗?  (可以)
		long可以作为switch的表达式吗? (不可以) 
		String可以作为switch的表达式吗? (在JDK7环境下可以)
*/

