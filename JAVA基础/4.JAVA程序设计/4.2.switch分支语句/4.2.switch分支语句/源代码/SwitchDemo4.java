/*
	switch��ı��ʽҲ����char, �������Ǿٸ����ӡ�
	
	��������ķ���(+,-,*,/)������ͬ�����㡣
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
				System.out.println("���ŷǷ������ܼ���");
		}
	}
}