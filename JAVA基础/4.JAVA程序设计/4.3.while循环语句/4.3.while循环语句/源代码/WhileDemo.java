/*
	whileѭ���Ļ�����ʽ��		
		��ʼ�����;
	    while(�ж��������) {
			 ѭ�������;
			 �����������;
		}
		
	�ص㣺�����ж�������䣬Ϊ���ִ��ѭ������Ĵ��롣
*/
class WhileDemo {
	public static void main(String[] args) {
		//����һ�����20��hello world��
		int a = 1;
		while(a <= 20) {
			System.out.println("hello world");
			a++;//��ֹ��ѭ��,����д���д��룡������
		}
		
		
		System.out.println("--------------");
		
		//�����������1��100��
		int b = 1;
		while(b <= 100) {
			System.out.println(b);
			b++;//��ֹ��ѭ��������д���д��룡������
		}
		
		System.out.println("--------------");
		
		//���������죺���1��100��5������һ�С�
		b = 1;//��b��ֵ���¸�ֵΪ1
		while(b <= 100) {
			System.out.print(b+" ");//print���ỻ�С�println���Զ�����
			if (b%5 == 0) {//��5�����ˣ�˵��Ҫת����
				System.out.println();//println()��ʾ����
			}
			b++;
		}
		
		System.out.println("--------------");
		
		//����������1��100��ӵ��ܺ͡�
		int c =1, sum = 0;
		while(c <= 100) {
			sum = sum + c;//Ҳ����д�� sum += c;
			c++;//��ֹ��ѭ������д��һ��
		}
		System.out.println("1��100�ĺ�Ϊ"+sum);
		
		
		System.out.println("--------------");
		
		//�����ģ���1��50���е�ż��֮��������֮�͡�
		int d = 1, sum1 = 0, sum2 = 0;
		while(d <= 50) {
			if (d % 2 == 0) {//ż��
				sum1 += d;// sum1 = sum1+d;
			} else {//����
				sum2 += d;// sum2 = sum2+d;
			}
			d++;//��ֹ��ѭ������д��һ��
		}
		System.out.println("ż��֮��Ϊ"+sum1+",����֮��Ϊ"+sum2);
		
		System.out.println("--------------");
		
		//�����壺��1-100�ܱ�3����������
		int e = 1;
		while(e <= 100) {
			if(e%3 == 0) {
				System.out.println(e);
			}
			e++;
		}
			
		System.out.println("--------------");
		
		//���������죺��1-100�ܱ�3����������3������һ�С�
		e = 1;
		int count = 1;
		while(e <= 100) {
			if(e%3 == 0) {
				System.out.print(e+" ");
				
				if (count % 3 == 0) {
					System.out.println();
				}
				count++;
			}
			e++;
		}
		
		
		System.out.println("--------------");
		
		//�����������100-1000֮��ġ�ˮ�ɻ���������ν��ˮ�ɻ�����ָһ����λ������ÿһλ���ֵ������͵��ڸ�������
		//������153����һ��ˮ�ɻ�����
		//153 = 1*1*1 + 5*5*5 + 3*3*3
		
		//����˼·������
		//��λ����ȡ��153%10 = 3
		//ʮλ����ȡ��153/10%10 = 5
		//��λ����ȡ��153/100 = 1
		int m = 100, n = 1000;
		while (m < n) {
			int ge = m%10;//����
			int shi = m/10%10;//ʮλ
			int bai = m/100;//��λ
			int tmp = bai*bai*bai+shi*shi*shi+ge*ge*ge;
			if(tmp == m) {//����������
				System.out.println(m);
			}
			m++;
		}
	}
}