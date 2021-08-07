package 구구단;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scanner =new Scanner(System.in);
	System.out.println("원하는 구구단을 출력하시오.");
	int Num = scanner.nextInt();
	
	for (int i = 1; i <= 9; i++) {
		System.out.println(Num + "*" + i + "=" + (Num*i));
	}
	
}
}
