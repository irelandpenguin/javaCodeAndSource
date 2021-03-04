/*
	数组:用于存储同一种数据类型的多个元素的容器。
	
	定义格式：
		A:数据类型[] 数组名; 
		B:数据类型 数组名[];
		
	举例：
		A:int[] a; 定义一个int类型的数组a变量(推荐！！)
		B:int a[]; 定义一个int类型的a数组变量
		
		String[] s;
		char[] c;
		double[] d;
		boolean[] bl;
		long[] l;
		short[] sh;
		
	注意：效果可以认为是一样的，都是定义一个int数组，但是念法上有些小区别。推荐使用第一种。
	
	数组进行初始化
		A:何谓初始化呢? 就是为数组开辟内存空间，并为每个数组元素赋值
		B:有几种方式呢?
			a:动态初始化 只指定长度，由系统给出初始化值
			b:静态初始化 给出初始化值，由系统决定长度
			
	动态初始化的格式：
		数据类型[] 数组名 = new 数据类型[数组长度];            //记住：= 右边的[]里一定有值
		
		举例：
		int[] arr = new int[3];	
		
	静态初始化的格式
		数据类型[] 数组名 = new 数据类型[] {数据1,数据2,...}   //记住：= 右边的[]里不能有值
		简化书写
		数据类型[] 数组名 = {数据1,数据2,...}
		
		举例：
		int[] arr3 = new int[]{12, 23, 2, 67, 45, 3};//静态初始化
		int[] arr3 = {12, 23, 2, 67, 45, 3};//静态初始化
		
	获取数组中的元素
		数组名[索引]
		注意：数组的索引从0开始，最大索引是 (数组的长度-1)。
		
	数组操作的两个常见小问题：	
		ArrayIndexOutOfBoundsException:数组索引越界异常。原因：你访问了不存在的索引。
		NullPointerException:空指针异常。原因：数组已经不在指向堆内存了。而你还用数组名去访问元素。
*/
class ArrayDemo {
	public static void main(String[] args) {
		//int[] a;
		//System.out.println(a);//这行报错，数组在使用前必须初始化
		
		
		//int b[] = new int[2];//方式一创建数组，不推荐  动态初始化
		int[] arr = new int[3];//方式二创建数组，推荐!   动态初始化
		System.out.println(arr);//打印数组的内存地址
		System.out.println(arr[0]);//打印数组第一个元素值
		double[] ary = new double[2];
		System.out.println(ary);
		System.out.println(ary[0]);
		
		System.out.println("---------");
		
		/*
			这里记住：
				int, long类型的数组默认初始化值为0
				float, double类型的数组默认初始化值为0.0
				类，接口，数组 都属于引用类型，它们的默认初始化值均为null
		*/
		
		
		
		int[] arr3 = new int[]{12, 23, 2};//静态初始化		
		//int[] arr4 = {12, 23, 2};//静态初始化,简写的(推荐！)
		for(int i = 0; i < arr3.length; i++) {//for循环打印所有元素值
			System.out.println(arr3[i]);
		}
		
		System.out.println("---------");
		
		
		
		arr[0] = 10;//修改数组指定索引的数组元素值
		arr[2] = 21;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");//打印数组元素，加个空格
		}
		
		System.out.println("\n---------");// \n表示换行
		
		int[] arr2 = arr;//把一个数组赋值给另一数组
		System.out.println(arr);
		System.out.println(arr2);
		arr2[0] = 21;
		arr2[1] = 32;
		arr2[2] = 3;
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+" ");//这里arr与arr2有区别吗？为啥？
		}
		
		System.out.println("\n---------");// \n表示换行
		
		//美化打印
		System.out.print("[");
		for (int i = 0; i < arr3.length; i++) {
			if (i == arr3.length-1) {
				System.out.println(arr3[i]+"]");
			} else {
				System.out.print(arr3[i]+",");
			}
		}
		
		
		
		//int[] arr3 = new int[]{12, 23, 2};//静态初始化		
		
		//下面代码打印会出现什么结果？
		//System.out.println(arr3[2]);//这里会报异常!! 为啥？
		
		
		//arr3 = null;//arr3赋值为null
		//System.out.println(arr3);//打印数组的内存地址
		//System.out.println(arr3[0]);//这里会报异常!! 为啥？
		
	}
}
