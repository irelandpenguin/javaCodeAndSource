/*
	数组可以做为方法的参数。
	
	比如：
		public static void test(int[] arr) {
			
		}
*/
class ArrayDemo2 {
	public static void main(String[] args) {
		//举例1: 有一个数组，求所有数组元素的和。
		int[] arr = {12, 32, 1, 100};//静态初始化
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum="+sum);
		
		//下面用方法来实现
		int sum2 = sum(arr);
		System.out.println("sum2="+sum2);
		 
		
		//举例2：有一个数组，求最大的数组元素。
		int[] arr2 = {123, 32, 456, 65, 12, 43};
		int maxValue = getMax(arr2);
		System.out.println("数组里的最大元素值为"+maxValue);
		
		
		//举例3：有一个数组，找出数组中指定元素对应的索引，找不到打印 -1 。
		int[] arr3 = {23, 2, 56, 78, 21, 55, 90};
		int idx = searchNum(arr3, 21);
		System.out.println("21在数组中的索引为"+idx);
		idx = searchNum(arr3, 100);
		if (idx == -1) {
			System.out.println(idx+",数组中没有该元素");
		}
		
	
		//举例4：有一个数组，把数组的里元素前后互换位置。
		//即：第一个与最后一个换，第二个与倒数第二个换，第三个与倒数第三个换等。
		int[] arr4 = {12, 4, 36, 78, 6, 30};
		exchangeNum(arr4);//这里的方法没有返回值，不用接收返回值
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i]+" ");
		}
		System.out.println();//换行
		
	}
	
	public static int sum(int[] a) {
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}
	
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int searchNum(int[] arr, int value) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static void exchangeNum(int[] arr) {
		//int[] arr4 = {12, 4, 36, 78, 6, 30};
		//arr[0]  arr[5]
		//arr[1]  arr[4]
		//arr[2]  arr[3]
		//arr[i]  arr[5-i]  //这里的5不能写死，arr.length-1
		//改进：arr[i]   arr[arr.length-1-i]
		int len = arr.length;
		for (int i = 0; i < len/2; i++) {
			int tmp = arr[i];
			arr[i] = arr[len-1-i];
			arr[len-1-i] = tmp;
		}
	}
}