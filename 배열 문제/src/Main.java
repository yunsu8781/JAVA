import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[10];
		boolean a;
		
		
		for (int i = 0; i <10 ; i++) {			
		num[i] = scanner.nextInt();
		}			
						
		System.out.println(num[1]);
		
	}
}

//���̰� 10�� �迭 array[]�� �����Ͽ� ��� ������ ���ڰ��� '����' �Է����� �� ����
//a�� ����� �迭�� ù���� �������� ������ ���������� ���� ���ϰ� ���⸦
//�ݺ��� ���� ����Ͻÿ�