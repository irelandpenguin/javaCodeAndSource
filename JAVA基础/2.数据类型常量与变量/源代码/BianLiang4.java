/*
	强制转换：
		从大的数据类型到小的数据类型。
		
		格式：
			目标数据类型 变量 = (目标数据类型) (被转换的数据);
			
		注意：
			不要随意的去使用强制转换，因为它隐含了精度损失问题。
			即使是强制转换，我们也要遵循从小转大的规则。
*/
class BianLiang4 {
	public static void main(String[] args) {
		byte a = 3;
		int b = 400000;
		//int c = a + b;//这个肯定没有问题
		//byte c = a + b; //这个是有问题的,因为不符合默认转换规则
		
		byte c = (byte) (a + b);//用强制类型转换改进
		System.out.println(c);
		int c2 = (int)(a+b);
		System.out.println(c2);
	}
}