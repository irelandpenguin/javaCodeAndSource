/*
	for与continue一起使用
*/
class ForDemo3 {
	public static void main(String[] args) {		
		//举例1：输出1到30能被3整除的数。
		for(int j = 1; j <= 30; j++) {
			if (j%3 != 0) {
				continue;//continue的作用就是结束本次循环，转入下一次循环，经常与for一起使用来控制代码
			}
			System.out.println(j);
		}
	}
}