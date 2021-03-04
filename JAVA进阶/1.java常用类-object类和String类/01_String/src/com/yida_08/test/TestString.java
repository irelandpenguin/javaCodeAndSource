package com.yida_08.test;

public class TestString {
	/*
	 * 需求：把数组中的数据按照指定个格式拼接成一个字符串 
	 * 举例：int[] ary = {1,2,3,4,5};
	 * 输出结果： "[1, 2, 3, 4, 5]"
	 */
	public void test1() {
		int[] ary = {1,2,3,4,5};
		System.out.print("[");
		for (int i = 0; i < ary.length; i++) {
			if (i == ary.length - 1) {
				System.out.print(ary[i] + "]" + "\n");
			} else {
				System.out.print(ary[i] + ", ");
			}
		}
	}
	
	/*
	 * 字符串反转
	 * 举例：键盘录入”i love java,do you love it ?”		
	 * 输出结果：”? it love you do,java love i”
	 */
	public void test2() {
		String s = "i love java,do you love it ?";
		String str = "";
		String[] sAry = s.split(",");
		for (int i = sAry.length-1; i >= 0; i--) {
			String[] ary = sAry[i].split(" ");
			for (int k = ary.length-1; k >= 0; k--) {
				if (k == 0) {
					str += ary[k];
				} else {
					str += ary[k] + " ";
				}
			}
			
			if (i > 0) {
				str += ",";
			}
		}
		
		System.out.println(str);
	}
	
	/*
	 * 统计大串中小串出现的次数
	 * 举例：
	 * 		在字符串"hello, yidahulian。welcom to yida, stuty java go to yida。ha ha ha。"
	 * 结果：
	 * 		yida出现了3次
	 * 
	 * 	indexOf("yida");
	 * 	indexOf("yida",fromIndex);
	 */
	public void test3() {
		String s = "hello, yidahulian。welcom to yida, stuty java go to yida。ha ha ha。";
		String s2 = "yida";
		int count = 0;
		
		int index = s.indexOf(s2);
		while (index != -1) {//等于-1表示找不到了，要退出while循环
			count++;
			System.out.println(s2 + "出现在位置为" + index);
			index = s.indexOf(s2, index + s2.length());
		}
		
		System.out.println(s2 + "共出现" + count + "次");
	}
}
