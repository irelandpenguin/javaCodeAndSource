/*
	while��returnһ��ʹ��
*/
class WhileDemo4 {
	public static void main(String[] args) {
		//����1�����1��5��
		int i = 1;
		while (i <= 5) {
			if (i == 2) {
				i++;
				//break;//break�����þ�����������ѭ����������whileһ��ʹ�������ƴ���
				//continue;//continue�����þ��ǽ�������ѭ����ת����һ��ѭ����������whileһ��ʹ�������ƴ���
				return;//return�����þ��ǽ�����������
			}
			System.out.println(i);
			i++;
		}
		System.out.println("������~~");
	}
}