package com.yida;

import java.util.Scanner;

public class StringBufferTest {

	public static void main(String[] args) {
		test1();
		//test2();
		//test3();
		//test4();
		//test5();
		//test6();
		//test7();
		//test8();
		//test9();
		//test10();
		//test11();
		//test12();
		//test13();
		//test14();
	}
	
	//1.  ���ַ�������"helloboy"���м��ܣ�Ҫ��ʹ�ÿɱ��ַ�����������ַ������ܺ��������"IFMMPCPZ"����ӡ��������ġ�
	//(˼·�������ַ���ASCII���֪��Сд��ĸ���д��ĸ��ֵ��Ϊ32���� 'h'-32�����ַ�'H')
	public static void test1() {
		StringBuffer sb = new StringBuffer("helloboy");
		StringBuffer ss = new StringBuffer();
		for(int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			c = (char)(c-32+1);//ǿ������ת��
			ss.append(c);
		}
		System.out.println(ss);
	}

	//2. ����һ���ɱ��ַ���"today, we will study another string, this string is import for us, now begin the string!"��
	//�ڶ��ź�������ַ���"msn"����ӡ���������Ӣ�ġ�
	public static void test2() {
		StringBuffer sb = new StringBuffer("today, we will study another string, this string is import for us, now begin the string!");
		int index = sb.indexOf(",");
		while(index != -1) {
			sb.insert(index+1, "msn");//�ڶ���֮�󣬲���"msn"
			index = sb.indexOf(",", index+1);//�Ӷ���֮�󣬼���������
		}
		System.out.println(sb);
	}
	
	//1.  ��һ���ɱ��ַ���"i love java, beging to learning java needs a persisting hert!"��
	//ȥ�����Ϊ"ing"�ĵ��ʺ�ꡣ���ӡ�����д���ԭ�ɱ��ַ�����
	public static void test3() {
		StringBuffer sb = new StringBuffer("i love java, beging to learning java needs a persisting hert!");
		int index = sb.indexOf("ing");
		while(index != -1) {
			sb.delete(index, index+3);//����3��ʾ"ing"�ĳ���
			index = sb.indexOf("ing");//��������һ��"ing"
		}
		System.out.println(sb);
	}
	
	//1. ��һ���ɱ��ַ���"today, we will study another string, this string is import for us, now begin the string!"��
	//�Ѻ���"string"�ַ����滻��"STRING"����ӡ����滻���ԭ�ַ�����
	public static void test4() {
		StringBuffer sb = new StringBuffer("today, we will study another string, this string is import for us, now begin the string!");
		int index = sb.indexOf("string");
		while (index != - 1) {
			sb.replace(index, index+6, "STRING");//����6��ʾ"string"�ĳ���
			index = sb.indexOf("string");
		}
		System.out.println(sb);
	}
	
	//1. �ѿɱ��ַ���"thank you very much, my friends!"��ȡ"very much, my"����ȡ�ɹ�����ַ���"dear students!"ƴ����󲢴�ӡ�����
	public static void test5() {
		StringBuffer sb = new StringBuffer("thank you very much, my friends!");
		String s = "very much, my";
		StringBuffer ss = new StringBuffer();
		int index = sb.indexOf(s);
		ss.append(sb.substring(index, index+s.length()));
		ss.append("dear students!");
		System.out.println(ss);
	}
	
	//2.  ��һ���ַ�����{"hello","world","foodwater","goodluck","hello","rootboy","photo","toomany","well","hold"};
	//�ҳ������а���"oo"������Ԫ�أ�Ȼ���ȡ��"oo"������ַ�������ӡ�����
	public static void test6() {
		String[] arr = {"hello","world","foodwater","goodluck","hello","rootboy","photo","toomany","well","hold"};
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			int index = s.indexOf("oo");//���Ұ���"oo"������Ԫ��
			if (index != -1) {//�ҵ���
				sb.append(s.substring(index+2)+" ");//����2��ʾ"oo"�ĳ��ȣ�ʹ�ÿո��ÿ����ȡ�ĵ��ʷֿ�
			}
		}
		System.out.println(sb);
	}
	
	//1. ��һ�ɱ��ַ���"welcom to China, My Friends!"�������ַ���"China"�������ڴ�ӡ�����ڵ�λ��������
	public static void test7() {
		StringBuffer sb = new StringBuffer("welcom to China, My Friends!");
		int index = sb.indexOf("China");
		while(index != -1) {//�ҵ���
			System.out.println("China������λ��Ϊ��"+index);
			//���ܲ�ֻһ��"China"������Ҫ��������һ����ֱ���Ҳ���Ϊֹ���˳�whileѭ��
			index = sb.indexOf("China", index+5);//����5��ʾ"China"�ĳ���
		}
	}
	
	//2. ���ҿɱ��ַ���"today, we will study another string, this string is import for us, now begin the string!"
	//"�а�����"string", ������ǵ�����λ�á�
	public static void test8() {
		StringBuffer sb = new StringBuffer("today, we will study another string, this string is import for us, now begin the string!");
		int index = sb.indexOf("string");
		while(index != -1) {//�ҵ���
			System.out.println("string������λ��Ϊ��"+index);
			//���ܲ�ֻһ��"string"������Ҫ��������һ����ֱ���Ҳ���Ϊֹ���˳�whileѭ��
			index = sb.indexOf("string", index+6);//����6��ʾ"string"�ĳ���
		}
	} 
	
	//1. ����¼���ַ������жϸ��ַ����Ƿ��ǶԳ��ַ�����
    //����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ�����
	public static void test9() {
		System.out.print("������һ���ַ�����");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		String ss = sb.reverse().toString();//�õ���ת����ַ���
		if (ss.equals(s)) {//�ж��Ƿ��ǶԳ��ַ���
			System.out.println(s+"�ǶԳ��ַ���");
		} else {
			System.out.println(s+"���ǶԳ��ַ���");
		}
		sc.close();
	}
	
	//1. ��һ�������� {29, 36, 157, 112, 14, 21, 6, 81, 10, 53}������ð�����������дӴ�С����
	public static void test10() {
		int[] arr = {29, 36, 157, 112, 14, 21, 6, 81, 10, 53};
		for(int i = 1; i < arr.length; i++) {//����ѭ������
			for(int j = 0; j < arr.length-i; j++) {//�����Ƚϣ�����³�������ϸ�
				if (arr[j] < arr[j+1]) {//�Ӵ�С��
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		//��ӡ�������Ԫ��
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//2. ��һ�ַ�����{'X', 'P', 'T', 'B', 'O', 'C', 'Q', 'A', 'U', 'L'}������ѡ�����������д�С��������
	public static void test11() {
		char[] arr = {'X', 'P', 'T', 'B', 'O', 'C', 'Q', 'A', 'U', 'L'};
		for(int i = 0; i < arr.length-1; i++) {//������ѭ������
			for (int j = i+1; j < arr.length; j++) {//�ڲ����ڱȽ�
				if (arr[i] > arr[j]) {//��С������
					char c = arr[i];
					arr[i] = arr[j];
					arr[j] = c;
				}
			}
		}
		
		//��ӡ�������Ԫ��
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//3. ��һ����˳������{29, 36, 57, 112, 314, 421, 630, 841, 1090, 5200}��
	//���ö��ֲ��ҷ��ҳ�57,630��1090��555�ֱ��Ӧ��������û�ҵ�����-1��
	public static void test12() {
		int[] arr = {29, 36, 57, 112, 314, 421, 630, 841, 1090, 5200};
		int[] vals = {57,63, 1090, 555};
		for (int i = 0; i < vals.length; i++) {
			int val = vals[i];
			int index = binSearch(arr, val);
			System.out.println(val+"������λ��Ϊ��"+index);
		}
	}
	
	public static int binSearch(int[] arr, int val) {
		int low = 0, hight = arr.length-1;//���õ�������������
		while (low <= hight) {
			int mid = (low+hight)/2;//��ȡ�м�����
			if (arr[mid] == val) {//�ҵ�����
				return mid;
			}
			if (arr[mid] > val) {//�м�������Ӧ��ֵ����val���������
				hight = mid-1;
			} else {//�м�������Ӧ��ֵС��val�����ұ���
				low = mid+1;
			}
		}
		
		return -1;
	}
	
	//1. ����¼��һ����������ӡ������Ӧ�Ķ����ƣ��˽��ƣ�ʮ�����ơ�
	public static void test13() {
		System.out.print("������һ��������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();//��ȡ����
		System.out.println("ʮ���ƣ�"+Integer.toString(num));
		System.out.println("�����ƣ�"+Integer.toBinaryString(num));
		System.out.println("�˽��ƣ�"+Integer.toOctalString(num));
		System.out.println("ʮ�����ƣ�"+Integer.toHexString(num));
		sc.close();
	}
	
	//2. ����¼��һ���ַ�����ͳ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ���
	public static void test14() {
		int big=0, lte=0, num=0;//bigͳ�ƴ�д�ַ���lteͳ��Сд�ַ���numͳ�������ַ�
		System.out.print("������һ���ַ�����");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);//��ȡָ��������Ӧ���ַ�
			if (Character.isLetter(c)) {//�Ƿ�����ĸ
				if (Character.isLowerCase(c)) {//��Сд��ĸ
					lte++;
				}
				if (Character.isUpperCase(c)) {//�Ǵ�д��ĸ
					big++;
				}
			}
			
			if (Character.isDigit(c)) {//�Ƿ�������
				num++;
			}
		}
		System.out.println("��д��ĸ��"+big+"����Сд��ĸ��"+lte+"����������"+num+"��");
		sc.close();
	}

}
