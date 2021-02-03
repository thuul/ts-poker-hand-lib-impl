/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

import java.io.Serializable;
import java.util.Set;
import tst.poker.hand.api.abs.IDeckableCard;
import tst.poker.hand.api.eval.FiveHandCardEvaluator.CardStrength;

/**
 *
 * @author walles
 */
public interface ICardEvaluator extends Serializable {

    /**
     *
     * @param cards
     * @return {@link CardStrength}
     */
    CardStrength evaluate(Set<IDeckableCard> cards);

}
