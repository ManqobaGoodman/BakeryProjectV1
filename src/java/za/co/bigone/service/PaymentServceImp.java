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

    public PaymentServceImp(DBPoolManagerBasic dbm) {
        this.orderDAO = new OrderDAOImpl(dbm);
        this.addressDAO = new AddressDAOImpl(dbm);
        this.orderLineItemDAO = new OrderLineItemDaoImpl(dbm);
    }
    

    @Override
    public boolean confirmPayment(Person person, List<OrderLineItem> lineitems) {
        boolean isPayment = false;
       int lastid = orderDAO.lastOderId();
        Address address = addressDAO.viewAddress1(person.getPersonId());
        lastid++;
        Order order = orderDAO.createOrder(lastid,address.getAddressId(), person.getPersonId());
        
        if(order != null){
                isPayment =true;

        }
        return isPayment;
    }
    
}
