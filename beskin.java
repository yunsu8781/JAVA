package example;

import java.util.Random;
import java.util.Scanner;

public class beskin {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		try {

			for (int i = 0; i < 32;) {

				if (i >= 31) {
					System.out.println("유저 승리");
					break;
				} else {
					System.out.println("현재 숫자 : " + i + "  유저가 입력할 차례");
					System.out.print("입력할 숫자 : ");
					int userCount = scanner.nextInt(4);
					i += userCount;
				}

				if (i >= 31) {
					System.out.println("컴퓨터 승리");
					break;
				} else {
					System.out.println("현재 숫자 : " + i + "  컴퓨터가 입력할 차례");
					int cpuCount = random.nextInt((3 - 1) + 1) + 1;
					System.out.println("입력한 숫자 : " + cpuCount);
					i += cpuCount;
					
					if (i >= 31) {
						System.out.println("유저 승리");		
						break;
					}

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
