/*
	switchע������2
		���case���Ҳ���Բ���ʹ�á�
	������һ��12���£�3�£�4�£�5��Ϊ����; 6�£�7�£�8��Ϊ�ļ�; 9�£�10�£�11��Ϊ�＾; 12�£�1�£�2��Ϊ������
	��ʹ��switch����������
*/

import java.util.Scanner;
class SwitchDemo3 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//���Ƽ���¼������
		System.out.println("������һ���·�(1-12):");
		int month = sc.nextInt();
		
		/*
		//switch�ж����
		switch(month) {
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("����");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("����");
				break;
			case 5:
				System.out.println("����");
				break;
			case 6:
				System.out.println("�ļ�");
				break;
			case 7:
				System.out.println("�ļ�");
				break;
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
				System.out.println("�＾");
				break;
			case 10:
				System.out.println("�＾");
				break;
			case 11:
				System.out.println("�＾");
				break;
			case 12:
				System.out.println("����");
				break;
			default:
				System.out.println("�����·�����!");
		}
		*/
		
		
		//switch�ж����
		switch(month) {
			case 1:
			case 2:
			case 12:
				System.out.println("����");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			default:
				System.out.println("�����·�����!");
		}
	}
}