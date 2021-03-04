/*
	接口练习2
		爸爸的儿,女即会唱歌又会跳舞。
		
		爸爸
			儿子
			女儿
		接口 
			唱歌
			跳舞
*/
interface SongAndDance {
	public abstract void song();
	public abstract void dance();
}

abstract class Father {
	private String name;
	private int age;
	
	public Father(){}
	public Father(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public abstract void eat();
	public abstract void sleep();
}

//实现接口的类命名规范：类名+Impl 
class SonImpl extends Father implements SongAndDance {
	public SonImpl(){}
	public SonImpl(String name, int age) {
		super(name, age);//调用父类的构造方法，初始化父类的成员变量。因为name和age是private修饰的，子类不能继承
	}
	
	public void eat() {
		System.out.println(getName()+"喜欢吃牛肉");
	}
	
	public void sleep() {
		System.out.println(getName()+"喜欢睁眼睡觉");
	}
	
	public void song() {
		System.out.println(getName()+"喜欢唱摇滚歌");
	}
	
	public void dance() {
		System.out.println(getName()+"喜欢跳拉丁舞");
	}
	
	public void show() {
		System.out.println(getName()+"---"+getAge());
		eat();
		sleep();
		song();
		dance();
	}
}


//实现接口的类命名规范：类名+Impl 
class DaughterImpl extends Father implements SongAndDance {
	public DaughterImpl(){}
	public DaughterImpl(String name, int age) {
		super(name, age);//调用父类的构造方法，初始化父类的成员变量。因为name和age是private修饰的，子类不能继承
	}
	
	public void eat() {
		System.out.println(getName()+"喜欢吃青菜");
	}
	
	public void sleep() {
		System.out.println(getName()+"喜欢侧着睡觉");
	}
	
	public void song() {
		System.out.println(getName()+"喜欢唱民族歌");
	}
	
	public void dance() {
		System.out.println(getName()+"喜欢跳广场舞");
	}
	
	public void show() {
		System.out.println(getName()+"---"+getAge());
		eat();
		sleep();
		song();
		dance();
	}
}

class InterfaceDemo2 {
	public static void main(String[] args) {
		SonImpl sl = new SonImpl();
		sl.setName("张一鸣");
		sl.setAge(21);
		System.out.println(sl.getName()+"---"+sl.getAge());
		sl.eat();
		sl.sleep();
		sl.song();
		sl.dance();
		
		
		System.out.println("---------");
		
		SonImpl sm = new SonImpl("张小亮", 24);
		sm.show();
		
		System.out.println("---------");
		
		
		DaughterImpl dl = new DaughterImpl();
		dl.setName("张小美");
		dl.setAge(16);
		System.out.println(dl.getName()+"---"+dl.getAge());
		dl.eat();
		dl.sleep();
		dl.song();
		dl.dance();
		
		System.out.println("---------");
		
		DaughterImpl dm = new DaughterImpl("张小含", 18);
		dm.show();
	}
}