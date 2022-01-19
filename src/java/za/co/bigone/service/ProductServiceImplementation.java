/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.service;

import java.util.ArrayList;
import za.co.bigone.DAO.ProductDAO;
import za.co.bigone.DAO.ProductDAOImple;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Product;

/**
 *
 * @author Student24
 */
public class ProductServiceImplementation implements ProductService{
    
    ProductDAO productDAO;

    public ProductServiceImplementation(DBPoolManagerBasic dbm) {
        this.productDAO = new ProductDAOImple(dbm);
    }
    
    

    @Override
    public ArrayList<Product> viewProducts(String productType) {
        
        return productDAO.viewProducts(productType);
    }

    @Override
    public Product viewProduct(String productName) {
        return productDAO.viewProduct(productName);
    }
    
}
