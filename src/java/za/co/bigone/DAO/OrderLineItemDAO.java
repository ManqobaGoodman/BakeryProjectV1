/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.DAO;

import java.util.ArrayList;
import za.co.bigone.model.OrderLineItem;

/**
 *
 * @author student02
 */
public interface OrderLineItemDAO {
    ArrayList<OrderLineItem> viewOrderLineItems (int OrderLineItemid);
    OrderLineItem viewOrderLineItem(int orderproductid);
}
