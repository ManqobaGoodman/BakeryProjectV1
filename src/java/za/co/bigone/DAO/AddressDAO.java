/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.DAO;

import java.util.List;
import za.co.bigone.model.Address;

/**
 *
 * @author student02
 */
public interface AddressDAO {
    List<Address> viewAddress ();
    Address viewAddress1(int personId);
    boolean insertAddress1(int peronId, String address1,String town, int postalCode);
    boolean updateAddress1(int personId,String address1,String town, int postalCode);
    
}
