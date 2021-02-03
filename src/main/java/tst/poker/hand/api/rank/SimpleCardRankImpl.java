/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.rank;

import tst.poker.hand.api.abs.AbstractCardRank;
import tst.poker.hand.api.abs.ICardSuit;

/**
 *
 * @author walles
 */
public class SimpleCardRankImpl extends AbstractCardRank {

    /**
     * constructor.
     *
     * @param name
     */
    public SimpleCardRankImpl(String name) {
        super(name);
    }

    /**
     * constructor.
     *
     * @param name
     * @param suit
     */
    public SimpleCardRankImpl(String name, ICardSuit suit) {
        super(name, suit);
    }

    @Override
    public String getName() {
        return name;
    }

}
