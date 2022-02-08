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
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Ingredients;

/**
 *
 * @author student02
 */
public class IngredientDAOImpl implements IngredientDAO {

    DBPoolManagerBasic dbm;
    private Connection con;
    // private Connection conction;

    public IngredientDAOImpl() {
    }

    public IngredientDAOImpl(DBPoolManagerBasic dbm) {
        this.dbm = dbm;
    }

    @Override
    public ArrayList<Ingredients> viewIngredient(int recipeid) {
        Ingredients i1 = null;
        ArrayList<Ingredients> viewIng = new ArrayList<>();

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT i.ingredientname, r.quantityofingredient FROM  recipeingredient AS r, ingredient AS i WHERE r.ingredientid=i.ingredientid AND r.recipeid = ?");
                
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                i1 = new Ingredients();
               
                i1.setIngredientID(rs.getInt("Ingredientid"));
                i1.getIngredientName(rs.getString("IngredientName"));
                viewIng.add(i1);

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return viewIng;

    }

    @Override
    public Ingredients insetIngredient() {
        Ingredients i1 = null;

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO ingredient");

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                i1 = new Ingredients();
                i1.setIngredientID(rs.getInt("Ingredientid"));
                i1.getIngredientName(rs.getString("IngredientName"));

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return i1;
    }

    @Override
    public Ingredients updateIngredient() {
        Ingredients i1 = null;

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE ingredient SET ingredientid =? WHERE ingredientname = ?");

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                i1 = new Ingredients();
                i1.setIngredientID(rs.getInt("Ingredientid"));
                i1.getIngredientName(rs.getString("IngredientName"));

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return i1;
    }

    @Override
    public Ingredients deleteIngredient() {
        Ingredients i1 = null;

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE * ingredient WHERE recipeid = ?");

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                i1 = new Ingredients();
                i1.setIngredientID(rs.getInt("Ingredientid"));
                i1.getIngredientName(rs.getString("IngredientName"));

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return i1;
    }

    
        public IngredientDAOImpl(String ingredientname) {
        Ingredients i1 = null;

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * ingredient WHERE ingredientid = ?");
           
            ps.setString(1, ingredientname);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               // i1 = new Ingredients();
                //i1.setIngredientID(rs.getInt("Ingredientid"));
                i1.getIngredientName(rs.getString("IngredientName"));

            }
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }

    @Override
    public Ingredients IngredientName(String ingredientname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
