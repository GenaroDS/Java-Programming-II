
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author -G
 */
public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.stream()
                .forEach(value -> System.out.println(value));
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    @Override
    public int compareTo(Hand o) {
        int thisValue = this.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (previousSum, value) -> previousSum + value);
        int otherValue = o.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (previousSum, value) -> previousSum + value);

        return thisValue - otherValue;

    }

    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}
