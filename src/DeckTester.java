/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) 
 {
   String [] ranks=new String[13];
   String [] suits=new String[4];
   int [] values=new int [13];
  Deck test1=new Deck(ranks, suits, values);
  Deck test2=new Deck(ranks, suits, values);
  Deck test3=new Deck(ranks, suits, values);
  
   test1.deal();
   test2.size();
   test3.toString();
 }
}
