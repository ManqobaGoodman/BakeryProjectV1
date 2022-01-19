/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.DAO;

import java.sql.Connection;
import java.util.ArrayList;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Product;

/**
 *
 * @author Student24
 */
public class ProductDAOImple implements ProductDAO {
    
    DBPoolManagerBasic dbm;
    private Connection con;
    private Connection conction;

    public ProductDAOImple(DBPoolManagerBasic dbm) {
        this.dbm = dbm;
    }

    @Override
    public ArrayList<Product> viewProducts(String productType) {
        return null;
    }

    @Override
    public Product viewProduct(String productName) {
        return null;
    }

}
