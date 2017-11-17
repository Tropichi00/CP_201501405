package hw02_201501405;
import java.util.Scanner;
public class hw02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner inus = new Scanner(System.in);
		
		String user = "";
		
		int usernum;
		int uw = 0, cw = 0;
		
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("-----------------------");
		
		// 컴퓨터의 난수(랜덤)값은 1,4,7일때 가위, 2,5,8은 바위, 3,6,9는 보
		
		for(int i = 1; i<=7; i++) {
			
			
			System.out.println("입력 : [가위, 바위, 보]");
			System.out.print("user : ");
			user = inus.next();
			
			if(user.equals("가위"))
				usernum = 1;
			else if(user.equals("바위"))
				usernum = 2;
			else if(user.equals("보"))
				usernum = 3;
			else
				usernum = 0;
			
			int com = (int)(Math.random()*10) + 1;
			
			if(com%3 == 0)
				System.out.println("com : 보");
			else if(com%3 == 1)
				System.out.println("com : 가위");
			else if(com%3 == 2)
				System.out.println("com : 바위");
			else
				System.out.println("??");
			
			System.out.println("<<결과>>");

			if(com%3 == usernum%3)
				System.out.println("비겼다!");
			
			else if((com%3==1 && usernum%3==2) || (com%3==2 && usernum%3==0) || (com%3==0 && usernum%3==1)) {
				System.out.println("이겼다!");
				uw++;
				}
			
			else if((com%3==1 && usernum%3==0) || (com%3==2 && usernum%3==1) || (com%3==0 && usernum%3==2)) {
				System.out.println("졌다!");
				cw++;}
			else
				System.out.print("");
			
			System.out.println("stage " + i + " >> user : " + uw + "승 vs computer " + cw + "승");
			
			System.out.println("");
	
		}
		
		
		if(uw > cw)
			System.out.println("최종 승리 : user");
		else if(uw < cw)
			System.out.println("최종 승리 : computer");
		else
			System.out.println("두 플레이어가 비겼다.");
		
		
	}

}
