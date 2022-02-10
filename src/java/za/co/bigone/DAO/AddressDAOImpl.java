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
    public Address viewAddress1(int personid) {
            Address ddr1 = null;
        

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM address where personid = ?");
            ps.setInt(1, personid);
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ddr1 = new Address();
                
                ddr1.setAddressId(rs.getInt("addressid"));
                ddr1.setAddress1(rs.getString("Address1"));
                ddr1.setTown(rs.getString("Town"));
                ddr1.setPostalCode(rs.getInt("PostalCode"));
                
                
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return ddr1;
    }

        //--------------Insert new adddress---------------
    
       

    @Override
    public boolean insertAddress1(int personId, String address1,String town, int postalCode) {
          boolean retVal = false;
         
        

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO address (addressid,personid,address1,town,postalcode) VALUE (null,?,?,?,?)");
            
            ps.setInt(1, personId);
            ps.setString(2, address1);
            ps.setString(3, town);
            ps.setInt(4, postalCode);
            
            retVal = ps.executeUpdate() > 0;
            
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return retVal;
    }
         //--------------Edit adddress---------------
    @Override
    public boolean updateAddress1(int personId,String address1,String town, int postalCode) {
          boolean retVal = false;
        

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE address SET address1= ?, town= ?, postalcode=? WHERE personid=?");
            ps.setString(1, address1);
            ps.setString(2, town);
             ps.setInt(3, postalCode);
             ps.setInt(4, personId);
             
             retVal = ps.executeUpdate() > 0;
           
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return retVal;
    }
    
}
