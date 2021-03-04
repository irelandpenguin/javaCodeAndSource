/*
	for与return一起使用
*/
class ForDemo4 {
	public static void main(String[] args) {
		//举例1：输出1到5。
		for(int i = 1; i <= 5; i++) {
			if (i == 2) {
				//break;//break的作用就是跳出本层循环，经常与for一起使用来控制代码
				continue;//continue的作用就是结束本次循环，转入下一次循环，经常与for一起使用来控制代码
				//return;//return的作用就是结束整个方法
			}
			System.out.println(i);
		}
		System.out.println("结束啦~~");
	}
}