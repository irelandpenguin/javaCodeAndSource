package com.yida_01.exception;
/**
 * throw:
 * 	�������������쳣������Ҳ���԰Ѹ��쳣�׳������׳������쳣����
 * 
 * �ܽ᣺
 * �������throwһ���쳣����ʲôʱ���ڷ�����throws ��
 * 	1������throw���쳣������RuntimeException���͵ģ���������Բ�дthrows��(��Ȼ������ˣ�Ҳ�ԡ�)
 * 	2������throw���쳣�����Ƿ�RuntimeExcetipn���͵ģ����������дthrows����Ϊ���Ǳ������쳣�����봦��
 * 
 * throws��throw������(������)
 *	throws
 *		���ڷ������ź��棬�׵����쳣�����������׶�����ö��ŷָ�;
 *		�׳����쳣�ɵ�����������;
 *		throws�׵��ǿ��ܷ������쳣������һ����ᷢ����
 *	throw
 *		���ڷ������ڣ��׵����쳣������ֻ����һ��;
 *		�׳����쳣�ɷ������ڵ���䴦��;
 *		throw�׵��쳣��һ������ʵ���ڵġ�
 */
public class G_Exception {

	public static void main(String[] args) {
		test();//�������쳣�������߲�������

		//�������쳣�������߱��봦��
		try {
			test2();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("OVER��~~");
	}
	
	public static void test() {
		int a = 8, b = 0;
		if (b == 0) {
			throw new ArithmeticException();// �׳�һ�������ڼ��쳣(API�鿴)�������߿ɲ�����
		} else {
			System.out.println(a / b);
		}
	}

	public static void test2() throws Exception {
		int a = 8, b = 0;
		if (b == 0) {
			throw new Exception();// �׳�һ�������ڼ��쳣�������߱��봦��
		} else {
			System.out.println(a / b);
		}
	}
	
	/*public static void test3() throws ArithmeticException,ArrayIndexOutOfBoundsException,StringIndexOutOfBoundsException {
		
	}*/

}
