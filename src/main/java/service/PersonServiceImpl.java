package service;

import model.Person;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;


@Stateless
public class PersonServiceImpl implements PersonService {

    @Override
    public List<Person> listPersons() {
        List<Person> personas = new ArrayList<>();
        personas.add(new Person(1, "Juan", "Perez", "jperez@gmail.com", "55668798"));
        personas.add(new Person(2, "Martha", "Suarez", "msuarez@mail.com", "566998811"));
        return personas;
    }

    @Override
    public Person encontrarPersonaPorId(Person person) {
        return null;
    }

    @Override
    public Person encontrarPersonaPorEmail(Person person) {
        return null;
    }

    @Override
    public void registrarPersona(Person person) {}

    @Override
    public void modificarPersona(Person person) {}

    @Override
    public void eliminarPersona(Person person) {}

}