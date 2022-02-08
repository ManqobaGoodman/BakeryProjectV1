/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.DAO;

import java.util.List;
import java.util.Locale;
import za.co.bigone.model.Order;
import za.co.bigone.model.OrderLineItem;

/**
 *
 * @author student02
 */
public interface OrderDAO {

    List<OrderLineItem> orderLine(int productid, int quantity);

    Order orderPlace(List<OrderLineItem> orderLine, int personid, String Address, Locale date);
    
    int lastOderId ();
    
    Order createOrder (int lastid , int addressid ,int personid);
    
    
    
}
