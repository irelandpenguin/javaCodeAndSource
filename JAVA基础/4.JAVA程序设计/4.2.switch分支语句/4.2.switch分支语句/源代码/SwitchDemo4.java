/*
	switch后的表达式也可以char, 这里我们举个例子。
	
	根据输入的符号(+,-,*,/)，做不同的运算。
*/
class SwitchDemo4 {
	public static void main(String[] args) {
		int x = 3, y = 4, z;
		char c = '+';
		switch (c) {
			case '+':
				z = x+y;
				System.out.println(x+"+"+y+"="+z);
				break;
			case '-':
				z = x-y;
				System.out.println(x+"-"+y+"="+z);
				break;
			case '*':
				z = x*y;
				System.out.println(x+"*"+y+"="+z);
				break;
			case '/':
				z = x/y;
				System.out.println(x+"/"+y+"="+z);
				break;
			default:
				System.out.println("符号非法，不能计算");
		}
	}
}