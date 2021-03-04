/*
	使用键盘录入的方式获取数值，然后利用if条件进行判断。
*/
import java.util.Scanner;
class IfDemo3 {
	public static void main(String[] args) {
		/*举例5：一次英语考试，总分100分，60分以下不及格，60~70分及格，70~90分良好，90~100分优异。
			键盘输入分数，判断属于哪一种？
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("输入你的分数");
		int score = sc.nextInt();
		if (score < 60) {
			System.out.println("成绩为"+score+"不及格");
		} else if (score >= 60 && score < 70) {
			System.out.println("成绩为"+score+"及格");
		} else if (score >= 70 && score < 90) {
			System.out.println("成绩为"+score+"良好");
		} else {
			System.out.println("成绩为"+score+"优异");
		}
	}
	
}

		
		

