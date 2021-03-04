/*
	java中方法的参数是如何传递的？
		基本类型(byte,short,int,long,float,double,char,boolean)：数值传递;
		引用类型(数组，类，接口)：地址传递。
*/
class MethodDemo {
	public static void main(String[] args) {
		//举例1：
		int a = 10, b = 20;
		int s = sum(a, b);//基本类型，传的是数值
		System.out.println("a="+a+",b="+b+",s="+s);//a=10,b=20,s=60
		
		
		System.out.println("---------");
		
		//举例2：
		int[] arr = {1,2,3,4,5,6};
		System.out.println("-----"+arr);
		test(arr);//引用类型，传的是地址
		
		//打印数组arr的所有元素
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		
		System.out.println("\n---------");
		
		//举例3. 小明，小红，小张3人参加期末考试(语文，数学，英语)，小明的成绩为{80.5, 92, 88.5}, 小红的成绩为{93, 68.5, 76},小张的成绩为{53.5, 81, 77}，求三门课程的平均成绩。
		double[][] grades = {{80.5, 92, 88.5},{93, 68.5, 76},{53.5, 81, 77}};
		double[] grade = new double[3];//定义一个一维数组，保存三门课程的平均成绩
		getGrade(grades, grade);//引用类型，传的是地址
		System.out.println("语文平均成绩为"+grade[0]+"\n"+"数学平均成绩为"+grade[1]+"\n"+"英语平均成绩为"+grade[2]);
		
	}
	
	public static int sum(int a, int b) {
		a = a*2;
		b = b*2;
		System.out.println("a="+a+",b="+b);//a=20,b=40
		int c = a+b;
		return c;
	}
	
	public static void test(int[] a) {
		System.out.println("====="+a);
		for (int i = 0; i < a.length; i++) {
			if (i%2 == 0) {
				a[i] = a[i]*2;
			}
		}
	}
	
	public static void getGrade(double[][] grades, double[] grade) {
		for (int i = 0; i < grades.length; i++) {
			double tmp = 0;
			for (int j = 0; j < grades[i].length; j++) {
				tmp += grades[j][i];
			}
			grade[i] = tmp/3;//获取平均成绩
		}
	}
}