/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

import java.io.Serializable;

/**
 *
 * @author walles
 */
public interface IDeckableCard extends Serializable {

    /**
     *
     * @return {@link ICardRank}
     */
    ICardRank getRank();

    /**
     *
     * @return {@link ICardSuit}
     */
    ICardSuit getSuit();
}
