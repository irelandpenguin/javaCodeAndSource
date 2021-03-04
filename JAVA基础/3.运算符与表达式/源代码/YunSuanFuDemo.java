/*
	赋值运算符：
		基本的赋值运算符：=
			把=右边的数据赋值给左边。
			
		扩展的赋值运算符：+=,-=,*=,/=,%=
			+= 把左边和右边做加法，然后赋值给左边。
*/
class YunSuanFuDemo {
	public static void main(String[] args) {
		int m = 3; //这里的=表示赋值运算符
		System.out.println("m="+m);//m=3
		
		int n = 2, p;
		p = n;//把n的值赋值给变量p
		System.out.println("p="+p);
		
		m = n = p = 12;//把12赋值给p，再把变量p的值赋值给n，再把变量n的值赋值给m。所以，3个变量的值一样
		System.out.println("m="+m+",n="+n+",p="+p);
		
		m = 2;
		
		m += 2;//等效于 m = m+2; 最终m的值为4
		System.out.println("m += 2的值为"+m);
		
		m -= 2;//等效于 m = m-2; 最终m的值为2
		System.out.println("m -= 2的值为"+m);
		
		
		m *= 2;//等效于 m = m*2; 最终m的值为4
		System.out.println("m *= 2的值为"+m);
		
		m /= 2;//等效于 m = m/2; 最终m的值为2
		System.out.println("m /= 2的值为"+m);
		
		m %= 2;//等效于 m = m%2; 最终m的值为0
		System.out.println("m %= 2的值为"+m);
	
	}
}