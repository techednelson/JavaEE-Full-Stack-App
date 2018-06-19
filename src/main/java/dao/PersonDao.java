package dao;

import java.util.List;
import model.Person;

public interface PersonDao {
    List<Person> findAllPersons();

    Person findPersonById(Person person);

    Person findPersonByEmail(Person person);

    void insertPerson(Person person);

    void updatePerson(Person person);

    void deletePerson(Person person);
}
