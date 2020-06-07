import java.util.*;

public class Deck{
  private Stack<Card> deck;

  public Deck(){
    this.deck = new Stack<Card>();
    char[] suits = {'S','D','H','C'};

    for (int i = 0; i<4; i++){
      char suit = suits[i];
      for (int j = 1; j<=13; j++){
        Card c = new Card(j, suit);
        this.deck.push(c);
      }
    }
  }

  public void shuffle(){
    Random rand = new Random();
    Card[] temp = new Card[this.deck.size()];
    int size = this.deck.size();
    for (int i=0; i<size; i++){
      temp[i]=this.deck.pop();
    }

    while(this.deck.size() != temp.length){
      int rnd = rand.nextInt(temp.length);
      if (temp[rnd] != null){
        this.deck.push(temp[rnd]);
        temp[rnd] = null;
      }
    }
    System.out.println("SHUFFLED!");

  }

  public Card draw(){
    return this.deck.pop();
  }

  public String toString(){
    for (int k = 0; k<this.deck.size(); k++){
      System.out.println(deck.get(k));
    }
    return "Outputted all cards in deck";
  }

}
