import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
	
		System.out.println("°¡À§(1), ¹ÙÀ§(2), º¸(3) ÀÔ·Â : ");
	
		int com = random.nextInt(2)+1;
		int user = scanner.nextInt();
		

		switch (com) {
		case 1:
			if( user == 1) {
				System.out.println("¹«½ÂºÎ");
			}
			if( user == 2) {
				System.out.println("ÀÌ±è");
			}
			if( user == 3) {
				System.out.println("Áü");
			}
			break;
		
		case 2:
			if( user == 1) {
				System.out.println("Áü");
			}
			if( user == 2) {
				System.out.println("¹«½ÂºÎ");
			}
			if( user == 3) {
				System.out.println("ÀÌ±è");
			}
			
			break;
		
		case 3:	
			if( user == 1) {
				System.out.println("ÀÌ±è");
			}
			if( user == 2) {
				System.out.println("Áü");
			}
			if( user == 3) {
				System.out.println("¹«½ÂºÎ");
			}
			break;

		}
	}

}
