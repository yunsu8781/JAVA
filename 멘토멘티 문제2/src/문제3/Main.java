package 문제3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요=>");
		int score = scanner.nextInt();
		
		if (score >= 90) {
			System.err.println("A");
		}else if(score >= 70) {
			System.err.println("B");
		}else if(score >= 50) {
			System.err.println("C");
	    }else if(score >= 20) {
	    	System.err.println("D");	
        }else if(score <= 19 ) {
        	System.err.println("F");	
        }
			
		}
	}


