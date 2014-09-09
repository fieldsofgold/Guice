package mod04.ex03b;

import java.util.List;

import mod04.ex03b.domain.IPersonService;
import mod04.ex03b.inject.PersonModule;
import mod04.ex03b.model.Person;

import com.google.inject.Guice;
import com.google.inject.Injector;


public class Client {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new PersonModule());
		IPersonService service = injector.getInstance(IPersonService.class);

		Person p1 = new Person("Jan", "Kowalski", 15);
		Person p2 = new Person("Anna", "Nowakowska", 18);
		Person p3 = new Person("Adam", "Rybak", 33);
		service.savePersons(p1, p2, p3);
		
		List<Person> adults = service.getAdults();
		System.out.println(adults);
	}
}
