/*
	do...whileѭ���Ļ�����ʽ��
		��ʼ�����;
		do {
			ѭ�������;
			�����������;
		}while(�ж��������);
		
	�ص㣺��������ִ��һ�Σ�Ȼ�����ж�������䣬Ϊ�棬��ִ��ѭ������Ĵ��롣
*/
class DoWhileDemo {
	public static void main(String[] args) {
		//����һ�����20��hello world��
		int a = 1;
		do {
			System.out.println("hello world");
			a++;//��ֹ��ѭ������д��һ��
		} while(a <= 20);
		
		System.out.println("--------------");
		
		
		//�����������1��100��
		int b = 1;
		do {
			System.out.println(b);
			b++;//��ֹ��ѭ������д��һ��
		} while(b <= 100);
		
		System.out.println("--------------");
		
		//���������죺���1��100��5������һ�С�
		b = 1;//��b��ֵ���¸�ֵΪ1
		do {
			System.out.print(b+" ");//print���ỻ�С�println���Զ�����
			if (b%5 == 0) {//��5�����ˣ�˵��Ҫת����
				System.out.println();//println()��ʾ����
			}
			b++;
		} while(b <= 100);
		
		System.out.println("--------------");
		
		//����������1��100��ӵ��ܺ͡�
		int c =1, sum = 0;
		do {
			sum = sum + c;//Ҳ����д�� sum += c;
			c++;//��ֹ��ѭ������д��һ��
		} while(c <= 100);
		System.out.println("1��100�ĺ�Ϊ"+sum);
		
		System.out.println("--------------");
		
		//�����ģ���1��50���е�ż��֮��������֮�͡�
		int d = 1, sum1 = 0, sum2 = 0;
		do {
			if (d % 2 == 0) {//ż��
				sum1 += d;
			} else {//����
				sum2 += d;
			}
			d++;//��ֹ��ѭ������д��һ��
		} while(d <= 50);
		System.out.println("ż��֮��Ϊ"+sum1+",����֮��Ϊ"+sum2);
		
		System.out.println("--------------");
		
		//�����壺��1-100�ܱ�3����������
		int e = 1;
		do {
			if(e%3 == 0) {
				System.out.println(e);
			}
			e++;
		} while(e <= 100);
		
		System.out.println("--------------");
					
		//���������죺��1-100�ܱ�3����������3������һ�С�
		int count = 1;//count�����ʾ����
		e = 1;//���ñ���e��ֵΪ1
		do {
			if(e%3 == 0) {
				System.out.print(e+"\t");// \t��ʾ������ĸ�
								
				if (count%3 == 0) {//�ܱ�3�������û�����
					System.out.println();
				}
				count++;
			}
			e++;
		} while(e <= 100);
		
		System.out.println("--------------");
		
		//�����������100-1000֮��ġ�ˮ�ɻ���������ν��ˮ�ɻ�����ָһ����λ�������λ���ֵ������͵��ڸ�������
		//������153����һ��ˮ�ɻ�����
		//153 = 1*1*1 + 5*5*5 + 3*3*3
		
		//����˼·������
		//��λ����ȡ��153%10 = 3
		//ʮλ����ȡ��153/10%10 = 5
		//��λ����ȡ��153/100 = 1
		int m = 100, n = 1000;
		do {
			int ge = m%10;//����
			int shi = m/10%10;//ʮλ
			int bai = m/100;//��λ
			int tmp = bai*bai*bai+shi*shi*shi+ge*ge*ge;
			if(tmp == m) {//����������
				System.out.println(m);
			}
			m++;
		} while (m < n);
	}
}
