/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.shuffle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import tst.poker.hand.api.abs.ICardShuffleAdapter;
import tst.poker.hand.api.abs.IDeckableCard;

/**
 * A concrete implementation of {@link ICardShuffleAdapter} interface using
 * {@link Random} interface for number randomization with {@link Collection}
 * element swapping.
 *
 * @see ICardShuffleAdapter
 *
 * @author walles
 */
public class RandomizeSwapShuffleAdapter implements ICardShuffleAdapter {

    @Override
    public List<IDeckableCard> shuffle(Set<IDeckableCard> cards) {
        List<IDeckableCard> cardList = new ArrayList<>(cards);
        int n = cardList.size();
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int swap = i + random.nextInt(n - i);
            IDeckableCard temp = cardList.get(i);
            cardList.set(i, cardList.get(swap));
            cardList.set(swap, temp);
        }
        return cardList;
    }

}
