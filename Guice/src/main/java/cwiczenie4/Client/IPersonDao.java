/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cwiczenie4.Client;

import java.util.List;

/**
 *
 * @author kursant2
 */
public interface IPersonDao {
    public void savePersons(Person... persons);
    public void savePersons(List<Person> persons);
    public List<Person> getPersons();
    
}
