package may;

import java.util.*;

class figure {
	
	String a;
	String ad;
	
	public void select() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("( �ﰢ��, �簢��, �� ) �� 1");
		a = sc.nextLine();
	
		
		switch (a) {
		case ("�簢��"):
			System.out.println("������ ���� �Է�");
			double i = sc.nextDouble();
			System.out.println("������ ���� �Է�");
			double j = sc.nextDouble();
			double l = i*j;
			System.out.println("�簢���� ���� : "+l);
			break;

		case("�ﰢ��"):
			System.out.println("������ ���� �Է�");
		double i2 = sc.nextDouble();
		System.out.println("������ ���� �Է�");
		double j2 = sc.nextDouble();
		double l2 = (i2*j2) / 2;
		System.out.println("�簢���� ���� : "+l2);
			break;
			
		case("��"):
			System.out.println("������ ���� �Է�");
		double i3 = sc.nextDouble();
		double j3 = (i3*i3) *3.14;
		System.out.println("�簢���� ���� : "+j3);
			break;
		}
		
		
		
		
		System.out.println("�����? Y or N");
		ad = sc.next();
		switch (ad) {
		case ("Y"):
			select();
			break;
			
		case ("y"):
			select();
			break;
					
		case ("N"):
			System.out.println("����");
			break;
		
		case ("n"):
			System.out.println("����");
			break;
		} 
		
		
	}	
}


public class choose {

	public static void main(String[] args) {

		figure nn = new figure();
		
		nn.select();
		
		
		
		
		
		
//		�Ʒ��� ������(1.�ﰢ�� 2.�簢�� 3.��) >> 2
//		���� �Է��ϼ���>>4
//		���� �Է��ϼ���>>5
//		���̴� 20�Դϴ�.
//		��� �Ͻðڽ��ϱ� yes�� y No�̸� n: y
//		�Ʒ��� ������(1.�ﰢ�� 2.�簢�� 3.��) >> 1
//		���� �Է��ϼ���>>4
//		���� �Է��ϼ���>>5
//		���̴� 10�Դϴ�.
//		��� �Ͻðڽ��ϱ� yes�� y No�̸� n: n
//		���α׷��� ���� �մϴ�.
	}

}
