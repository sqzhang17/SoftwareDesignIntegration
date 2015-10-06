//Overview
// An object of type Deck represents a deck of playing cards.  The deck
// is a regulate poker deck that contains 52 regular cards and that can
// also optionally include two Jokers.
public class Deck {
   private Card[] deck;
   private int cardsUsed;

   //AF:
   //"Card" array refers to the array of Card objects included within this Deck
   //"cardsUsed" refers an integer variable that indicates the number of used cards of this Deck.

   //RI:
   //the length of deck should equal either 52 or 54;
   //cardsUsed should be larger than or equal to 0, and smaller than the length of deck
   
   public Deck() {
    //Overview: This constructor initializes a Deck object with 
    //calling other constructor Deck(boolean includeJokers), the
    // includeJokers parameter is false. This will create a Deck object
    // without Jokers

    //Requires: nil
    //Modifiers: nil
    //Effects: Deck object initialization without Jokers
   }

   public Deck(boolean includeJokers) {
    //Overview: This constructor initializes a Deck object with 
    //the input parameter of includeJokers. This will create a Deck object
    // without or with Jokers based on the input includeJokers

    //Requires: nil
    //Modifiers: nil
    //Effects: Deck object initialization without or with Jokers.
    // each case will include four suits and 13 values for each suit.
   }
   
   public void shuffle() {
    //Overview: This method shuffle the deck into a random order.

    //Requires: nil
    //Modifiers: this.deck
    //Effects: shuffle the deck into a random order.
   }
   
   public int cardsLeft() {
    //Overview: This method return an integer to indicate the cards left from deck
    //Requires: nil
    //Modifiers: nil
    //Effects: return the card left from the deck as an integer
   }

   public Card dealCard() {
    //Overview: This method return the next unused Card object in this Deck.
    //Requires: nil
    //Modifiers: this.cardsUsed
    //Effects: return the first Card object unused left deck.
   }
   
   public boolean hasJokers() {
    //Overview: This method indicate if this Deck contains Jokers card.
    //Requires: nil
    //Modifiers: nil
    //Effects: return a boolean variable as if this Deck contains Joker.
   }

   public boolean repOK(){
    if(cardsUsed<0 || cardsUsed>=deck.length || (deck.length!=52 && deck.length!=54))
      return false;

    return true;
   }
   
} // end class Deck
