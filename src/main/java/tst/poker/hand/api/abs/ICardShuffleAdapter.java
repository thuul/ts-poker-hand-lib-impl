/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

import java.util.List;
import java.util.Set;

/**
 * A base interface for generic adaptation of shuffling algorithms.
 *
 * @author walles
 */
public interface ICardShuffleAdapter {

    /**
     *
     * @param cards
     * @return {@link Set}
     */
    List<IDeckableCard> shuffle(Set<IDeckableCard> cards);

}
