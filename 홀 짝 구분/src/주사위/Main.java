package �ֻ���;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		int Remain = Num%2; 
				
		if (Remain == 0 ) {
			System.out.println("¦���Դϴ�");
		} if (Remain != 0) { 
			System.out.println("Ȧ���Դϴ�");		
		}
		
	}
}

