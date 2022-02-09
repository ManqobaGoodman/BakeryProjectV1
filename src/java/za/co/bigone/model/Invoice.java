/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.model;

import java.time.LocalDate;

/**
 *
 * @author student02
 */
public class Invoice {
    private int invoiceid;
    private int orderid;
    private String invoicedate;

    public Invoice() {
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

    /**
     * @return the orderid
     */
    public int getOrderid() {
        return orderid;
    }

    /**
     * @param orderid the orderid to set
     */
    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    /**
     * @return the invoicedate
     */
    public String getInvoicedate() {
        return invoicedate;
    }

    /**
     * @param invoicedate the invoicedate to set
     */
    public void setInvoicedate(String invoicedate) {
        this.invoicedate = invoicedate;
    }
    
    
}
