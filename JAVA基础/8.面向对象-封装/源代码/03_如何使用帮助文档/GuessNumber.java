/*
	猜数字小游戏(数据在1-100之间)
	
	分析：
		A:程序产生一个随机数。(被猜的)
		B:键盘录入数据。(你猜的)
		C:把你猜的和被猜的进行比较
			a:大了
			b:小了
			c:猜中了
		D:给出多次猜的机会，猜中就结束。
			while()循环，猜中就break
*/
import java.util.Scanner;
class GuessNumber {
	public static void main(String[] args) {
		int randomNum = (int)(Math.random()*100+1);//随机产生一个数字
		//System.out.println("产生的随机数为"+randomNum);
		
		while (true) {
			System.out.println("请输入你要猜的数(1-100之间):");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num > randomNum) {
				System.out.println("猜大了");
			} else  if (num < randomNum) {
				System.out.println("猜小了");
			} else {
				System.out.println("恭喜你，猜中了！");
				break;//此行一定要有，为啥？
			}
		}
	}
}