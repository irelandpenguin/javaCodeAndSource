/*
	for��returnһ��ʹ��
*/
class ForDemo4 {
	public static void main(String[] args) {
		//����1�����1��5��
		for(int i = 1; i <= 5; i++) {
			if (i == 2) {
				//break;//break�����þ�����������ѭ����������forһ��ʹ�������ƴ���
				continue;//continue�����þ��ǽ�������ѭ����ת����һ��ѭ����������forһ��ʹ�������ƴ���
				//return;//return�����þ��ǽ�����������
			}
			System.out.println(i);
		}
		System.out.println("������~~");
	}
}