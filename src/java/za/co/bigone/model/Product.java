/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.model;

import za.co.bigone.DAO.RecipeDAO;

/**
 *
 * @author Student24
 */
public class Product {

    private int productId;
    private int productTypeid;
    private String nameOfProduct;
    private String productDescription;
    private double productPrice;
    private String picture;
    private int recipeid;
    private String ingredientName;
    private String recipeName;
    

    public Product() {
    }

    public Product(int productTypeid, String nameOfProduct, String productDescription, double productPrice, String picture) {
        this.productTypeid = productTypeid;
        this.nameOfProduct = nameOfProduct;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.picture = picture;
        this.recipeid = recipeid;
        this.ingredientName = ingredientName;
        this.recipeName = recipeName;
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
    public int getProductTypeid() {
        return productTypeid;
    }

    /**
     * @param productType the productType to set
     */
    public void setProductTypeid(int productTypeid) {
        this.productTypeid = productTypeid;
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
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice the prodictPrice to set
     */
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
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

    /**
     * @return the recipeid
     */
    public int getRecipeid() {
        return recipeid;
    }

    /**
     * @param recipeid the recipeid to set
     */
    public void setRecipeid(int recipeid) {
        this.recipeid = recipeid;
    }

    /**
     * @return the ingredientName
     */
    public String getIngredientName() {
        return ingredientName;
    }

    /**
     * @param ingredientName the ingredientName to set
     */
    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    /**
     * @return the recipeName
     */
    public String getRecipeName() {
        return recipeName;
    }

    /**
     * @param recipeName the recipeName to set
     */
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
     
}
