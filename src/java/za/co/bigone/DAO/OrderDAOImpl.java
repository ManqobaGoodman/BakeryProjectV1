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
public class OrderDAOImpl implements OrderDAO{
    DBPoolManagerBasic dbm;
    private Connection con;
    private Connection conction;
    
    public OrderDAOImpl(){
        
    }

    public OrderDAOImpl(DBPoolManagerBasic dbm) {
        this.dbm = dbm;
    }
    

    @Override
    public List<OrderLineItem> orderLine(int productid, int quantity) {
        Order o1 = null;
        List<OrderLineItem> orderL = new ArrayList<>();
        
        try {
            Connection con = dbm.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM orderid WHERE orderproctid = ?");
        
            ps.setInt(1, 1);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                o1 = new Order();
                o1.setOrderlineid(rs.getInt("Orderlineid"));
                o1.setAddressid(rs.getInt("Addressid"));
                o1.setOrderid(rs.getInt("Orderid"));
                o1.setPersonid(rs.getInt("Personid"));
                //orderL.addAll((Collection<? extends OrderLineItem>) o1);
                
            }
            con.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }   
            return orderL;
                
    }

    @Override
    public Order orderPlace(List<OrderLineItem> orderLine, int personid, String Address, Locale date) {
        
        return null;
    }
    
}
