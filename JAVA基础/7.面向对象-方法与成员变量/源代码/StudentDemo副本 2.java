/*
	成员方法与构造方法的区别
		构造方法
			方法名与类名相同，没有返回类型也没有返回值;
		
		成员方法
			根据返回值：
				void类型
				非void类型
			形式参数：
				空参方法
				非空参方法
*/

class Student {
	private String name;
	
	//以下是构造方法
	public Student() {//无参构造方法
		
	}
	
	public Student(String name) {//带1个参数的构造方法
		this.name = name;
	}
	
	//以下是成员方法
	public String getName() {//无参数，有返回值的方法
		return name;
	}
	
	public void setName(String name) {//有参数，无返回值的方法
		this.name = name;
	}
	
	public void hello() {//无参数，无返回值的方法
		System.out.println("hello");
	}
	
	public String getInformation(String name) {//有参数，有返回值的方法
		this.name = name;
		return name;
	}
}

class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();//这里会调用无参构造方法
		s.setName("张三");//这里会调用有参数，无返回值的方法
		System.out.println(s.getName());//这里会调用无参数，有返回值的方法
		s.hello();//这里会调用无参数，无返回值的方法
		String info = s.getInformation("李四");//这里会调用有参数，有返回值的方法
		System.out.println(info);
		
		
		Student s2 = new Student("张小兰");//这里调用有参数的构造方法
		System.out.println(s2.getName());//这里会调用无参数，有返回值的方法
	}
}