/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.poker.hand.api.abs;

/**
 *
 * @author walles
 */
public class AbstractPokerGameVariant implements IPokerGameVariant {

    protected int deals;
    protected IDeckableCardComposite cardComposite;

    /**
     * default constructor.
     *
     */
    public AbstractPokerGameVariant() {
    }

    /**
     * constructor.
     *
     * @param deals
     * @param cardComposite
     */
    public AbstractPokerGameVariant(int deals, IDeckableCardComposite cardComposite) {
        this.deals = deals;
        this.cardComposite = cardComposite;
    }

    @Override
    public int getDeals() {
        return deals;
    }

    @Override
    public void setDeals(int deals) {
        this.deals = deals;
    }

    @Override
    public IDeckableCardComposite getCardComposite() {
        return cardComposite;
    }

    @Override
    public void setCardComposite(IDeckableCardComposite cardComposite) {
        this.cardComposite = cardComposite;
    }

}
