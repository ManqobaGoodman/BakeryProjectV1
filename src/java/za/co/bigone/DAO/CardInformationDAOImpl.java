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
import za.co.bigone.model.Card;

/**
 *
 * @author student02
 */
public class CardInformationDAOImpl implements CardInformationDAO {

    DBPoolManagerBasic dbm;
    private Connection con;
    PreparedStatement ps;

    public CardInformationDAOImpl(DBPoolManagerBasic dbm) {
        this.dbm = dbm;
    }

    @Override
    public Card viewCardInformation(int invoiceid) {
        Card card1 = null;

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT (cardholder,cardnumber,cvv) FROM cardinformation where invoiceid = ?");
            ps.setInt(1, invoiceid);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                card1 = new Card();

                card1.setCardHolder(rs.getString("cardholder"));
                card1.setCardNum(rs.getString("cardnumber"));
                card1.setCvv(rs.getString("cvv"));

            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return card1;
    }

    @Override
    public Card insertCardInformation(int invoiceid, String cardholder, String cardnumber, String cvv) {
        Card card1 = new Card();

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO cardinformation (invoiceid,cardholder,cardnumber,cvv) VALUE (?,?,?,? )");

            ps.setInt(1, invoiceid);
            ps.setString(2, "cardholder");
            ps.setString(3, "cardnumber");
            ps.setString(4, "cvv");

            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return card1;

    }

}
