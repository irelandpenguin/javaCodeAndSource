/*
	ѭ����䣺forѭ��,whileѭ��,do...whileѭ����
	
	forѭ����ʽ��
		for(��ʼ�����;�ж��������;�����������) {
			ѭ�������;
		}
		
		ִ�����̣�
			A:ִ�г�ʼ�����
			B:ִ���ж��������,���䷵��ֵ��true����false
				�����true����ִ��ѭ�������
				�����false���ͽ���ѭ��
			C:ִ�п����������
			D:�ص�B������
			
	ע�����
		A:�ж�����������ۼ򵥻��Ǹ��ӣ��������boolean���͡�
		B:ѭ������������һ����䣬�����ſ���ʡ�ԣ�����Ƕ�����䣬�����Ų���ʡ�ԡ�������Զ��Ҫʡ�ԡ�
*/
class ForDemo {
	public static void main(String[] args) {
		//����һ�����20��hello world��
		for(int a = 1; a <= 20; a++) {
			System.out.println("hello world");
		}
		
		System.out.println("--------------");
		
		//�����������1��100��
		int b = 1;
		for(; b <= 100; b++) {
			System.out.println(b);
		}
		
		/*
		b = 2000;
		System.out.println(b);
		*/
		/*
			ע�⣺b�����������ݰڷŵ�λ�ò�ͬ����ͬ������ŵ�forѭ�������棬�������������������main����;
			����ŵ�forѭ�����棬������������ֻ��forѭ�������棡��
		*/
		
		
		System.out.println("--------------");
		
		//���������죺���1��100��5������һ�С�
		for(b = 1; b <= 100; b++) {
			System.out.print(b+" ");//print���ỻ�С�println���Զ�����
			if (b%5 == 0) {//��5�����ˣ�˵��Ҫת����
				System.out.println();//println()��ʾ����
			}
		}
		
		System.out.println("--------------");
		
		//����������1��100��ӵ��ܺ͡�
		int sum = 0;
		for(int c =1; c <= 100; c++) {
			sum = sum + c;//Ҳ����д�� sum += c; 
		}
		System.out.println("1��100�ĺ�Ϊ"+sum);
		
		System.out.println("--------------");
		
		//�����ģ���1��50���е�ż��֮��������֮�͡�
		int sum1 = 0, sum2 = 0;
		for(int d = 1; d <= 50; d++) {
			if (d % 2 == 0) {//ż��
				sum1 += d;
			} else {//����
				sum2 += d;
			}
		}
		System.out.println("ż��֮��Ϊ"+sum1+",����֮��Ϊ"+sum2);
		
		System.out.println("--------------");
		
		//�����壺��1-100�ܱ�3����������
		int e = 1;
		for(; e <= 100; e++) {
			if(e%3 == 0) {
				System.out.println(e);
			}
		}
			
		System.out.println("--------------");
		
		//���������죺��1-100�ܱ�3����������3������һ�С�
		int count = 1;//count�����ʾ����
		for(e = 1; e <= 100; e++) {
			if(e%3 == 0) {
				System.out.print(e+"\t");// \t��ʾ������ĸ�
			
				if (count%3 == 0) {//�ܱ�3�������û�����
					System.out.println();
				}
				count++;
			}
		}
		
		System.out.println("--------------");
		
		//�����������100-1000֮��ġ�ˮ�ɻ���������ν��ˮ�ɻ�����ָһ����λ�������λ���ֵ������͵��ڸ�������
		//������153����һ��ˮ�ɻ�����
		//153 = 1*1*1 + 5*5*5 + 3*3*3
		
		//����˼·������
		//��λ����ȡ��153%10 = 3
		//ʮλ����ȡ��153/10%10 = 5
		//��λ����ȡ��153/100 = 1
		for(int m = 100; m < 1000; m++) {
			int ge = m%10;//����
			int shi = m/10%10;//ʮλ
			int bai = m/100;//��λ
			int tmp = bai*bai*bai+shi*shi*shi+ge*ge*ge;
			if(tmp == m) {//����������
				System.out.println(m);
			}
		}
	}
}
