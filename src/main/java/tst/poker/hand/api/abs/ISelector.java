/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

import java.io.Serializable;

/**
 *
 * @author walles
 * @param <C> #selection criteria entity
 * @param <T> #selection entity
 */
public interface ISelector<C, T> extends Serializable {

    /**
     *
     */
    void initialize();

    /**
     *
     * @param criteria
     * @return {@link T}
     */
    T select(C criteria);
    
}
