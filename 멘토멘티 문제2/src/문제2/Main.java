package 문제2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("강아지의 번호를 입력하시오 : ");
		int dog = scanner.nextInt();
		
		switch (dog) {
		case 1:
			System.out.println("1번은 보리 입니다");
			break;
		case 2:
			System.out.println("2번은 보리 입니다");
			break;
		case 3:
			System.out.println("3번은 쿠키 입니다");
			break;
		case 4:
			System.out.println("4번은 쿠키 입니다");
			break;
		case 5:
			System.out.println("5번은 쿠키 입니다");
			break;
		case 6:
			System.out.println("6번은 땅콩 입니다");
			break;
		case 7:
			System.out.println("7번은 땅콩 입니다");
			break;
		case 8:
			System.out.println("8번은 땅콩 입니다");
			break;
		case 9:
			System.out.println("9번은 메리 입니다");
			break;
		case 10:
			System.out.println("10번은 메리 입니다");
			break;
		case 11:
			System.out.println("11번은 메리 입니다");
			break;
		case 12:
			System.out.println("12번은 보리 입니다");
			break;
		case 0:
			System.out.println("강아지 이름");
			System.out.println("보리 쿠키 땅콩 메리");
			break;
		default:
			break;
		}
		
		
	}
}
