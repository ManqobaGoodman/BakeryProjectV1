package za.co.bigone.DAO;

import java.util.ArrayList;
import za.co.bigone.model.Ingredients;

/**
 *
 * @author student02
 */
public interface IngredientDAO {

    ArrayList<Ingredients> viewIngredient();

    String IngredientName(String IngredientName);
    Ingredients insetIngredient();
    Ingredients updateIngredient();
    Ingredients deleteIngredient();
    // boolean insetIngredeient(String name); 
    //insert,update,delete

}