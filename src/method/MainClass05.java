package method;

import java.util.Scanner;

public class MainClass05 {
public static void main(String[] args) {
	TestClass05 t = new TestClass05();
	Scanner input = new Scanner(System.in);
	int num = 0;
	System.out.print("수 입력 : ");
	num = input.nextInt();
	t.sumFunc(num);
}
}
