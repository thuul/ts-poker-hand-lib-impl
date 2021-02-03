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
public abstract class AbstractKeyValueBasedSelector<K, T> implements IKeyValueBasedSelector<K, T> {

    protected final Map<K, T> selectorMap = getSelectorMap();

    @Override
    public boolean addSelection(K selectKey, T selection) {
        return selectorMap.put(selectKey, selection) != null;
    }

    @Override
    public T replaceSelection(K selectKey, T newSelection) {
        return selectorMap.replace(selectKey, newSelection);
    }

    @Override
    public T select(K selectKey) {
        return selectorMap.get(selectKey);
    }

    @Override
    public boolean removeSelection(K selectKey) {
        return selectorMap.remove(selectKey) != null;
    }

    @Override
    public final boolean addSelection(T selection) {
        return false;
    }

}
