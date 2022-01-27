/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.DAO;

import java.time.LocalDate;
import za.co.bigone.model.Invoice;

/**
 *
 * @author student02
 */
public interface InvoiceDAO {
    Invoice  viewInvoice(int invoiceid,int orderid,LocalDate invoicedate );
}
