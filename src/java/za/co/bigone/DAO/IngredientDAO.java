
package za.co.bigone.DAO;

import java.util.ArrayList;
import za.co.bigone.model.Ingredients;

/**
 *
 * @author student02
 */
public interface IngredientDAO {
   ArrayList<Ingredients> viewIngredient(int IngredientID );
   String IngredientName(String IngredientName); 
    
    
}
