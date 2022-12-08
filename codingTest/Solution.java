package codingTest;

public class Solution {

	int A;
	int B;
	int C;
	int D;
	int E;
	int F;
		
	public Solution() {}
	
	int solution(String n[]) {	
		int passer = n.length;
		
		for (int i = 0; i < n.length; i++) {
				char[] arr = n[i].toCharArray();
				for (int j = 0; j < arr.length; j++) {
					 if (arr[j] == 'A') {
						A++;
					}else if (arr[j] == 'B') {
						B++;
					}else if (arr[j] == 'C') {
						C++;
					}else if (arr[j] == 'D') {
						D++;
					}else if (arr[j] == 'E') {
						E++;
					}else if (arr[j] == 'F') {
						F++;
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
