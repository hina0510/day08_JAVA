package method;

public class TestClass10 {
	public int sumData(int num1, int num2) {
		int sum;
		if(num1>num2) {
			sum = num1;
		}else {
			sum = num2;
		}
		return sum;
	}
	public void printData(int sum) {
		System.out.println("큰 수  : "+sum);
	}
	public void ghfWkrData(int num3) {
		if(num3%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
	public void qotnData(int num4) {
		if(num4%3==0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수 아님");
		}
	}
	public void thtnData(int num5) {
		int sum=0;
		for(int i=1;i<=num5;i++) {
			if(num5%i==0) {
				sum += 1;
			}
		}
		if(num5==1 || sum==2) {
			System.out.println("소수");
		}else {
			System.out.println("소수 아님");
		}
	}
	public void wjfeoData(int num6) {
		if(num6<0) {
			num6 = -(num6);
		}
		System.out.println(num6);
	}
}
