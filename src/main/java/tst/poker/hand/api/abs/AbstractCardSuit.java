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
public abstract class AbstractCardSuit implements ICardSuit {

    protected String name;
    protected String unicodeString;

    /**
     * default constructor.
     *
     */
    public AbstractCardSuit() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
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
        final AbstractCardSuit other = (AbstractCardSuit) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return String.format("%s [ %s%s ]", getClass().getSimpleName(), name, unicodeString);
    }

}
