package ����5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �Է��Ͻÿ�.");
		int human = scanner.nextInt();
		int a = human/2;
		
		if (a > 10) {
			if (human%2 == 1) {
				//Ȧ��
				System.out.println("A�׷� : "+(a+1));				
				System.out.println("B�׷� : "+a);				
			}else if (human%2 == 0) {
				//����
				System.out.println("A�׷� : "+a);
				System.out.println("B�׷� : "+a);			
			}
		}else if (a <= 10 ) {
			if (a%2 == 1) {
				System.out.println("A�׷� : "+(a+1));
				System.out.println("B�׷� : "+a);
				System.out.println("�� �׷��� 10�� �����̹Ƿ� �׷��� ���յ˴ϴ�.");
				System.out.println("C�׷� :"+ human);							
			}else if (a%2 == 0) {
				System.out.println("A�׷� : "+a);
				System.out.println("B�׷� : "+a);
				System.out.println("�� �׷��� 10�� �����̹Ƿ� �׷��� ���յ˴ϴ�.");
				System.out.println("C�׷� :"+ human);							
				
			}
		}
		
	}
}
