package гу;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int value= 0;
		
		for (int i = 0; i <= n; i++) {
			value = value + i;
		}
		System.out.println(value);
	}
}
