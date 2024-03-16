package BlackJack.OOD.Java;

import java.util.ArrayList;
import java.util.List;

public class Creation {
    //consts for creating a new deck
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final int[] VALUES = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
    private static final char[] SYMBOLS = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};


    //assigns suit, values, and symbols to card and adds the new card to the deck
    public static List<Card> generateDeck(int numDecks) {
        List<Card> deck = new ArrayList<>();
        for (int i = 0; i < numDecks; i++) {
            for (String suit : SUITS) {
                for (int j = 0; j < VALUES.length; j++) {
                    deck.add(new Card(suit, VALUES[j], SYMBOLS[j])); //adding new card to deck
                }
            }
        }
        return deck;
    }


    //Prints all cards in deck
    public static void printDeck(List<Card> deck) {
        if(deck != null){
            for (Card card : deck) {
                System.out.println(card);
            }
        }
        else{
            System.out.println("*Deck object does not exist");
        }
    }


}


class Card {
    private String suit;
    private int value;
    private char symbol;


    public Card(String suit, int value, char symbol) {
        this.suit = suit;
        this.value = value;
        this.symbol = symbol;
    }


    public String getSuit() {return suit;}
    public int getValue() {return value;}
    public char getSymbol() {return symbol;}

    @Override
    public String toString() {
            return "[" + symbol + "] of " + suit;
    }
}
