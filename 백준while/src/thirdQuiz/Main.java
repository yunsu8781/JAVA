package thirdQuiz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int c = 0;
		
		if (N < 10) {
			while (N!=N) {
				N = N*10;
				N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
	            c++;		
			}
		} else {
	    	while (N!=N) {
		    	N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
                c++;		
		}	
		}
		System.out.println(c);
	}

}
