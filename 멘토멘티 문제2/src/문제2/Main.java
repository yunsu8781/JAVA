package ����2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� ��ȣ�� �Է��Ͻÿ� : ");
		int dog = scanner.nextInt();
		
		switch (dog) {
		case 12:
		case 1:
		case 2:
			System.out.println(dog+"���� �����Դϴ�.");			
			break;
			
		case 3:
		case 4:
		case 5:
			System.out.println(dog+"���� ��Ű�Դϴ�.");			
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println(dog+"���� �����Դϴ�.");			
			break;
		
		case 9:
		case 10:
		case 11:
			System.out.println(dog+"���� �޸��Դϴ�.");			
			break;
			
		case 0:
			System.out.println(dog+"���� ���� ��Ű ���� �޸�");

		default:
			break;
		}
	    
		
		}
		
		
	}

