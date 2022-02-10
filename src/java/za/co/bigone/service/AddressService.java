/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.service;

import java.util.List;
import za.co.bigone.model.Address;

/**
 *
 * @author Student24
 */
public interface AddressService {
   
    Address viewAddress1(int personId);
    boolean insertAddress1(int peronId, String address1,String town, int postalCode);
    boolean updateAddress1(int peronId, String address1,String town, int postalCode);
}
