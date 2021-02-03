/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.deck;

import tst.poker.hand.api.abs.AbstractDeckableCard;
import tst.poker.hand.api.abs.ICardRank;
import tst.poker.hand.api.abs.ICardSuit;

/**
 *
 * @author walles
 */
public class SimpleDeckableCardImpl extends AbstractDeckableCard {

    /**
     * constructor.
     *
     * @param rank
     * @param suit
     */
    public SimpleDeckableCardImpl(ICardRank rank, ICardSuit suit) {
        super(rank, suit);
    }

    @Override
    public ICardRank getRank() {
        return rank;
    }

    @Override
    public ICardSuit getSuit() {
        return suit;
    }

}
