/*
	�����⣺������д���
*/
class SwitchDemo6Test
 {
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		switch(x){
			default:
				y++;
				break;
			case 3:
				y++;
			case 4:
				y++;
		}
		System.out.println("y="+y);//y=4
		
		System.out.println("---------------");
		
		
		int a = 2;
		int b = 3;
		switch(a){
			default:
				b++;//����b���4����Ϊû��break�����Լ�������ִ��
			case 3:
				b++;//����b���5����Ϊû��break�����Լ�������ִ��
			case 4:
				b++;//����b���6��������
		}
		System.out.println("b="+b);//b=6
		
	}
}