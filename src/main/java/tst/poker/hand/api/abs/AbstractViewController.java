/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

public abstract class AbstractViewController<T> implements IViewController<T> {

    protected T model;

    /**
     * default constructor.
     *
     */
    public AbstractViewController() {
    }

    /**
     * constructor.
     *
     * @param model
     */
    public AbstractViewController(T model) {
        this.model = model;
    }

    @Override
    public T getModel() {
        return model;
    }

    @Override
    public void setModel(T model) {
        this.model = model;
    }

}
