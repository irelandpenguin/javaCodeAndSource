/*
	do...while��continueһ��ʹ��
*/
class DoWhileDemo3 {
	public static void main(String[] args) {		
		//����1�����1��30�ܱ�3����������
		int j = 1;
		do {
			if (j%3 != 0) {
				j++;
				continue;//continue�����þ��ǽ�������ѭ����ת����һ��ѭ����������do...whileһ��ʹ�������ƴ���
			}
			System.out.println(j);
			j++;
		} while (j <= 30);
	}
}