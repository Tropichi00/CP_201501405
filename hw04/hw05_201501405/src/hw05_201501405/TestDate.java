package hw05_201501405;
import java.util.*;
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner indate = new Scanner(System.in);
		Date tdate = new Date();
		
		System.out.print("���� �Է� : ");
		tdate.year = indate.nextInt();
		System.out.print("�� �Է� : ");
		tdate.month = indate.nextInt();
		System.out.print("�� �Է� : ");
		tdate.day = indate.nextInt();
		
		
		System.out.print("����� ��¥ ǥ�� : ");
		tdate.printEastern();
		
		System.out.print("����� ��¥ ǥ��  : ");
		tdate.printWestern();
		
	}

}
