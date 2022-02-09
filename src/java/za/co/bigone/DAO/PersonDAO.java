
package za.co.bigone.DAO;

import za.co.bigone.model.Person;

public interface PersonDAO {
    Person login(String email, String password);
     public Person register(String name, String lastname, String title, String telephone, String email, String password);
     public boolean isPersonAvailable(String email);
     Person getPerson(int personid);
     
}
