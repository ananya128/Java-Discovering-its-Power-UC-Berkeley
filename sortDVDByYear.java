import javax.xml.stream.*;
import java.io.*;
import java.util.*; 

public class sortDVDByYear {


   public void read(String  filepath) 
   {

      String elementName = "release_year";

      Map<String, Integer> map = new HashMap<String, Integer>();

      try 
      {
         FileInputStream fileInputStream = new  FileInputStream(filepath);
         XMLInputFactory factory = XMLInputFactory.newInstance();
         XMLStreamReader xmlStreamReader = 
             factory.createXMLStreamReader(fileInputStream);

         while (xmlStreamReader.hasNext()) 
         {

             xmlStreamReader.next();
             if (xmlStreamReader.getEventType() == XMLStreamReader.START_ELEMENT) 
             {

                  if (xmlStreamReader.getLocalName().equals(elementName) )
                   {

                        xmlStreamReader.next();
                        if (xmlStreamReader.getEventType() == XMLStreamReader.CHARACTERS) 
                            {

                                 String key = xmlStreamReader.getText();
                                 Integer num = map.get(key);
                                 if ( num == null )
                                 {
                                     map.put(key, 1);
                                 }
                                 else
                                 {
                                     map.put(key, num+1);
                                 }

                            }

                   }
              }
           

         } 
          //System.out.println(map);
          System.out.println("<DVD>");
          System.out.println("<summary>");

          Iterator it = map.keySet().iterator();
          while (it.hasNext()) 
          {
             Object key =it.next();
             System.out.println("<count decade = \"" + key + "\">" + map.get(key) + "</count>");
           }

          System.out.println("</summary>");
          System.out.println("</DVD>");

      xmlStreamReader.close();
      } catch  (XMLStreamException e) {
       e.printStackTrace(); 
      } catch  (FileNotFoundException e) {
       e.printStackTrace(); 
      }
   }





 public static void  main(String[] args) 
 {

   //dvd.dtd
   XMLStreamWriter xw =  null; 
   XMLOutputFactory xof = XMLOutputFactory.newInstance(); 
   try 
   {
      xw =  xof.createXMLStreamWriter(new FileWriter("/Users/ananyayadav/Downloads/dvd.xml"));
      xw.writeStartDocument("1.0");
      xw.writeDTD("<!DOCTYPE  DVDS SYSTEM \"dvd.dtd\">");
      xw.writeStartElement("DVDS");

      //DVD1
      xw.writeStartElement("DVD");
      xw.writeAttribute("id",  "4");
 
      xw.writeStartElement("title");
      xw.writeCharacters("Star  Wars: Attack of the Clones");
      xw.writeEndElement();
 
      String []  performers_dvd1 =
      {
          "Ewan  McGregor",
          "Natalie  Portman", 
          "Hayden  Christensen"
      };
      xw.writeStartElement("performers");
      for (String  performer : performers_dvd1) 
      {
          xw.writeStartElement("performer");
          xw.writeCharacters(performer);
          xw.writeEndElement();
      }

      xw.writeEndElement(); 
      xw.writeStartElement("discs");
      xw.writeCharacters("2");
      xw.writeEndElement();

      xw.writeStartElement("price");
      xw.writeCharacters("14.99");
      xw.writeEndElement(); 

      xw.writeStartElement("release_year");
      xw.writeCharacters("2002");
      xw.writeEndElement(); 

      xw.writeEndElement();  // close the DVD tag

      //DVD2
      xw.writeStartElement("DVD");
      xw.writeAttribute("id",  "7");
 
      xw.writeStartElement("title");
      xw.writeCharacters("Forrest Gump");
      xw.writeEndElement();
 
      String []  performers_dvd2 = 
      {
          "Tom Hanks",
          "Robin Wright"
      };
      xw.writeStartElement("performers");
      for (String  performer : performers_dvd2)
      {
          xw.writeStartElement("performer");
          xw.writeCharacters(performer);
          xw.writeEndElement();
      }
      
      xw.writeEndElement(); 
      xw.writeStartElement("discs");
      xw.writeCharacters("3");
      xw.writeEndElement();

      xw.writeStartElement("price");
      xw.writeCharacters("8.99");
      xw.writeEndElement(); 

      xw.writeStartElement("release_year");
      xw.writeCharacters("1994");
      xw.writeEndElement(); 

      xw.writeEndElement();  // close the DVD tag

      //DVD3
      xw.writeStartElement("DVD");
      xw.writeAttribute("id",  "9");
 
      xw.writeStartElement("title");
      xw.writeCharacters("The Lord of the Rings: The Two Towers");
      xw.writeEndElement();
 
      String []  performers_dvd3 = 
      {
          "Elijah Jordan Wood",
          "Viggo Mortensen",
          "Ian McKellen",
          "Cate Blanchett"
      };
      xw.writeStartElement("performers");
      for (String  performer : performers_dvd3) 
      {
          xw.writeStartElement("performer");
          xw.writeCharacters(performer);
          xw.writeEndElement();
      }
      
      xw.writeEndElement(); 
      xw.writeStartElement("discs");
      xw.writeCharacters("8");
      xw.writeEndElement();

      xw.writeStartElement("price");
      xw.writeCharacters("16.99");
      xw.writeEndElement(); 

      xw.writeStartElement("release_year");
      xw.writeCharacters("2002");
      xw.writeEndElement(); 

      xw.writeEndElement();  // close the DVD tag

      xw.writeEndElement();  // close the DVDS tag
      xw.writeEndDocument();
      xw.flush();
      xw.close(); 
    } catch  (XMLStreamException e) {
      e.printStackTrace();
    } catch (IOException e)  {
      e.printStackTrace();
    }


    //main method
    sortDVDByYear dvdReader =  new sortDVDByYear();
    dvdReader.read("dvd.xml");




 }
}