package hw05_201501405;

import java.util.*;

public class hw05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner word = new Scanner(System.in);
		
		String str;
		
		jamo jmcnt = new jamo();
			
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		
		jmcnt.setstr(str = word.next());
	 // jmcnt.ss = word.next();
		
		jmcnt.jacnt();
		jmcnt.mocnt();
		
	}

}
