import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BooksDB {
	
	String genreName;
	
	
	Map<String,List<String>> theBookMap = new HashMap<String, List<String>>();
	Map<String,List<String>> theAuthormap = new HashMap<String, List<String>>();
	
	public void setBookMap(String name,String ...v) {
		//sets up a hashmap with the Book name and genre
		List<String> BookLst = new ArrayList<String>();
		for(String i:v) {
			BookLst.add(i);
		}
		theBookMap.put(name, BookLst);
		
		
	}
	
	public void setAuthorMap(String name,String ...c) {
		//sets up a hashmap with the author name and genre
		List<String> authorLst = new ArrayList<String>();
		for(String j:c) {
			authorLst.add(j);
		}
		theAuthormap.put(name, authorLst);
		
		
	}
	
	public static Map<String,List<String>> books(String keyword){
     ArrayList<BooksDB> allList = new ArrayList<BooksDB>();
     HashMap<String, List<String>> Finalmap = new HashMap<>();
     
     //Database for the books
		BooksDB b1 = new BooksDB();
		b1.genreName = "Romance";
		b1.setBookMap(b1.genreName,"The Way I Hate Him","Hide Away Heart","The Five-Star Weekend","Reminders of Him","Beach Read");
		b1.setAuthorMap(b1.genreName,"Meghan Quinn","Melanie Harlow","Elin Hilderbrand","Colleen Hoover","Emily Henry");
		
		allList.add(b1);
		
		BooksDB b2 = new BooksDB();
		b2.genreName = "Mystery";
		b2.setBookMap(b2.genreName,"Murder on the Orient Express","Gone Girl","One of Us Is Lying","A Good Girl's Guide to Murder","The Silent Patient");
		b2.setAuthorMap(b2.genreName,"Agatha Christie","Gillian Flynn","Karen M. McManus","Holly Jackson","Alex Michaelides");
		
		
		allList.add(b2);
		
		BooksDB b3 = new BooksDB();
		b3.genreName = "Art";
		b3.setBookMap(b3.genreName,"Steal Like an Artist","The Letters of Vincent van Gogh","Wall and Piece","Seven Days in the Art World","On Photography");
		b3.setAuthorMap(b3.genreName,"Austin Kleon","Vincent van Gogh","Banksy","Sarah Thornton","Susan Sontag");
		
		
		allList.add(b3);
		
		BooksDB b4 = new BooksDB();
		b4.genreName = "Biography";
		b4.setBookMap(b4.genreName,"The Diary of a Young Girl","Becoming","I Am Malala","The Autobiography of Malcolm X","Educated");
		b4.setAuthorMap(b4.genreName,"Anne Frank","Michelle Obama","Malala Yousafzai","Malcolm X","Tara Westover");
		
		
		allList.add(b4);
		
		BooksDB b5 = new BooksDB();
		b5.genreName = "Business";
		b5.setBookMap(b5.genreName,"Shoe Dog: A Memoir by the Creator of Nike","The Lean Startup","Rich Dad, Poor Dad","Rework","Outliers: The Story of Success");
		b5.setAuthorMap(b5.genreName,"Phil Knight","Eric Ries","Robert T. Kiyosaki","Jason Fried","Malcolm Gladwell");
		
		
		allList.add(b5);
		
		BooksDB b6 = new BooksDB();
		b6.genreName = "Classics";
		b6.setBookMap(b6.genreName,"The Great Gatsby","Wuthering Heights","Little Women","Emma","Frankenstein: The 1818 Text");
		b6.setAuthorMap(b6.genreName,"F. Scott Fitzgerald","Emily Brontë","Louisa May Alcott"," Jane Austen","Mary Wollstonecraft Shelley");
		
		
		allList.add(b6);
		
		BooksDB b7 = new BooksDB();
		b7.genreName = "Crime";
		b7.setBookMap(b7.genreName,"The Girl with the Dragon Tattoo","A Study in Scarlet","The Godfather","The Cuckoo's Calling","The Girl on the Train");
		b7.setAuthorMap(b7.genreName,"Stieg Larsson","Arthur Conan Doyle","Mario Puzo"," Robert Galbraith","Paula Hawkins");
		
		
		allList.add(b7);
		
		BooksDB b8 = new BooksDB();
		b8.genreName = "Fiction";
		b8.setBookMap(b8.genreName,"The Hunger Games","The Da Vinci Code","The Great Gatsby","To Kill a Mockingbird","The Handmaid’s Tale");
		b8.setAuthorMap(b8.genreName,"Suzanne Collins","Dan Brown","F. Scott Fitzgerald","Harper Lee","Margaret Atwood");
		
		
		allList.add(b8);
		
		BooksDB b9 = new BooksDB();
		b9.genreName = "Humour";
		b9.setBookMap(b9.genreName,"Is Everyone Hanging Out Without Me?","Furiously Happy: A Funny Book About Horrible Things","Yes Please",""
				+ "Me Talk Pretty One Day","Bossypants");
		b9.setAuthorMap(b9.genreName,"Mindy Kaling","Jenny Lawson","Amy Poehler","David Sedaris","Tina Fey");
		
		
		allList.add(b9);
		
		BooksDB b10 = new BooksDB();
		b10.genreName = "Paranormal";
		b10.setBookMap(b10.genreName,"Twilight","City of Bones (The Mortal Instruments, #1)","The Very Secret Society of Irregular Witches",
				"The Dead Romantics","The House Across the Lake");
		b10.setAuthorMap(b10.genreName,"Stephenie Meyer","Cassandra Clare","Sangu Mandanna","Ashley Poston","Riley Sager");
		
		
		allList.add(b10);
		
		BooksDB b11 = new BooksDB();
		b11.genreName = "Poetry";
		b11.setBookMap(b11.genreName,"the sun and her flowers","The Complete Poems of Emily Dickinson","Ariel","Where the Sidewalk Ends","Leaves of Grass");
		b11.setAuthorMap(b11.genreName,"Rupi Kaur","Emily Dickinson","Sylvia Plath","Shel Silverstein","Walt Whitman");
		
		
		allList.add(b11);
		
		BooksDB b12 = new BooksDB();
		b12.genreName = "Science fiction";
		b12.setBookMap(b12.genreName,"Dune","Ready Player One","Ender’s Game","The Martian","Foundation");
		b12.setAuthorMap(b12.genreName,"Frank Herbert","Ernest Cline","Orson Scott Card","Andy Weir","Isaac Asimov");
		
		
		allList.add(b12);
		
		BooksDB b13 = new BooksDB();
		b13.genreName = "Sports";
		b13.setBookMap(b13.genreName,"The Blind Side","Friday Night Lights","Icebreaker","The Score","Plays Well With Others");
		b13.setAuthorMap(b13.genreName,"Michael Lewis","H.G. Bissinger","Hannah Grace","Elle Kennedy","Lauren Blakely");
		
		
		allList.add(b13);
		
		BooksDB b14 = new BooksDB();
		b14.genreName = "Travel";
		b14.setBookMap(b14.genreName,"Eat, Pray, Love","Under the Tuscan Sun: At Home in Italy","Notes from a Small Island","Into the Wild","A Year in Provence");
		b14.setAuthorMap(b14.genreName,"Elizabeth Gilbert","Frances Mayes","Bill Bryson","Jon Krakauer","Peter Mayle");
		
		
		allList.add(b14);
		
		BooksDB b15 = new BooksDB();
		b15.genreName = "Young Adult";
		b15.setBookMap(b15.genreName,"The Fault in Our Stars","Divergent","Harry Potter Series","The Grace Year","One of Us Is Lying");
		b15.setAuthorMap(b15.genreName,"John Green","Veronica Roth","J.K Rowling","Kim Liggett","Karen M. McManus");
		
		
		allList.add(b15);
		
		//returns the books and author names in a map according to the genre chosen by the user
		for(BooksDB bb: allList) {
			for(Map.Entry<String,List<String>> mapElement : bb.theBookMap.entrySet()) {
				
				if(mapElement.getKey() == keyword) {
				//'String key = mapElement.getKey();
				System.out.println("the values are "+ mapElement.getValue());
				Finalmap.put("Books", mapElement.getValue());
				
							
				}
				
				
			}
			
			for(Map.Entry<String,List<String>> auth : bb.theAuthormap.entrySet()) {
				if(auth.getKey() == keyword) {
					Finalmap.put("Authors", auth.getValue());
				}
				}
			}
		
		return Finalmap;
	}
	
	
	

}
