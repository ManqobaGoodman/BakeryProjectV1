
package za.co.bigone.DAO;

import java.util.List;
import za.co.bigone.model.OrderLineItem;

/**
 *
 * @author student02
 */
public interface OrderLineItemDAO {
   List<OrderLineItem> viewOrderLineItems(int orderId);
   OrderLineItem viewOrderLineItem(int orderlineitemid);
   boolean insertOrderLineItem(int orderid,int productid, int quantity);
}
