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
public class Recipe {

    private int recipeID;
    private String recipename;

    public Recipe() {
    }

    /**
     * @return the recipeID
     */
    public int getRecipeID() {
        return recipeID;
    }

    /**
     * @param recipeID the recipeID to set
     */
    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    /**
     * @return the recipename
     */
    public String getRecipename() {
        return recipename;
    }

    /**
     * @param recipename the recipename to set
     */
    public void setRecipename(String recipename) {
        this.recipename = recipename;
    }

}
