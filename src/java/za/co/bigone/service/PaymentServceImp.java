/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.service;

import java.util.List;
import za.co.bigone.DAO.AddressDAO;
import za.co.bigone.DAO.AddressDAOImpl;
import za.co.bigone.DAO.OrderDAO;
import za.co.bigone.DAO.OrderDAOImpl;
import za.co.bigone.DAO.OrderLineItemDAO;
import za.co.bigone.DAO.OrderLineItemDaoImpl;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Address;
import za.co.bigone.model.Card;
import za.co.bigone.model.Order;
import za.co.bigone.model.OrderLineItem;
import za.co.bigone.model.Payment;
import za.co.bigone.model.Person;

/**
 *
 * @author Student24
 */
public class PaymentServceImp implements PaymentService{


    OrderDAO orderDAO;
    AddressDAO addressDAO;
    OrderLineItemDAO orderLineItemDAO;
    DBPoolManagerBasic dbm;

    public PaymentServceImp(DBPoolManagerBasic dbm) {
        this.orderDAO = new OrderDAOImpl(dbm);
        this.addressDAO = new AddressDAOImpl(dbm);
        this.orderLineItemDAO = new OrderLineItemDaoImpl(dbm);
        this.dbm=dbm;
    }
    
    
    
    

    @Override
    public boolean confirmPayment(Card card, int amount) {
     // return ((int)(Math.random()*amount))%2==0;
     return true;
    }
    
    public boolean createOrder(Person person, List<OrderLineItem> lineitems){
        boolean retVal=false;
        int lastid = orderDAO.lastOderId();
        Address address = addressDAO.viewAddress1(person.getPersonId());
        lastid+=1;
        orderDAO.updateLastOrderId(lastid);
        if(orderDAO.createOrder(lastid,address.getAddressId(), person.getPersonId())){
            OrderLineItemDAO olidao=new OrderLineItemDaoImpl(dbm);
            
            
            
            for (OrderLineItem lineitem : lineitems) {
             olidao.insertOrderLineItem(lastid, lineitem.getProduct().getProductId(), lineitem.getQuantity());
            }
            retVal=true;
        }
        return retVal;
    } 
}
