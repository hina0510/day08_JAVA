package test;

import com.care.test.MemberClass;

public class MainClass {
public static void main(String[] args) {
	MemberClass mem = new MemberClass();
	mem.name = "김개똥";
	mem.age = 25;
	System.out.println("이름 : "+mem.name);
	System.out.println("나이 : "+mem.age);
	
}
}
