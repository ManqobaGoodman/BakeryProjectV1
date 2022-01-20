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
public class Producttype {
    private int productTypeId;
    private String productTypeDesc;

    public Producttype() {
    }

    public Producttype(int productTypeId, String productTypeDesc) {
        this.productTypeId = productTypeId;
        this.productTypeDesc = productTypeDesc;
    }

    public void setProductTypeDesc(String productTypeDesc) {
        this.productTypeDesc = productTypeDesc;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductTypeDesc() {
        return productTypeDesc;
    }

    public int getProductTypeId() {
        return productTypeId;
    }
    
    
}
