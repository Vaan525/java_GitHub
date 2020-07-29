package June;

import java.util.*;


public class lotto {

	static Random sc = new Random();
	static int a;
	
	
	public lotto (int a) {
		this.a = a;
	}
	
		
		
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		int[] aa = new int[6];
		for (int i = 0; i < aa.length; i++) {	
			aa[i] = sc.nextInt(45)+1;
			for(int j = 0; j < i; j++) {
				if(aa[i] == aa[j]) {
					i--;  
						 
				}
			}
		} 
		for(int k = 0; k < aa.length; k++) {
			list.add(aa[k]);
		}
			
		
		
		for(Integer lot : list)
			System.out.println(lot + '\t');
		System.out.println();
		
		
		
		
	}

}
