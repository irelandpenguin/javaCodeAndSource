/*
	switch注意事项2
		多个case语句也可以并列使用。
	举例：一年12个月，3月，4月，5月为春季; 6月，7月，8月为夏季; 9月，10月，11月为秋季; 12月，1月，2月为冬季。
	请使用switch语句表达出来。
*/

import java.util.Scanner;
class SwitchDemo3 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//控制键盘录入数据
		System.out.println("请输入一个月份(1-12):");
		int month = sc.nextInt();
		
		/*
		//switch判断语句
		switch(month) {
			case 1:
				System.out.println("冬季");
				break;
			case 2:
				System.out.println("冬季");
				break;
			case 3:
				System.out.println("春季");
				break;
			case 4:
				System.out.println("春季");
				break;
			case 5:
				System.out.println("春季");
				break;
			case 6:
				System.out.println("夏季");
				break;
			case 7:
				System.out.println("夏季");
				break;
			case 8:
				System.out.println("夏季");
				break;
			case 9:
				System.out.println("秋季");
				break;
			case 10:
				System.out.println("秋季");
				break;
			case 11:
				System.out.println("秋季");
				break;
			case 12:
				System.out.println("冬季");
				break;
			default:
				System.out.println("输入月份有误!");
		}
		*/
		
		
		//switch判断语句
		switch(month) {
			case 1:
			case 2:
			case 12:
				System.out.println("冬季");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			default:
				System.out.println("输入月份有误!");
		}
	}
}