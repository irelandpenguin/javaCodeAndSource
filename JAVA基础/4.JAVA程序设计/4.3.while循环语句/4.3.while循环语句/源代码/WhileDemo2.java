/*
	while��breakһ��ʹ��
*/
class WhileDemo2 {
	public static void main(String[] args) {
		//����1��ֻ���1��30�ܱ�3�����ĵ�һ����
		int j = 1;
		while (j <= 30) {
			if (j%3 == 0) {
				System.out.println(j);
				break;//break�����þ�����������ѭ����������whileһ��ʹ�������ƴ���
			}
			j++;
		}
		
		/*(
		while() {
			//XXXXX
			while() {
				//MMMMM
				break;//ֻ��������ѭ�������ѭ�����ܸ���
			}
			
			break;
		}
		*/
		
		
		System.out.println("--------------");
		
		//����2����뾶Ϊ1��20��Բ�������100ʱ����Ӧ���ٽ�뾶���ٽ������
		//Բ����ļ��㹫ʽ��(��� = PI * �뾶 * �뾶)
		int r = 1;
		double PI = 3.14, s = 0.0;// ����s��ʾ���
		while (r <= 20) {
			s = PI * r * r;//�������
			if (s > 100) {
				System.out.println("�ٽ�뾶Ϊ"+r+"\n"+"�ٽ����Ϊ"+s);// \n��ʾ�س�����
				break;//break�����þ�����������ѭ����������whileһ��ʹ�������ƴ���
			}
			r++;
		}
	}
}