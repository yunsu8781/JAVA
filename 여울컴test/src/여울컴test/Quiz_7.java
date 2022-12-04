package ex;

import java.util.Scanner;

public class Quiz_7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 배열 생성
		int[][] firstArr = new int[2][3];
		int[][] secondArr = new int[2][3];
		// 첫번째 배열 값 받아오기
		System.out.println("first Arr");
		for (int i = 0; i < firstArr.length; i++) {
			for (int j = 0; j < firstArr[i].length; j++) {
				firstArr[i][j] = scanner.nextInt();
			}
		}

		// 두번째 값 받아오기
		System.out.println("second Arr");
		for (int i = 0; i < secondArr.length; i++) {
			for (int j = 0; j < secondArr[i].length; j++) {
				secondArr[i][j] = scanner.nextInt();
			}
		}
		
		//곱한 값 배열에 저장하기
		int[][] sumArr = new int[2][3];
		for (int i = 0; i < sumArr.length; i++) {
			for (int j = 0; j < sumArr[i].length; j++) {
				sumArr[i][j] = firstArr[i][j] * secondArr[i][j];
			}
		}
		//곱한 배열값 출력하기
		for (int[] y : sumArr) {
			for (int z : y) {
				System.out.print(z + " ");
			}
			System.out.println();
		}

	}
}
