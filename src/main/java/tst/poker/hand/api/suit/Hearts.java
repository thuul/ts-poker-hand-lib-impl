/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.suit;

import tst.poker.hand.api.abs.AbstractCardSuit;

/**
 *
 * @author walles
 */
public class Hearts extends AbstractCardSuit {

    public Hearts() {
        name = "Hearts";
        unicodeString = ("\u2665".toUpperCase());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getUnicodeString() {
        return unicodeString;
    }

}
