import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String AI = null;
		int AItemp = 0;
		String �����;
		System.out.println("���������� �����Դϴ�.���ǿ� ������������ �Ȱ����ϴ�.");
		System.out.println("Ai�� ���� ���� �� �� �� ������ ����մϴ�.");
		Random random = new Random();
	    Scanner scanner = new Scanner(System.in);
		System.out.println("����� >>");
		����� = scanner.next();		
		
		AItemp = random.nextInt(2);
		switch (AItemp) {
		case 0:
			AI = "����";		
			break;
		case 1:
			AI = "����";
			break;
		case 2:
			AI = "��";
			break;

		
		}
		if (AI.equals("����") && �����.equals("����")) {
			System.out.println("AI :"+AI);
			System.out.println("����� :"+�����);
			System.out.println("�����ϴ�.");
		}else if (AI.equals("����")&& �����.equals("����")) {
			System.out.println("AI :"+AI);
			System.out.println("�����:"+�����);
			System.out.println("����ڰ� �̰���ϴ�.");
		}else if(AI.equals("����") && �����.equals("��")) {
			System.out.println("AI :"+AI);
			System.out.println("�����:"+�����);
			System.out.println("AI�� �̰���ϴ�.");
		}else if (AI.equals("����") && �����.equals("����")) {
			System.out.println("AI :"+AI);
			System.out.println("����� :"+�����);
			System.out.println("AI�� �̰���ϴ�.");
		}else if (AI.equals("����") && �����.equals("����")) {
			System.out.println("AI :"+AI);
			System.out.println("����� :"+�����);
			System.out.println("�����ϴ�.");
		}else if (AI.equals("����") && �����.equals("��")) {
			System.out.println("AI :"+AI);
			System.out.println("����� :"+�����);
			System.out.println("����ڰ� �̰���ϴ�.");
		}else if (AI.equals("��") && �����.equals("����")) {
			System.out.println("AI :"+AI);
			System.out.println("����� :"+�����);
			System.out.println("����ڰ� �̰���ϴ�.");
		}else if (AI.equals("��") && �����.equals("����")) {
			System.out.println("AI :"+AI);
			System.out.println("����� :"+�����);
			System.out.println("AI�� �̰���ϴ�.");
		}else if (AI.equals("��") && �����.equals("��")) {
			System.out.println("AI :"+AI);
			System.out.println("����� :"+�����);
			System.out.println("�����ϴ�.");
		}else {
			System.out.println("�Է��� �߸��� �Է��� �ֽ��ϴ�.");
		}

		
	}

}
