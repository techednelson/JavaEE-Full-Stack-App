package service;

import dao.PersonDao;
import model.Person;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;


@Stateless
public class PersonServiceImpl implements PersonService {

    @Inject
    private PersonDao personDao;

    @Override
    public List<Person> listPersons() {
        return personDao.findAllPersons();
    }

    @Override
    public Person findPersonById(Person person) {
        return personDao.findPersonById(person);
    }

    @Override
    public Person findPersonByEmail(Person person) {
        return personDao.findPersonByEmail(person);
    }

    @Override
    public void registerPerson(Person person) {
        personDao.insertPerson(person);
    }

    @Override
    public void modifyPerson(Person person) {
        personDao.updatePerson(person);
    }

    @Override
    public void deletePerson(Person person) {
        personDao.deletePerson(person);
    }

}