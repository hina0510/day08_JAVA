package method;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 t = new TestClass06();
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		
		int sum = t.sumFunc(num);
		System.out.println("1~"+num+"까지의 합 : "+sum);
	}
}
