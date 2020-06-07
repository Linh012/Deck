class Main {
  public static void main(String[] args) {
    Deck d1 = new Deck();

    System.out.println("Player 1 draws a "+d1.draw().toString());
    System.out.println("Player 2 draws a "+d1.draw().toString());

  }
}
