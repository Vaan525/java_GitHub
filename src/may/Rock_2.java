package may;

import java.util.Scanner;

public class Rock_2 {

	public void rockGame() {
	System.out.println("게임 횟수를 입력해주세요. \nmax 10회");
	Scanner sc = new Scanner(System.in);
	String comStr="", userStr="";
	
	int win = 0, lose = 0, draw = 0, fail = 0;
	int coin = sc.nextInt();
	
	
	if(coin > 10) {
		System.out.println("10회 이상은 불가");
		return;
	}
	
	System.out.println("시작");
	System.out.println("가위 [1] 바위 [2] 보 [3]");
	
	for(int i = 0; i < coin; i++) {
		int computer = (int)(Math.random()*3)+1;
		int user = sc.nextInt();

		if(computer == 1) {
			comStr ="가위";
		} else if (computer == 2) {
			comStr ="바위";
		} else if (computer == 3) {
			comStr ="보";
		} else {
			comStr ="시스템 오류";
		}
		
		if (user == 1) {
			userStr ="가위";
		} else if (user == 2) {
			userStr ="바위";
		} else if (user == 3) {
			userStr ="보";
		} else {
			userStr ="시스템 오류";
			
		}
		
		System.out.println("[유저]"+userStr+" =VS= "+
		comStr+"[컴퓨터]");
		if (user >= 1 && user <=3) {
			if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {
                win++; // 유저가 이기는 경우 
                System.out.println("승리");
			} else if (user == computer) {
				lose++;
				System.out.println("무승부");
			} else {
				draw++;
				System.out.println("패배");
			}
		} else {
			fail++;
            System.out.println("값을 잘못 입력 하였습니다."); 
		}
	System.out.println("=========================================");
		
	}
	float odds = ((float)win/(float)(coin))*100;
	
	System.out.println("[결과] 게임 횟수 : " +coin);
    System.out.println("[전적] win:"+win+"번, lose:"+lose+"번, draw:"+draw+"번, 무효:"+fail+"번");
    System.out.printf("[승률] %.2f%% \n",odds);
    System.out.println("================GAME END=================");
    sc.close();
	
	}
	
	public static void main(String[] args) {

	}

}
