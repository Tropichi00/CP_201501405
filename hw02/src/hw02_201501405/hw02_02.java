package hw02_201501405;
import java.util.Scanner;
public class hw02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner inti = new Scanner(System.in);
		
		int year, month, day;
		int toldays = 0;
		String dow = "";
		
		System.out.print("���� �Է� : "); 
		year = inti.nextInt();
		System.out.print("�� �Է� : ");
		month = inti.nextInt();
		System.out.print("�� �Է� : ");
		day = inti.nextInt();
	
		toldays =  (year-1) * 365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
	
		for(int i = 1; i < month; i++) {
			switch (i) {
			
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				toldays += 31;
				break;
			case 2:
				if(((year % 4 == 0) && (year % 100 !=0)) || year % 400 == 0)
					toldays += 29;
				else
					toldays += 28;
				break;
				
			case 4: case 6: case 9: case 11:
				toldays += 30;
				break;
			}
		}
		
		
		toldays += day;
		
		
		switch (toldays % 7) { // �������� 1900�� 1�� 1�� -> ��
		case 0:
			dow = "��";
			break;
		case 1:
			dow = "��";
			break;
		case 2:
			dow = "ȭ";
			break;
		case 3:
		    dow = "��";
	        break;    
	    case 4:
	        dow = "��";
	        break;
	    case 5:
	         dow = "��";
	         break;
	    case 6:
	         dow = "��";
	         break;    
		}
		
		
		
		System.out.println(year + "�� " + month + "�� " + day + "���� " + dow + "�����Դϴ�." );
		
	}

}
