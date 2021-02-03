/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

import java.util.List;
import java.util.Set;
import tst.poker.hand.api.eval.FiveHandCardEvaluator.CardStrength;

/**
 *
 * @author walles
 */
public interface IPokerGameStarter {

    /**
     *
     * @param variantName
     * @return {@link IPokerGameVariant}
     */
    IPokerGameVariant selectGameVariant(String variantName);

    /**
     *
     * @param cards
     * @return {@link Set}
     */
    List<IDeckableCard> shuffle(Set<IDeckableCard> cards);

    /**
     *
     * @param cards
     * @param deal
     * @return {@link Set}
     */
    Set<IDeckableCard> deal(List<IDeckableCard> cards, int deal);

    /**
     *
     * @param cards
     * @return {@link CardStrength}
     */
    CardStrength evalute(Set<IDeckableCard> cards);

}
