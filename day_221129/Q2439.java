package day_221129;

import java.util.Scanner;

public class Q2439 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		
		for (int i = 0; i < Num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
