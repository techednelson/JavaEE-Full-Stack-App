package service;

import model.Person;

import javax.ejb.Local;
import java.util.List;


@Local
public interface PersonService {

    public List<Person> listPersons();

    public Person encontrarPersonaPorId(Person person);

    public Person encontrarPersonaPorEmail(Person person);

    public void registrarPersona(Person person);

    public void modificarPersona(Person person);

    public void eliminarPersona(Person person);
}