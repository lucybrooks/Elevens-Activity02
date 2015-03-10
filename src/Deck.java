import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

 /**
  * cards contains all the cards in the deck.
  */
 private List<Card> cards;

 /**
  * size is the number of not-yet-dealt cards.
  * Cards are dealt from the top (highest index) down.
  * The next card to be dealt is at size - 1.
  */
 private int size;


 /**
  * Creates a new <code>Deck</code> instance.<BR>
  * It pairs each element of ranks with each element of suits,
  * and produces one of the corresponding card.
  * @param ranks is an array containing all of the card ranks.
  * @param suits is an array containing all of the card suits.
  * @param values is an array containing all of the card point values.
  */
 public Deck(String[] ranks, String[] suits, int[] values) 
 {
   ranks= {"K","Q","J","10","9","8","7","6","5","4","3","2","A"};
   suits= {"Hearts","Spades","Diamonds","Clubs"};
   values= {13,12,11,10,9,8,7,6,5,4,3,2,1};
 }


 /**
  * Determines if this deck is empty (no undealt cards).
  * @return true if this deck is empty, false otherwise.
  */
 public boolean isEmpty() 
 {
  boolean result=false;
  if(cards.size()=0)
  {
    result=true;
  }
  return result;
 }

 /**
  * Accesses the number of undealt cards in this deck.
  * @return the number of undealt cards in this deck.
  */
 public int size() 
 {
  return size;
 }

 /**
  * Randomly permute the given collection of cards
  * and reset the size to represent the entire deck.
  */
 public void shuffle() {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
 }

 /**
  * Deals a card from this deck.
  * @return the card just dealt, or null if all the cards have been
  *         previously dealt.
  */
 public Card deal() 
 {
   if(size!=0)
   {
     return null;
   }
   else
   {
     return cards.remove(0);
   }
 }
