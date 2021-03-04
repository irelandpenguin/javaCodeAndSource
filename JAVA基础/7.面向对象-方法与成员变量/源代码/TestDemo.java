/*
	变量什么时候定义为成员变量：
		如果这个变量是用来描述这个类的信息的，那么，该变量就应该定义为成员变量。
		
	变量到底定义在哪里好呢?
		变量的范围是越小越好。因为能及时的被回收。
*/
class Teacher {
	//因为老师有姓名和年龄，这是必须的。用来描述老师的个人信息，所以，name和age定义为成员变量最合适。
	String name;
	int age;
	
	public Teacher() {
		
	}
	
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("姓名:"+name+",年龄:"+age);
	}
	
	public void eat(String foodName, String drinkName) {//老师中午吃啥饭
		String info = foodName+drinkName;//老师吃啥饭，每天都可能不一样，不能用来描述老师信息的。所以，这里的变量info定义为局部变量更合适
		System.out.println("王老师中午吃饭信息："+info);
	}
	
	public int sum(int a, int b) {//学生问老师一个求和题目
		int s = a+b;//因为题目各种各样，不能用来描述老师信息，所以，这里的变量s定义为局部变量更合适
		return s;
	}
}

class TestDemo {
	public static void main(String[] args) {
		Teacher tea = new Teacher("王老师", 45);
		tea.show();
		
		tea.eat("五谷鱼粉","+一杯可乐");
		int result = tea.sum(100, 50);
		System.out.println(result);
	}
}