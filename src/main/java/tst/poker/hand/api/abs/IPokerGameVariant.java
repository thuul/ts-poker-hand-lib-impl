/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

/**
 *
 * @author walles
 */
public interface IPokerGameVariant {

    /**
     *
     * @return int
     */
    int getDeals();

    /**
     *
     * @param decks
     */
    void setDeals(int decks);

    /**
     *
     * @return {@link IDeckableCardComposite}
     */
    IDeckableCardComposite getCardComposite();

    /**
     *
     * @param cardComposite
     */
    void setCardComposite(IDeckableCardComposite cardComposite);

}
