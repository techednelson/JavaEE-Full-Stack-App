package dao;

import model.Person;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class PersonDaoImpl implements PersonDao {
    @PersistenceContext(unitName = "human_resourcesPU")
    EntityManager em;

    @Override
    public List<Person> findAllPersons() {
        return em.createNamedQuery("Person.findAll").getResultList();
    }

    @Override
    public Person findPersonById(Person person) {
        return em.find(Person.class, person.getId());
    }

    @Override
    public Person findPersonByEmail(Person person) {
        Query query = em.createQuery("from person p where p.email = email");
        query.setParameter("email", person.getEmail());
        return (Person) query.getSingleResult();
    }

    @Override
    public void insertPerson(Person person) {
        em.persist(person);
    }

    @Override
    public void updatePerson(Person person) {
        em.merge(person);
    }

    @Override
    public void deletePerson(Person person) {
        em.merge(person);
        em.remove(person);
    }
}
