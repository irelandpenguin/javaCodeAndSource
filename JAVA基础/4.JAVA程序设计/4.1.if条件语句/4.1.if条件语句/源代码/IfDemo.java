/*
	Java���Գ������
	
	(1)if������䣻
	(2)ifǶ����䣻
*/

class IfDemo {
	public static void main(String[] args) {
		//if������䣻
		//����1�������������ͱ�������Сֵ��
		float a = 13.14F, b = 8.9F;
		
		//��ʽһ������ʹ������֮ǰѧϰ����Ŀ�����
		float max = ((a > b) ? a : b);
		System.out.println("max="+max);
		
		//��ʽ����ʹ��if�������
		//if��������ʽ��
		/*
			if (�Ƚϱ��ʽ) {
				�����������Ĵ���
			} else {
				�����������Ĵ���
			}
		*/
		if (a > b) {
			System.out.println("max="+a);
		} else {
			System.out.println("max="+b);
		}
		
		
		System.out.println("------------------");
		
		//����2����֪�뾶r=3.0����Բ���ܳ�s(�ܳ�=2*PI*r)������PIΪ����ֵ 3.14�����ܳ�����12ʱ����ӡ�ܳ���
		double r = 1.0, s;
		double PI = 3.14;
		s = 2*PI*r;
		if (s > 12) {
			System.out.println("�ܳ�Ϊ"+s);
		}
		
		//����3����һ�����ͱ���x��ֵΪ7���жϵ�ǰ��������������ż����
		int x = 8;
		if (x%2 == 0) {
			System.out.println("x="+x+"Ϊż��");
		} else {
			System.out.println("x="+x+"Ϊ����");
		}
		
		//����4�������������ͱ���m=4.5, n=1.2��������m���ڱ���nʱ���������������ͱ���ֵ��
		float m = 4.5F, n = 1.2F;
		if (m > n) {
			float tmp;//����һ���м�������洢ֵ
			tmp = m;
			m = n;
			n = tmp;
		}
		System.out.println("m="+m+",n="+n);
		
		//����5��һ��Ӣ�￼�ԣ��ܷ�100�֣�60�����²�����60~70�ּ���70~90�����ã�90~100�����졣С��85�֣�������һ�֣�
		//if������䣬����һ�ֶ���������ʽΪ��
		/*
		if ���Ƚϱ��ʽ�� {
			���ʽ1;
		} else if (�Ƚϱ��ʽ2){
			���ʽ2;
		} else if (�Ƚϱ��ʽ3) {
			���ʽ3;
		} else if (�Ƚϱ��ʽ4) {
			���ʽ4;
		} else if (�Ƚϱ��ʽ5) {
			���ʽ5;
		} else if (�Ƚϱ��ʽ6) {
			���ʽ6;
		} else {
			���ʽ7;
		}
		*/
		int score = 85;
		if (score < 60) {
			System.out.println("С���ĳɼ�Ϊ"+score+"������");
		} else if (score >= 60 && score < 70) {
			System.out.println("С���ĳɼ�Ϊ"+score+"����");
		} else if (score >= 70 && score < 90) {
			System.out.println("С���ĳɼ�Ϊ"+score+"����");
		} else {//90~100
			System.out.println("С���ĳɼ�Ϊ"+score+"����");
		}
		
	}
}