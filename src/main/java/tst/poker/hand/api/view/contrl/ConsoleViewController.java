/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.view.contrl;

import tst.poker.hand.api.abs.IViewController;
import java.util.List;
import java.util.Set;
import javax.annotation.PostConstruct;
import tst.poker.hand.api.abs.AbstractViewController;
import tst.poker.hand.api.abs.IDeckableCard;
import tst.poker.hand.api.abs.IDeckableCardComposite;
import tst.poker.hand.api.abs.IPokerGameStarter;
import tst.poker.hand.api.abs.IPokerGameVariant;
import tst.poker.hand.api.annotatn.CommonQualifier;
import tst.poker.hand.api.eval.FiveHandCardEvaluator;
import tst.poker.hand.api.game.MathRandomAndSwapPokerGameFacade;

/**
 * A concrete implementation of {@link IViewController} for rendering view to
 * console.
 *
 * @see IViewController
 *
 * @author walles
 */
@CommonQualifier("ConsoleViewController")
public class ConsoleViewController extends AbstractViewController<Object> {

    @PostConstruct
    @Override
    public void initialize() {
    }

    @Override
    public void renderView() {

        System.out.println("Initializing .......");

        IPokerGameStarter starter = new MathRandomAndSwapPokerGameFacade();
        IPokerGameVariant variant = starter.selectGameVariant("Five-Card-Draw-No-Swap");
        IDeckableCardComposite cardComposite = variant.getCardComposite();
        cardComposite.initialize();
        Set<IDeckableCard> cards = cardComposite.getDeckableCards();

        System.out.println("Shuffling .......");
        List<IDeckableCard> shuffled = starter.shuffle(cards);

        System.out.println("Dealing cards .......");
        Set<IDeckableCard> deals = starter.deal(shuffled, variant.getDeals());

        System.out.println("Evaluating hand strength .......");
        FiveHandCardEvaluator.CardStrength evalute = starter.evalute(deals);

        System.out.println(String.format("%s %s", "Your hand:", deals.toString()));
        System.out.println(String.format("%s %s", "You have:", evalute.getStrength()));
    }

}
