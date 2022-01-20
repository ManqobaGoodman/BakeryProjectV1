/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import sun.net.www.content.text.plain;
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

    public ProductDAOImple() {

    }

    public ProductDAOImple(DBPoolManagerBasic dbm) {
        this.dbm = dbm;
    }

    @Override
    public ArrayList<Product> viewProducts(int productTypeid) {
        Product p1 = null;
        ArrayList<Product> viewProd = new ArrayList<>();
        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM product WHERE productTypeid = ?");

            ps.setInt(productTypeid, productTypeid);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p1 = new Product();
                p1.setProductId(rs.getInt("productid"));
                p1.setNameOfProduct(rs.getString("nameofproduct"));
                p1.setProductTypeid(rs.getInt("producttypeid"));
                p1.setProductDescription(rs.getString("productdescription"));
                p1.setProductPrice(rs.getDouble("productprice"));
                p1.setPicture(rs.getString("productpicture"));
                viewProd.add(p1);
            }
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return viewProd;
    }

    @Override
    public Product viewProduct(int productid) {
        Product p1 = new Product();
        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM product WHERE productid = ?");
            ps.setInt(1, productid);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                p1.setProductId(rs.getInt("productid"));
                p1.setNameOfProduct(rs.getString("nameofproduct"));
                p1.setProductTypeid(rs.getInt("producttypeid"));
                p1.setProductDescription(rs.getString("productdescription"));
                p1.setProductPrice(rs.getDouble("productprice"));
                p1.setPicture(rs.getString("productpicture"));

            }
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return p1;
    }

}
