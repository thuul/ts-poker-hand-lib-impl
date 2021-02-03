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
public abstract class AbstractCardRank implements ICardRank {

    protected String name;
    protected ICardSuit suit;

    /**
     * constructor.
     *
     * @param name
     */
    public AbstractCardRank(String name) {
        this.name = name;
    }

    /**
     * constructor.
     *
     * @param name
     * @param suit
     */
    public AbstractCardRank(String name, ICardSuit suit) {
        this.name = name;
        this.suit = suit;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public int compareTo(ICardRank o) {
        return o.getName().compareTo(name);
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
        final AbstractCardRank other = (AbstractCardRank) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return String.format("%s [ %s ]", getClass().getSimpleName(), name);
    }

}
