/*
	(2)ifǶ����䣻
*/
class IfDemo2 {
	public static void main(String[] args) {
		//����1����һ���ַ�����'x'���жϸñ����Ƿ�ͬʱ�����ַ�'a','n','b'������Ҫ��ʱ�Ŵ�ӡ��
		char m = 'x';
		
		//��ʽһ��ʹ��if���������
		if (m > 'a' && m > 'n' && m > 'b') {
			System.out.println("�ַ�"+m+"ͬʱ����'a', 'n', 'b'");
		}
		
		
		//��ʽ����ʹ��ifǶ�������
		if (m > 'a') {
			if (m > 'n') {
				if (m > 'b') {
					System.out.println("�ַ�"+m+"ͬʱ����'a', 'n', 'b'");
				}
			}
		}
		
		
		//����2����3�����������ֵ��
		int a = 120, b = 340, c = 20;
		int max;
		
		//��ʽһ������ʹ������֮ǰѧϰ����Ŀ�����
		max = ((a > b)   ?   ((a > c) ? a : c)   :   ((b > c) ? b : c));
		System.out.println("max="+max);
		
		//��ʽ����ʹ��ifǶ�������
		if (a > b) {//a>b
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {//a <= b
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		System.out.println("max="+max);
	}
}