import java.io.FileNotFoundException;
import java.io.IOException ;
import java.io.PrintWriter;
import java.io.FileWriter;

public class ExPrintWriter{
		public static void main(String[] args){	
		
		String path = "C:\\Users\\yunsu\\Documents\\cnai\\study\\2022-11-25.log";
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(path));
			pw.println("Hello World");
			
			pw.append('+');
			
			pw.append(" Wow");

			pw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
       	 	pw.close();
		
	}
	
}