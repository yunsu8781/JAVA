package ����9;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("���ϴ� ������ �����Ͻÿ�.");
	System.out.println("1=��");
	System.out.println("2=�����");
	System.out.println("3=���Ƹ�");
	System.out.println("4=������");
	System.out.println("5=���");
	int ani = scanner.nextInt();

	switch (ani) {
	case 1:
		System.out.println("dog");
		break;
	case 2:
		System.out.println("cat");		
		break;

	case 3:
		System.out.println("chick");		
		break;
	
	case 4:
		System.out.println("lizard");		
		break;

	case 5:
		System.out.println("crow");		
		break;

	default:
		break;
	}
	
}
}
