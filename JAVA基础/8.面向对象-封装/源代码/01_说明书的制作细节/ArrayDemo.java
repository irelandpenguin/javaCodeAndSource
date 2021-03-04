/*
	面向对象三大特性：
		封装
		继承
		多态
		
	首先，学习封装，学习前，我们先学习如何制作说明书
	
	如何制作一个说明书呢?
		A:写一个工具类
		B:对这个类加入文档注释
		C:用工具解析文档注释
			javadoc -d 目录 -author -version java文件名称
			
			目录：就是一个文件夹的路径。如果只写文件夹名，表示在当前目录下生成说明书。
			文件名称：就是即将生成说明书的java文件，比如：ArrayTool.java
			
			比如：(doc表示文件夹名)
			javadoc -d doc -author -version ArrayTool.java
			javadoc -d C:\Java课程\doc -author -version ArrayTool.java
			
			注意：如果想为更多工具类生成说明书，直接在最后面补java文件名即可。如下：
			javadoc -d doc -author -version ArrayTool.java ArrayTool2.java ArrayTool3.java
			
	制作帮助文档出错：
		找不到可以文档化的公共或受保护的类：告诉我们类的权限不够
		需要把类的权限改成public
*/
class ArrayDemo {
	public static void main(String[] args) {
		
	}
	
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
	
	/**
	* 功能：获取数组中的最大值
	* @param arr 一维的整型数组
	* @return int 方法返回数组中最大元素
	*/
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}