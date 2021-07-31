import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int user1 = 0;
		
		do {	
		
	Scanner scanner2	= new Scanner(System.in);
	Random random = new Random();
	
	System.out.println("가위(1), 바위(2), 보(3) 입력 : ");
	
	int com = random.nextInt(2)+1;
	int user = scanner2.nextInt();
	
		
	switch (com) {
	case 1:
		switch(user)
		{
		case 1:
			System.out.println("컴퓨터 : 가위,  사용자 : 가위");
			System.out.println("비겼습니다.");
			break;
		case 2:
			System.out.println("컴퓨터 : 가위,  사용자 : 바위");
			System.out.println("사용자 Win!!");
			break;
		case 3:
			System.out.println("컴퓨터 : 가위,  사용자 : 보");
			System.out.println("컴퓨터 Win!!");
			break;
		}
		break;
    case 2:
    	switch(user)
		{
		case 1:
			System.out.println("컴퓨터 : 바위,  사용자 : 가위");
			System.out.println("컴퓨터 Win!!");
			break;
		case 2:
			System.out.println("컴퓨터 : 바위,  사용자 : 바위");
			System.out.println("비겼습니다.");
			break;
		case 3:
			System.out.println("컴퓨터 : 바위,  사용자 : 보");
			System.out.println("사용자 Win!!");
			break;
		}
		break;	
    case 3:
    	switch(user)
		{
		case 1:
			System.out.println("컴퓨터 : 보,  사용자 : 가위");
			System.out.println("사용자 Win!!");
			break;
		case 2:
			System.out.println("컴퓨터 : 보,  사용자 : 바위");
			System.out.println("컴퓨터 Win!!");
			break;
		case 3:
			System.out.println("컴퓨터 : 보,  사용자 : 보");
			System.out.println("비겼습니다.");
			break;
		}
		break;	
	default:
		System.out.println("잘못된 숫자를 입력하였습니다.");
		break;
	}
	System.out.println("계속 하시겠습니까? 계속하시려면 0을 눌러주세요.");
	
	user = scanner2.nextInt();
	}while (user1 == 0);

		}
}
	
