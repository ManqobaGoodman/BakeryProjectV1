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
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Recipe;

/**
 *
 * @author student02
 */
public class RecipeDAOImpl implements RecipeDAO {

    DBPoolManagerBasic dbm;
    private Connection con;
    private Connection conction;

    public RecipeDAOImpl() {
    }

    public RecipeDAOImpl(DBPoolManagerBasic dbm) {
        this.dbm = dbm;
    }

    /**
     *
     * @param recipeid
     * @return
     */
    @Override
    public Recipe viewRecipe(int recipeid) {
        Recipe r1 = new Recipe();
        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT FROM recipe WHERE recipeid = ?");

            ps.setInt(1, 1);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                r1.setRecipeID(rs.getInt("recipeid"));
                r1.setRecipename(rs.getString("recipename"));
            }
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return r1;

    }

    @Override
    public Recipe insertRecipe() {
         Recipe r1 = new Recipe();
        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO recipe VALUE = ?");

            ps.setInt(1, 1);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                r1.setRecipeID(rs.getInt("recipeid"));
                r1.setRecipename(rs.getString("recipename"));
            }
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return r1;
    }

    @Override
    public Recipe updateRecipe() {
         Recipe r1 = null;
        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE recipe SET recipeid =? WHERE recipename = ?");

            ps.setInt(1, 1);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                r1.setRecipeID(rs.getInt("recipeid"));
                r1.setRecipename(rs.getString("recipename"));
            }
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return r1;
    }

}
