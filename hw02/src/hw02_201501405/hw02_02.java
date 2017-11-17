package hw02_201501405;
import java.util.Scanner;
public class hw02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner inti = new Scanner(System.in);
		
		int year, month, day;
		int toldays = 0;
		String dow = "";
		
		System.out.print("연도 입력 : "); 
		year = inti.nextInt();
		System.out.print("월 입력 : ");
		month = inti.nextInt();
		System.out.print("일 입력 : ");
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
		
		
		switch (toldays % 7) { // 기준일인 1900년 1월 1일 -> 월
		case 0:
			dow = "일";
			break;
		case 1:
			dow = "월";
			break;
		case 2:
			dow = "화";
			break;
		case 3:
		    dow = "수";
	        break;    
	    case 4:
	        dow = "목";
	        break;
	    case 5:
	         dow = "금";
	         break;
	    case 6:
	         dow = "토";
	         break;    
		}
		
		
		
		System.out.println(year + "년 " + month + "월 " + day + "일은 " + dow + "요일입니다." );
		
	}

}
