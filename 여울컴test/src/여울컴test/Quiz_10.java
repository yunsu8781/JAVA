package 여울컴test;

import java.util.Scanner;

public class Quiz_10 {
	public static void main(String[] args) {
		Scanner scaneer = new Scanner(System.in);

		try {

			// 현재 층과 사람수를 담을수 있는 변수칸
			int nowPeople = 0;
			int nowFloor = 1;

			// 계속해서 값을 받아올수 있는 for문
			for (int i = 0; i < 1;) {

				System.out.println("현재 층 : " + nowFloor + " 현재 사람 : " + nowPeople);
				int scan = scaneer.nextInt();
				switch (scan) {
				case 1:
					nowFloor += 1;
					break;
				case 2:
					nowFloor -= 1;
					break;
				case 3:
					nowPeople += 1;
					break;
				case 4:
					nowPeople -= 1;
					break;
				case 0:
					i = 1;
					System.out.println("프로그램 종료");
					break;

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
