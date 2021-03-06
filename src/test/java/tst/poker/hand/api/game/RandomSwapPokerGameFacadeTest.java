/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tst.poker.hand.api.abs.IDeckableCard;
import tst.poker.hand.api.abs.IDeckableCardComposite;
import tst.poker.hand.api.abs.IPokerGameStarter;
import tst.poker.hand.api.abs.IPokerGameVariant;

/**
 *
 * @author walles
 */
public class RandomSwapPokerGameFacadeTest {

    public RandomSwapPokerGameFacadeTest() {
    }

    private final IPokerGameStarter instance = new RandomSwapPokerGameFacade();

    @Test
    public void PokerGameStartUpTest() {

        assertAll("RandomSwapPokerGameFacade initialize test", () -> {
            String variantName = "Five-Card-Draw-No-Swap";
            IPokerGameVariant variant = instance.selectGameVariant(variantName);
            assertNotNull(variant);

            assertAll("Card deck composition test", () -> {
                IDeckableCardComposite cardComposite = variant.getCardComposite();
                assertNotNull(cardComposite);
                cardComposite.initialize();
                Set<IDeckableCard> cards = cardComposite.getDeckableCards();
                assertNotNull(cards);
                assertTrue(!cards.isEmpty());

                assertAll("Card shuffle test", () -> {
                    List<IDeckableCard> expectedResult = new ArrayList<>(cards);
                    List<IDeckableCard> shuffles = instance.shuffle(cards);
                    assertNotNull(shuffles);
                    assertTrue(!shuffles.isEmpty());
                    assertNotEquals(expectedResult, shuffles);

                    /**
                     * calling a shuffle Algorithm based on {@link Random}
                     * interface for number randomization with
                     * {@link Collection} element swapping.
                     */
                    assertAll("shuufle test", () -> {
                        int expectedDeals = 5;
                        Set<IDeckableCard> deals = instance.deal(shuffles, variant.getDeals());
                        assertEquals(expectedDeals, deals.size(),
                                String.format("The number of dealed cards must be equals %s", expectedDeals));

                        assertAll("shuufle test", () -> {
                            assertNotNull(instance.evalute(deals), "The poker hand srength result cannot be null");
                        });
                    });
                });
            });
        });
    }

}
