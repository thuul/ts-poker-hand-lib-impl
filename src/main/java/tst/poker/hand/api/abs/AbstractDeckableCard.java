/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

import java.util.Objects;

/**
 *
 * @author walles
 */
public abstract class AbstractDeckableCard implements IDeckableCard {

    protected ICardRank rank;
    protected ICardSuit suit;

    /**
     * constructor.
     *
     * @param rank
     * @param suit
     */
    public AbstractDeckableCard(ICardRank rank, ICardSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.rank);
        hash = 61 * hash + Objects.hashCode(this.suit);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstractDeckableCard other = (AbstractDeckableCard) obj;
        if (!Objects.equals(this.rank, other.rank)) {
            return false;
        }
        return Objects.equals(this.suit, other.suit);
    }

    @Override
    public String toString() {
        return String.format("[ %s%s ]", rank.getName(), suit.getUnicodeString());
    }

}
