/**
 * ��ȡ������ָ����Χ���������Ҫ�����ظ���
 * 
 * ������ʵ�֣���������ĳ����ǹ̶��ģ����Ȳ���ȷ����
 * ��������ʹ�ü���ʵ�֡�
 * 
 * ���磺��ȡ10��0��10֮�����������Ҳ����ظ���
 * ������
 * 		A:����һ���洢������ļ��ϡ�
 * 		B:ʹ��ѭ�����ϵĲ���������Ķ���
 * 		C:����һ��ͳ�Ʊ���count����0��ʼ��
 * 		D:�ж�ͳ�Ʊ����Ƿ�С��10
 * 			��:�Ȳ���һ����������жϸ�������ڼ������Ƿ���ڡ�
 * 					���������:����ӣ�count++��
 * 					�������:������
 * 			��break����ѭ��
 * 		E:��������
 */
package com.yida_02.Test;

import java.util.ArrayList;
import java.util.Random;

public class A_RandomNum {

	public static void main(String[] args) {
		String randomNum = getRandom(4,101,201);
		System.out.println(randomNum);
	}

	/**
	 * ��ȡ������ָ����Χ���������Ҫ�����ظ���
	 * @param number ���ٸ������
	 * @param begin ָ����Χ����ʼֵ
	 * @param end ָ����Χ������ֵ
	 */
	public static String getRandom(int number, int begin, int end) {
		ArrayList<Integer> lit = new ArrayList<Integer>();
		Random r = new Random();
		int count = 0;// ͳ�ƴ���
		while (true) {
			//begin: 0  end: 10
			//r.nextInt(10) : 0~10
			
			//begin: 5   end: 15
			//r.nextInt(15) : 0~15
			//�Ľ���r.nextInt(15-5) : 0~10
			//�����Ľ���r.nextInt(15-5) + 5 : 5~15
			//���ոĽ���r.nextInt(end-begin)+begin
			
			//begin: 25   end:80
			//r.nextInt(80-25)+25 : 0~55 + 25  =  25~80
			
			
			int randomNum = r.nextInt(end-begin)+begin;
			Integer num = new Integer(randomNum);
			if (lit.contains(num) == false) {
				lit.add(num);
				count++;
			}

			// ���������ˣ�����ѭ��
			if (count == number) {
				break;
			}
		}

		return lit.toString();
	}

}
