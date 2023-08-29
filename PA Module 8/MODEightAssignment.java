import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
//import java.io.FileReader;

public class MODEightAssignment {
	
	 public static void main(String[] args) throws IOException
	    {
	       
	        int n = -2;
	        //BufferedReader br = null;
	        String strLine = "";
	        String fileName = "/Users/ananyayadav/Desktop/sample3.txt";
	        
	        int totalNo = getTotalLines(fileName);
	        System.out.println("There are "+ totalNo + " lines in the text!");

	        try 
	        {
	            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
	  
	             // When n > 0, display the first n lines
	            if (n > 0)
	            {
	                while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= n)
	                {
	                    System.out.println(strLine);
	                }
	                
	            }


	             // When n < 0, display the last n lines
	            else if (n < 0)
	            {
	                while (((strLine = reader.readLine()) != null) && reader.getLineNumber() < totalNo+n )
	                {
	                    //do nothing
	                }

	                while (((strLine = reader.readLine()) != null) && reader.getLineNumber() >= totalNo+n )
	                {
	                    System.out.println(strLine);
	                }

	 
	            }


	             // When n = 0, display all lines
	            else
	            {
	                while ((strLine = reader.readLine()) != null)
	                {
	                    System.out.println(strLine);
	                }

	            }



	           reader.close();

	        } catch (FileNotFoundException e) {
	            System.err.println("File not found");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file.");
	        }
	     }



	    //Get line number of the text file
	      public static int getTotalLines(String fileName) throws IOException 
	      {

	         BufferedReader in = 
	             new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
	         LineNumberReader reader = new LineNumberReader(in);
	         String s = reader.readLine();
	         int lines = 0;
	         while (s != null) 
	         {
	             lines++;
	             s = reader.readLine();
	         }
	         reader.close();
	         in.close();
	         return lines;
	         
	      }
	


	   


}
