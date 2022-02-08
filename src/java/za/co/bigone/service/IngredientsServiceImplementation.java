/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.service;

import java.util.ArrayList;
import za.co.bigone.DAO.IngredientDAO;
import za.co.bigone.DAO.IngredientDAOImpl;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Ingredients;

/**
 *
 * @author student02
 */
public class IngredientsServiceImplementation implements IngredientsService  {
    
    IngredientDAO ingredientDAO;

    public IngredientsServiceImplementation(DBPoolManagerBasic dbm) {
        this.ingredientDAO = new IngredientDAOImpl(dbm);
    }
    
   
    
//    @Override
//    public ArrayList<Ingredients> viewIngredient() {
//        return ingredientDAO.viewIngredient();
//    }

    /**
     *
     * @param IngredientName
     * @return
     */

    @Override
    public Ingredients IngredientName(String IngredientName) {
        return ingredientDAO.IngredientName(IngredientName);
    }

    @Override
    public Ingredients insetIngredient() {
        return null;
    }

    @Override
    public Ingredients updateIngredient() {
        return null;
    }

    @Override
    public Ingredients deleteIngredient() {
        return null;
    }

    @Override
    public ArrayList<Ingredients> viewIngredient(int recipeid) {
        return ingredientDAO.viewIngredient(recipeid);
    }
    
}
