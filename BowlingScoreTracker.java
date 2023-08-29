import java.util.*;

public class BowlingScoreTracker {
	String BowlerName;

	Map<String,List<Integer>> theScoreMap = new HashMap<String, List<Integer>>();
	Map<String,List<String>> theDatemap = new HashMap<String, List<String>>();
	int scoreLstSize=0;
	int dateLstSize=0;
	
	public void setScoreMap(String name,int ...v) {
		List<Integer> scoreLst = new ArrayList<Integer>();
		for(int i:v) {
			scoreLst.add(i);
		}
		scoreLstSize = scoreLst.size();
		theScoreMap.put(name, scoreLst);
		
		
	}
	
	public void setDateMap(String name,String ...c) {
		List<String> dates = new ArrayList<String>();
		for(String j:c) {
			dates.add(j);
		}
		dateLstSize = dates.size();
		theDatemap.put(name, dates);
		
		
	}
	
	public int getSum(List<Integer> ListToSum) {
		int sum = 0; 

	     for (int i : ListToSum)
	         sum = sum + i;

	     return sum;
	}
	
	
	
	public static void main(String args[]) {
		BowlingScoreTracker b1 = new BowlingScoreTracker();
		b1.BowlerName = "Henry";
		b1.setScoreMap(b1.BowlerName,10,20,30,40,50);
		b1.setDateMap(b1.BowlerName,"20/06/2023","21/06/2023","22/06/2023","23/06/2023","24/06/2023");
		
		//Bowler name
		System.out.println("the name of the bowler is " +b1.BowlerName );
		//Number of games
		System.out.println("the number of games played by "+b1.BowlerName+ " is "+ b1.scoreLstSize);
		//Average score
		System.out.println("the average score of " +b1.BowlerName+ " is "+ b1.getSum(b1.theScoreMap.get(b1.BowlerName))/b1.scoreLstSize);
		//Score of last game
		System.out.println("the score of last game of " +b1.BowlerName+ " is "+ b1.theScoreMap.get(b1.BowlerName).get(b1.scoreLstSize-1));
		//Date of Last Game
		System.out.println("the date of last game of " +b1.BowlerName+ " is "+ b1.theDatemap.get(b1.BowlerName).get(b1.dateLstSize-1));
		
		
		BowlingScoreTracker b2 = new BowlingScoreTracker();
		b2.BowlerName = "James";
		b2.setScoreMap(b2.BowlerName,11,24,33,48);
		b2.setDateMap(b2.BowlerName,"20/05/2023","21/05/2023","22/05/2023","23/05/2023");
		
		//Bowler name
		System.out.println("the name of the bowler is " +b2.BowlerName );
		//Number of games
		System.out.println("the number of games played by "+b2.BowlerName+ " is "+ b2.scoreLstSize);
		//Average score
		System.out.println("the average score of " +b2.BowlerName+ " is "+ b2.getSum(b2.theScoreMap.get(b2.BowlerName))/b2.scoreLstSize);
		//Score of last game
		System.out.println("the score of last game of " +b2.BowlerName+ " is "+ b2.theScoreMap.get(b2.BowlerName).get(b2.scoreLstSize-1));
		//Date of Last Game
		System.out.println("the date of last game of " +b2.BowlerName+ " is "+ b2.theDatemap.get(b2.BowlerName).get(b2.dateLstSize-1));
		
	}

}
