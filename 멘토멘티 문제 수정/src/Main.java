import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String AI = null;
		int AItemp = 0;
		String 사용자;
		System.out.println("가위바위보 게임입니다.현실에 가위바위보와 똑같습니다.");
		System.out.println("Ai는 가위 바위 보 중 한 가지를 출력합니다.");
		Random random = new Random();
	    Scanner scanner = new Scanner(System.in);
		System.out.println("사용자 >>");
		사용자 = scanner.next();		
		
		AItemp = random.nextInt(2);
		switch (AItemp) {
		case 0:
			AI = "가위";		
			break;
		case 1:
			AI = "바위";
			break;
		case 2:
			AI = "보";
			break;

		
		}
		if (AI.equals("가위") && 사용자.equals("가위")) {
			System.out.println("AI :"+AI);
			System.out.println("사용자 :"+사용자);
			System.out.println("비겼습니다.");
		}else if (AI.equals("가위")&& 사용자.equals("바위")) {
			System.out.println("AI :"+AI);
			System.out.println("사용자:"+사용자);
			System.out.println("사용자가 이겼습니다.");
		}else if(AI.equals("가위") && 사용자.equals("보")) {
			System.out.println("AI :"+AI);
			System.out.println("사용자:"+사용자);
			System.out.println("AI가 이겼습니다.");
		}else if (AI.equals("바위") && 사용자.equals("가위")) {
			System.out.println("AI :"+AI);
			System.out.println("사용자 :"+사용자);
			System.out.println("AI가 이겼습니다.");
		}else if (AI.equals("바위") && 사용자.equals("바위")) {
			System.out.println("AI :"+AI);
			System.out.println("사용자 :"+사용자);
			System.out.println("비겼습니다.");
		}else if (AI.equals("바위") && 사용자.equals("보")) {
			System.out.println("AI :"+AI);
			System.out.println("사용자 :"+사용자);
			System.out.println("사용자가 이겼습니다.");
		}else if (AI.equals("보") && 사용자.equals("가위")) {
			System.out.println("AI :"+AI);
			System.out.println("사용자 :"+사용자);
			System.out.println("사용자가 이겼습니다.");
		}else if (AI.equals("보") && 사용자.equals("바위")) {
			System.out.println("AI :"+AI);
			System.out.println("사용자 :"+사용자);
			System.out.println("AI가 이겼습니다.");
		}else if (AI.equals("보") && 사용자.equals("보")) {
			System.out.println("AI :"+AI);
			System.out.println("사용자 :"+사용자);
			System.out.println("비겼습니다.");
		}else {
			System.out.println("입력중 잘못된 입력이 있습니다.");
		}

		
	}

}
