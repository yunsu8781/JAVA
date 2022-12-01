package day_221128;

import java.util.Scanner;

public class Q10807 {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
	try{
        int Num = sc.nextInt();
        int[] array = new int[Num];

        for(int i = 0; i < Num; i++) {
            array[i] = sc.nextInt();
        }

        int count = 0;
        int v= sc.nextInt();

        for(int i = 0; i < array.length; i++) {
            if (v == array[i]){
                count++;
            }
        }

        System.out.println(count);
	}catch (Exception e){
		e.printStackTrace();
	}
		
	}
}
