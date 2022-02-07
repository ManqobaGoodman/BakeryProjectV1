/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.model;

/**
 *
 * @author Student24
 */
public class UpdateCartClass {
    private String prodyuctId;
    private String quantity;

    public UpdateCartClass() {
    }

    /**
     * @return the prodyuctId
     */
    public String getProdyuctId() {
        return prodyuctId;
    }

    /**
     * @param prodyuctId the prodyuctId to set
     */
    public void setProdyuctId(String prodyuctId) {
        this.prodyuctId = prodyuctId;
    }

    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "prodyuctId: " + prodyuctId +"\n quantity: "+quantity;
    }
    
    
}
