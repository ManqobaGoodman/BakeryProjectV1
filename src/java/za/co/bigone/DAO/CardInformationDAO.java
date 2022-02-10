/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.DAO;

import za.co.bigone.model.Card;

/**
 *
 * @author student02
 */
public interface CardInformationDAO {
    Card viewCardInformation(int paymentid);
    Card insertCardInformation(int paymentid, String cardholder,String cardnumber,String cvv );
}
