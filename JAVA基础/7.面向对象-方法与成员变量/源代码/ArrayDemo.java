/*
	写一个工具类数组，封装常用的功能。方便以后调用。
	
	注意：在同一文件夹下的两个java文件里的类可互相访问。
		
*/
class ArrayDemo {
	public static void main(String[] args) {
		int[] ary = {12, 45, 2, 67, 709, 6, 32, 54, 78, 18};
		
		//ArrayTool at = new ArrayTool();//创建一个对象
		//at.show(ary);//使用对象调用方法来遍历数组

		
		//一般不推荐使用上述方式进行调用。类方法，我们统一由类名进行调用。更直观,更有意义。
		//但是，有些"不听话的"开发者还采用上述方式调用。所以，需要想个办法不让他们调用。
		
		ArrayTool.show(ary);//遍历数组
		
		
		System.out.println("\n----------");
		
		int max = ArrayTool.getMax(ary);//查找数组中的最大值
		System.out.println("数组中的最大值为"+max);
		
		System.out.println("----------");
		
		int idx = ArrayTool.getIndex(ary, 6);//查找6在数组中的索引位置
		System.out.println("6在数组中的位置为"+idx);
		idx = ArrayTool.getIndex(ary, 666);//查找666在数组中的索引位置
		System.out.println("666在数组中的位置为"+idx);
		
		
		/*
			总结一下：
				当前的main方法是由static修饰的，说明main方法也是ArrayDemo的类方法。
				根据上节我们讲解的static知识点可知，main方法只能访问类方法和类成员变量。
				所以，我们才会给ArrayTool里的方法使用static修饰。
		*/
	}
}