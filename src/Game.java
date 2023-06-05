public class Game {
    public int a;
    public int b;
    public Card card1;
    public Card[] deck;
    public int count=0;

    public static void main(String[] args){
        Game myGame;
        myGame = new Game();
    }
    public Game(){
        System.out.println("Game constructor");
        deck = new Card[52];
        for(int w=0;w<4;w++) {
            for (int x = 1; x < 14; x++) {
                deck[count] = new Card(w, x);
                count++;
            }

        }
//        deck[0] = new Card(1,1);
//        deck[0].print();
        card1=new Card(1,1);
       // card1.suit = "spades";
        card1.printCard();
        shuffle();
    }
    public void shuffle() {
        Card[] shuffledDeck = new Card[52];
        for(int f = 0; f<shuffledDeck.length;f++){
            int randomCard = (int)(Math.random()*52);
            Card shufflecard = deck[randomCard];
            while(deck[randomCard].isDealt==true){
                shufflecard.printCard();
                randomCard = (int)(Math.random()*52);
                shufflecard = deck[randomCard];
            }
//            deck[randomCard].isDealt==true;
            shufflecard.printCard();
            shuffledDeck[f] = shufflecard;
        }
        deck = shuffledDeck;
    }
}
