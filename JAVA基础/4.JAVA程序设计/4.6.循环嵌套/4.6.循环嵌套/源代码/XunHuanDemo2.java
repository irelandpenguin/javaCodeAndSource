/*
	需求：请输出下列的形状
		*
		**
		***
		****
		*****
*/
class XunHuanDemo2 {
	public static void main(String[] args) {
		for(int x = 0; x < 5; x++) {//外层控制行
			for(int y = 0; y <= x; y++) {//里层控制列
				System.out.print("*");
			}
			System.out.println();
		}
	}
}