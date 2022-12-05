package example;

import java.util.ArrayList;

public class ArrList {
	public static void main(String[] args) {
		
		try {
			
		String[] arr = new String[2];
		arr[0] = "one";
		arr[1] = "two";
		
		 for(int i=0; i<arr.length; i++){
	            System.out.println(arr[i]);
	        }
		
		 ArrayList<String> al = new ArrayList<String>();
		 al.add("one");
		 al.add("two");
		 al.add("three");
		 
		 for(int i=0; i<al.size(); i++){
	            System.out.println(al.get(i));
	        }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
