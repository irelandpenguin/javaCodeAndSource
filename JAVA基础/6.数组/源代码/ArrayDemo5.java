/*
	二维数组的练习
		1. 有一个二维数组，求它的所有元素的总和。
		2. 小明，小红，小张3人参加期末考试(语文，数学，英语)，小明的成绩为{80, 92, 88}, 小红的成绩为{93, 68, 76},
		//小张的成绩为{53, 81, 77}。求语文平均成绩，数学平均成绩，英语平均成绩。
*/
import java.util.Scanner;
class ArrayDemo5 {
	public static void main(String[] args) {
		//1. 有一个二维数组，求它的所有元素的总和。
		int[][] arr = {{23, 12, 65},{2, 40},{100}};//静态初始化
		int sum = sum(arr);//方法有返回值，需要接收
		System.out.println("sum="+sum);
		
		System.out.println("---------");
		
		//2. 小明，小红，小张3人参加期末考试(语文，数学，英语)，
		//小明的成绩为{80, 92, 88}, 小红的成绩为{93, 68, 76},小张的成绩为{53, 81, 77}。
		//求语文平均成绩，数学平均成绩，英语平均成绩。
		double[][] grades = {{80.5, 92, 88.5},{93, 68.5, 76},{53.5, 81, 77}};//静态初始化
		double[] grade = new double[3];//定义一个一维数组，保存三门课程的平均成绩
		getGrade(grades, grade);
		System.out.println("语文平均成绩为"+grade[0]+"\n"+"数学平均成绩为"+grade[1]+"\n"+"英语平均成绩为"+grade[2]);
	}
	
	public static int sum(int[][] arr) {
		int s = 0;
		for(int i = 0; i < arr.length; i++) {//外层遍历二维数组的元素
			for(int j = 0; j < arr[i].length; j++) {//里层遍历一维数组的元素
				s += arr[i][j];
			}
		}
		return s;
	}
	
	/*
		double[][] grades = {{80.5, 92, 88.5},{93, 68.5, 76},{53.5, 81, 77}};//静态初始化
		double[] grade = new double[3];
	*/
	public static void getGrade(double[][] grades, double[] grade) {
		for (int i = 0; i < grades.length; i++) {//外层遍历二维数组的元素
			double tmp = 0;//创建一个临时变量，用于累加每科的成绩
			for (int j = 0; j < grades[i].length; j++) {//里层遍历一维数组的元素
				tmp = tmp + grades[j][i];//重点！！
			}
			grade[i] = tmp/3;//获取平均成绩
		}
	}
}