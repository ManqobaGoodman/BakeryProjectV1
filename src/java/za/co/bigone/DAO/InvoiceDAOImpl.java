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
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Invoice;

/**
 *
 * @author student02
 */
public class InvoiceDAOImpl implements InvoiceDAO {

    DBPoolManagerBasic dbm;
    private Connection con;
    PreparedStatement ps;
    //private Connection conction;

    public InvoiceDAOImpl(DBPoolManagerBasic dbpool) {
        dbm = dbpool;
    }

    @Override
    public Invoice viewInvoice(int orderid) {
        Invoice inv = null;

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM invoice WHERE invoiceid = ? ");

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                inv = new Invoice();
                inv.setInvoiceid(rs.getInt("invoiceid"));
                inv.setOrderid(rs.getInt("orderid"));
                inv.setInvoicedate("invoicedate");

            }
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return inv;
    }

    @Override
    public int lastInvoiceID() {
        int lastid = 0;
        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT lastid FROM lastidtable WHERE keyid = 'invoiceid';");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lastid = rs.getInt("lastid");
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lastid;
    }

    @Override
    public boolean createInvoice(int invoiceid, int orderid) {
        boolean inv = false;

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO invoice VALUES (?,?,CURDATE())");
            
            ps.setInt(1, invoiceid);
            ps.setInt(2, orderid);
            
            inv = ps.executeUpdate() >0;
            

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(InvoiceDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       return inv;
    }

    @Override
    public boolean updateLastInvoiceId(int invoiceId) {
         boolean retVal = false;
        try {
            con = dbm.getConnection();
            ps = con.prepareStatement("UPDATE lastidtable SET lastid=? WHERE keyid='invoiceid'");
            ps.setInt(1, invoiceId);
            retVal = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(OrderDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return retVal;
    
    }

    @Override
    public int lastInvoiceId() {
        
        int lastid = 0;
        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT lastid FROM lastidtable WHERE keyid = 'invoiceid'");

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                lastid = rs.getInt("lastid");

            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lastid;
    }

}
