
package za.co.bigone.service;

import za.co.bigone.DAO.PersonDAO;
import za.co.bigone.DAO.PersonDAOImpl;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Person;

/**
 *
 * @author Student24
 */
public class LoginRegisterServiceImplementation implements LoginRegisterService {
    PersonDAO pdao;
    
    public LoginRegisterServiceImplementation(DBPoolManagerBasic dbm){
        this.pdao = new PersonDAOImpl(dbm);
    }
 
    @Override
    public Person login(String email, String password) {
        return pdao.login(email, password);
    }

    @Override
    public Person register(String name, String lastname, String title, String telephone, String email, String password) {
        return pdao.register(name, lastname, title, telephone, email, password);
    }

    @Override
    public Boolean isEmailAvailable(String email) {
        return pdao.isPersonAvailable(email);
    }

}
