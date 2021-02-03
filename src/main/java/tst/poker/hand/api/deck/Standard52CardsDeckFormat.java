/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.deck;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.PostConstruct;
import tst.poker.hand.api.abs.AbstractDeckableCardComposite;
import tst.poker.hand.api.abs.ICardRank;
import tst.poker.hand.api.abs.ICardSuit;
import tst.poker.hand.api.annotatn.CommonQualifier;
import tst.poker.hand.api.rank.SimpleCardRankImpl;
import tst.poker.hand.api.suit.Clubs;
import tst.poker.hand.api.suit.Diamonds;
import tst.poker.hand.api.suit.Hearts;
import tst.poker.hand.api.suit.Spades;

/**
 *
 * @author walles
 */
@CommonQualifier("Standard52CardsDeckFormat")
public class Standard52CardsDeckFormat extends AbstractDeckableCardComposite {

    /**
     * default constructor.
     *
     */
    public Standard52CardsDeckFormat() {
    }

    @PostConstruct
    @Override
    public void initialize() {

        /**
         * NOTE: This concrete composite interface understand how to deck
         * Standard 52 card deck format. The initialize function is called to
         * combine the suits and ranks to build the required number of deck.
         */
        Set<ICardSuit> suits = new HashSet<>();
        suits.add(new Diamonds());
        suits.add(new Spades());
        suits.add(new Clubs());
        suits.add(new Hearts());

        String[] ARR_RANKS = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        Set<ICardRank> ranks = new HashSet<>();
        for (String rank : ARR_RANKS) {
            ranks.add(new SimpleCardRankImpl(rank));
        }
        suits.forEach(s -> {
            ranks.forEach(r -> {
                cards.add(new SimpleDeckableCardImpl(r, s));
            });
        });
    }

}
