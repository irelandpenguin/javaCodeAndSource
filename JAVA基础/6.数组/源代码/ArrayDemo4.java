/*
	二维数组
		格式2：
			数据类型[][] 数组名 = new 数据类型[m][];
			
			m：这个二维数组有多少个一维数据。
			列数没给出，表示可以动态的给。这次是一个变化的一维数组。
			
			举例：int[][] arr = new int[3][];
			
		二维数组初始化：
			A：动态初始化;
			B：静态初始化;
*/
class ArrayDemo4 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];//动态创建二维数组
		System.out.println(arr);//打印二维数组的地址
		System.out.println(arr[0]);//打印二维数组里第一个一维数组的地址  null
		System.out.println(arr[1]);//打印二维数组里第二个一维数组的地址  null
		System.out.println(arr[2]);//打印二维数组里第三个一维数组的地址  null
		//System.out.println(arr[0][0]);//打印二维数组里第一个一维数组的第一个元素   这里报.NullPointerException异常，为啥？
		
		System.out.println("---------");
		
		//动态开辟二维数组中一维数组的内存
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[1];
		
		System.out.println(arr);//打印二维数组的地址
		System.out.println(arr[0]);//打印二维数组里第一个一维数组的地址 
		System.out.println(arr[1]);//打印二维数组里第一个一维数组的地址  
		System.out.println(arr[2]);//打印二维数组里第一个一维数组的地址  
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][0]);
		//System.out.println(arr[2][1]);// 这里报ArrayIndexOutOfBoundsException异常，为啥？
		
		System.out.println("---------");
		
		//手工填值
		arr[0][0] = 100;
		arr[0][1] = 23;
		arr[1][0] = 90;
		arr[2][0] = 78;
		
		//打印二维数组里的所有元素
		for (int i = 0; i < arr.length; i++) {//外层遍历二维数组的元素
			for (int j = 0; j < arr[i].length; j++) {//里层遍历一维数组的元素
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------");
		
		//利用循环给二组数组填充值 
		int num = 1;
		for (int i = 0; i < arr.length; i++) {//外层遍历二维数组的元素
			for (int j = 0; j < arr[i].length; j++) {//里层遍历一维数组的元素
				arr[i][j] = num++;
			}
		}
		
		
		printArray(arr);//打印所有元素
		System.out.println("---------");
		
		//重新创建一个二维数组，静态初始化它的元素
		//int[][] arr2 = new int[][]{{10,20},{1,3,5},{60}};//不推荐
		//也可以简化，如下：
		int[][] arr2 = {{10,20},{1,3,5},{60}};//推荐

		printArray(arr2);//打印所有元素
	}
	
	public static void printArray(int[][] a) {//打印所有元素
		for (int i = 0; i < a.length; i++) {//外层遍历二维数组的元素
			for (int k = 0; k < a[i].length; k++) {//里层遍历一维数组的元素
				System.out.print(a[i][k]+"\t");//不换行, "\t"表示横向跳四格
			}
			System.out.println();//换行
		}
	}
}
