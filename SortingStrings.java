import java.io.*;
public class SortingStrings {
    public static void main(String[] args)throws IOException{
    	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in),1);
    	System.out.println("Enter the number of strings to be read");
    	int numOfstrings = Integer.parseInt(stdin.readLine());
    	
    	String[] sLst = new String[numOfstrings]; 
    	for(int i=0;i<numOfstrings;i++) {
    		String userStr = stdin.readLine();
    		sLst[i] = userStr;
    		
    	}
    	
    	// used selection sort algorithm
    	int minIndex;
        for (int j = 0; j < sLst.length - 1; j++) {
        	minIndex = j;
        	String tempvar;
            for (int k = j + 1; k < sLst.length; k++) {
                if (sLst[k].compareTo(sLst[minIndex]) < 0) {
                	minIndex = k;}
            }
            if (minIndex != j)
            {
                tempvar = sLst[j];
                sLst[j]=sLst[minIndex];
                sLst[minIndex] = tempvar;}
                
    }
}
}