package com.yida_03;
/**
 * 一个完整继承类的创建与使用
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Employee em = new Employee();//无参构造
		em.setName("成龙");
		em.setAge(60);
		em.setNumber(2000);
		System.out.println(em.getName()+"---"+em.getAge()+"---"+em.getNumber());

		Employee em2 = new Employee("吴京",35,3000);//带参构造
		em2.show();
	}

}
