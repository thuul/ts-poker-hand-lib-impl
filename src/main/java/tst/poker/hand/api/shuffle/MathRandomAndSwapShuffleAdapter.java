/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.shuffle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import tst.poker.hand.api.abs.ICardShuffleAdapter;
import tst.poker.hand.api.abs.IDeckableCard;

/**
 * A concrete implementation of {@link ICardShuffleAdapter} interface using
 * {@link Math#random()} Algorithm for number randomization and
 * {@link Collection} swapping.
 *
 * @see ICardShuffleAdapter
 *
 * @author walles
 */
public class MathRandomAndSwapShuffleAdapter implements ICardShuffleAdapter {

    @Override
    public List<IDeckableCard> shuffle(Set<IDeckableCard> cards) {
        List<IDeckableCard> cardList = new ArrayList<>(cards);
        int n = cardList.size();
        for (int i = 0; i < n; i++) {
            int random = i + (int) (Math.random() * (n - i));
            IDeckableCard temp = cardList.get(random);
            cardList.set(random, cardList.get(i));
            cardList.set(i, temp);
        }
        return cardList;
    }

}
