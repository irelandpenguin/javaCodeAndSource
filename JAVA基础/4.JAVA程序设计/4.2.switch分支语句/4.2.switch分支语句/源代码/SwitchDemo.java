/*
	switch����ʽ��
		switch(���ʽ) {
			case ֵ1:
				�����1;
				break;
			case ֵ2:
				�����2;
				break;
			...
			default:
				�����n+1;
				break;
		}
		
	���ͣ�
		���ʽ:����ط���ȡֵ�����޶���,��switch����������ǣ�
			byte,short,int,char
			JDK5�Ժ������ö��
			JDK7�Ժ�������ַ���
		case:���������Ҫ�ͱ��ʽ���бȽϵ�ֵ
		�����:Ҫִ�еĴ���
		break:��ʾ�жϣ���������˼�����Կ���switch���Ľ�����
		default:�����е�ֵ���ͱ��ʽ��ƥ��ʱ����ִ��default���Ƶ���䡣
		
	������
		����¼��һ��������������������������Ӧ������?
*/
import java.util.Scanner;
class SwitchDemo {
	public static void main(String[] args) {
		System.out.println("����һ��(1~7)֮�������");
		Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		switch (week) {//�������������int
			case 1:
				System.out.println("����һ");
				break;//�жϣ�����switch���
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("������������");
				//break;//�����break���Բ�д
		}
	}
}


/*
	�����⣺
		byte������Ϊswitch�ı��ʽ��?  (����)
		long������Ϊswitch�ı��ʽ��? (������) 
		String������Ϊswitch�ı��ʽ��? (��JDK7�����¿���)
*/

