
import java.util.Random;
import java.util.Scanner;

public class Main {

	 static Scanner s = new Scanner(System.in);
	  	
	public static void main(String[] args) {

		 int currentNumber = 0;
	        int userCount = 0;

	        Scanner s = new Scanner(System.in);

	        System.out.println("������ �����ϰڽ��ϴ�.");
	        System.out.println();
	        System.out.println("CPU >> 1 2");
	        currentNumber = 2;

	        while(currentNumber < 31) {
	            
	        	System.out.print("�� ���� ���� �θ��ðڽ��ϱ�? >>");
	            while(true) {
	                userCount = s.nextInt();
	                if (userCount<=3&&userCount>=1) {
	                    System.out.println();
	                    break;
	                }
	                else {
	                    System.out.println();
	                    System.out.print("�ٽ� �Է��Ͻʽÿ�>>");
	                }
	            }

	            System.out.print("User >> ");
	            for(int n = 0; n < userCount; n++) {
	                ++currentNumber;
	                System.out.print(currentNumber + " ");
	            }
	            System.out.println();

	            System.out.print("CPU >> ");
	            for(int i = 0; i < (4-userCount); i++) {
	                ++currentNumber;
	                if(currentNumber < 31)
	                    System.out.print(currentNumber + " ");
	            }
	            System.out.println();

	            userCount = 0;

	        }
	        s.close();
		
	}
}
