class ArrayTool {
	//这里可以定义成员变量
	//...
	
	//我们可以加个private修饰的构造方法，来替代系统的。这样，由于权限问题，外界就不能再创建该类的对象了。
	private ArrayTool() {}
	
	//以下是类成员方法，也叫类方法。因为使用了static修饰
	
	public static void show(int[] arr) {//遍历数组元素
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.print(arr[i]+"]");
			} else {
				System.out.print(arr[i]+", ");
			}
		}
	}
	
	public static int getMax(int[] arr) {//获取数组中的最大值
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getIndex(int[] arr, int value) {//根据给定的value值，找出它在数组中第一次出现的索引位置。如果找不到，返回-1
		int index = -1;//给个初始值
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				index = i;
				break;
			}
		}
		return index;
	}
}