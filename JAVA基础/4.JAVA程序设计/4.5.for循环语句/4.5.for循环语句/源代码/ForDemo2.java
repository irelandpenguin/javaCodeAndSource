/*
	for��breakһ��ʹ��
*/
class ForDemo2 {
	public static void main(String[] args) {		
		//����1��ֻ���1��30�ܱ�3�����ĵ�һ������
		for(int j = 1; j <= 30; j++) {
			if (j%3 == 0) {
				System.out.println(j);
				break;//break�����þ�����������ѭ����������forһ��ʹ�������ƴ���
			}
		}
		
		/*
		for(int a = 1; a < 100; a++) {
			for (int b = 1; b < 20; b++) {
				//xxxxxx
				//xxxx
				break;//�����breakֻ����������forѭ��
			}
			
			break;//�����break������������forѭ��
		}
		*/
		

		System.out.println("--------------");
		
		//����2����뾶Ϊ1��20��Բ�������100ʱ����Ӧ���ٽ�뾶���ٽ������
		double PI = 3.14, s = 0.0;// ����s��ʾ���
		for(int r = 1; r <= 20; r++) {
			s = PI * r * r;//���
			if (s > 100) {
				System.out.println("�ٽ�뾶Ϊ"+r+"\n"+"�ٽ����Ϊ"+s);// \n��ʾ�س�����
				break;//break�����þ�����������ѭ����������forһ��ʹ�������ƴ���
			}
		}
		
	}
}