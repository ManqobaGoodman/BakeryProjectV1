/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.service;

import za.co.bigone.DAO.AddressDAO;
import za.co.bigone.DAO.AddressDAOImpl;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Address;

/**
 *
 * @author Student24
 */
public class AddressServiceImplement  implements AddressService{
            private AddressDAO addressDAO;
    public AddressServiceImplement(DBPoolManagerBasic dbpool) {
        this.addressDAO = new AddressDAOImpl(dbpool);
    }

    @Override
    public Address viewAddress1(int personId) {
        return addressDAO.viewAddress1(personId);
    }

    @Override
    public Address insertAddress1(int peronId, String address1,String town, int postalCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Address updateAddress1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
