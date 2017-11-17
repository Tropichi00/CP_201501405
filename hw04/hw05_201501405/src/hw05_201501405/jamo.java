package hw05_201501405;

import java.util.*;

public class jamo {

	
		int ja=0, mo=0;
		private String ss;
		
		public String getstr() {
			return ss;
		}
		
		public void setstr(String str) {
			ss = str;
		}
		
	
		public void mocnt() {
		
			int i, slen;
			slen = ss.length();
			
			for(i=0; i<slen; i++) {
				
				if(ss.charAt(i)=='a' || ss.charAt(i)=='A' || ss.charAt(i)=='e' || ss.charAt(i)=='E' ||
						ss.charAt(i)=='o' || ss.charAt(i)=='O' || ss.charAt(i)=='i' || 
						ss.charAt(i)=='I' || ss.charAt(i)=='u' ||ss.charAt(i)=='U')
					mo++;
			}
			System.out.println("모음의 개수 : " + mo + "개");
		}
		
		public void jacnt() {
			
			int i, slen;
			slen = ss.length();
				
			for(i=0; i<slen; i++) {
				
				if(ss.charAt(i)!='a' && ss.charAt(i)!='A' && ss.charAt(i)!='e' && ss.charAt(i)!='E' &&
						ss.charAt(i)!='o' && ss.charAt(i)!='O' && ss.charAt(i)!='i' 
						&& ss.charAt(i)!='I' && ss.charAt(i)!='u' ||ss.charAt(i)=='U')
					ja++;	
			}
			System.out.println("자음의 개수 : " + ja + "개");
		}
		
}

