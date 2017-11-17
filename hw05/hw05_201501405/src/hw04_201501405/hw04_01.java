package hw04_201501405;
import java.util.*;
public class hw04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] radar = new int[10];
		int max=0, min=0;
	
		for(int i=0; i<radar.length; i++) {
			
			int rnum = (int)(Math.random()*100)+1;
			radar[i] = rnum;
			
			max = radar[0];
			min = radar[0];
			
			System.out.print(radar[i] + " ");
		}
		
		
		for(int i=0; i<radar.length; i++) {
						
			if(max < radar[i])
				max = radar[i];
			
			if(min > radar[i])
				min = radar[i];
								
		}
		
		
		System.out.println(" ");
		System.out.println("10개의 수 중 가장 큰 숫자 : " + max);
		
		System.out.println("10개의 수 중 가장 작은 숫자 : " + min);
	}

}
