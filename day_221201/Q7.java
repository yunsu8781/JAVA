package day_221201;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {

			int[] firstArr = new int[2];
			int[] secondArr = new int[2];
			
			for (int i = 0; i < firstArr.length; i++) {
				int firstLine = scanner.nextInt();
				firstArr[i] = firstLine; 
				if (scanner.hasNextLine()) {
					for (int j = 0; j < secondArr.length; j++) {
						int secondLine = scanner.nextInt();
						secondArr[i] = secondLine; 
						
					}
				}
			}
				int sum;
				for (int i = 0; i < 3; i++) {
					sum = firstArr[i] + secondArr[i];
				}
	 {						
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
