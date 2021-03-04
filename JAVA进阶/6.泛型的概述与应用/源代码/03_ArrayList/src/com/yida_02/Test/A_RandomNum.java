/**
 * 获取任意多个指定范围的随机数，要求不能重复。
 * 
 * 用数组实现，但是数组的长度是固定的，长度不好确定。
 * 所以我们使用集合实现。
 * 
 * 比如：获取10个0到10之间的随机数，且不能重复。
 * 分析：
 * 		A:创建一个存储随机数的集合。
 * 		B:使用循环不断的产生随机数的对象
 * 		C:定义一个统计变量count，从0开始。
 * 		D:判断统计遍历是否小于10
 * 			是:先产生一个随机数，判断该随机数在集合中是否存在。
 * 					如果不存在:就添加，count++。
 * 					如果存在:跳过。
 * 			否：break跳出循环
 * 		E:遍历集合
 */
package com.yida_02.Test;

import java.util.ArrayList;
import java.util.Random;

public class A_RandomNum {

	public static void main(String[] args) {
		String randomNum = getRandom(4,101,201);
		System.out.println(randomNum);
	}

	/**
	 * 获取任意多个指定范围的随机数，要求不能重复。
	 * @param number 多少个随机数
	 * @param begin 指定范围的起始值
	 * @param end 指定范围的最终值
	 */
	public static String getRandom(int number, int begin, int end) {
		ArrayList<Integer> lit = new ArrayList<Integer>();
		Random r = new Random();
		int count = 0;// 统计次数
		while (true) {
			//begin: 0  end: 10
			//r.nextInt(10) : 0~10
			
			//begin: 5   end: 15
			//r.nextInt(15) : 0~15
			//改进：r.nextInt(15-5) : 0~10
			//继续改进：r.nextInt(15-5) + 5 : 5~15
			//最终改进：r.nextInt(end-begin)+begin
			
			//begin: 25   end:80
			//r.nextInt(80-25)+25 : 0~55 + 25  =  25~80
			
			
			int randomNum = r.nextInt(end-begin)+begin;
			Integer num = new Integer(randomNum);
			if (lit.contains(num) == false) {
				lit.add(num);
				count++;
			}

			// 满足条件了，跳出循环
			if (count == number) {
				break;
			}
		}

		return lit.toString();
	}

}
