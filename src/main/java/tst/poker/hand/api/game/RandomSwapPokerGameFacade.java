/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.game;

import java.util.List;
import java.util.Set;
import tst.poker.hand.api.abs.IDeckableCard;
import tst.poker.hand.api.shuffle.RandomizeSwapShuffleAdapter;

/**
 *
 * @author walles
 */
public class RandomSwapPokerGameFacade extends PokerGameStartUpFacade {

    @Override
    public List<IDeckableCard> shuffle(Set<IDeckableCard> cards) {
        return new RandomizeSwapShuffleAdapter().shuffle(cards);
    }

}
