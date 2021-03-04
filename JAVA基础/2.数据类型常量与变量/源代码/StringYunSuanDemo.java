/*
	字符串参与运算
	
		字符串数据和其他数据做+，结果是字符串类型。
		这里的+不是加法运算，而是字符串连接符。
	结论：+前后，只要有一个是字符串，就会发生字符串连接。否则，就会发生数值相加！
*/
class StringYunSuanDemo {
	public static void main(String[] args) {
		System.out.println("6+6"+'A'+1);//6+6A1
		System.out.println('a'+1+"8+8");//988+8
		
		System.out.println("5+5="+5+5);//第一个+得出的结果为"5+5=5"  第二个+前是"5+5=5"+5 -> 5+5=55
		System.out.println(5+5+"=5+5");//第一个+得出的结果为数字10   第二个+前是数字10+"=5+5"   ->   10=5+5
	}
}