import java.io.*;
public class ReverseString {
	public static void main(String[] args)throws IOException{
    	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in),1);
    	System.out.println("Enter the string to be reversed");
    	String str = stdin.readLine();
    	System.out.println("the reversed string is "+ reverse(str));
    	
	}
	
	static String reverse(String s) {
		if((s == null) || s.length()<=1) {
			return s;
		}
		else {
			return reverse(s.substring(1)) + s.charAt(0);
		}
		
	}

}
