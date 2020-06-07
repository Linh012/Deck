public class Card{
  /*
  *ACE = 1, JACK = 11, QUEEN = 12, KING = 13
  *SPADES = S, HEARTS = H, DIAMONDS = D, CLUBS = C
  */
  private final int number;
  private final char suit;

  public Card(){
    this.number = 0;
    this.suit = 'J';
  }

  public Card(int cnumber, char csuit){
    this.number = cnumber;
    this.suit = csuit;
  }

  public char getSuit(){
    return this.suit;
  }

  public int getNumber(){
    return this.number;
  }

  public String getSuitString(){
    switch ( this.suit ) {
      case 'S': return "Spades";
      case 'H': return "Hearts";
      case 'D': return "Diamonds";
      case 'C': return "Clubs";
      default:  return "Joker";
      }
  }

  public String getNumberString(){
    switch ( this.number ) {
         case 1: return "Ace";
         case 2: return "2";
         case 3: return "3";
         case 4: return "4";
         case 5: return "5";
         case 6: return "6";
         case 7: return "7";
         case 8: return "8";
         case 9: return "9";
         case 10:return "10";
         case 11:return "Jack";
         case 12:return "Queen";
         case 13:return "King";
         default:return "0";
  }
}

  public String toString(){
    return this.getNumberString() + " of " + this.getSuitString();
  }
}
