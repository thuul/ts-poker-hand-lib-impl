/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

/**
 *
 * @author walles
 * @param <C> #selection criteria entity
 * @param <T> #selection entity
 */
public interface ISeriesSelector<C, T> extends ISelector<C, T> {

    /**
     *
     * @param selection
     * @return {@link boolean}
     */
    boolean addSelection(T selection);

    /**
     *
     * @param criteria
     * @param newSelection
     * @return {@link T}
     */
    T replaceSelection(C criteria, T newSelection);

    /**
     *
     * @param criteria
     * @return {@link boolean}
     */
    boolean removeSelection(C criteria);
}
