/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.service;

import java.util.ArrayList;
import za.co.bigone.model.Ingredients;

/**
 *
 * @author student02
 */
public interface IngredientsService {

    ArrayList<Ingredients> viewIngredient(int recipeid);

    /**
     *
     * @param IngredientName
     * @return
     */
    Ingredients IngredientName(String IngredientName);

    Ingredients insetIngredient();

    Ingredients updateIngredient();

    Ingredients deleteIngredient();
}
