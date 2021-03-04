/*
 * 需求：有一个英文，把空格前后的单词首字母改成大写。
 * 举例：
 * 		i love yidahulian techo
 * 结果：
 * 		I Love Yidahulian Techo
 * 
 * 	分析：
 * 		首先，把字符串按空格分离，得到一个String[];
 * 		然后，for循环遍历数组中的每一个单词;
 * 		接下来，可以使用substring(0,1);得到每一个单词的首字母;
 * 		再利用，toUpperCase();把刚得到的单词改成大写;
 * 		再利用，substring(1);可以把每个单词后面的字母全部拿到;
 * 		再利用，concat()方法把两个子串给拼接起来;
 * 		最后，把拼接后的单词全部组合成一个字串并打印。
 */
package com.yida_06.String;

public class B_Test {

	public static void main(String[] args) {
		String s = "i love yidahulian techo";
		String[] ary = s.split(" ");//按空格拆分
		String newS = new String();
		for (int i = 0; i < ary.length; i++) {
			String str = ary[i];
			String first = str.substring(0, 1);
			first = first.toUpperCase();
			String last = str.substring(1);
			String tmp = first + last;
			newS += tmp + " ";
		}
		System.out.println(newS);

		System.out.println("------");

		test();// 简化版
	}
	
	public static void test() {
		// 简化版
		String s = "i love yidahulian techo", newS = "";
		String[] ary = s.split(" "); //按空格拆分
		for (int i = 0; i < ary.length; i++) {
			String first = ary[i].substring(0, 1).toUpperCase();// 链式编程
			String last = ary[i].substring(1);
			newS += first + last + " ";
		}
		System.out.println(newS);
	}

}
