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
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Order;
import za.co.bigone.model.OrderLineItem;

/**
 *
 * @author student02
 */
public class OrderDAOImpl implements OrderDAO {

    DBPoolManagerBasic dbm;
    private Connection con;
    // private Connection conction;

    public OrderDAOImpl() {

    }

    public OrderDAOImpl(DBPoolManagerBasic dbm) {
        this.dbm = dbm;
    }

    @Override
    public List<OrderLineItem> orderLine(int productid, int quantity) {
        OrderLineItem o1 = null;
        ArrayList<OrderLineItem> orderL = new ArrayList<>();

        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM orderid WHERE orderproctid = ?");

            ps.setInt(1, 1);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
//                o1 = new OrderLineItem();
//                o1.setOrderlineid(rs.getInt("Orderlineid"));
//                o1.setOrderproductid(rs.getInt("orderproductid"));
//                o1.setProductid(rs.getInt("productid"));
//                o1.setQuantity(rs.getInt("quantity"));
//                orderL.add(o1);

            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return orderL;

    }

    @Override
    public Order orderPlace(List<OrderLineItem> orderLine, int personid, String Address, Locale date) {

        return null;
    }

    @Override
    public int lastinvoice() {

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
    public Order createOrder(int lastid,  int addressid, int personid) {
        Order createOrder = null;
        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO ordertable VALUES (?,?,?,CURDATE(),'n');");
            ps.setInt(1, lastid);
            ps.setInt(2,addressid);
            ps.setInt(3, personid);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                createOrder.setOrderid(rs.getInt("orderid"));
                createOrder.setOrderlineid(rs.getInt("orderlineid"));
                createOrder.setPersonid(rs.getInt("personid"));
                createOrder.setAddressid(rs.getInt("addressid"));
                

            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return createOrder;

    }

}
