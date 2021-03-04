package com.yida_03.equals;

public class Student {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	


	/*
	//手工重写equals()方法
	@Override
	public boolean equals(Object obj) {
		//这里要改进，根据这里比较的成员变量来决定返回true还是false
		//这里其实要比较的就是name和age
		//但是，name是String类型的，而String是引用类型的，所以，在这里不能直接用==比较，应该用equals()比较
		//String的equals()方法是重写Object类的，比较的是字符串的内容是否相同。这点大家先记住！
		Student s = (Student)obj;
		return (s.age == this.age && s.name.equals(this.name));
	}*/
}
