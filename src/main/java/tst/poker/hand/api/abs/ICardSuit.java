/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author walles
 */
public interface ICardSuit extends Serializable {

    /**
     *
     * @return {@link String}
     */
    String getName();

    /**
     *
     * @return {@link String}
     */
    String getUnicodeString();

}
