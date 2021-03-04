/*
	循环语句：for循环,while循环,do...while循环。
	
	for循环格式：
		for(初始化语句;判断条件语句;控制条件语句) {
			循环体语句;
		}
		
		执行流程：
			A:执行初始化语句
			B:执行判断条件语句,看其返回值是true还是false
				如果是true，就执行循环体语句
				如果是false，就结束循环
			C:执行控制条件语句
			D:回到B继续。
			
	注意事项：
		A:判断条件语句无论简单还是复杂，结果都是boolean类型。
		B:循环体语句如果是一条语句，大括号可以省略；如果是多条语句，大括号不能省略。建议永远不要省略。
*/
class ForDemo {
	public static void main(String[] args) {
		//举例一：输出20次hello world。
		for(int a = 1; a <= 20; a++) {
			System.out.println("hello world");
		}
		
		System.out.println("--------------");
		
		//举例二：输出1到100。
		int b = 1;
		for(; b <= 100; b++) {
			System.out.println(b);
		}
		
		/*
		b = 2000;
		System.out.println(b);
		*/
		/*
			注意：b的作用域会根据摆放的位置不同而不同，如果放到for循环的外面，那它的作用域就是整个main方法;
			如果放到for循环里面，那它的作用域只在for循环体里面！！
		*/
		
		
		System.out.println("--------------");
		
		//举例二延伸：输出1到100，5个数换一行。
		for(b = 1; b <= 100; b++) {
			System.out.print(b+" ");//print不会换行。println会自动换行
			if (b%5 == 0) {//被5整除了，说明要转换了
				System.out.println();//println()表示换行
			}
		}
		
		System.out.println("--------------");
		
		//举例三：求1到100相加的总和。
		int sum = 0;
		for(int c =1; c <= 100; c++) {
			sum = sum + c;//也可以写成 sum += c; 
		}
		System.out.println("1到100的和为"+sum);
		
		System.out.println("--------------");
		
		//举例四：求1到50所有的偶数之和与奇数之和。
		int sum1 = 0, sum2 = 0;
		for(int d = 1; d <= 50; d++) {
			if (d % 2 == 0) {//偶数
				sum1 += d;
			} else {//奇数
				sum2 += d;
			}
		}
		System.out.println("偶数之和为"+sum1+",奇数之和为"+sum2);
		
		System.out.println("--------------");
		
		//举例五：求1-100能被3整除的数。
		int e = 1;
		for(; e <= 100; e++) {
			if(e%3 == 0) {
				System.out.println(e);
			}
		}
			
		System.out.println("--------------");
		
		//举例五延伸：求1-100能被3整除的数，3个数换一行。
		int count = 1;//count这里表示计数
		for(e = 1; e <= 100; e++) {
			if(e%3 == 0) {
				System.out.print(e+"\t");// \t表示横向空四格
			
				if (count%3 == 0) {//能被3整除，该换行了
					System.out.println();
				}
				count++;
			}
		}
		
		System.out.println("--------------");
		
		//举例六：输出100-1000之间的“水仙花数”，所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
		//举例：153就是一个水仙花数。
		//153 = 1*1*1 + 5*5*5 + 3*3*3
		
		//解题思路分析：
		//个位数获取：153%10 = 3
		//十位数获取：153/10%10 = 5
		//百位数获取：153/100 = 1
		for(int m = 100; m < 1000; m++) {
			int ge = m%10;//个数
			int shi = m/10%10;//十位
			int bai = m/100;//百位
			int tmp = bai*bai*bai+shi*shi*shi+ge*ge*ge;
			if(tmp == m) {//符合条件的
				System.out.println(m);
			}
		}
	}
}
