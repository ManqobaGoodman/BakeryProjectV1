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
public class OrderLineItem {
    private int orderlineid;
    private int productid;
    private int quantity;
    private int orderproductid;

    public OrderLineItem() {
    
    
    
    }

    /**
     * @return the orderlineid
     */
    public int getOrderlineid() {
        return orderlineid;
    }

    /**
     * @param orderlineid the orderlineid to set
     */
    public void setOrderlineid(int orderlineid) {
        this.orderlineid = orderlineid;
    }

    /**
     * @return the productid
     */
    public int getProductid() {
        return productid;
    }

    /**
     * @param productid the productid to set
     */
    public void setProductid(int productid) {
        this.productid = productid;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the orderproductid
     */
    public int getOrderproductid() {
        return orderproductid;
    }

    /**
     * @param orderproductid the orderproductid to set
     */
    public void setOrderproductid(int orderproductid) {
        this.orderproductid = orderproductid;
    }
    
    
}
