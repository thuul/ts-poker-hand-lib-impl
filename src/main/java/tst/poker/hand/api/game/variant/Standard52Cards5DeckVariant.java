/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.game.variant;

import tst.poker.hand.api.abs.AbstractPokerGameVariant;
import tst.poker.hand.api.abs.IDeckableCardComposite;
import tst.poker.hand.api.annotatn.CommonQualifier;

@CommonQualifier("Standard52Cards5DeckVariant")
public class Standard52Cards5DeckVariant extends AbstractPokerGameVariant {

    /**
     * default constructor.
     *
     */
    public Standard52Cards5DeckVariant() {
    }

    /**
     * constructor.
     *
     * @param deals
     * @param cardComposite
     */
    public Standard52Cards5DeckVariant(int deals, IDeckableCardComposite cardComposite) {
        super(deals, cardComposite);
    }

}
