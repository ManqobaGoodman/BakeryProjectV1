/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import za.co.bigone.controller.Login;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Person;

/**
 *
 * @author Student24
 */
public class PersonDAOImpl implements PersonDAO {

    DBPoolManagerBasic dbm;
    private Connection con;
    private Connection conction;

    public PersonDAOImpl(DBPoolManagerBasic dbm) {
        this.dbm = dbm;
    }

    public Connection getConnectionDB() {
        try {
            con = DriverManager.getConnection("");
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return con;
    }

    public Person login(String email, String password) {
        Person p = null;
        try {
            // -------------  for test purposes

            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("Select personid, firstname, lastname, title, telephonenumber, emailaddress  from person where emailaddress=? AND password = ?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                p = new Person();
                p.setPersonId(rs.getInt("personid"));
                p.setFirstname(rs.getString("firstname"));
                p.setLastname(rs.getString("lastname"));
                p.setTitle(rs.getString("title"));
                p.setEmail(rs.getString("emailaddress"));
                p.setTelephone(rs.getString("telephonenumber"));
                System.out.println("The name is: " + rs.getString("firstname") + " -------------------------------------------------------------");
            }
            con.close();
            // ----------------------------------
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }

    @Override
    public Person register(String firstname, String lastname, String title, String telephone, String email, String password) {
        Person p = null;
        System.out.println("Goodman");
        //not admin
        int isAdmin = 1;
        //the persson is active
        int isActive = 2;
        try {
            // -------------  for test purposes

            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO person VALUES (null,?, ?, ?,?,?,?);");
            
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, title);
            ps.setString(4, telephone);
            ps.setString(5, email);
            ps.setString(6, password);
//            ps.setInt(7, isAdmin);
//            ps.setInt(8, isActive);
            
            ps.executeUpdate();
            
            ps = con.prepareStatement("Select personid, firstname, lastname, title, telephonenumber, emailaddress  from person where emailaddress=?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery(); 
            if (rs.next()) {
                p = new Person();
                p.setPersonId(rs.getInt("personid"));
                p.setFirstname(rs.getString("firstname"));
                p.setLastname(rs.getString("lastname"));
                p.setTitle(rs.getString("title"));
                p.setEmail(rs.getString("emailaddress"));
                p.setTelephone(rs.getString("telephonenumber"));
                
                System.out.println("The name is: " + rs.getString("firstname") + " -------------------------------------------------------------");
            }
            con.close();
          
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }

    @Override
    public boolean isPersonAvailable(String email) {
        boolean isAvailable = false;
        String available = null;
        try {
            // -------------  for test purposes

            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("Select emailaddress  from person where emailaddress=?");
            ps.setString(1, email);
           
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               
               available = rs.getString("emailaddress");
                if (email.equalsIgnoreCase(email)) {
                    isAvailable = true;
                }
                
                System.out.println("The name is: " + rs.getString("firstname") + " -------------------------------------------------------------");
            }
            con.close();
            // ----------------------------------
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return isAvailable;
    }
}
