/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

import java.io.Serializable;
import javax.annotation.PostConstruct;

/**
 * A base interface for view rendering controller.
 *
 * @author walles
 * @param <T>
 */
public interface IViewController<T> extends Serializable {

    /**
     * initialization function.
     *
     */
    @PostConstruct
    void initialize();

    /**
     * function for processing view rendering.
     *
     */
    void renderView();

    /**
     * gets the backing model of a view.
     *
     * @return {@link T}
     */
    T getModel();

    /**
     * sets the backing model of a view.
     *
     * @param model
     */
    void setModel(T model);

}
