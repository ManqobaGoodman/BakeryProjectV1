/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.model;

/**
 *
 * @author student02
 */
public class Payment {
    private int paymentid;
    private int invoiceid;
    

    public Payment() {
    }

    /**
     * @return the paymentid
     */
    public int getPaymentid() {
        return paymentid;
    }

    /**
     * @param paymentid the paymentid to set
     */
    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    /**
     * @return the invoiceid
     */
    public int getInvoiceid() {
        return invoiceid;
    }

    /**
     * @param invoiceid the invoiceid to set
     */
    public void setInvoiceid(int invoiceid) {
        this.invoiceid = invoiceid;
    }


    
    
    
}
