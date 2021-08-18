package 문제6;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		Random random = new Random();
		System.out.println("사용자 >>");
		
		int user = scanner.nextInt();
		int com = random.nextInt(2)+1;
		
		switch (com) {
		case 1:
			if (user == 1) {
				System.out.println("user : 가위");
				System.out.println("com : 가위");
				System.out.println("비김");
			}
			if (user == 2) {
				System.out.println("user : 바위");
				System.out.println("com : 가위");
				System.out.println("이김");
			}
			if (user == 3) {
				System.out.println("user : 보");
				System.out.println("com : 가위");
				System.out.println("짐");				
			}
			break;
		case 2:
			if (user == 1) {
				System.out.println("user : 가위");
				System.out.println("com : 바위");
				System.out.println("짐");
			}
			if (user == 2) {
				System.out.println("user : 바위");
				System.out.println("com : 바위");				
				System.out.println("비김");
			}
			if (user == 3) {
				System.out.println("user : 보");
				System.out.println("com : 바위");				
				System.out.println("이김");				
			}
			break;
		case 3:
			if (user == 1) {
				System.out.println("user : 가위");
				System.out.println("com : 보");
				System.out.println("이김");
			}
			if (user == 2) {
				System.out.println("user :바위");
				System.out.println("com : 보");				
				System.out.println("짐");
			}
			if (user == 3) {
				System.out.println("user : 보");
				System.out.println("com : 보");
				System.out.println("비김");				
			}
			break;

		default:
			break;
		}
	}
}
