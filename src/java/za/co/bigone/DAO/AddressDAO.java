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
    Address viewAddress1();
    Address insertAddress1();
    Address updateAddress1();
    
}
