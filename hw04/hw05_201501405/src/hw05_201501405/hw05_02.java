package hw05_201501405;
import java.util.*;
public class hw05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String lina;
		int i;
		String relina = "";
		
		Scanner inlin = new Scanner(System.in);
		
		System.out.print("��ȯ �� ���ڿ��� �Է��ϼ��� : ");
		lina = inlin.nextLine();
		
		char[] chstr = lina.toCharArray();
		
		for(i=0; i<lina.length(); i++) {
			
			chstr[i] = lina.charAt(i);
			
			if(chstr[i]>='a' && chstr[i]<='z')
				relina += String.valueOf(chstr[i]).toUpperCase();
			else if(chstr[i]>='A' && chstr[i]<='Z')
				relina += String.valueOf(chstr[i]).toLowerCase();
			else
				relina += chstr[i];

			//  String str = String.valueOf(char c); // char to String
		}
		System.out.println("��ȯ �� ���ڿ��� : " + relina);
	}

}
