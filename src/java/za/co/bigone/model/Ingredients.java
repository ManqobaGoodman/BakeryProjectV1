/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.model;

import java.util.ArrayList;

/**
 *
 * @author Student24
 */
public class Ingredients {

  
    private int IngredientID;
    private String IngredientName;
    ArrayList<Ingredients> viewIngredients;
    

    public Ingredients() {
    }

    public Ingredients(int IngredientID, String IngredientName) {
        this.IngredientID = IngredientID;
        this.IngredientName = IngredientName;
    }

    /**
     * @return the IngredientID
     */
    public int getIngredientID() {
        return IngredientID;
    }

    /**
     * @param IngredientID the IngredientID to set
     */
    public void setIngredientID(int IngredientID) {
        this.IngredientID = IngredientID;
    }

    /**
     * @return the IngredientName
     */
    public String getIngredientName() {
        return IngredientName;
    }

    /**
     * @param IngredientName the IngredientName to set
     */
    public void setIngredientName(String IngredientName) {
        this.IngredientName = IngredientName;
    }

    public String getIngredientName(String IngredientName) {
        return IngredientName;
    }

}
