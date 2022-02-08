/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.service;

import za.co.bigone.model.Recipe;

/**
 *
 * @author student02
 */
public interface RecipeService {

    Recipe viewRecipe(int recipeid);
    
    Recipe getRecipename(String recipename);

    Recipe insertRecipe();

    Recipe updateRecipe();
}

