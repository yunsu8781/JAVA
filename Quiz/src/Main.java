
import java.util.Scanner;
public class Main { 
	public static void main(String[] args) {
		
		System.out.println("���ϴ� �������� �Է����ּ���");
		Scanner sc=new Scanner(System.in);
		int dan=sc.nextInt();  
		
		for(int i=1; i<=9; i++) 
		{
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		sc.close(); 
		
	}

}
