package Quiz1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		if( (A+B) < 100 ) {
	   System.err.println("100������ ���Դϴ�.");
		}
		if( (A+B) > 100 ) {
	   System.err.println("100�̻��� ���Դϴ�.");
		}
		if( (A+B) == 100 ) {
			System.err.println("100�Դϴ�.");
		}
		
		}
	}