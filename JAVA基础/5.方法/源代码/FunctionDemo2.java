/*
	返回类型为空的方法讲解

	方法格式：
		修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
			方法体语句;
			return 返回值; 
		}

	返回类型为空表示不返回值，不用接收的。
*/
class FunctionDemo2 {
	public static void main(String[] args) {
		
		//举例1：找出1到100，能被3整除的数。
		//getNum(1, 100);
		
		//举例2：打印1到100中的偶数和与奇数和。
		int a = 1, b = 100;
		getNum2(a, b);
		
		//举例3：求100~999中，十位数包含6的数。
		getNum3(100, 999);
		
		//举例4：打印hello world
		hello();
	}
	
	
	public static void getNum(int a, int b) {
		for(int i = a; i <= b; i++) {
			if(i%3 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();//换行
	}
	
	public static void getNum2(int a, int b) {
		int sum1 = 0, sum2 = 0;
		for(int i = a; i <= b; i++) {
			if(i%2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		}
		System.out.println("偶数和为"+sum1+",奇数和为"+sum2);
	}
	
	public static void getNum3(int x, int y) {
		for(int n = x; n <= y; n++) {
			int num = n/10%10;//获取十位数字
			if(num == 6) {
				System.out.print(n+"\t");// \t 表示横向跳四格
			}
		}
	}
	
	public static void hello() {
		System.out.println("hello world");
	}
}