/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.DAO;

import java.util.ArrayList;
import java.util.List;
import za.co.bigone.model.OrderLineItem;

/**
 *
 * @author student02
 */
public interface OrderLineItemDAO {

    List<OrderLineItem> viewOrderLineItems (List<OrderLineItem> OrderLineItemList);

    OrderLineItem viewOrderLineItem(int orderproductid);
}
