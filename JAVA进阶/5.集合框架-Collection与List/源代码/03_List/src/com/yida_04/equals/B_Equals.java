/*
 * ����ȥ���������ظ���ѧ������(����ĳ�Ա����ֵ����ͬ����Ϊ�ظ�)
 */
package com.yida_04.equals;

import java.util.ArrayList;
import java.util.Iterator;

public class B_Equals {

	public static void main(String[] args) {
		// �������϶���
		ArrayList lt = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("����", 29);
		Student s2 = new Student("����", 29);
		Student s3 = new Student("����", 27);
		Student s4 = new Student("����", 31);
		Student s5 = new Student("����", 27);

		// ���Ԫ��
		lt.add(s1);
		lt.add(s2);
		lt.add(s3);
		lt.add(s4);
		lt.add(s5);

		//show(lt);
		
		// ��ʽһ�������ظ���ѧ������
		//filter(lt);

		// ��ʽ�������˼����ظ��ַ���
		filter2(lt);
	}

	// ��ʽһ�������ظ���ѧ������
	public static void filter(ArrayList lt) {
		// ˼·������
		// A:�������϶���
		// B:��Ӷ���ַ���Ԫ��(����������ͬ��)
		// C:�����¼���
		// D:�����ɼ���,��ȡ�õ�ÿһ��Ԫ��
		// E:�����Ԫ�ص��¼���ȥ�ң�����û�С� ������ӣ� û�У�����ӡ�
		// F:�����¼���
		ArrayList newLt = new ArrayList();
		Iterator it = lt.iterator();
		while (it.hasNext()) {
			Student stu = (Student) it.next();
			if (newLt.contains(stu) == false) {
				newLt.add(stu);
			}
		}
		show(newLt);

		// ���ǰ��պ��ַ���һ���Ĳ��������ֳ������ˡ�
		// Ϊʲô��?
		// ͨ���򵥵ķ���������֪��������������ж��ϡ�
		// ������жϹ����Ǽ����Լ��ṩ�ģ��������������������֪����������жϵģ���Ӧ��ȥ��Դ�롣
		// contains()�����ĵײ���������equals()������
		// �����ǵ�ѧ������û��equals()���������ʱ��Ĭ��ʹ�õ���������Object��equals()����
		// Object��equals()Ĭ�ϱȽϵ��ǵ�ֵַ�����ԣ����ǽ�ȥ�ˡ���Ϊnew�Ķ�������ֵַ����ͬ��
		// ���������Լ������󣬱Ƚϳ�Ա������ֵ����дequals()���ɡ�
		// Ҳ�����Զ����ɼ��ɡ�
	}

	// ��ʽ�������˼����ظ��ַ���
	public static void filter2(ArrayList lt) {
		// ˼·������
		// ��ѡ������˼�����룬���ǾͿ���ͨ������˼���������Ŀ
		// ��0���������κͺ���ıȽϣ��оͰѺ�ĸɵ�
		// ͬ����1����...
		for (int i = 0; i < lt.size() - 1; i++) {
			for (int j = i + 1; j < lt.size(); j++) {
				Student stu1 = (Student) lt.get(i);
				Student stu2 = (Student) lt.get(j);
				//if (stu1.equals(stu2)) {
				if (stu1.getName().equals(stu2.getName()) && stu1.getAge() == stu2.getAge()) {
					lt.remove(j);
					j--;// ��Ҫ��ǰ��һλ����ֹ©��֮��   ��ArrayListԭ���ĸ����������޸ģ�index��ı�ģ�����j���index��Ҫ�Լ���
				}
			}
		}

		show(lt);
	}

	// ��ʾѧ����Ϣ
	public static void show(ArrayList lt) {
		Iterator it = lt.iterator();
		while (it.hasNext()) {
			Student stu = (Student) it.next();
			System.out.println(stu);
		}
	}

}
