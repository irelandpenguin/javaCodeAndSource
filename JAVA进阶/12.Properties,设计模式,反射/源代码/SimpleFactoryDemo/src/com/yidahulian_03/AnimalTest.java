package com.yidahulian_03;

/*
 * ��������ģʽ��
 * 	��Ҫʲô������ר�Ź���ȥ��������Ȼ����ø��Եķ�����
 * 
 * �ô�����������ʱ�������޸�ԭ�������ˡ�ֱ����������ר�Ź�����ʵ�֡����Ϲ�����չԭ��
 * �׶ˣ�ÿ���봴�������ڵĶ���ʱ����Ҫ����ר�Ź����༰�����ࡣʵ���ļ��ࡣ
 */
public class AnimalTest {

	public static void main(String[] args) {
		// ����һֻ��
		Animal dog = new DogFactory().createAnimal();
		dog.eat();

		// ����һֻè
		Animal cat = new CatFactory().createAnimal();
		cat.eat();

		// ����һֻ��
		Animal pig = new PigFactory().createAnimal();
		pig.eat();
	}

}
