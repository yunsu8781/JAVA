package example;

import java.util.Random;
import java.util.Scanner;

public class Sports {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("게임 시작 ");
		System.out.println("1 : 이김, 2 : 짐,  3 : 무승부");
		try {

			int money = 10000;
			while ( money > 500) {
				// 사용자의 선택사항을 받는 코드
				System.out.print("결과를 선택하세요 : ");
				int option = scanner.nextInt();

				// 랜덤하게 점수를 불러오는 코드
				int leftTeam = random.nextInt(9) + 1;
				int rightTeam = random.nextInt(9) + 1;
				System.out.println(leftTeam + ":" + rightTeam);

				switch (option) {
				case 1:
					if (leftTeam > rightTeam) {
						System.out.println("Win!");
						money = money * 2;
						System.out.println("맞았습니다");
					} else {
						money = money/2;
						System.out.println("틀렸습니다..");
					}
					break;
				case 2:
					if (leftTeam < rightTeam) {
						System.out.println("Lose..");
						money = money * 2;
						System.out.println("맞았습니다");
					} else {
						money = money / 2;
						System.out.println("틀렸습니다..");
					}
					break;
				case 3:
					if (leftTeam == rightTeam) {
						System.out.println("-Tie-");
						money = money * 3;
						System.out.println("맞았습니다");
					} else {
						money = money / 2;
						System.out.println("틀렸습니다..");
					}
					break;
				}
				System.out.println("현재 돈 : " + money);

			}
			
			System.out.println("돈이 부족하므로 게임 종료");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
