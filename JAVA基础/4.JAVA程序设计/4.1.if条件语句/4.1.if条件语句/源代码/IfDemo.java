/*
	Java语言程序设计
	
	(1)if条件语句；
	(2)if嵌套语句；
*/

class IfDemo {
	public static void main(String[] args) {
		//if条件语句；
		//举例1：求两个浮点型变量的最小值。
		float a = 13.14F, b = 8.9F;
		
		//方式一：还是使用我们之前学习的三目运算符
		float max = ((a > b) ? a : b);
		System.out.println("max="+max);
		
		//方式二：使用if条件语句
		//if条件语句格式：
		/*
			if (比较表达式) {
				走这个括号里的代码
			} else {
				走这个括号里的代码
			}
		*/
		if (a > b) {
			System.out.println("max="+a);
		} else {
			System.out.println("max="+b);
		}
		
		
		System.out.println("------------------");
		
		//举例2：已知半径r=3.0，求圆的周长s(周长=2*PI*r)。其中PI为常量值 3.14，当周长大于12时，打印周长。
		double r = 1.0, s;
		double PI = 3.14;
		s = 2*PI*r;
		if (s > 12) {
			System.out.println("周长为"+s);
		}
		
		//举例3：有一个整型变量x，值为7。判断当前变量是奇数还是偶数。
		int x = 8;
		if (x%2 == 0) {
			System.out.println("x="+x+"为偶数");
		} else {
			System.out.println("x="+x+"为奇数");
		}
		
		//举例4：有两个浮点型变量m=4.5, n=1.2，当变量m大于变量n时，交换两个浮点型变量值。
		float m = 4.5F, n = 1.2F;
		if (m > n) {
			float tmp;//声明一个中间变量来存储值
			tmp = m;
			m = n;
			n = tmp;
		}
		System.out.println("m="+m+",n="+n);
		
		//举例5：一次英语考试，总分100分，60分以下不及格，60~70分及格，70~90分良好，90~100分优异。小明85分，属于哪一种？
		//if条件语句，还有一种多条件，格式为：
		/*
		if （比较表达式） {
			表达式1;
		} else if (比较表达式2){
			表达式2;
		} else if (比较表达式3) {
			表达式3;
		} else if (比较表达式4) {
			表达式4;
		} else if (比较表达式5) {
			表达式5;
		} else if (比较表达式6) {
			表达式6;
		} else {
			表达式7;
		}
		*/
		int score = 85;
		if (score < 60) {
			System.out.println("小明的成绩为"+score+"不及格");
		} else if (score >= 60 && score < 70) {
			System.out.println("小明的成绩为"+score+"及格");
		} else if (score >= 70 && score < 90) {
			System.out.println("小明的成绩为"+score+"良好");
		} else {//90~100
			System.out.println("小明的成绩为"+score+"优异");
		}
		
	}
}