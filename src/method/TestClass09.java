package method;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass09 {
	/*
	public String inputData() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = input.next();
		return name;
	}
	public void printData(String name) {
		System.out.println("이름 : "+name);
	}
 	*/
	/*
	public String[] inputData() {
		Scanner input = new Scanner(System.in);
		System.out.print("3개의 이름 입력 : ");
		String name1, name2, name3;
		name1 = input.next();
		name2 = input.next();
		name3 = input.next();
		String[] arr= {name1, name2, name3};
		return arr;
	}
	public void printData(String[] name) {
		for(int i=0;i<3;i++) {
			System.out.println("이름 : "+name[i]);
		}
		
	}
	*/
	/*
	public int[] inputData() {
		Scanner input = new Scanner(System.in);
		System.out.print("두 수 입력 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int[] num = {num1, num2};
		return num;
	}
	public int sumData(int[] num) {
		int sum=0;
		for(int i=0;i<2;i++) {
			sum +=num[i];
		}
		return sum;
	}
	public void printData(int sum) {
		System.out.println("두 수의 합 : "+sum);
		
	}
	 */
	public ArrayList<Integer> inputData() {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		System.out.print("두 수 입력 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		num.add(num1);
		num.add(num2);
		
		return num;
	}
	public int sumData(ArrayList<Integer> num) {
		int sum=0;
		for(int i=0;i<2;i++) {
			sum +=num.get(i);
		}
		return sum;
	}
	public void printData(int sum) {
		System.out.println("두 수의 합 : "+sum);
		
	}
	
	
	
}
