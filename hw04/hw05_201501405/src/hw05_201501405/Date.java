package hw05_201501405;

public class Date {

	
	public int year, month, day;
	public String emon;
	
	public void printEastern() {
		
		System.out.println(year + "." + month + "." + day);
		
	}
	
	
	public void printWestern() {
		
		switch(month) {
		case 1:
			emon = "Jenuary";
			break;
		case 2:
			emon = "Feburary";
			break;
		case 3:
			emon = "March";
			break;
		case 4:
			emon = "April";
			break;
		case 5:
			emon = "May";
			break;
		case 6:
			emon = "June";
			break;
		case 7:
			emon = "July";
			break;
		case 8:
			emon = "August";
			break;
		case 9:
			emon = "September";
			break;
		case 10:
			emon = "October";
			break;
		case 11:
			emon = "Nobember";
			break;
		case 12:
			emon = "December";
			break;
		
		}
		
		System.out.println(emon + " " + day + ", " + year);
	}
}
