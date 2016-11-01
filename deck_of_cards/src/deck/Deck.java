package deck;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class for Deck objects that include random playing cards and in a specific order. Creating smaller decks from the
 * two larger (ordered and random) ones are also possible.
 */
public class Deck {

    private ArrayList deck = new ArrayList(); // global variable deck
    private int numberOfCards = deck.size(); // for testing purposes


    /**
     * Default constructor to create a Deck object.
     */
	 public Deck(){

     }


    String[] SUIT = { "Clubs", "Diamonds", "Hearts", "Spades"};  // Array to hold suit strings

    String [] FACE =  {"2", "3", "4", "5", "6", "7", "8", "9","10",
         "Jack", "Queen", "King", "Ace"};       // Array to hold face value strings


    /**
     * Add 52 cards to the deck in order of face value.
     */
    public void addStandardCards() {
        int n = SUIT.length * FACE.length;

        for (int i = 0; i < FACE.length; i++) { // iterate through face values.
            for (int j = 0; j < SUIT.length; j++) { // iterate through suits for each face value.
                deck.add((SUIT.length * i + j), (FACE[i] + " of " + SUIT[j]) ); // saves the card at the correct index
            }

        }
        // for (int k = 0; k < deck.size(); k++) // for testing
        //      System.out.println(deck.get(k));      // for testing
    }

    /**
     * Add 52 cards to the deck in random order.
     */
    public void addStandardCardsRandom() {

        for (int i = 0; i < FACE.length; i++) { // iterate through face values.
            for (int j = 0; j < SUIT.length; j++) { // iterate through suits for each face value.
                deck.add((SUIT.length * i + j), (FACE[i] + " of " + SUIT[j]) ); // saves the card at the correct index
            }

        }
        Collections.shuffle(deck);     // shuffle the deck
    }

    /**
     *  Retrieves the list of cards.
     */
    public ArrayList getCardList() {
            return deck;
    }

    /**
     * Deals last specified number of cards (usually 5).
     * @param lastOfNum
     * @return hand
     */
    public ArrayList deal(int lastOfNum){
        ArrayList hand = new ArrayList(deck.subList(deck.size() - lastOfNum, deck.size()));
        int i;
        for (i = deck.size()-lastOfNum; i < deck.size(); i++)
            deck.remove(i);
        return hand;
    }

    /**
     * Adds cards to the current deck.
     * @param someCards
     */
    public void addCards(ArrayList someCards) {
            deck.add(someCards);
    }

    /**
     * Overrides the toString method to actually be useful.
     * @return
     */
    public String toString() {
        int k;
        for (k = 0; k < deck.size(); k++)
            System.out.println(deck.get(k));
        return "";
    }
}
