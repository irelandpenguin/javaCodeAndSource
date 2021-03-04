package com.yidahulian_05;

public class Teacher {
	// ���췽��˽�л�����ֹ��紴������
	private Teacher() {
	}

	// ����һ����Ա���󲢸�ֵΪnull��private��֤��粻��ֱ�ӵ��ã�static��֤Ψһ
	private static Teacher tea = null;

	// ����һ����̬ͬ����������ֹ���߳�ͬʱ����tea����
	public synchronized static Teacher getTeacher() {
		if (tea == null) {
			tea = new Teacher();
		}
		return tea;
	}
}
