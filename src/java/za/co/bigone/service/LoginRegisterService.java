/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.service;

import za.co.bigone.model.Person;

/**
 *
 * @author Student24
 */
public interface LoginRegisterService {

    Person login(String email, String password);

    Person register(String name, String lastname, String title, String telephone, String email, String password);

    Boolean isEmailAvailable(String email);

}
