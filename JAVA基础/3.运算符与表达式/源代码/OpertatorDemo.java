/*
	逻辑运算符：
		&,|,^
		!,&&,||
		
	特点：
		逻辑运算符一般用于连接boolean类型的表达式或者值。
			(a+b) && (a==b)
			
		表达式：就是用运算符把常量或者变量连接起来的符合java语法的式子。
			算术表达式：a + b
			比较表达式：a == b
			
			
	结论：
		&逻辑与:有false则false。
		|逻辑或:有true则true。
		^逻辑异或:相同为false，不同为true。
			举例：情侣关系。男男,男女,女男,女女
		!逻辑非:非false则true，非true则false。
		&&逻辑与：有false则false。与单个&的区别就是&&的左边为假时，右边不在计算。而单个&左右都要计算。
		||逻辑或：有true则true。与单个|的区别就是||的左边为真时，右边不在计算。而单个|左右都要计算。
*/
class OpertatorDemo {
	public static void main(String[] args) {
		int a = 3, b = 4, c = 5;
		
		/*
		//&逻辑与:有false则false。
		System.out.println((a>b) & (a>c));//false & false = false
		
		System.out.println((a>b) & (a<c));//false & true = false
		
		System.out.println((a<b) & (a>c));//true & false = false
		
		System.out.println((a<b) & (a<c));//true & true = true
		System.out.println("-----------------");
		*/
		
		/*
		//|逻辑或:有true则true。
		System.out.println((a>b) | (a>c));//false | false = false
		System.out.println((a>b) | (a<c));//false | true = true
		System.out.println((a<b) | (a>c));//true | false = true
		System.out.println((a<b) | (a<c));//true | true = true
		System.out.println("-----------------");
		*/
		
		//^逻辑异或:相同为false，不同为true。
		System.out.println((a>b) ^ (a>c));//false ^ false = false
		System.out.println((a>b) ^ (a<c));//false ^ true = true
		System.out.println((a<b) ^ (a>c));//true ^ false = true
		System.out.println((a<b) ^ (a<c));//true ^ true = false
		System.out.println("-----------------");
		
		
		/*
		//!逻辑非:非false则true，非true则false。
		System.out.println(!(a>b));//!false = true
		System.out.println(!(a<b));//!true = false
		System.out.println(!!(a<b));//!true = false -> !false = true
		//System.out.println("-----------------");
		*/
		
		//int a = 3, b = 4, c = 5;
		/*
		//&&逻辑与:有false则false。
		System.out.println((a>b) && (a>c));//false && false = false
		System.out.println((a>b) && (a<c));//false && true = false
		System.out.println((a<b) && (a>c));//true && false = false
		System.out.println((a<b) && (a<c));//true && true = true
		System.out.println("-----------------");
		*/
		/*
		//||逻辑或:有true则true。
		System.out.println((a>b) || (a>c));//false || false = false
		System.out.println((a>b) || (a<c));//false || true = true
		System.out.println((a<b) || (a>c));//true || false = true
		System.out.println((a<b) || (a<c));//true || true = true
		*/
	}
}