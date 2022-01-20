/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.model;

import java.util.Locale;

/**
 *
 * @author student02
 */
public class Order {
   private int orderid ;
   private int addressid;
   private int personid;
   private Locale orderdate;
   private int orderlineid;
  

    public Order() {
    
    
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
     * @return the addressid
     */
    public int getAddressid() {
        return addressid;
    }

    /**
     * @param addressid the addressid to set
     */
    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    /**
     * @return the personid
     */
    public int getPersonid() {
        return personid;
    }

    /**
     * @param personid the personid to set
     */
    public void setPersonid(int personid) {
        this.personid = personid;
    }

    /**
     * @return the orderdate
     */
    public Locale getOrderdate() {
        return orderdate;
    }

    /**
     * @param orderdate the orderdate to set
     */
    public void setOrderdate(Locale orderdate) {
        this.orderdate = orderdate;
    }

    public int getOrderlineid() {
        return orderlineid;
    }

    public void setOrderlineid(int orderlineid) {
        this.orderlineid = orderlineid;
    }
   
   
}
