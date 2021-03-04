/*
	while与return一起使用
*/
class WhileDemo4 {
	public static void main(String[] args) {
		//举例1：输出1到5。
		int i = 1;
		while (i <= 5) {
			if (i == 2) {
				i++;
				//break;//break的作用就是跳出本层循环，经常与while一起使用来控制代码
				//continue;//continue的作用就是结束本次循环，转入下一次循环，经常与while一起使用来控制代码
				return;//return的作用就是结束整个方法
			}
			System.out.println(i);
			i++;
		}
		System.out.println("结束啦~~");
	}
}