/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.game;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import tst.poker.hand.api.abs.IPokerGameStarter;
import java.util.Set;
import tst.poker.hand.api.abs.AbstractKeyValueBasedSelector;
import tst.poker.hand.api.abs.IDeckableCard;
import tst.poker.hand.api.abs.IDeckableCardComposite;
import tst.poker.hand.api.abs.IPokerGameVariant;
import tst.poker.hand.api.eval.FiveHandCardEvaluator;
import tst.poker.hand.api.eval.FiveHandCardEvaluator.CardStrength;
import tst.poker.hand.api.selector.PokerGameVariantSelector;
import tst.poker.hand.api.shuffle.CollectionsUtilShuffleAdapter;
import tst.poker.hand.api.abs.ICardEvaluator;

/**
 *
 * @author walles
 */
public class PokerGameStartUpFacade implements IPokerGameStarter {

    /**
     *
     * @param variantName
     * @return {@link IDeckableCardComposite}
     */
    @Override
    public IPokerGameVariant selectGameVariant(String variantName) {
        AbstractKeyValueBasedSelector<String, IPokerGameVariant> gameSelector = new PokerGameVariantSelector();
        gameSelector.initialize();
        return gameSelector.select(variantName);
    }

    @Override
    public List<IDeckableCard> shuffle(Set<IDeckableCard> cards) {
        return new CollectionsUtilShuffleAdapter().shuffle(cards);
    }

    @Override
    public Set<IDeckableCard> deal(List<IDeckableCard> cards, int deal) {
        LinkedList<IDeckableCard> forDeal = new LinkedList(cards);
        Set<IDeckableCard> deals = new HashSet<>(deal);
        while (deal != 0) {
            deals.add(forDeal.poll());
            deal--;
        }
        return deals;
    }

    @Override
    public CardStrength evalute(Set<IDeckableCard> cards) {
        ICardEvaluator evalutor = new FiveHandCardEvaluator();
        return evalutor.evaluate(cards);
    }

}
