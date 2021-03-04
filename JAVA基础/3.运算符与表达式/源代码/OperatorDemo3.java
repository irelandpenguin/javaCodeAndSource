/*
	三目运算符：
		格式：比较表达式?表达式1:表达式2;
		
		比较表达式:结果是一个boolean类型。
		
		执行流程：
			根据比较表达式的计算返回一个true或者false。
			如果是true，就把表达式1作为结果。
			如果是false，就把表达式2作为结果。
*/
class OperatorDemo {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		//int z = x > y ? x : y;
		int z = ((x > y) ? x : y);//更好的写法
		System.out.println("z="+z);
		
		
		//z = ((x*2 > y-10) ? (x-y) : (x+y));
		//System.out.println("z="+z);//z=-100
		
		//z = ((x=y) ? x : y);//报错了。为啥？因为 ？ 前要求是一个boolean类型
		//System.out.println("z="+z);
		
		
		//做几个练习题，练一把
		//练习1：求两个数中的最大值。
		int a = 12, b = 6;
		int max = ((a > b) ? a : b);
		System.out.println("max="+max);//max=12
		
		
		//练习2：求三个数中的最大值。
		int m = 2, n = 23, p = 1;
		int tmp = ((m>n) ? m : n);//tmp=23
		max = ((tmp > p) ? tmp : p); //这里的max是上面声明的，因为在变量生命周期内，同一个变量可多次使用
		System.out.println("max="+max);//max=23
		
		
		//也可以一步搞定,但不建议这么写！！
		//max = ((m > n)     ?    ((m > p) ? m : p)     :     ((n > p) ? n : p));//这里嵌套使用的三目运算符
		//System.out.println("max="+max);//max=23
		
		
		//不建议这样写，太不好理解了!
		//max = m > n ? m > p ? m : p : n > p ? n : p;
		//System.out.println("max="+max);
		
		
		//练习3：判断2个数是否相等。
		boolean c1 = ((a == b) ? true : false);
		System.out.println("c1="+c1);//c1=false
		
		//因为是boolean类型的变量，所以，也可以这样写
		boolean c2 = (a == b);
		System.out.println("c2="+c2);//c2=false
		
	}
}