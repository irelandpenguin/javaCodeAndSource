/*
	方法：完成特定功能的代码块。
	
	注意：在很多语言里面有函数的定义，而在Java中函数被称为方法。

	方法格式：
		修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
			方法体语句;
			return 返回值; 
		}
	详细解释：
		修饰符：目前就用 public static。后面我们再详细的讲解其他的修饰符。
		返回值类型：就是功能结果的数据类型。
		方法名：符合命名规则即可。方便我们的调用。
		参数：用于接收实际值的。
		参数类型：就是参数的数据类型
		参数名：就是变量名
		方法体语句：就是完成功能的代码。
		return：结束方法的。
		返回值：就是功能的结果，由return带给调用者。
		
	要想写好一个方法，就必须明确两个东西：
		A:返回值类型
			结果的数据类型
		B:参数列表
			你要传递几个参数，以及每个参数的数据类型
			
	方法的注意事项：
		A:方法不调用不执行
		B:方法与方法是平级关系，不能嵌套定义
		C:方法定义的时候参数之间用逗号隔开
		D:方法调用的时候不用再传递数据类型
		E:如果方法有明确的返回值，一定要有return带回一个值
*/
class FunctionDemo {
	//当前这个方法的功能：求两个数的和。
	public static int sum(int a,int b) {
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		//举例1：求两个数的和。	
		//int h = sum(12,8);
		//System.out.println(h);
		
		//也可以这个写,一般不推荐
		//System.out.println(sum(12,8));//这种方式要注意一点：方法必须有真正的返回值，如果方法返回的是void,就不能这么调用！！
		
		//举例2：求1到100的和。
		int m = getSum(1, 100);
		System.out.println("1到100的和为"+m);
		
		//举例3：求两个浮点数中最大的一个。
		float x = 31.4F, y = 2.56f;
		float max = getMax(x, y);
		System.out.println(x+","+y+"最大的是"+max);
		
		//输出20次hello world。
		show();
	}
	
	public static void show() {//这个方法，不带返回值，没有参数
		for(int i = 1; i <= 20; i++) {
			System.out.println("hello world");
		}
	}
	
	public static int getSum(int m,int n) {
		int s = 0;
		for (int i = m; i <= n;i++) {
			s = s+i;
		}
		return s;
	}
	

	public static float getMax(float x, float y) {
		if (x > y) {
			return x;
		}
		return y;
	}
}


