package hw02_201501405;
import java.util.Scanner;
public class hw02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner inus = new Scanner(System.in);
		
		String user = "";
		
		int usernum;
		int uw = 0, cw = 0;
		
		System.out.println("���������� ������ �����մϴ�.");
		System.out.println("-----------------------");
		
		// ��ǻ���� ����(����)���� 1,4,7�϶� ����, 2,5,8�� ����, 3,6,9�� ��
		
		for(int i = 1; i<=7; i++) {
			
			
			System.out.println("�Է� : [����, ����, ��]");
			System.out.print("user : ");
			user = inus.next();
			
			if(user.equals("����"))
				usernum = 1;
			else if(user.equals("����"))
				usernum = 2;
			else if(user.equals("��"))
				usernum = 3;
			else
				usernum = 0;
			
			int com = (int)(Math.random()*10) + 1;
			
			if(com%3 == 0)
				System.out.println("com : ��");
			else if(com%3 == 1)
				System.out.println("com : ����");
			else if(com%3 == 2)
				System.out.println("com : ����");
			else
				System.out.println("??");
			
			System.out.println("<<���>>");

			if(com%3 == usernum%3)
				System.out.println("����!");
			
			else if((com%3==1 && usernum%3==2) || (com%3==2 && usernum%3==0) || (com%3==0 && usernum%3==1)) {
				System.out.println("�̰��!");
				uw++;
				}
			
			else if((com%3==1 && usernum%3==0) || (com%3==2 && usernum%3==1) || (com%3==0 && usernum%3==2)) {
				System.out.println("����!");
				cw++;}
			else
				System.out.print("");
			
			System.out.println("stage " + i + " >> user : " + uw + "�� vs computer " + cw + "��");
			
			System.out.println("");
	
		}
		
		
		if(uw > cw)
			System.out.println("���� �¸� : user");
		else if(uw < cw)
			System.out.println("���� �¸� : computer");
		else
			System.out.println("�� �÷��̾ ����.");
		
		
	}

}
