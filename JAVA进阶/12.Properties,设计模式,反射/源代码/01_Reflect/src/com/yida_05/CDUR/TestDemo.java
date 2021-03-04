package com.yida_05.CDUR;
/**
 * 写个功能，实现用户的增(Create)，删(Delete)，改(Update)，查(Read)功能
 * 
 * @author 宜达互联-钱老师
 *
 */
public class TestDemo {

	public static void main(String[] args) {
		//实现用户信息的增，删，改，查
		UserDao ud = new UserDaoImpl();//多态的体现
		ud.create();
		ud.delete();
		ud.update();
		ud.read();
		
		// 现在，我想在操作增，删，改，查之前，判断用户有没有权限去操作。怎么办呢？
		// 我们可以使用 --- 静态代理。
	}
}
