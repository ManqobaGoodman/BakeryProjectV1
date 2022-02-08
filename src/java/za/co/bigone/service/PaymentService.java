/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.service;

import java.util.List;
import za.co.bigone.model.OrderLineItem;
import za.co.bigone.model.Payment;
import za.co.bigone.model.Person;

/**
 *
 * @author Student24
 */
public interface PaymentService {
    boolean confirmPayment(Person person, List<OrderLineItem> lineitems);
}
