// Overview: A "Card" object stores the information of card's suit and card's value 

public class Card {
   private final int suit; 
   private final int value;
   //AF:
   //"suit" refers to suit of the card object;
   //"value" refers to the value of the card object.

   //RI:
   //For a regular card (non-oker),the value must be in the range 1 through 13;
   //The suit variable must be one of the values of SPADES, HEARTS, DIAMONDS, CLUBS, or JOKER.



   public Card() {
    //Overview: This constructor initializes a Card object WITHOUT
    //any parameters, the new Card object has the object variable as
    //the suit=JOKER(4) and value=1 

    //Requires: nil
    //Modifiers: nil
    //Effects: object initialization with suit = JOKER(4) and value =1 
   }
   

   public Card(int theValue, int theSuit) {
    //Overview: This constructor initializes a Card object with
    //TWO parameters, the new Card object has the object variable as
    //the suit=theSuit and value=theValue

    //Requires: 
    // 1. the input theSuit must be choosen from 
    // final static variable for Card object: 
    // SPADES, HEARTS, DIAMONDS, CLUBS, and JOKER.

    // 2. the input theValue must be in the range of larger than 1 and smaller than 13
    // if the theSuit input is not JOKER

    //Modifiers: nil
    //Effects: object initialization with two input parameters theSuit theValue.
   }

   public int getSuit() {
    //Overview: This getter method return the suit of this card as an integer. 

    //Requires: nil
    //Modifiers: nil
    //Effects: return an integer which is the suit of this card.
   }
   
   public int getValue() {
    //Overview: This getter method return the value of this card as an integer. 

    //Requires: nil
    //Modifiers: nil
    //Effects: return an integer which is the value of this card.
   }
   
   public String getSuitAsString() {
    //Overview: This getter method return the suit of this card as an String. 

    //Requires: nil
    //Modifiers: nil
    //Effects: return an String which is the suit of this card.
   }
   
   public String getValueAsString() {
    //Overview: This getter method return the value of this card as an String. 

    //Requires: nil
    //Modifiers: nil
    //Effects: return an String which is the value of this card.
   }

   public String toString() {
    //Overview: This method return string representation of this card,
    //include its suit and its value (except that for a Joker with value 1,
    //the return value is just "Joker"). 

    //Requires: nil
    //Modifiers: nil
    //Effects: return an String representation which combines the value and suit of this card.
   }

   public boolean repOK(){
    if (theSuit != Card.SPADES && theSuit != Card.HEARTS && theSuit != Card.DIAMONDS && 
            theSuit != Card.CLUBS && theSuit != Card.JOKER)
      return false;

    if(theSuit != Card.JOKER && (theValue < 1 || theValue > 13)) 
      return false;

    return true;
   }
   

} // end class Card
