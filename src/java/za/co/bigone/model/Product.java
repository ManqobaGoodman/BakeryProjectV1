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
public class Product {

    private int productId;
    private String productType;
    private String nameOfProduct;
    private String productDescription;
    private String prodictPrice;
    private String picture;

    public Product() {
    }

    public Product(String productType, String nameOfProduct, String productDescription, String prodictPrice, String picture) {
        this.productType = productType;
        this.nameOfProduct = nameOfProduct;
        this.productDescription = productDescription;
        this.prodictPrice = prodictPrice;
        this.picture = picture;
    }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return the productType
     */
    public String getProductType() {
        return productType;
    }

    /**
     * @param productType the productType to set
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * @return the nameOfProduct
     */
    public String getNameOfProduct() {
        return nameOfProduct;
    }

    /**
     * @param nameOfProduct the nameOfProduct to set
     */
    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    /**
     * @return the productDescription
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * @param productDescription the productDescription to set
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * @return the prodictPrice
     */
    public String getProdictPrice() {
        return prodictPrice;
    }

    /**
     * @param prodictPrice the prodictPrice to set
     */
    public void setProdictPrice(String prodictPrice) {
        this.prodictPrice = prodictPrice;
    }

    /**
     * @return the picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @param picture the picture to set
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }
     
}
