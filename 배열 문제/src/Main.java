import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[10];
		boolean a;
		
		
		for (int i = 0; i <10 ; i++) {			
		num[i] = scanner.nextInt();
		}			
						
		System.out.println(num[1]);
		
	}
}

//길이가 10인 배열 array[]를 생성하여 모든 공간에 숫자값을 '직접' 입력해준 뒤 변수
//a를 만들어 배열의 첫번쨰 공간부터 마지막 공간까지의 값을 더하고 빼기를
//반복한 값을 출력하시오