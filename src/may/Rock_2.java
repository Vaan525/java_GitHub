package may;

import java.util.Scanner;

public class Rock_2 {

	public void rockGame() {
	System.out.println("���� Ƚ���� �Է����ּ���. \nmax 10ȸ");
	Scanner sc = new Scanner(System.in);
	String comStr="", userStr="";
	
	int win = 0, lose = 0, draw = 0, fail = 0;
	int coin = sc.nextInt();
	
	
	if(coin > 10) {
		System.out.println("10ȸ �̻��� �Ұ�");
		return;
	}
	
	System.out.println("����");
	System.out.println("���� [1] ���� [2] �� [3]");
	
	for(int i = 0; i < coin; i++) {
		int computer = (int)(Math.random()*3)+1;
		int user = sc.nextInt();

		if(computer == 1) {
			comStr ="����";
		} else if (computer == 2) {
			comStr ="����";
		} else if (computer == 3) {
			comStr ="��";
		} else {
			comStr ="�ý��� ����";
		}
		
		if (user == 1) {
			userStr ="����";
		} else if (user == 2) {
			userStr ="����";
		} else if (user == 3) {
			userStr ="��";
		} else {
			userStr ="�ý��� ����";
			
		}
		
		System.out.println("[����]"+userStr+" =VS= "+
		comStr+"[��ǻ��]");
		if (user >= 1 && user <=3) {
			if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {
                win++; // ������ �̱�� ��� 
                System.out.println("�¸�");
			} else if (user == computer) {
				lose++;
				System.out.println("���º�");
			} else {
				draw++;
				System.out.println("�й�");
			}
		} else {
			fail++;
            System.out.println("���� �߸� �Է� �Ͽ����ϴ�."); 
		}
	System.out.println("=========================================");
		
	}
	float odds = ((float)win/(float)(coin))*100;
	
	System.out.println("[���] ���� Ƚ�� : " +coin);
    System.out.println("[����] win:"+win+"��, lose:"+lose+"��, draw:"+draw+"��, ��ȿ:"+fail+"��");
    System.out.printf("[�·�] %.2f%% \n",odds);
    System.out.println("================GAME END=================");
    sc.close();
	
	}
	
	public static void main(String[] args) {

	}

}
