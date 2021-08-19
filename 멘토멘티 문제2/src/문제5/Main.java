package 문제5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("사람수를 입력하시오.");
		int human = scanner.nextInt();
		int a = human/2;
		
		if (a > 10) {
			if (human%2 == 1) {
				//홀수
				System.out.println("A그룹 : "+(a+1));				
				System.out.println("B그룹 : "+a);				
			}else if (human%2 == 0) {
				//정수
				System.out.println("A그룹 : "+a);
				System.out.println("B그룹 : "+a);			
			}
		}else if (a <= 10 ) {
			if (a%2 == 1) {
				System.out.println("A그룹 : "+(a+1));
				System.out.println("B그룹 : "+a);
				System.out.println("한 그룹이 10명 이하이므로 그룹이 통합됩니다.");
				System.out.println("C그룹 :"+ human);							
			}else if (a%2 == 0) {
				System.out.println("A그룹 : "+a);
				System.out.println("B그룹 : "+a);
				System.out.println("한 그룹이 10명 이하이므로 그룹이 통합됩니다.");
				System.out.println("C그룹 :"+ human);							
				
			}
		}
		
	}
}
