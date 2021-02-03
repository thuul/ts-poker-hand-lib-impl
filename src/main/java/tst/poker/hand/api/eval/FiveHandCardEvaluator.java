/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.eval;

import tst.poker.hand.api.abs.ICardEvaluator;
import static com.google.common.base.Preconditions.checkArgument;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Ordering;
import static com.google.common.collect.Ordering.from;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import com.google.common.collect.Multiset.Entry;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import tst.poker.hand.api.abs.ICardRank;
import tst.poker.hand.api.abs.ICardSuit;
import tst.poker.hand.api.abs.IDeckableCard;

/**
 *
 * @author walles
 */
public class FiveHandCardEvaluator implements ICardEvaluator {

    private static final Ordering<Entry<ICardRank>> byCountThenRank;

    static {
        Comparator<Entry<ICardRank>> byCount = comparingInt(Entry::getCount);
        Comparator<Entry<ICardRank>> byRank = comparing(Entry::getElement);
        byCountThenRank = from(byCount.thenComparing(byRank));
    }

    @Override
    public CardStrength evaluate(Set<IDeckableCard> cards) {

        CardStrength strength;
        LinkedList<ICardRank> cardRanks = new LinkedList<>();

        checkArgument(cards.size() == 5);
        Set<ICardSuit> suits = new HashSet<>();
        Multiset<ICardRank> ranks = HashMultiset.create();
        cards.stream().map(card -> {
            suits.add(card.getSuit());
            return card;
        }).forEachOrdered(card -> {
            ranks.add(card.getRank());
        });
        Set<Entry<ICardRank>> entries = ranks.entrySet();
        byCountThenRank.immutableSortedCopy(entries).forEach(entry -> {
            cardRanks.addFirst(entry.getElement());
        });
        ICardRank first = cardRanks.getFirst();
        int distinctCount = cardRanks.size();
        switch (distinctCount) {
            case 5:
                boolean flush = suits.size() == 1;
                if (cardRanks.indexOf(cardRanks.getFirst()) - cardRanks.indexOf(cardRanks.getLast()) == 4) {
                    strength = flush ? CardStrength.STRAIGHT_FLUSH : CardStrength.STRAIGHT;
                } else if (first.getName().equals("A") && cardRanks.get(1).getName().equals("5")) {
                    strength = flush ? CardStrength.STRAIGHT_FLUSH : CardStrength.STRAIGHT;
                    cardRanks.addLast(cardRanks.removeFirst());
                } else {
                    strength = flush ? CardStrength.FLUSH : CardStrength.HIGH_CARD;
                }
                break;
            case 4:
                strength = CardStrength.ONE_PAIR;
                break;
            case 3:
                strength = ranks.count(first) == 2 ? CardStrength.TWO_PAIR : CardStrength.THREE_OF_A_KIND;
                break;
            default:
                strength = ranks.count(first) == 3 ? CardStrength.FULL_HOUSE : CardStrength.FOUR_OF_A_KIND;
                break;
        }
        return strength;
    }

    public enum CardStrength {

        HIGH_CARD("HIGH CARD"),
        ONE_PAIR("ONE PAIR"),
        TWO_PAIR("TWO PAIR"),
        THREE_OF_A_KIND("THREE OF A KIND"),
        STRAIGHT("STRAIGHT"),
        FLUSH("FLUSH"),
        FULL_HOUSE("FULL HOUSE"),
        FOUR_OF_A_KIND("FOUR OF A KIND"),
        STRAIGHT_FLUSH("STRAIGHT FLUSH");

        private final String strength;

        private CardStrength(String strenth) {
            this.strength = strenth;
        }

        public String getStrength() {
            return strength;
        }

    }

}
