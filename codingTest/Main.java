package codingTest;

public class Main {
	public static void main(String[] args) {

		Solution solution = new Solution();
		String[] score = {"ABCD", "AABC","ABFF", "BDEF"};
		
		int result = solution.solution(score);
		System.out.println("합격자 수 : "+result);
	
	}
}
