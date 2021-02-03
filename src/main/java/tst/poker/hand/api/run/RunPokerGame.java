/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.run;

import tst.poker.hand.api.abs.IViewController;
import tst.poker.hand.api.view.contrl.ConsoleViewController;

/**
 * A basic entry class for generating output to console.
 *
 * @see ConsoleViewController
 *
 * @author walles
 */
public class RunPokerGame {

    public static void main(String[] args) {

        for (int i = 0; i < 1; i++) {
            IViewController view = new ConsoleViewController();
            view.initialize();
            view.renderView();
        }

    }
    
    static public final void printAll(){
        System.out.println("printing");
    }
}
