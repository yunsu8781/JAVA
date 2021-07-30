
public class Main {

	public static void main(String[] args) {
		
		String trafficLight = "검정불";
	    switch (trafficLight) {
		case "빨간불":
			System.out.println("정차하세요");
			break;
			
		case "파란불":
			System.out.println("출발하세요");	
			break;
			
		case "노란불":
			System.out.println("멈추세요");
			break;

		default:
			System.out.println("신호등이 고잡났어요. 경찰에 신고하세요.");
		    break;
		}
	}
}
