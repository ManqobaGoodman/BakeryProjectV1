/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.DAO;

import java.util.ArrayList;
import za.co.bigone.model.Product;

/**
 *
 * @author Student24
 */
public interface ProductDAO {
    ArrayList<Product>  viewProducts(String productType);
    Product viewProduct(String productName);
}
