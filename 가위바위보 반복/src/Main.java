import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int user1 = 0;
		
		do {	
		
	Scanner scanner2	= new Scanner(System.in);
	Random random = new Random();
	
	System.out.println("����(1), ����(2), ��(3) �Է� : ");
	
	int com = random.nextInt(2)+1;
	int user = scanner2.nextInt();
	
		
	switch (com) {
	case 1:
		switch(user)
		{
		case 1:
			System.out.println("��ǻ�� : ����,  ����� : ����");
			System.out.println("�����ϴ�.");
			break;
		case 2:
			System.out.println("��ǻ�� : ����,  ����� : ����");
			System.out.println("����� Win!!");
			break;
		case 3:
			System.out.println("��ǻ�� : ����,  ����� : ��");
			System.out.println("��ǻ�� Win!!");
			break;
		}
		break;
    case 2:
    	switch(user)
		{
		case 1:
			System.out.println("��ǻ�� : ����,  ����� : ����");
			System.out.println("��ǻ�� Win!!");
			break;
		case 2:
			System.out.println("��ǻ�� : ����,  ����� : ����");
			System.out.println("�����ϴ�.");
			break;
		case 3:
			System.out.println("��ǻ�� : ����,  ����� : ��");
			System.out.println("����� Win!!");
			break;
		}
		break;	
    case 3:
    	switch(user)
		{
		case 1:
			System.out.println("��ǻ�� : ��,  ����� : ����");
			System.out.println("����� Win!!");
			break;
		case 2:
			System.out.println("��ǻ�� : ��,  ����� : ����");
			System.out.println("��ǻ�� Win!!");
			break;
		case 3:
			System.out.println("��ǻ�� : ��,  ����� : ��");
			System.out.println("�����ϴ�.");
			break;
		}
		break;	
	default:
		System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�.");
		break;
	}
	System.out.println("��� �Ͻðڽ��ϱ�? ����Ͻ÷��� 0�� �����ּ���.");
	
	user = scanner2.nextInt();
	}while (user1 == 0);

		}
}
	
