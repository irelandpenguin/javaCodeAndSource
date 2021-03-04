package com.yida_03.Field;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;



/**
 * ͨ�������ȡ��Ա������ʹ�á�
 */
public class A_Reflect {

	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class<?> c = Class.forName("com.yida_03.Field.Student");

		// ��ȡ���еĳ�Ա����
		//Field[] fields = c.getFields();//��ȡ������Ա����
		//Field[] fields = c.getDeclaredFields();//��ȡ���г�Ա����
		/*for (Field field : fields) {
			System.out.println(field);
		}*/

		// ͨ���޲ι��췽�����󴴽���ʵ��
		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();

		// ��ȡaddress�����丳ֵ
		Field addressField = c.getField("address");
		//public void set(Object obj,Object value)//����ʵ�������Field�ֶε�ֵ��
		addressField.set(obj, "����");
		System.out.println(obj);
		System.out.println(addressField.get(obj));

		// ��ȡname�����丳ֵ
		//Field nameField = c.getField("name");// ���� NoSuchFieldException
		//nameField.set(obj, "����");
		//ԭ����һ��ʼ���ǻ�ȡ���ǹ����ĳ�Ա��������name��˽�еġ�������ľͿ����ˡ�
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);//���ÿɷ���
		nameField.set(obj, "����");
		System.out.println(obj);
		System.out.println(nameField.get(obj));

		// ��ȡage�����丳ֵ
		//Field ageField = c.getField("age");// ���� NoSuchFieldException
		//ageField.set(obj, 25);
		//ԭ����һ��ʼ���ǻ�ȡ���ǹ����ĳ�Ա��������age��Ĭ�ϵġ�������ľͿ����ˡ�
		Field ageField = c.getDeclaredField("age");
		ageField.setAccessible(true);//���ÿɷ���
		ageField.set(obj, 25);
		System.out.println(obj);
		System.out.println(ageField.get(obj));
	}

}
