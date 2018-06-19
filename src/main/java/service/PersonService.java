package service;

import model.Person;

import javax.ejb.Local;
import java.util.List;


@Local
public interface PersonService {

    public List<Person> listPersons();

    public Person findPersonById(Person person);

    public Person findPersonByEmail(Person person);

    public void registerPerson(Person person);

    public void modifyPerson(Person person);

    public void deletePerson(Person person);
}