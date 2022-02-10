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
import java.util.logging.Level;
import java.util.logging.Logger;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.EmailInvoice;
import za.co.bigone.model.Order;

/**
 *
 * @author student02
 */
public class EmailInvoiceDAOImpl implements EmailInvoiceDAO {

    DBPoolManagerBasic dbm;
    private Connection con;
    PreparedStatement ps;

    public EmailInvoiceDAOImpl() {
    }

    public EmailInvoiceDAOImpl(DBPoolManagerBasic dbm) {
        this.dbm = dbm;
    }

    @Override
    public EmailInvoice getPerson(int personid) {
        EmailInvoice ei = null;

        try {

            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM emailtable WHERE personid=?;");

            ps.setInt(1, personid);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ei = new EmailInvoice();
                ei.setPersonid(rs.getInt("personid"));
                ei.setEmailmessage(rs.getString("emailmessage"));

            }
            con.close();

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
        return ei;

    }

    @Override
    public EmailInvoice getEmailmessage(String emailmessage) {

        EmailInvoice emsg = null;

        try {

            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT emailmessage FROM emailtable WHERE personid=?;");

            ps.setString(1, emailmessage);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                emsg = new EmailInvoice();
                emsg.setEmailmessage(rs.getString("emailmessage"));

            }
            con.close();

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
        return emsg;
    }

}
