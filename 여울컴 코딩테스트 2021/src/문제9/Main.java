package 문제9;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("원하는 동물을 선택하시오.");
	System.out.println("1=개");
	System.out.println("2=고양이");
	System.out.println("3=병아리");
	System.out.println("4=도마뱀");
	System.out.println("5=까마귀");
	int ani = scanner.nextInt();

	switch (ani) {
	case 1:
		System.out.println("dog");
		break;
	case 2:
		System.out.println("cat");		
		break;

	case 3:
		System.out.println("chick");		
		break;
	
	case 4:
		System.out.println("lizard");		
		break;

	case 5:
		System.out.println("crow");		
		break;

	default:
		break;
	}
	
}
}
