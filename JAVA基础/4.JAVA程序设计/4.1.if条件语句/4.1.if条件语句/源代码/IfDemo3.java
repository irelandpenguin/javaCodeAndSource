/*
	ʹ�ü���¼��ķ�ʽ��ȡ��ֵ��Ȼ������if���������жϡ�
*/
import java.util.Scanner;
class IfDemo3 {
	public static void main(String[] args) {
		/*����5��һ��Ӣ�￼�ԣ��ܷ�100�֣�60�����²�����60~70�ּ���70~90�����ã�90~100�����졣
			��������������ж�������һ�֣�
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("������ķ���");
		int score = sc.nextInt();
		if (score < 60) {
			System.out.println("�ɼ�Ϊ"+score+"������");
		} else if (score >= 60 && score < 70) {
			System.out.println("�ɼ�Ϊ"+score+"����");
		} else if (score >= 70 && score < 90) {
			System.out.println("�ɼ�Ϊ"+score+"����");
		} else {
			System.out.println("�ɼ�Ϊ"+score+"����");
		}
	}
	
}

		
		

