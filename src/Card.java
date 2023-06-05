public class Card {
    public String suit;
    public int value;
    public String name;
    public boolean isDealt;

    public Card(int pSuit,int pName){ //constructor has no void and same name as class

        if(pSuit == 0){
            suit = "Diamond";
        }
        if(pSuit == 1){
            suit = "Club";
        }
        if(pSuit == 2){
            suit = "Spades";
        }
        if(pSuit == 3){
            suit = "Hearts";
        }
        if(pName ==1){
            name = "ACE";
        }
        if(pName ==2){
            name = "2";
        }
        if(pName ==3){
            name = "3";
        }
        if(pName ==4){
            name = "4";
        }
        if(pName ==5){
            name = "5";
        }
        if(pName ==6){
            name = "6";
        }
        if(pName ==7){
            name = "7";
        }
        if(pName ==8){
            name = "8";
        }
        if(pName ==9){
            name = "9";
        }
        if(pName ==10){
            name = "10";
        }
        if(pName ==11){
            name = "JACK";
        }
        if(pName ==12){
            name = "QUEEN";
        }
        if(pName ==13){
            name = "KING";
        }
        System.out.println("You made the " + name + " of " + suit);
    }
    public void printCard(){
        System.out.println("This is the " + name + " of " + suit + " it is dealt " + isDealt);
    }
}
