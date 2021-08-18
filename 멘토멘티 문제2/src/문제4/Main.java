package 문제4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    System.out.println("숫자를 입력하시오.");
		int Num = scanner.nextInt();
		
		for (int i = Num; i >= 0; i--) {
			System.out.println(i);
		}
		
	}

}
