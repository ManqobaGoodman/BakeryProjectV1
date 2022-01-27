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
import java.util.List;
import za.co.bigone.DAO.AddressDAO;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Address;

/**
 *
 * @author student02
 */
public class AddressDAOImpl implements AddressDAO {

    DBPoolManagerBasic dbm;
    private Connection con;
    private Connection conction;

    public AddressDAOImpl() {
    }
    //---------------------View all addresses-------------------------------
    @Override
    public List<Address> viewAddress() {
        Address Addr1 = null;
        List<Address> viewAddr = new ArrayList<>();

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM addressid ");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Addr1.setAddress1(rs.getString("Address1"));
                Addr1.setAddress2(rs.getString("Address2"));
                Addr1.setAddressId(rs.getInt("AddressId"));
                Addr1.setPostalCode(rs.getInt("PostalCode"));
                Addr1.setProvince(rs.getString("province"));
                Addr1.setTown(rs.getString("Town"));
                viewAddr.add(Addr1);
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return viewAddr;
    }
     //---------------------View one address-------------------------------
    @Override
    public Address viewAddress1() {
            Address Addr1 = new Address();
        

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM addressid VALUE = ?");

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Addr1.setAddress1(rs.getString("Address1"));
                Addr1.setAddress2(rs.getString("Address2"));
                Addr1.setAddressId(rs.getInt("AddressId"));
                Addr1.setPostalCode(rs.getInt("PostalCode"));
                Addr1.setProvince(rs.getString("province"));
                Addr1.setTown(rs.getString("Town"));
                
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return Addr1;
    }

        //--------------Insert new adddress---------------
    
       

    @Override
    public Address insertAddress1() {
         Address Addr1 = new Address();
        

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO address VALUE = ?");

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Addr1.setAddress1(rs.getString("Address1"));
                Addr1.setAddress2(rs.getString("Address2"));
                Addr1.setAddressId(rs.getInt("AddressId"));
                Addr1.setPostalCode(rs.getInt("PostalCode"));
                Addr1.setProvince(rs.getString("province"));
                Addr1.setTown(rs.getString("Town"));
                
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return Addr1;
    }
         //--------------Edit adddress---------------
    @Override
    public Address updateAddress1() {
         Address Addr1 = new Address();
        

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE address SET (?,?,?,?,?,?) WHERE (?,?,?,?,?,?)");

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Addr1.setAddress1(rs.getString("Address1"));
                Addr1.setAddress2(rs.getString("Address2"));
                Addr1.setAddressId(rs.getInt("AddressId"));
                Addr1.setPostalCode(rs.getInt("PostalCode"));
                Addr1.setProvince(rs.getString("province"));
                Addr1.setTown(rs.getString("Town"));
                
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return Addr1;
    }
    
}
