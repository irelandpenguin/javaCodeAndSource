/*
	++,--运算符的使用：
		单独使用：
			放在操作数的前面和后面效果一样。(这种用法是我们比较常见的)
		参与运算使用：
			放在操作数的前面，先自增或者自减，然后再参与运算。
			放在操作数的后面，先参与运算，再自增或者自减。
			
	作用：就是对变量进行自增1或者自减1。
*/
class OperatorDemo2 {
		public static void main(String[] args) {
			//定义两个变量
			int x = 3;
			int y = 4;
			
			//字符串的拼接
			//System.out.println("x:"+x);
			//System.out.println("y:"+y);
			
			System.out.println("x:"+x+",y:"+y);//x:3,y:4
			
			//单独使用
			//x++;
			//y--;
			//++x;//x的值变为4
			//--y;//y的值变为3
			//System.out.println(x);
			//System.out.println("x:"+x+",y:"+y);//x:4,y:3
			
			
			
			//意外的类型,常量是不可以这样做的
			//System.out.println(10++);
			
			System.out.println("-------------------");
			//参与运算使用
			int a = 3;
			int b = 4;
			
			//int c = ++a;//a先自已加1，然后，再把自己的值赋值给变量c
			//a=4,c=4
			//System.out.println("a="+a+",c="+c);
			//int d = --b;//b先自己减1，然后，再把自己的值赋值给变量d
			//b=3,d=3
			//System.out.println("b="+b+",d="+d);
			
			
			int c = a++;//变量a先把自己的值赋给变量c，然后，自己再加1
			//c=3,a=4
			System.out.println("c="+c+",a="+a);
			int d = b--;//变量b先把自己的值赋给变量d，然后，自己再减1
			//d=4,b=3
			System.out.println("d="+d+",b="+b);
		}
}