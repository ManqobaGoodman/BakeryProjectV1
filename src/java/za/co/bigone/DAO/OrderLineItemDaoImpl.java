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
import java.util.logging.Level;
import java.util.logging.Logger;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.OrderLineItem;
import za.co.bigone.model.Product;

/**
 *
 * @author student02
 */
public class OrderLineItemDaoImpl implements OrderLineItemDAO {

    private DBPoolManagerBasic dbm;
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public OrderLineItemDaoImpl(DBPoolManagerBasic dbpool) {
        dbm = dbpool;
    }

    /**
     *
     * @param OrderLineItemList
     * @param OrderLineItemid
     * @return
     */
    @Override
    public List<OrderLineItem> viewOrderLineItems(int orderId) {
        List<OrderLineItem> viewoli = new ArrayList<>();
        try {
            Connection con = dbm.getConnection();
            ps = con.prepareStatement(""
                    + "SELECT nameofproduct,productdescription,productprice,productpicture,quantity,orderlineitemid \n"
                    + "FROM orderlineitem AS oli, product AS p WHERE oli.orderid=? AND oli.productid=p.productid");
            ps.setInt(1, orderId);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setNameOfProduct(rs.getString("nameofproduct"));
                p.setProductDescription(rs.getString("productdescription"));
                p.setProductPrice(rs.getDouble("productprice"));
                p.setPicture(rs.getString("productpicture"));
                OrderLineItem oli1 = new OrderLineItem(rs.getInt("orderlineitemid"), p, rs.getInt("quantity"));
                viewoli.add(oli1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            closeStreams();
        }
        return viewoli;
    }

    @Override
    public OrderLineItem viewOrderLineItem(int orderlineitemid) {
        OrderLineItem oli1 = new OrderLineItem();
        try {
            con = dbm.getConnection();
            ps = con.prepareStatement(""
                    + "SELECT nameofproduct,productdescription,productprice,productpicture,quantity,orderlineitemid \n"
                    + "FROM orderlineitem AS oli, product AS p WHERE oli.orderlineitemid=? AND oli.productid=p.productid");

            ps.setInt(1, orderlineitemid);
            rs = ps.executeQuery();
            if (rs.next()) {
                Product p = new Product();
                p.setNameOfProduct(rs.getString("nameofproduct"));
                p.setProductDescription(rs.getString("productdescription"));
                p.setProductPrice(rs.getDouble("productprice"));
                p.setPicture(rs.getString("productpicture"));
                oli1 = new OrderLineItem(rs.getInt("orderlineitemid"), p, rs.getInt("quantity"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            closeStreams();
        }
        return oli1;
    }

    private void closeStreams() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Resultset failed to close");
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Prepared failed to close");
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Connection failed to close");
            }
        }
    }

    @Override
    public boolean insertOrderLineItem(int orderid, int productid, int quantity) {
        boolean retVal = false;

        try {
            con = dbm.getConnection();
            ps = con.prepareStatement("INSERT INTO orderlineitem (orderid, productid, quantity) VALUES (?,?,?);");
            ps.setInt(1, orderid);
            ps.setInt(2, productid);
            ps.setInt(3, quantity);

            retVal = ps.executeUpdate() > 0;
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return retVal;
    }
}
