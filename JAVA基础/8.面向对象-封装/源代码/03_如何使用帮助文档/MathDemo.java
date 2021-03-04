/*
	学习使用系统的文档说明书，即：java帮助文档。


	Math:类包含用于执行基本数学运算的方法
	
	由于Math类在java.lang包下，所以不需要导包。
	
	特点：
		没有构造方法，因为它的成员全部是静态的。
		
	掌握它的三个方法：
		获取最大值
		public static int max(int a, int b)
		
		获取最小值
		public static int min(int a, int b)
		
		获取随机数，返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
		public static double random()
*/
class MathDemo {
	public static void main(String[] args) {
		int a = 100, b = 89;
		int maxValue = Math.max(a, b);
		int minValue = Math.min(a, b);
		System.out.println("最大值为"+maxValue+",最小值为"+minValue);

		
		System.out.println("----------");
		
		double randNum = Math.random();//0.0到1.0之间，不包括1.0
		System.out.println("生成的随机数为"+randNum);
		
		randNum = Math.random()*100+1;//1到100之间，包括100
		System.out.println("生成的随机数(1-100之间)为"+randNum);
		
		int num = (int)(Math.random()*100+1);
		System.out.println("生成的整型随机数(1-100之间)为"+num);
		
		System.out.println("----------");
		
		for (int i = 1; i <= 50; i++) {
			int aNum = (int)(Math.random()*100+1);
			System.out.println("生成的整型随机数(1-100之间)为"+aNum);
		}
		
	}
	
}
