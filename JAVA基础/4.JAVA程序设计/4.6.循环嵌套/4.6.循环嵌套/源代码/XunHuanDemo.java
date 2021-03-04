/*
	多层循环嵌套使用

	需求：请输出一个4行5列的星星(*)图案。
	结果：
		*****
		*****
		*****
		*****
		
	循环嵌套：就是外层循环语句的循环体本身也是一个循环语句。
*/
class XunHuanDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {//外循环控制行数
			for (int x = 0; x < 5; x++) {//内循环控制列数
				System.out.print("*");
			}
			System.out.println();//换行
		}
	}
}