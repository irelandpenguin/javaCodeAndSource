package com.yidahulian_02;

/*
 * �򵥹���ģʽ��
 * 	��Ҫʲô�����ɹ���ȥ��������Ȼ����ø��Եķ�����
 * 
 * �ô�����������ʱ�����ٹ�ע�߱����󴴽��ˡ�ֱ���ɹ�����ʵ�֡��ӿ�ͳһ����
 * �׶ˣ�ÿ���봴�������ڵĶ���ʱ����Ҫ���Ĺ����ࡣΥ���˹�����չ��ԭ��
 * ������չԭ�򣺲��Ķ���ǰ�������£�ʵ�ֹ�����ӡ�
 */
public class AnimalTest {

	public static void main(String[] args) {
		// ����һֻ��
		Animal dog = AnimalFactory.createAnimal("dog");
		dog.eat();

		// ����һֻè
		Animal cat = AnimalFactory.createAnimal("cat");
		cat.eat();

		// ����һֻ��
		Animal pig = AnimalFactory.createAnimal("pig");
		if (pig == null) {
			System.out.println("�Բ���Ŀǰ�����ṩ���ද��");
		}
	}

}
