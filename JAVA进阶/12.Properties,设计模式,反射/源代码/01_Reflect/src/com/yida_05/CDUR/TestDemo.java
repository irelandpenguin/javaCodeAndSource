package com.yida_05.CDUR;
/**
 * д�����ܣ�ʵ���û�����(Create)��ɾ(Delete)����(Update)����(Read)����
 * 
 * @author �˴ﻥ��-Ǯ��ʦ
 *
 */
public class TestDemo {

	public static void main(String[] args) {
		//ʵ���û���Ϣ������ɾ���ģ���
		UserDao ud = new UserDaoImpl();//��̬������
		ud.create();
		ud.delete();
		ud.update();
		ud.read();
		
		// ���ڣ������ڲ�������ɾ���ģ���֮ǰ���ж��û���û��Ȩ��ȥ��������ô���أ�
		// ���ǿ���ʹ�� --- ��̬����
	}
}
