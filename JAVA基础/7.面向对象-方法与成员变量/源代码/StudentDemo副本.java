/*
	private:
		是一个权限修饰符,表示私有的。
		可以修饰成员变量和成员方法;
		被其修饰的成员变量和成员方法只能在本类中被访问。
	好处：保证了数据的隐私性，安全性。
*/
class Student {
	private String name = "宜达互联";//private修饰的是私有的，只能当前类使用
	private int age = 20;
	private char sex = '女';//给个默认值，也可以不给
	
	//获取姓名
	public String getName() {
		return name;
	}
	
	//设置姓名
	public void setName(String ne) {
		name = ne;
	}
	
	//获取年龄
	public int getAge() {
		return age;
	}
	
	//设置年龄
	public void setAge(int ae) {
		age =ae;
	}
	
	//获取性别
	public char getSex() {
		return sex;
	}
	
	//设置性别
	public void setSex(char sx) {
		sex = sx;
	}
	
	
	//设置学生信息
	public void setInfomation(String ne, int ae, char sx) {
		name = ne;
		age = ae;
		sex = sx;
	}
	
	//打印学生信息
	private void showInformation() {//这个是私有方法，只能当前类调用
		System.out.println("宜达互联提醒：\n"+"姓名:"+name+",年龄:"+age+",性别:"+sex);
	}
	
	
	public void show() {
		//showInformation();
		System.out.println("姓名:"+name+",年龄:"+age+",性别:"+sex);
	}
}

class StudentDemo {
	public static void main(String[] args) {
		Student stu = new Student();
		
		
		//以下赋值是错误的，因为3个成员变量都被private修饰，都 是私有的，
		//只能在Student类中访问，这样不能访问
		//stu.name = "张三";
		//stu.age = 25;
		//stu.sex = '男';
		
		//stu.show();
		//System.out.println("姓名:"+stu.getName()+",年龄:"+stu.getAge()+",性别:"+stu.getSex());
		
		//以下赋值都是正确的，因为使用了public修改的方法进行访问
		stu.setName("张三");
		stu.setAge(25);
		stu.setSex('男');
		System.out.println("姓名:"+stu.getName()+",年龄:"+stu.getAge()+",性别:"+stu.getSex());//张三 25 男
		
		
		//再创建一个学生对象
		Student stu2 = new Student();
		stu2.setInfomation("张小红", 22, '女');
		//显示学生信息，不能用showInformation，因为这个方法是private修饰的，对个外界不公开
		//stu2.showInformation();
		
		//下面的方法就可以，因为是public修饰的，对外界是公开的
		stu2.show();
		
	}
}