/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.service;

import java.util.List;
import za.co.bigone.model.OrderLineItem;

/**
 *
 * @author Student24
 */
public class CartServiceImpl implements CartService{

    @Override
    public List<OrderLineItem> addCart(List<OrderLineItem> itemlist,OrderLineItem orderLineItem) {
        
        if(itemlist != null){
            itemlist.add(orderLineItem);
        }
        
        return null;
    }
    
}
