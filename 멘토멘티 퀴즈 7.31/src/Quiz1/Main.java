package Quiz1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		if( (A+B) < 100 ) {
	   System.err.println("100이하의 값입니다.");
		}
		if( (A+B) > 100 ) {
	   System.err.println("100이상의 값입니다.");
		}
		if( (A+B) == 100 ) {
			System.err.println("100입니다.");
		}
		
		}
	}