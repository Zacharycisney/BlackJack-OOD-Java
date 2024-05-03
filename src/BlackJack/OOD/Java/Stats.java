package BlackJack.OOD.Java;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Stats {


    public static int cardsBetween(List<Card> deck, int lesserBound, int greaterBound) {
            int cardsBetween = 0;

            for (Card card : deck) {
                if(card.getValue() >= lesserBound && card.getValue() <= greaterBound) {
                        ++cardsBetween;

                }

                if(card.getValue() == 11 && 1 >= lesserBound && 1 <= greaterBound) {
                    ++cardsBetween;
                } //takes into account Aces doubling as 1
            }


            return cardsBetween;
    }


    public static float odds(List<Card>deck, float cardNeeded){
        return cardNeeded / deck.size();
    }

    public static float oneFlipOdds(List<Card> deck, int handTotal){
        return Stats.odds(deck, Stats.cardsBetween(deck, (17 - handTotal), (21 - handTotal))) ;
    }
    public static void printOneFlipOdds(List<Card> deck){
        System.out.println( "\n Next Flip Creating [17-21]" +
                            "\n Dealer: " + (oneFlipOdds(deck, Users.dealerTotal) * 100) + "%" +
                            "\n Player: " + (oneFlipOdds(deck, Users.playerTotal) * 100) + "%");
    }

    public static float bustOdds(List<Card> deck, int handTotal){

        int bustCards = 0;

        for (Card card : deck) {
            if((card.getValue() + handTotal) > 21) {
                ++bustCards;
            }

            if(card.getValue() == 11 &&  (handTotal + 1) > 21) {
                ++bustCards;
            } //takes into account Aces doubling as 1
        }

        return Stats.odds(deck, bustCards) ;
    }

    public static void printBustOdds(List<Card> deck){
        System.out.println( "\n Odds of Busting [+21]" +
                            "\n Dealer: " + (bustOdds(deck, Users.dealerTotal) * 100) + "%" +
                            "\n Player: " + (bustOdds(deck, Users.playerTotal) * 100) + "%");
    }


    // THIS IS POORLY WRITTEN //
    public static void runTheNumbers(List<Card> deck) {
        Scanner scanner = new Scanner(System.in);


        boolean running = true;
        while (running) {
            System.out.print("\nDealer Total: ");
            Users.dealerTotal = scanner.nextInt();

            if (Users.dealerTotal == 0) {
                break;
            }

            System.out.print("Player Total: ");
            Users.playerTotal = scanner.nextInt();
            System.out.println("");

            if (Users.dealerTotal == 0) {
                break;
            }

            Stats.printOneFlipOdds(deck);
            Stats.printBustOdds(deck);
        }
    }





    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }


    public static BigInteger choose(int numerator, int denominator){

        //Formatting: numerator! / ( denominator! * (numerator - denominator)! )
        return factorial(numerator).divide(factorial(denominator).multiply(factorial(numerator - denominator)));

        //-----     Example: 52! / (2! * 50!) = 1326 [Total combonations of picking two cards]   -----//


        //Formatting: numerator! / ( denominator! )
        //return factorial(numerator).divide(factorial(denominator));

                                    //-----     Example: 52! / 2! = 4.0329088e+67    -----//
    }


















    private int greaterThan10 = 0;
    private int lessThan10 = 0;


    //getters
    public int getLessThan10() {return lessThan10;}
    public int getGreaterThan10() {return greaterThan10;}


    //setters
    public void setGreaterThan10(int greaterThan10) {this.greaterThan10 = greaterThan10;}
    public void setLessThan10(int lessThan10) {this.lessThan10 = lessThan10;}








}
