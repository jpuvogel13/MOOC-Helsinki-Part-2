import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;

    public Hand(){
        this.hand= new ArrayList<Card>();
    }
    public void add(Card card){
        hand.add(card);
    }

    public void print(){
        for(Card card : this.hand) {
            int suit = card.getSuit();
            int cardValue = card.getValue();
            if (cardValue <= 9) {
                if (suit == 0) {
                    System.out.println(cardValue + " of Spades");
                } else if (suit == 1) {
                    System.out.println(cardValue + " of Diamonds");
                } else if (suit == 2) {
                    System.out.println(cardValue + " of Hearts");
                } else {
                    System.out.println(cardValue + " of Clubs");
                }
            }
            if(cardValue>9){
                if (suit == 0) {
                    System.out.println(createFaceCard(cardValue) + " of Spades");
                } else if (suit == 1) {
                    System.out.println(createFaceCard(cardValue) + " of Diamonds");
                } else if (suit == 2) {
                    System.out.println(createFaceCard(cardValue) + " of Hearts");
                } else {
                    System.out.println(createFaceCard(cardValue) + " of Clubs");
                }
            }
        }
         }
         public String createFaceCard(int cardValue){
            if(cardValue==11){
                return "J";
            }else if(cardValue==12){
                return "Q";
            }else if(cardValue==13){
                return "K";
            }else {
                return "A";
            }
         }
         public void sort(){
             Collections.sort(hand);
         }
         public int compareTo(Hand hand){
            int hand1=0;
            int hand2=0;
            for(Card card1: this.hand){
                int cardValue=card1.getValue();
                hand1+=cardValue;
            }
            for(Card card2: hand.hand){
                int cardValue2=card2.getValue();
                hand2+=cardValue2;
            }
        return hand1-hand2;
         }
         public void sortAgainstSuit(){
        Collections.sort(hand,new SortAgainstSuitAndValue());
         }

    }

