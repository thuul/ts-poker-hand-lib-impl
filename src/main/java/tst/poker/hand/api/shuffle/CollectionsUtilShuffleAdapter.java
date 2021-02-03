/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import tst.poker.hand.api.abs.IDeckableCard;
import tst.poker.hand.api.annotatn.CommonQualifier;
import tst.poker.hand.api.abs.ICardShuffleAdapter;

/**
 * A concrete implementation of {@link ICardShuffleAdapter} interface using
 * {@link Collections#shuffle} shuffle Algorithm {@link Collections} shuffling.
 *
 * @see ICardShuffleAdapter
 *
 * @author walles
 */
@CommonQualifier("CollectionsUtilShuffleAdapter")
public class CollectionsUtilShuffleAdapter implements ICardShuffleAdapter {

    @Override
    public List<IDeckableCard> shuffle(Set<IDeckableCard> cards) {
        List<IDeckableCard> cardList = new ArrayList<>(cards);
        Collections.shuffle(cardList);
        return cardList;
    }

}
