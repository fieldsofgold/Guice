package cwiczenie4.Client;

import java.util.List;

public interface IPersonService {
    public void savePersons(Person... persons);
    public void savePersons(List<Person> persons);
    public List<Person> getTeenagers();
    public List<Person> getAdults();
}
