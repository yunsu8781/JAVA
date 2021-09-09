package 알람시계;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		int time = m-45;
		
		if (time < 0 ) {
			System.out.println(h-1 + ":" + (60 + time ));
		}else if (time >0) {
			System.out.println(h +":"+ time );
		}
		
	}
}
