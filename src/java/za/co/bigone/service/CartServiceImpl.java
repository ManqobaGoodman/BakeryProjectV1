/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.service;

import java.util.List;
import za.co.bigone.DAO.OrderLineItemDAO;
import za.co.bigone.DAO.OrderLineItemDaoImpl;
import za.co.bigone.DAO.ProductDAO;
import za.co.bigone.DAO.ProductDAOImple;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.OrderLineItem;
import za.co.bigone.model.Product;

/**
 *
 * @author Student24
 */
public class CartServiceImpl implements CartService{
    private OrderLineItemDAO orderLineItemDAO;
    private ProductDAO productDAO;
            
    public CartServiceImpl(DBPoolManagerBasic dbpool) {
        this.orderLineItemDAO = new OrderLineItemDaoImpl(dbpool);
        this.productDAO = new ProductDAOImple(dbpool);
    }
    
   
    @Override
    public List<OrderLineItem> addCart(List<OrderLineItem> itemlist,OrderLineItem orderLineItem) {
        if(itemlist != null){
            itemlist.add(orderLineItem);
        }else{
           itemlist =(List<OrderLineItem>) new OrderLineItem();
           itemlist.add(orderLineItem);
        }
        
        
        return itemlist;
    }

    @Override
    public Product getProductForOrderLineItem(int productId) {
        return productDAO.viewProduct(productId);
    }
    
}
