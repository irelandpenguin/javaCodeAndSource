/*
	比较运算符：
		==,!=,>,>=,<,<=
		
	特点：
		无论你的操作是简单还是复杂，结果是boolean类型。
		
	注意事项：
		"=="不能写成"="。
*/
class OperatorDemo {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		int z = 3;
	
		System.out.println(x == y);//false
		System.out.println(x == z);//true
		System.out.println((x+y) == (x+z));//false
		System.out.println("------------");
		
		System.out.println(x != y);//true
		System.out.println(x > y);//false
		System.out.println(x >= y);//false
		System.out.println(x < y);//true
		System.out.println(x <= y);//true
		System.out.println("------------");
		
		int a = 10;
		int b = 20;
		
		//boolean flag = (a == b);//flag = false;
		//System.out.println(flag);
		
		//boolean flag = (a = b); //这个是有问题的，不兼容的类型
		//System.out.println(flag);
		
		int c = (a = b); //把b赋值给a，然后把a留下来
		System.out.println(c);
		
	}
}