package Quiz1;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("������ �����ּ��� => ");
	int Score = scanner.nextInt();
	
	if ( Score <= 70 ) {
		System.out.println("�ش��м��� ���� : "+ Score);
		System.err.println("���հ��Դϴ�.");
	} else if (Score > 70) {
		System.out.println("�ش��л��� ���� : "+ Score);
		System.err.println("�հ��Դϴ�.");
	}


}
}
