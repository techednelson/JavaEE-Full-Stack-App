package beans;

import model.Person;
import org.primefaces.event.RowEditEvent;
import service.PersonService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named("personBean")
@RequestScoped
public class PersonBean {

    @Inject
    private PersonService personService;

    private Person personSelected;

    private List<Person> persons;

    public PersonBean() { }

    @PostConstruct
    public void init() {
        //Variables initialization
        persons = personService.listPersons();
        personSelected = new Person();
    }

    public void editListener(RowEditEvent event) {
        Person person = (Person) event.getObject();
        personService.modifyPerson(person);
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public Person getPersonSelected() {
        return personSelected;
    }

    public void setPersonSelected(Person personSelected) {
        this.personSelected = personSelected;
    }

    public void updatePersonSelected() {
        this.personSelected = new Person();
    }

    public void addPerson() {
        personService.registerPerson(this.personSelected);
        this.personSelected = null;
        //List update
        this.init();
    }

    public void deletePerson() {
        personService.deletePerson(this.personSelected);
        this.personSelected = null;
        //List update
        this.init();
    }

    public PersonService getPersonService() {
        return personService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
}
