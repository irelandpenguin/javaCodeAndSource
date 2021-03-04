/**
* 此类主要封装数组的常用方法，方便外界调用。
* @author 张老师
* @version V1.1
*/
public class ArrayTool2 {//使用public修饰的类才能被javadoc工具命令解析	
	/**
	* 功能：遍历数组元素。
	* @param arr 一维的整型数组
	*/
	public static void show(int[] arr) {
	System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.print(arr[i]+"]");
			} else {
				System.out.print(arr[i]+", ");
			}
		}
	}
}