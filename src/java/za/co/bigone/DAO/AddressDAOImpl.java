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
  //  private Connection conction;

    public AddressDAOImpl(DBPoolManagerBasic dbm) {
        this.dbm = dbm;
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
                
                Addr1.setAddressId(rs.getInt("AddressId"));
                Addr1.setPostalCode(rs.getInt("PostalCode"));
                
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
    public Address viewAddress1(int addressId) {
            Address Addr1 = new Address();
        

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Address where addressid = ?");
            ps.setInt(1, addressId);
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Addr1.setAddressId(rs.getInt("AddressId"));
                Addr1.setAddress1(rs.getString("Address1"));
                Addr1.setTown(rs.getString("Town"));
                Addr1.setPostalCode(rs.getInt("PostalCode"));
                
                
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return Addr1;
    }

        //--------------Insert new adddress---------------
    
       

    @Override
    public Address insertAddress1(int peronId, String address1,String town, int postalCode) {
         Address Addr1 = new Address();
         
        

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO address (addressid,personid,addr1,town,postalcode) VALUE (null,?,?,?,? )");
            
            ps.setInt(1, peronId);
            ps.setString(2, address1);
            ps.setString(3, town);
            ps.setInt(4, postalCode);
            ps.executeUpdate();
            
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
                Addr1.setAddressId(rs.getInt("AddressId"));
                Addr1.setPostalCode(rs.getInt("PostalCode"));
                Addr1.setTown(rs.getString("Town"));
                
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return Addr1;
    }
    
}
