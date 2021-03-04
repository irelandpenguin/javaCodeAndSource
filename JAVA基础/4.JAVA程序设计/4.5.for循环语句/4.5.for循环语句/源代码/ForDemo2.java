/*
	for与break一起使用
*/
class ForDemo2 {
	public static void main(String[] args) {		
		//举例1：只输出1到30能被3整除的第一个数。
		for(int j = 1; j <= 30; j++) {
			if (j%3 == 0) {
				System.out.println(j);
				break;//break的作用就是跳出本层循环，经常与for一起使用来控制代码
			}
		}
		
		/*
		for(int a = 1; a < 100; a++) {
			for (int b = 1; b < 20; b++) {
				//xxxxxx
				//xxxx
				break;//这里的break只是跳出里层的for循环
			}
			
			break;//这里的break才是跳出外层的for循环
		}
		*/
		

		System.out.println("--------------");
		
		//举例2：求半径为1到20且圆面积大于100时，对应的临界半径和临界面积。
		double PI = 3.14, s = 0.0;// 变量s表示面积
		for(int r = 1; r <= 20; r++) {
			s = PI * r * r;//面积
			if (s > 100) {
				System.out.println("临界半径为"+r+"\n"+"临界面积为"+s);// \n表示回车换行
				break;//break的作用就是跳出本层循环，经常与for一起使用来控制代码
			}
		}
		
	}
}