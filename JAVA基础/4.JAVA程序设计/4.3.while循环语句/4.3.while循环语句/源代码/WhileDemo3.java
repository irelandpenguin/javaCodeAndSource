/*
	while��continueһ��ʹ��
*/
class WhileDemo3 {
	public static void main(String[] args) {
		//����1�����1��30�ܱ�3����������
		int j = 1;
		while (j <= 30) {
			if (j%3 != 0) {
				j++;
				continue;//continue�����þ��ǽ�������ѭ����ת����һ��ѭ����������whileһ��ʹ�������ƴ���
			}
			System.out.println(j);
			j++;
		}
		
		
		/*
		while(j <= 30) {
			if (j%3 == 0) {
				System.out.println(j);
			}
			j++;
		}
		*/
	}
}