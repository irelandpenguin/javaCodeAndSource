/*
	��JDK7���Ժ�switch��ı��ʽҲ�����ַ���String, �������Ǿٸ����ӡ�
	
	�����ַ���������2�д���
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();��ʾ�����ַ���;
	
	\ ��ʾת���ַ�������ת�����������ַ������磺\"  \'
*/
import java.util.Scanner;
class SwitchDemo5 {
	public static void main(String[] args) {
		int x = 3, y = 4, z;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ַ���(\"+\", \"-\", \"*\", \"/\")");//����� / ����ת���ַ����������/����ķ���
		//System.out.println("�����ַ�(\'+\', \'-\', \'*\', \'/\')");
		String s = sc.nextLine();// nextLine��������ȡ�����ַ���
		
		//String s = "+";
		
		switch (s) {
			case "+":
				z = x+y;
				System.out.println("x+y="+z);
				break;
			case "-":
				z = x-y;
				System.out.println("x-y="+z);
				break;
			case "*":
				z = x*y;
				System.out.println("x*y="+z);
				break;
			case "/":
				z = x/y;
				System.out.println("x/y="+z);
				break;
			default:
				System.out.println("���ŷǷ������ܼ���");
		}
	}
}