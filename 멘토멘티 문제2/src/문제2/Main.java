package 문제2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("강아지의 번호를 입력하시오 : ");
		int dog = scanner.nextInt();
		
		switch (dog) {
		case 12:
		case 1:
		case 2:
			System.out.println(dog+"번은 보리입니다.");			
			break;
			
		case 3:
		case 4:
		case 5:
			System.out.println(dog+"번은 쿠키입니다.");			
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println(dog+"번은 땅콩입니다.");			
			break;
		
		case 9:
		case 10:
		case 11:
			System.out.println(dog+"번은 메리입니다.");			
			break;
			
		case 0:
			System.out.println(dog+"번은 보리 쿠키 땅콩 메리");

		default:
			break;
		}
	    
		
		}
		
		
	}

