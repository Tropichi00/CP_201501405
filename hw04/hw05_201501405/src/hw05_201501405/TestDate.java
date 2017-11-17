package hw05_201501405;
import java.util.*;
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner indate = new Scanner(System.in);
		Date tdate = new Date();
		
		System.out.print("연도 입력 : ");
		tdate.year = indate.nextInt();
		System.out.print("월 입력 : ");
		tdate.month = indate.nextInt();
		System.out.print("일 입력 : ");
		tdate.day = indate.nextInt();
		
		
		System.out.print("동양식 날짜 표현 : ");
		tdate.printEastern();
		
		System.out.print("서양식 날짜 표현  : ");
		tdate.printWestern();
		
	}

}
