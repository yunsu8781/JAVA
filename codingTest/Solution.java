package codingTest;

public class Solution {

	int A;
	int B;
	int C;
	int D;
	int E;
	int F;
		
	public Solutiom() {}
	
	int solution(String n[]) {	
		int passer = n.length;
		
		for (int i = 0; i < n.length; i++) {
				char[] arr = n[i].toCharArray();
				for (int j = 0; j < arr.length; j++) {
					 switch (arr[j]) {
					case 'A':
						A++;
						break;
					case 'B':
						B++;						
						break;
					case 'C':						
						C++;						
						break;
					case 'D':
						D++;												
						break;
					case 'E':
						E++;																		
						break;
					case 'F':
						F++;																								
						break;

					}
				}
				if (F >= 2 ) {
					passer = passer-1;					
				}else if (A >= 2) {	
					
				}else {
					A = (A * 5); 
					B = (B * 4); 
					C = (C * 3); 
					D = (D * 2); 
					E = (E * 1); 
					F = (F * 0);
					
					double sumScore = ((A+B+C+D+E+F)/6)+((A+B+C+D+E+F)%6) ;
					
					if (sumScore < 3) {
						passer = passer -1;						 
					}else if (sumScore >= 3) {
						
					}
				}
		}
		return passer;
	}
	
}
