package Quiz3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("HP = 170");
		System.out.println("Skill1 : 30");
		System.out.println("Skill2 : 70");
		System.out.println("Skill3 : 100");
		int HP = 170;

		while (HP > 0) {
			int skill = scanner.nextInt();
			switch (skill) {
			case 1:
				System.out.println("skill1�� ����Ǿ����ϴ�.");
				HP = HP - 30;
				System.out.println("���� ü�� : " + HP);

				break;
			case 2:
				System.out.println("skill2�� ����Ǿ����ϴ�.");
				HP = HP - 70;
				System.out.println("���� ü�� : " + HP);

				break;
			case 3:
				System.out.println("skill3�� ����Ǿ����ϴ�.");
				HP = HP - 100;
				System.out.println("���� ü�� : " + HP);

				break;
			}
		}
		System.out.println("������ϴ�.");
		
	}
}
