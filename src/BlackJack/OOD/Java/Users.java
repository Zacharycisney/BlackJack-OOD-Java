package BlackJack.OOD.Java;

import java.util.List;

public class Users {

    static int dealerTotal = 14;
    public static int playerTotal = 11;

    public static float oneFlipOdds(List<Card> deck, int handTotal){
        return Stats.odds(deck, Stats.cardsBetween(deck, (17 - handTotal), (21 - handTotal)));
    }






}
