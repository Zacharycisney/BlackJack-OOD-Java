package BlackJack.OOD.Java;

import java.util.List;
import java.util.Scanner;

public class Run {


        public static void main(String[] args) {

//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter the number of decks: ");
//            int numDecks = scanner.nextInt(); //user input


            int numDecks = 1;
            List<Card> deck = Creation.generateDeck(numDecks);
            Creation.printDeck(deck);






        }


}
