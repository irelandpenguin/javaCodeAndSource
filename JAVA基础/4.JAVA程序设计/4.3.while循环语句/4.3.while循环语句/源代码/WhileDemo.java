/*
	while循环的基本格式：		
		初始化语句;
	    while(判断条件语句) {
			 循环体语句;
			 控制条件语句;
		}
		
	特点：首先判断条件语句，为真才执行循环体里的代码。
*/
class WhileDemo {
	public static void main(String[] args) {
		//举例一：输出20次hello world。
		int a = 1;
		while(a <= 20) {
			System.out.println("hello world");
			a++;//防止死循环,必须写这行代码！！！！
		}
		
		
		System.out.println("--------------");
		
		//举例二：输出1到100。
		int b = 1;
		while(b <= 100) {
			System.out.println(b);
			b++;//防止死循环，必须写这行代码！！！！
		}
		
		System.out.println("--------------");
		
		//举例二延伸：输出1到100，5个数换一行。
		b = 1;//把b的值重新赋值为1
		while(b <= 100) {
			System.out.print(b+" ");//print不会换行。println会自动换行
			if (b%5 == 0) {//被5整除了，说明要转换了
				System.out.println();//println()表示换行
			}
			b++;
		}
		
		System.out.println("--------------");
		
		//举例三：求1到100相加的总和。
		int c =1, sum = 0;
		while(c <= 100) {
			sum = sum + c;//也可以写成 sum += c;
			c++;//防止死循环，先写这一行
		}
		System.out.println("1到100的和为"+sum);
		
		
		System.out.println("--------------");
		
		//举例四：求1到50所有的偶数之和与奇数之和。
		int d = 1, sum1 = 0, sum2 = 0;
		while(d <= 50) {
			if (d % 2 == 0) {//偶数
				sum1 += d;// sum1 = sum1+d;
			} else {//奇数
				sum2 += d;// sum2 = sum2+d;
			}
			d++;//防止死循环，先写这一行
		}
		System.out.println("偶数之和为"+sum1+",奇数之和为"+sum2);
		
		System.out.println("--------------");
		
		//举例五：求1-100能被3整除的数。
		int e = 1;
		while(e <= 100) {
			if(e%3 == 0) {
				System.out.println(e);
			}
			e++;
		}
			
		System.out.println("--------------");
		
		//举例五延伸：求1-100能被3整除的数，3个数换一行。
		e = 1;
		int count = 1;
		while(e <= 100) {
			if(e%3 == 0) {
				System.out.print(e+" ");
				
				if (count % 3 == 0) {
					System.out.println();
				}
				count++;
			}
			e++;
		}
		
		
		System.out.println("--------------");
		
		//举例六：输出100-1000之间的“水仙花数”，所谓的水仙花数是指一个三位数，其每一位数字的立方和等于该数本身。
		//举例：153就是一个水仙花数。
		//153 = 1*1*1 + 5*5*5 + 3*3*3
		
		//解题思路分析：
		//个位数获取：153%10 = 3
		//十位数获取：153/10%10 = 5
		//百位数获取：153/100 = 1
		int m = 100, n = 1000;
		while (m < n) {
			int ge = m%10;//个数
			int shi = m/10%10;//十位
			int bai = m/100;//百位
			int tmp = bai*bai*bai+shi*shi*shi+ge*ge*ge;
			if(tmp == m) {//符合条件的
				System.out.println(m);
			}
			m++;
		}
	}
}