/*
	do...while与continue一起使用
*/
class DoWhileDemo3 {
	public static void main(String[] args) {		
		//举例1：输出1到30能被3整除的数。
		int j = 1;
		do {
			if (j%3 != 0) {
				j++;
				continue;//continue的作用就是结束本次循环，转入下一次循环，经常与do...while一起使用来控制代码
			}
			System.out.println(j);
			j++;
		} while (j <= 30);
	}
}