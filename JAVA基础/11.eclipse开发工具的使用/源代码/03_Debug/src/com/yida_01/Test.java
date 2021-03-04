package com.yida_01;

public class Test {

	public static void main(String[] args) {
		//使用jar包里的ArrayTool类里的方法
		int[] ary = {12, 23, 2, 45, 3, 56, 345, 678, 10};
		ArrayTool.show(ary);//遍历方法
		
		int max = ArrayTool.max(ary);//找最大值方法
		System.out.println("最大值为："+max);
		
		int idx = ArrayTool.findIndex(ary, 56);//查找元素索引
		System.out.println("索引值为："+idx);
	}

}
