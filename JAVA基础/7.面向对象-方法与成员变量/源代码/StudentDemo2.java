/*
	类的get方法与set方法
*/
class MidStudent {
	String name;//姓名，默认值为null
	int age;//年龄，默认值为0
	char sex;//性别，默认值为'\u0000'
	String address;//地址，默认值为null
	
	public void show() {//该方法的功能：打印学生信息
		System.out.println("姓名:"+name+", 年龄:"+age+", 性别:"+sex+", 地址:"+address);
	}
	
	//以下方法都是获取学生单个信息的
	public String getName() {//该方法的功能：获取学生姓名
		return name;
	}
	
	public int getAge() {//该方法的功能：获取学生年龄
		return age;
	}
	
	public char getSex() {//该方法的功能：获取学生性别
		return sex;
	}
	
	public String getAddress() {//该方法的功能：获取学生地址
		return address;
	}
	
	
	//以下方法都是设置学生单个信息的
	public void setName(String ne) {
		name = ne;
	}
	
	public void setAge(int ae) {
		age = ae;
	}
	
	public void setSex(char sx) {
		sex = sx;
	}
	
	public void setAddress(String as) {
		address = as;
	}
	
	
	//该方法的功能：设置学生信息
	public void setInformation(String ne, int ae, char sx, String as) {
		name = ne;
		age = ae;
		sex = sx;
		address = as;
	}
	
}

class StudentDemo2 {
	public static void main(String[] args) {
		MidStudent stu = new MidStudent();
		
		//设置学生信息
		stu.name = "宜达互联";
		stu.age = 5;
		stu.sex = 'M';
		stu.address = "福田车公庙，皇冠科技园2栋3楼";
		
		//显示学生信息
		String name = stu.getName();
		int age = stu.getAge();
		char sex = stu.getSex();
		String addr = stu.getAddress();
		System.out.println("姓名:"+name+", 年龄:"+age+", 性别:"+sex+", 地址:"+addr);
		
		System.out.println("-----------");
		
		
		//设置学生信息
		stu.setName("王小萌");
		stu.setAge(26);
		stu.setSex('F');
		stu.setAddress("深圳南山白石洲");
		stu.show();//显示学生信息
		
		System.out.println("-----------");
		
		//设置学生信息
		stu.setInformation("李四",35,'M',"深圳龙岗中心城");
		stu.show();//显示学生信息
		
	}
}