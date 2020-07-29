package June;

import java.util.Scanner;

public class Cal {
	static int a;
	static int b;
	static String c;
	static int d;
	
	public static void Calculrator() {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("첫번쨰 숫자를 입력");
	a = sc.nextInt();
	System.out.println("연산 기호를 입력");
	c = sc.next();
	System.out.println("두번째 숫자를 입력");
	b = sc.nextInt();
	

	try {		
		switch (c) {
			case ("+") :
				d = a+b;
				break;
			case ("-") :
				d = a-b;
				break;
			case ("*") :
				d = a*b;
				break;
			case ("/") :
				d = a/b;
				break;
	}
	}
	catch (ArithmeticException e){
		System.out.println(e.getMessage());
	}
	System.out.println(a+" "+c+" "+b+" = " +d);
	
	
	System.out.println("계속함? y or n");
	String e = sc.next();
	
		switch(e) {
			case ("y") :
				Calculrator();
				break;
			case ("n") :
				break;
		}
	
	}
	
	public static void main(String[] args) {
	
		Calculrator();
	
	
	
	
	
	
	
	
	
	}
	
}
