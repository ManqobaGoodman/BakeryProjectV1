/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.DAO;

import za.co.bigone.model.EmailInvoice;

/**
 *
 * @author student02
 */
public interface EmailInvoiceDAO {
    
    EmailInvoice getPerson(int personid);
    EmailInvoice getEmailmessage(String emailmessage);
    boolean insert(int personid,String emailmessage);
    
}
