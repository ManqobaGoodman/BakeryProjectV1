/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.DAO;

import za.co.bigone.model.Payment;

/**
 *
 * @author student02
 */
public interface PaymentDAO {
    Payment viewPayment (int paymentid,int invoiceid,String paymenttype);
    
}
