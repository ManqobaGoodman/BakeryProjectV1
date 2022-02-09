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
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Invoice;

/**
 *
 * @author student02
 */
public class InvoiceDAOImpl implements InvoiceDAO {

    DBPoolManagerBasic dbm;
    private Connection con;
    //private Connection conction;

    public InvoiceDAOImpl() {
    }

    @Override
    public Invoice viewInvoice(int invoiceid, int orderid, LocalDate invoicedate) {
        Invoice inv = null;

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM invoice WHERE invoiceid = ? ");

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                inv.setInvoiceid(rs.getInt("invoiceid"));
                inv.setOrderid(rs.getInt("orderid"));
                inv.setInvoicedate(invoicedate);
                //inv.setInvoicedate(rs.("invoicedate"));
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
            PreparedStatement ps = con.prepareStatement("SELECT lastid FROM lastinvoiceid WHERE keyid = orderid");
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
    public Invoice createInvoice(int invoiceid, int orderid, LocalDate invoicedate) {
        Invoice inv = null;

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO invoice VALUES (null,?,CURDATE())");

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                inv.setInvoiceid(rs.getInt("invoiceid"));
                inv.setOrderid(rs.getInt("orderid"));
                inv.setInvoicedate(invoicedate);
                
            }
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return inv;
    }
}
