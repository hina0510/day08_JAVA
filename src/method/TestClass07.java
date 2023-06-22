package method;

import java.util.Scanner;

public class TestClass07 {
	public int inputData() {
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		return num;
	}
	public int sumData(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum += i ;
		}
		return sum;
	}
	public void printData(int num, int sum) {
		System.out.println("1~"+num+"까지의 합 : "+sum);
	}
}
