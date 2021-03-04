/*
	面试题：看程序写结果
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
				b++;//这里b变成4，因为没有break，所以继续向下执行
			case 3:
				b++;//这里b变成5，因为没有break，所以继续向下执行
			case 4:
				b++;//这里b变成6，结束了
		}
		System.out.println("b="+b);//b=6
		
	}
}