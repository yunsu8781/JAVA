package 여울컴test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Quiz_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {

			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int num3 = scanner.nextInt();
			int sum = num1 * num2 * num3;
			
			int count0 = 0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9 = 0;
			int[] arrSum = Stream.of(String.valueOf(sum).split("")).mapToInt(Integer::parseInt).toArray();
			for (int i = 0; i < arrSum.length; i++) {
				switch (arrSum[i]) {
				case 0:
					count0 += 1;
					break;
				case 1:
					count1 += 1;
					break;
				case 2:
					count2 += 1;
					break;
				case 3:
					count3 += 1;
					break;
				case 4:
					count4 += 1;
					break;
				case 5:
					count5 += 1;
					break;
				case 6:
					count6 += 1;
					break;
				case 7:
					count7 += 1;
					break;
				case 8:
					count8 += 1;
					break;
				case 9:
					count9 += 1;
					break;

				default:
					break;
				} 
			}
			System.out.println(sum );
			System.out.println("0의 개수 : "+count0);
			System.out.println("1의 개수 : "+count1);
			System.out.println("2의 개수 : "+count2);
			System.out.println("3의 개수 : "+count3);
			System.out.println("4의 개수 : "+count4);
			System.out.println("5의 개수 : "+count5);
			System.out.println("6의 개수 : "+count6);
			System.out.println("7의 개수 : "+count7);
			System.out.println("8의 개수 : "+count8);
			System.out.println("9의 개수 : "+count9);
			
		

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

