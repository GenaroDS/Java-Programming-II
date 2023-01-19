
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author -G
 */
public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card hand1, Card hand) {
        int suitValueOrder =  hand1.getSuit().ordinal() - hand.getSuit().ordinal();

        if (suitValueOrder == 0) {
            return hand1.compareTo(hand);
        }
        
        return suitValueOrder;
    }

}
