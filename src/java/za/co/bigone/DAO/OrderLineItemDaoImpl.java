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
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.OrderLineItem;

/**
 *
 * @author student02
 */
public class OrderLineItemDaoImpl implements OrderLineItemDAO {

    DBPoolManagerBasic dbm;
    private Connection con;
    private Connection conction;

    public OrderLineItemDaoImpl() {
    }

    /**
     *
     * @param OrderLineItemid
     * @return
     */
    @Override
    public List<OrderLineItem> viewOrderLineItems(int OrderLineItemid) {
        OrderLineItem oli1 = null;
        List<OrderLineItem> viewoli = new ArrayList<>();
        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM orderlineitem WHERE orderlineitemid = ?");

            ps.setInt(1, OrderLineItemid);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                oli1 = new OrderLineItem();
                oli1.setOrderlineid(rs.getInt("orderlineid"));
                oli1.setOrderproductid(rs.getInt("orderproductid"));
                oli1.setProductid(rs.getInt("productid"));
                oli1.setQuantity(rs.getInt("quantity"));
                viewoli.add(oli1);
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return viewoli;
    }

    @Override
    public OrderLineItem viewOrderLineItem(int orderproductid) {
        OrderLineItem oli1 = new OrderLineItem();
        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM orderlineitem WHERE orderproductid = ?");

            ps.setInt(1, orderproductid);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                oli1.setOrderlineid(rs.getInt("orderlineid"));
                oli1.setOrderproductid(rs.getInt("orderproductid"));
                oli1.setProductid(rs.getInt("productid"));
                oli1.setQuantity(rs.getInt("quantity"));

            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return oli1;
    }

}
