/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

import java.util.Set;

/**
 * A trimmed down composite-pattern version for decking {@link IDeckableCard}
 *
 * @author walles
 */
public interface IDeckableCardComposite extends IDeckableCard {

    /**
     *
     * @param card
     */
    void addDeckableCard(IDeckableCard card);

    /**
     *
     * @param card
     * @return {@link IDeckableCard}
     */
    IDeckableCard remove(IDeckableCard card);

    /**
     *
     * @return {@link Set}
     */
    Set<IDeckableCard> getDeckableCards();

    /**
     *
     * @param cards
     */
    void setDeckableCards(Set<IDeckableCard> cards);

    /**
     * init function.
     *
     */
    void initialize();

}
