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
			System.out.println("<1.�ʱ�ȭ> <2. ���� > <3. ����> <4. ������ü> <5.��������>");
			num = in.nextInt();
			if(num ==  1) {
			
				for(int i=0; i<2; i++) {
					System.out.println((i+1)+"�� ���� ���� �Է�");
					System.out.print((i+1)+"�� ���� ��ȣ  : ");
					ac = in.nextInt();
						
					System.out.print((i+1)+"�� ������ : ");
					o = in.next();
				
					System.out.print((i+1)+"�� �ʱ� �ܾ� : ");
					b = in.nextInt();
							
					ba[i] = new BankAccount(ac,o,b);
				}			
			}
		
			else if(num ==  2) {

				System.out.print("ã�� ���� ��ȣ��? : ");
				ac_tmp = in.nextInt();
				count = 2;
		
				for(int i=0; i<2; i++) {
					if(ba[i].getacnum() == ac_tmp)
						count=i;
				}
				if(count ==2)
					System.out.print("ã�� ���°� �����ϴ�.ùȭ������ ���ư��ϴ�. \n");
				else
				{
					System.out.print("���� �� �ݾ���? : ");
					ba[count].deposit(amount = in.nextInt());
					
					System.out.println(ba[count]);
				}		
			}
		
			else if (num == 3) {
			
				System.out.print("ã�� ���� ��ȣ��? : ");
				ac_tmp = in.nextInt();
				count = 2;
			
				for(int i=0; i<2; i++) {
					if(ba[i].getacnum() == ac_tmp)
						count=i;
				}
				if(count ==2)
					System.out.print("ã�� ���°� �����ϴ�.ùȭ������ ���ư��ϴ�. \n");
				else
				{
					System.out.print("��� �� �ݾ���? : ");
					ba[count].withdraw(amount = in.nextInt());
					System.out.println(ba[count]);
				}
			}
		
			else if (num == 4){
				/*
				System.out.print("ã�� ���� ��ȣ��? : ");
				ac_tmp = in.nextInt();
				count = 2;
			
				for(int i=0; i<2; i++) {
					if(ba[i].getacnum() == ac_tmp)
						count=i;
				}
				if(count ==2)
					System.out.print("ã�� ���°� �����ϴ�.ùȭ������ ���ư��ϴ�.");
				else
				{
					System.out.print("�Ա� ���� ��ȣ��? : ");
					ac_tmp = in.nextInt();
					
					count2 = 2;
					for(int j=0; j<2; j++) {
						if(ba[j].getacnum() == ac_tmp)
							count=j;
					}
					System.out.print(count2);
					if(count2 ==2)
						System.out.print("�Ա� ���°� �����ϴ�.ùȭ������ ���ư��ϴ�.");
					else
					{	*/
						System.out.print("1�� ���¿��� 2�����·� �۱��� �ݾ� : ");
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
