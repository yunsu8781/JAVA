package Quiz2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
      Scanner scanner = new Scanner(System.in);
      System.out.println("���ڸ� �Է��ϼ���.");
      int n = scanner.nextInt();
	  
     
      for(int i=1; i<=9; i++)  {
          int ni;
		System.out.println(n + "*" + i + "=" + (n*i));
      }
		

}
}
