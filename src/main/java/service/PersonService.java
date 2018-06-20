package service;

import model.Person;

import javax.ejb.Local;
import java.util.List;


@Local
public interface PersonService {

   List<Person> listPersons();

   Person findPersonById(Person person);

   Person findPersonByEmail(Person person);

   void registerPerson(Person person);

   void modifyPerson(Person person);

   void deletePerson(Person person);

}