/*
	二维数组：就是元素为一维数组的一个数组。
	
	格式1：(格式2后面讲解)
	数据类型[][] 数组名 = new 数据类型[m][n];
		m：表示这个二维数组有多少个一维数组。
		n：表示每个一维数组有多个少元素。
		
	举例：int[][] arr = new int[3][2]; //推荐！！
		
	注意：
		A：以下格式也可以表示二维数组
			a：数据类型 数组名[][] = new 数据类型[m][n];
				举例：int arr[][] = new int[3][2];//不推荐！！
			b：数据类型[] 数组名[] = new 数据类型[m][n];
				举例：int[] arr[] = new int[3][2];//不推荐！！
			
		B：面试题测一把：
			int[] x, y[]; 请问x, y分别表示什么？
				x：表示的是一个一维int数组
				y: 表示的是一个二维int数组
			
	二维数组初始化：
		A：动态初始化: 即创建时只开辟内存空间，不赋值。
		B：静态初始化：即创建时赋值，系统根据赋的值来开辟空间。
	
*/
class ArrayDemo3 {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];//定义一个二维数组，推荐!! 动态初始化，注意：=右边的两个[]建议有值!!
		//int arr[][] = new int[3][2];//定义一个二维数组，不推荐
		//int[] arr[] = new int[3][2];//定义一个二维数据，不推荐
		
		System.out.println(arr);//打印二维数组的地址
		
		
		System.out.println(arr[0]);//打印二维数组中第一个一维数组的地址
		System.out.println(arr[1]);//打印二维数组中第二个一维数组的地址
		System.out.println(arr[2]);//打印二维数组中第三个一维数组的地址
		
		System.out.println(arr[0][0]);//打印二维数组中第一个一维数组的第一个元素
		System.out.println(arr[0][1]);//打印二维数组中第一个一维数组的第二个元素
		
		
		System.out.println("-----------");
		
		//给二维数组赋值
		arr[0][0] = 100;
		arr[0][1] = 9;
		arr[1][0] = 12;
		arr[2][1] = 30;
		
		//打印二维数组里的所有元素
		for (int i = 0; i < arr.length; i++) {//外层循环，遍历的是二维数组的元素
			for (int k = 0; k < arr[i].length; k++) {
				System.out.print(arr[i][k]+"\t");//不换行，"\t"表示横向空四格
			}
			System.out.println();//换行
		}
		
		System.out.println("-----------");
		
		//再创建一个二维数组，静态初始化
		//int[][] arr2 = new int[][]{{1,2},{3,4},{5,6}};//不推荐，注意：= 右边的两个[]里一定不能有值！
		//可以简化初始化，如下：
		int[][] arr2 = {{1,2},{3,4},{5,6}};//推荐
		for (int i = 0; i < arr2.length; i++) {
			for (int k = 0; k < arr2[i].length; k++) {
				System.out.print(arr2[i][k]+" ");//不换行
			}
			System.out.println();//换行
		}
		
	}
}