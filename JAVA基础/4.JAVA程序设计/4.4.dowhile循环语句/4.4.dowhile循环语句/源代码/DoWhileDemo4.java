/*
	do...while��returnһ��ʹ��
*/
class DoWhileDemo4 {
	public static void main(String[] args) {
		//����1�����1��5��
		int i = 1;
		do {
			if (i == 2) {
				i++;
				//break;//break�����þ�����������ѭ����������do...whileһ��ʹ�������ƴ���
				continue;//continue�����þ��ǽ�������ѭ����ת����һ��ѭ����������do...whileһ��ʹ�������ƴ���
				//return;//return�����þ��ǽ�����������
			}
			System.out.println(i);
			i++;
		} while (i <= 5);
		System.out.println("������~~");
	}
}