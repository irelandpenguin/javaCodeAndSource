package com.yida_07.String;

public class B_Test {

	public static void main(String[] args) {
		String s = "hello", s2 = "hel";
		int result = s.compareTo(s2);
		System.out.println(s+"与"+s2+"的比较结果为"+result);//这里为什么会返回2呢？
		if (result > 0) {
			System.out.println(s + "大于" + s2);
		} else if (result < 0) {
			System.out.println(s + "小于" + s2);
		} else {
			System.out.println(s + "等于" + s2);
		}
	}
	
	/*
	public int compareTo(String anotherString) {
		//等价于this.value.length，value是一个一维字符数组，用于存放字符串里面的每一个字符
        int len1 = value.length;//len1=5
        int len2 = anotherString.value.length;//len2=3
        int lim = Math.min(len1, len2);//lim=3
        char v1[] = value;//v1[]数组里的元素就是{'h','e','l','l','o'}
        char v2[] = anotherString.value;//v2[]数组里的元素就是{'h','e','l'}

        int k = 0;
        while (k < lim) {//这里的lim值为3
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;//这里最终返回的是5-3=2
    }
    */
}
