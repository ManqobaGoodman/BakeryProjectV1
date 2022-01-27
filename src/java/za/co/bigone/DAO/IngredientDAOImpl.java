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
    private Connection conction;

    public IngredientDAOImpl() {
    }

    public IngredientDAOImpl(DBPoolManagerBasic dbm) {
        this.dbm = dbm;
    }

    @Override
    public ArrayList<Ingredients> viewIngredient() {
        Ingredients i1 = null;
        ArrayList<Ingredients> viewIng = new ArrayList<>();

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM ingredient");

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
    public String IngredientName(String IngredientName) {
        return null;
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
            PreparedStatement ps = con.prepareStatement("DELETE * ingredient WHERE ingredientid = ?");

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

}
