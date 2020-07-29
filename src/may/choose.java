package may;

import java.util.*;

class figure {
	
	String a;
	String ad;
	
	public void select() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("( 삼각형, 사각형, 원 ) 택 1");
		a = sc.nextLine();
	
		
		switch (a) {
		case ("사각형"):
			System.out.println("가로의 길이 입력");
			double i = sc.nextDouble();
			System.out.println("세로의 길이 입력");
			double j = sc.nextDouble();
			double l = i*j;
			System.out.println("사각형의 넓이 : "+l);
			break;

		case("삼각형"):
			System.out.println("가로의 길이 입력");
		double i2 = sc.nextDouble();
		System.out.println("세로의 길이 입력");
		double j2 = sc.nextDouble();
		double l2 = (i2*j2) / 2;
		System.out.println("사각형의 넓이 : "+l2);
			break;
			
		case("원"):
			System.out.println("반지름 길이 입력");
		double i3 = sc.nextDouble();
		double j3 = (i3*i3) *3.14;
		System.out.println("사각형의 넓이 : "+j3);
			break;
		}
		
		
		
		
		System.out.println("계속함? Y or N");
		ad = sc.next();
		switch (ad) {
		case ("Y"):
			select();
			break;
			
		case ("y"):
			select();
			break;
					
		case ("N"):
			System.out.println("꺼져");
			break;
		
		case ("n"):
			System.out.println("꺼져");
			break;
		} 
		
		
	}	
}


public class choose {

	public static void main(String[] args) {

		figure nn = new figure();
		
		nn.select();
		
		
		
		
		
		
//		아래중 고르세요(1.삼각형 2.사각형 3.원) >> 2
//		가로 입력하세요>>4
//		세로 입력하세요>>5
//		넓이는 20입니다.
//		계속 하시겠습니까 yes면 y No이면 n: y
//		아래중 고르세요(1.삼각형 2.사각형 3.원) >> 1
//		가로 입력하세요>>4
//		세로 입력하세요>>5
//		넓이는 10입니다.
//		계속 하시겠습니까 yes면 y No이면 n: n
//		프로그램을 종료 합니다.
	}

}
