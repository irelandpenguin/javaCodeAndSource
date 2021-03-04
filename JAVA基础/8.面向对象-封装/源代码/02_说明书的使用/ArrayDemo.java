/*
	说明书的使用
*/
class ArrayDemo {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {28,55,37,46,19};
		
		//遍历
		ArrayTool.printArray(arr);

		//获取最值
		int max = ArrayTool.getMax(arr);
		System.out.println("max:"+max);
		
		//获取55的索引值
		int index = ArrayTool.getIndex(arr,55);
		System.out.println("index:"+index);
	}
}