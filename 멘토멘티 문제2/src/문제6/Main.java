package ����6;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		Random random = new Random();
		System.out.println("����� >>");
		
		int user = scanner.nextInt();
		int com = random.nextInt(2)+1;
		
		switch (com) {
		case 1:
			if (user == 1) {
				System.out.println("user : ����");
				System.out.println("com : ����");
				System.out.println("���");
			}
			if (user == 2) {
				System.out.println("user : ����");
				System.out.println("com : ����");
				System.out.println("�̱�");
			}
			if (user == 3) {
				System.out.println("user : ��");
				System.out.println("com : ����");
				System.out.println("��");				
			}
			break;
		case 2:
			if (user == 1) {
				System.out.println("user : ����");
				System.out.println("com : ����");
				System.out.println("��");
			}
			if (user == 2) {
				System.out.println("user : ����");
				System.out.println("com : ����");				
				System.out.println("���");
			}
			if (user == 3) {
				System.out.println("user : ��");
				System.out.println("com : ����");				
				System.out.println("�̱�");				
			}
			break;
		case 3:
			if (user == 1) {
				System.out.println("user : ����");
				System.out.println("com : ��");
				System.out.println("�̱�");
			}
			if (user == 2) {
				System.out.println("user :����");
				System.out.println("com : ��");				
				System.out.println("��");
			}
			if (user == 3) {
				System.out.println("user : ��");
				System.out.println("com : ��");
				System.out.println("���");				
			}
			break;

		default:
			break;
		}
	}
}
