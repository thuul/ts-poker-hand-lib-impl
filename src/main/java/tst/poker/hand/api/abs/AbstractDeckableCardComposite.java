/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author walles
 */
public abstract class AbstractDeckableCardComposite implements IDeckableCardComposite {

    protected Set<IDeckableCard> cards = new HashSet<>();
    protected IDeckableCard selectedCard;

    @Override
    public void addDeckableCard(IDeckableCard card) {
        selectedCard = card;
        cards.add(card);
    }

    @Override
    public IDeckableCard remove(IDeckableCard card) {
        selectedCard = card;
        return cards.remove(card) ? card : null;
    }

    @Override
    public Set<IDeckableCard> getDeckableCards() {
        return cards;
    }

    @Override
    public void setDeckableCards(Set<IDeckableCard> cards) {
        this.cards = cards;
    }

    @Override
    public ICardRank getRank() {
        return selectedCard.getRank();
    }

    @Override
    public ICardSuit getSuit() {
        return selectedCard.getSuit();
    }

}
