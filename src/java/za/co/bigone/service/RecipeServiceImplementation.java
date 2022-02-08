/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.service;

import za.co.bigone.DAO.RecipeDAO;
import za.co.bigone.DAO.RecipeDAOImpl;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Recipe;

/**
 *
 * @author student02
 */
public class RecipeServiceImplementation implements RecipeService {

    RecipeDAO recipeDAO;

    public RecipeServiceImplementation(DBPoolManagerBasic dbm) {
        this.recipeDAO = new RecipeDAOImpl(dbm);
    }

    @Override
    public Recipe viewRecipe(int recipeid) {
        return recipeDAO.viewRecipe(recipeid);
    }

    
    @Override
    public Recipe getRecipename(String recipename) {
        return recipeDAO.getRecipeName(recipename);
    }

    @Override
    public Recipe insertRecipe() {
        return null;
    }

    @Override
    public Recipe updateRecipe() {
        return null;
    }

}
