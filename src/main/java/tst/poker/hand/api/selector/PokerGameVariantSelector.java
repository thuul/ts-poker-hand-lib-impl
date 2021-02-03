/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.selector;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import tst.poker.hand.api.abs.AbstractKeyValueBasedSelector;
import tst.poker.hand.api.abs.IPokerGameVariant;
import tst.poker.hand.api.annotatn.CommonQualifier;
import tst.poker.hand.api.deck.Standard52CardsDeckFormat;
import tst.poker.hand.api.game.variant.Standard52Cards5DeckVariant;

/**
 *
 * @author walles
 */
@CommonQualifier("PokerGameVariantSelector")
public class PokerGameVariantSelector extends AbstractKeyValueBasedSelector<String, IPokerGameVariant> {

    @Override
    public Map<String, IPokerGameVariant> getSelectorMap() {
        return new HashMap<>();
    }

    @PostConstruct
    @Override
    public void initialize() {
        /**
         * NOTE: Allows for different type of poker game deck variants to be
         * loaded either from a property file or any other available registry.
         */
        addSelection("Five-Card-Draw-No-Swap", new Standard52Cards5DeckVariant(5, new Standard52CardsDeckFormat()));
    }

}
