
package deck;
public class Card {

    private int value;
    private String nameValue = "";
    private int suit;
    private String nameSuit = "";

    /**
     * Constructor to store a card's value based on the parameters.
     * @param faceValue
     * @param suitValue
     */
    public Card(int faceValue, int suitValue) {
        suit = suitValue;
        value = faceValue;

    }

    /**
     * Takes specified card and returns the string version.
     * @return
     */
    public String toString() {
        switch (value) {    // Determines which string is outputted based on face value inputted
            case 1:
                nameValue = "Ace";
                break;
            case 2:
                nameValue = "2";
                break;
            case 3:
                nameValue = "3";
                break;
            case 4:
                nameValue = "4";
                break;
            case 5:
                nameValue = "5";
                break;
            case 6:
                nameValue = "6";
                break;
            case 7:
                nameValue = "7";
                break;
            case 8:
                nameValue = "8";
                break;
            case 9:
                nameValue = "9";
                break;
            case 11:
                nameValue = "Jack";
                break;
            case 12:
                nameValue = "Queen";
                break;
            case 13:
                nameValue = "King";
                break;
            default:
                break;
        }
        switch (suit) {         // Determines which suit to output based on value inputted for suit
            case 1:
                nameSuit = "Clubs";
                break;
            case 2:
                nameSuit = "Diamonds";
                break;
            case 3:
                nameSuit = "Hearts";
                break;
            case 4:
                nameSuit = "Spades";
                break;
        }

        return nameValue + " of " + nameSuit;
    }
}

		



