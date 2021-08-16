package Quiz1;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("점수를 적어주세요 => ");
	int Score = scanner.nextInt();
	
	if ( Score <= 70 ) {
		System.out.println("해당학셍의 점수 : "+ Score);
		System.err.println("불합격입니다.");
	} else if (Score > 70) {
		System.out.println("해당학생의 점수 : "+ Score);
		System.err.println("합격입니다.");
	}


}
}
