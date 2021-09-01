import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	

	    int a = 1, z = 5;
	    int i=1;
	    for(i=1;i<=5;i++){
	     for(int j=1;j<=5;j++){
	       if(a==j || z==j){
	        System.out.print("*");
	       }else{
	        System.out.print(" ");
	       }
	     }
	     
	     a++;
	     z--;
	     System.out.println();
	
	
}
}
}