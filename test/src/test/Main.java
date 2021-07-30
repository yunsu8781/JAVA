package test;

public class Main {
	public static void main(String[] args) {
		
	int age = 25;
		
		if (age < 10 && age >= 0) {
			System.out.println("어린이 친구군요. 하하");
		}  else if(age >= 50) {
			System.out.println("취미를 즐기세용"); 
		}  else if(age >= 40) {
			System.out.println("여행가세요 여행");
		}  else if(age >= 30) {
			System.out.println("결혼은 언제하시려구요?. 노력하세요");
		}  else if(age >= 20) {
			System.out.println("성인이시군요. 술마시세요 ㅎㅎ");
		}  else if(age >= 10) {
			System.out.println("청소년이군요. 공부하세여");
		}

	}
}