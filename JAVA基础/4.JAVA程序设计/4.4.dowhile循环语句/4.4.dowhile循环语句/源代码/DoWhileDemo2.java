/*
	do...while��breakһ��ʹ��
*/
class DoWhileDemo2 {
	public static void main(String[] args) {
		//����1��ֻ���1��30�ܱ�3�����ĵ�һ������
		int j = 1;
		do {
			if (j%3 == 0) {
				System.out.println(j);
				break;//break�����þ�����������ѭ����������do...whileһ��ʹ�������ƴ���
			}
			j++;
		} while (j <= 30);
		
		/*
		do {
			do {
				break;//��������ѭ��������do...while����Ӱ��
			}while();
			break;//�����break����������do...while��
		} while();
		*/
		
		System.out.println("--------------");
		
		//����2����뾶Ϊ1��20��Բ�������100ʱ����Ӧ���ٽ�뾶���ٽ����(���=PI*�뾶*�뾶)��
		int r = 1;
		double PI = 3.14, s = 0.0;// ����s��ʾ���
		do {
			s = PI * r * r;
			if (s > 100) {
				System.out.println("�ٽ�뾶Ϊ"+r+"\n"+"�ٽ����Ϊ"+s);// \n��ʾ�س�����
				break;//break�����þ�����������ѭ����������do...whileһ��ʹ�������ƴ���
			}
			r++;
		} while (r <= 20);
	}
}