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
import za.co.bigone.model.Payment;

/**
 *
 * @author student02
 */
public class PaymentDAOImpl implements PaymentDAO {

    DBPoolManagerBasic dbm;
    private Connection con;
    private Connection conction;

    @Override
    public Payment viewPayment(int paymentid, int invoiceid, String paymenttype) {
        Payment pay1 = null;

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM payment WHERE paymentid = ? ");

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pay1.setInvoiceid(rs.getInt("invoiceid"));
                pay1.setPaymentid(rs.getInt("paymentid"));
                pay1.setPaymenttype(rs.getString("paymenttype"));

            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return pay1;
    }
}