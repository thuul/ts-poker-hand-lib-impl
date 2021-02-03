/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

import java.util.Map;

/**
 *
 * @author walles
 * @param <K>
 * @param <T>
 */
public interface IKeyValueBasedSelector<K, T> extends ISeriesSelector<K, T> {

    /**
     *
     * @param selectKey
     * @param selection
     * @return {@link boolean}
     */
    boolean addSelection(K selectKey, T selection);

    /**
     *
     * @param selectKey
     * @param newSelection
     * @return {@link T}
     */
    @Override
    T replaceSelection(K selectKey, T newSelection);

    /**
     *
     * @param selectKey
     * @return {@link T}
     */
    @Override
    T select(K selectKey);

    /**
     *
     * @param selectKey
     * @return {@link boolean}
     */
    @Override
    boolean removeSelection(K selectKey);

    /**
     *
     * @return {@link Map}
     */
    Map<K, T> getSelectorMap();
}
