package com.yida_01;

import com.yida_08.ArrayTool;
import com.yida_09.Son;

public class Test {

	public static void main(String[] args) {
		//使用jar包里的ArrayTool类里的方法
		int[] ary = {12, 23, 2, 45, 3, 56, 345, 678, 10};
		ArrayTool.show(ary);//遍历方法
		
		int max = ArrayTool.max(ary);//找最大值方法
		System.out.println("最大值为："+max);
		
		int idx = ArrayTool.findIndex(ary, 56);
		System.out.println("索引值为："+idx);
		
		//使用jar包里的Son类里的方法
		Son son = new Son("李连杰");
		son.study();
		son.play();
		son.song();
		son.dance();
		
	}

}
