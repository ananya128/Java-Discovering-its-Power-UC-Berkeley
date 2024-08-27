import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.*;
import javax.swing.table.*;

class BookRecUI extends JFrame

{

private JPanel topPanel;
private JTable table;
public JScrollPane scrollPane;
public JScrollPane scrollPane1;
public JScrollPane scrollPane0;
private String[] columnNames=new String[3];
private String[][] dataValues=new String[5][3];
private JComboBox combobox;
static JLabel l;
public String selectedText;

JButton button=new JButton("Search Books");

public BookRecUI()

{

setTitle("Book Recommendation Application");
setSize(500,500);
setDefaultCloseOperation (EXIT_ON_CLOSE);
button.setBounds(40,80,200,200);
//options for the user to choose from
combobox = new JComboBox(new Object[]{"","Art","Biography","Business","Classics","Crime","Fiction","Humour","Mystery","Paranormal","Poetry", "Romance","Science fiction",
		"Sports","Travel","Young Adult"});
columnNames=new String[] {"Book Name", "Author Name","Genre"};
l = new JLabel("Select Genre of choice ");
Font font = new Font("Courier", Font.BOLD,12);
l.setFont(font);



topPanel=new JPanel();

getContentPane().add(topPanel);
table=new JTable();
scrollPane=new JScrollPane(table);
scrollPane.setSize(300,200);
scrollPane.setAlignmentX(CENTER_ALIGNMENT);
scrollPane.setAlignmentY(CENTER_ALIGNMENT);
scrollPane0=new JScrollPane(combobox);
scrollPane1=new JScrollPane(button);
scrollPane1.setSize(90,30);
scrollPane1.setBounds(75,200,150,30);
topPanel.add(l);
topPanel.add(scrollPane); 
topPanel.add(scrollPane0);
topPanel.add(scrollPane1);

combobox.addActionListener(new ActionListener() {  
	//called when user selects a genre from the combobox
    public void actionPerformed(ActionEvent e) { 
    	selectedText = (String) combobox.getSelectedItem();
    	System.out.println("the selected one is "+ selectedText);
}  
});


button.addActionListener(

           new ActionListener()
            {
        	   @Override
             public void actionPerformed(ActionEvent event)
               {
        		 //called when user clicks on the search button
                  System.out.println("inside action listener "+ selectedText);
                  //HashMap<String, List<String>> BooksFinalmap = new HashMap<>();
                  Map<String,List<String>> BooksFinalmap = new HashMap<String, List<String>>();
                  BooksFinalmap = BooksDB.books(selectedText);
                  //iterates over the hashmap to put the author and book elements in the table
                  for(Map.Entry<String,List<String>> mapElement : BooksFinalmap.entrySet()) {
                	  
                  for(int i = 0; i < 5; i++){
                      for(int j = 0; j < 2; j++){
                    	  if(mapElement.getKey() == "Books") {
                      	dataValues[i][0] = mapElement.getValue().get(i);}
                    	  else if(mapElement.getKey() == "Authors") {
                    		  dataValues[i][1] = mapElement.getValue().get(i);
                    	  }
                      	dataValues[i][2] = selectedText;
                      	//dataValues[i][1] = selectedText;
                          //newArray[i][j] = "Mystery";
                      }
                  }
               }
                  TableModel  model=new myTableModel();
                  table.setModel(model);
                 }
              });

}

public class myTableModel extends DefaultTableModel
{
    myTableModel()
    {
       super(dataValues,columnNames);
      }

public boolean isCellEditable(int row,int cols)
{
    return true;
}
}


public static void main(String args[])

  {

	BookRecUI x=new BookRecUI();

  x.setVisible(true);

  }  

}





        
	

