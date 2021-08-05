package 문제7;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("첫번째 숫자들을 입력해 주세요.");
	int FirstArray = scanner.nextInt();
	
	System.out.println("두번째 숫자들을 입력해 주세요.");
	int SecondArray = scanner.nextInt();
	
	System.out.println(FirstArray * SecondArray );
	
}
}
