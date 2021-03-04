/*
	面试题：
		short s=1;s=s+1; 
		short s=1;s+=1;
		上面两个代码有没有问题，如果有，那里有问题。
		
		short s=1;s=s+1;//它是有问题的，short+int=int，而s是short，所以，不符默认转换规则。
		
		short s=1;s+=1;//????
		
		
		为什么第二个木有问题呢?
			扩展的赋值运算符其实隐含了一个强制类型转换。
			
			s += 1;
			不是等价于 s = s + 1;
			而是等价于 s = (s的数据类型)(s + 1);
*/
class YunSuanFuDemo2 {
	public static void main(String[] args) {
		//short s = 1;
		//s = s+1;//这里会编译失败，报损失精度的错误。因为s+1的结果默认为int
		//System.out.println(s);
		
		short s = 1;
		s += 1; // s = (short)(s+1); //这里不会编译失败，为啥？因为+=运算符默认会进行强制转换
		System.out.println(s);
	}
}
