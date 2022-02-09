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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    PreparedStatement ps;
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
    public int lastOderId() {

        int lastid = 0;
        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT lastid FROM lastidtable WHERE keyid = 'orderid'");

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
    public boolean createOrder(int lastid, int addressid, int personid) {
        boolean retVal = false;
        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO ordertable VALUES (?,?,?,CURDATE(),'n');");
            ps.setInt(1, lastid);
            ps.setInt(2, addressid);
            ps.setInt(3, personid);
            retVal = ps.executeUpdate() > 0;
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return retVal;
    }

    @Override
    public boolean updateLastOrderId(int orderId) {
        boolean retVal = false;
        try {
            con = dbm.getConnection();
            ps = con.prepareStatement("UPDATE lastidtable SET lastid=? WHERE keyid='orderid'");
            ps.setInt(1, orderId);
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
    public Order getOrder(int orderid) {
        Order order = null ;
        
        try {
            
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT orderid,addressid ,personid,orderdate,delivered FROM order WHERE orderid=?;");
            
            ps.setInt(1, orderid);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                order = new Order();
                order.setOrderid(rs.getInt("orderid"));
                order.setPersonid(rs.getInt("personid"));
         
            }
            con.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return order;
    }

    @Override
    public Order getPerson(int personid) {
        Order person = null ;
        
        try {
            
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT orderid,addressid ,personid,orderdate,delivered FROM order WHERE personid=?;");
            
            ps.setInt(1, personid);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                person = new Order();
                person.setOrderid(rs.getInt("orderid"));
                person.setPersonid(rs.getInt("personid"));
     
                
            }
            con.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return person;
    }

}
