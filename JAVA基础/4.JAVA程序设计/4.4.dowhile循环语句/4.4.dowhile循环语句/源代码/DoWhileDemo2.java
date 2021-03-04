/*
	do...while与break一起使用
*/
class DoWhileDemo2 {
	public static void main(String[] args) {
		//举例1：只输出1到30能被3整除的第一个数。
		int j = 1;
		do {
			if (j%3 == 0) {
				System.out.println(j);
				break;//break的作用就是跳出本层循环，经常与do...while一起使用来控制代码
			}
			j++;
		} while (j <= 30);
		
		/*
		do {
			do {
				break;//跳出本层循环，外层的do...while不受影响
			}while();
			break;//这里的break就跳最外层的do...while了
		} while();
		*/
		
		System.out.println("--------------");
		
		//举例2：求半径为1到20且圆面积大于100时，对应的临界半径和临界面积(面积=PI*半径*半径)。
		int r = 1;
		double PI = 3.14, s = 0.0;// 变量s表示面积
		do {
			s = PI * r * r;
			if (s > 100) {
				System.out.println("临界半径为"+r+"\n"+"临界面积为"+s);// \n表示回车换行
				break;//break的作用就是跳出本层循环，经常与do...while一起使用来控制代码
			}
			r++;
		} while (r <= 20);
	}
}