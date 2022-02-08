/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.DAO;

import java.util.ArrayList;
import za.co.bigone.model.Ingredients;
import za.co.bigone.model.Product;
import za.co.bigone.model.Producttype;
import za.co.bigone.model.Recipe;

/**
 *
 * @author Student24
 */
public interface ProductDAO {

    ArrayList<Product> viewProducts(int productTypeid);

    Product viewProduct(int productid);

    Producttype getProducttype(int productTypeid);
    
    

}
