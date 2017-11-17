package hw07_201501405;
import java.util.*;
public class TestBankAccount {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ac, b, num, amount;
		String o = "";
		int ac_tmp,count,count2;
		
		BankAccount [] ba = new BankAccount[2];
		Scanner in = new Scanner(System.in);
							
		while(true)
		{
			System.out.println("<1.초기화> <2. 저금 > <3. 인출> <4. 계좌이체> <5.서비스종료>");
			num = in.nextInt();
			if(num ==  1) {
			
				for(int i=0; i<2; i++) {
					System.out.println((i+1)+"번 계좌 정보 입력");
					System.out.print((i+1)+"번 계좌 번호  : ");
					ac = in.nextInt();
						
					System.out.print((i+1)+"번 예금주 : ");
					o = in.next();
				
					System.out.print((i+1)+"번 초기 잔액 : ");
					b = in.nextInt();
							
					ba[i] = new BankAccount(ac,o,b);
				}			
			}
		
			else if(num ==  2) {

				System.out.print("찾는 계좌 번호는? : ");
				ac_tmp = in.nextInt();
				count = 2;
		
				for(int i=0; i<2; i++) {
					if(ba[i].getacnum() == ac_tmp)
						count=i;
				}
				if(count ==2)
					System.out.print("찾는 계좌가 없습니다.첫화면으로 돌아갑니다. \n");
				else
				{
					System.out.print("저금 할 금액은? : ");
					ba[count].deposit(amount = in.nextInt());
					
					System.out.println(ba[count]);
				}		
			}
		
			else if (num == 3) {
			
				System.out.print("찾는 계좌 번호는? : ");
				ac_tmp = in.nextInt();
				count = 2;
			
				for(int i=0; i<2; i++) {
					if(ba[i].getacnum() == ac_tmp)
						count=i;
				}
				if(count ==2)
					System.out.print("찾는 계좌가 없습니다.첫화면으로 돌아갑니다. \n");
				else
				{
					System.out.print("출금 할 금액은? : ");
					ba[count].withdraw(amount = in.nextInt());
					System.out.println(ba[count]);
				}
			}
		
			else if (num == 4){
				/*
				System.out.print("찾는 계좌 번호는? : ");
				ac_tmp = in.nextInt();
				count = 2;
			
				for(int i=0; i<2; i++) {
					if(ba[i].getacnum() == ac_tmp)
						count=i;
				}
				if(count ==2)
					System.out.print("찾는 계좌가 없습니다.첫화면으로 돌아갑니다.");
				else
				{
					System.out.print("입금 계좌 번호는? : ");
					ac_tmp = in.nextInt();
					
					count2 = 2;
					for(int j=0; j<2; j++) {
						if(ba[j].getacnum() == ac_tmp)
							count=j;
					}
					System.out.print(count2);
					if(count2 ==2)
						System.out.print("입금 계좌가 없습니다.첫화면으로 돌아갑니다.");
					else
					{	*/
						System.out.print("1번 계좌에서 2번계좌로 송금할 금액 : ");
						amount = in.nextInt();
						System.out.println("==========================");
			
						//ba[count].sendAccount(amount, ba[count2]);
						ba[0].sendAccount(amount, ba[1]);
					//}
				//}
			}
			else if (num == 5)
			{
				System.out.print("Bye Bye !!");
				break;
			}
		}
		in.close();
	}
}
