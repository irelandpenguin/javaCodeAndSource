/*
	while与break一起使用
*/
class WhileDemo2 {
	public static void main(String[] args) {
		//举例1：只输出1到30能被3整除的第一数。
		int j = 1;
		while (j <= 30) {
			if (j%3 == 0) {
				System.out.println(j);
				break;//break的作用就是跳出本层循环，经常与while一起使用来控制代码
			}
			j++;
		}
		
		/*(
		while() {
			//XXXXX
			while() {
				//MMMMM
				break;//只跳出本层循环，外层循环不受干扰
			}
			
			break;
		}
		*/
		
		
		System.out.println("--------------");
		
		//举例2：求半径为1到20且圆面积大于100时，对应的临界半径和临界面积。
		//圆面积的计算公式：(面积 = PI * 半径 * 半径)
		int r = 1;
		double PI = 3.14, s = 0.0;// 变量s表示面积
		while (r <= 20) {
			s = PI * r * r;//面积计算
			if (s > 100) {
				System.out.println("临界半径为"+r+"\n"+"临界面积为"+s);// \n表示回车换行
				break;//break的作用就是跳出本层循环，经常与while一起使用来控制代码
			}
			r++;
		}
	}
}