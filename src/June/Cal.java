package June;

import java.util.Scanner;

public class Cal {
	static int a;
	static int b;
	static String c;
	static int d;
	
	public static void Calculrator() {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("ù���� ���ڸ� �Է�");
	a = sc.nextInt();
	System.out.println("���� ��ȣ�� �Է�");
	c = sc.next();
	System.out.println("�ι�° ���ڸ� �Է�");
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
	
	
	System.out.println("�����? y or n");
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
