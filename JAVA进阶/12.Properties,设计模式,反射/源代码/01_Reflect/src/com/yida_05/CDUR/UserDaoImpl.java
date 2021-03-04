package com.yida_05.CDUR;

public class UserDaoImpl implements UserDao {

	@Override
	public void create() {
		System.out.println("增加");
	}

	@Override
	public void delete() {
		System.out.println("删除");
	}

	@Override
	public void update() {
		System.out.println("修改");
	}

	@Override
	public void read() {
		System.out.println("查询");
	}

}
