/*
	字符参与运算
		键盘上的每一个字符都对应一个唯一的数字，我们称之为ASCII码。
		ASCII码用来唯一标识一个字符！！
		
	ASCII码表
		通过看完这张表以后，我们要记住三个值：
			'a'		97
			'A'		65
			'0'		48
			
	字符也能参与运算
*/
class CharYunSuanDemo {
	public static void main(String[] args) {
		System.out.println('a'); //打印a
		System.out.println('a'+1);//打印98
		
		int m = 'A'+2;
		System.out.println(m);//67
		
		int n = '0'+1;
		System.out.println(n);//49
		
		int n2 = 0+1;
		System.out.println(n2);//1
	}
}