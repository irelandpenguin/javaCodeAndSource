/*
	for��continueһ��ʹ��
*/
class ForDemo3 {
	public static void main(String[] args) {		
		//����1�����1��30�ܱ�3����������
		for(int j = 1; j <= 30; j++) {
			if (j%3 != 0) {
				continue;//continue�����þ��ǽ�������ѭ����ת����һ��ѭ����������forһ��ʹ�������ƴ���
			}
			System.out.println(j);
		}
	}
}