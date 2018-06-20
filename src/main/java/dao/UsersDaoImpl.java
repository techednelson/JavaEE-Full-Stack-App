package dao;

import model.Users;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UsersDaoImpl implements  UsersDao {

    @PersistenceContext(unitName = "human_resourcesPU")
    EntityManager em;

    @Override
    public List<Users> findAllUsers() {
        return em.createNamedQuery("users.findAll").getResultList();
    }

    @Override
    public Users findUserById(Users user) {
        return em.find(Users.class, user.getId());
    }

    @Override
    public void insertUser(Users user) {
        em.persist(user);
    }

    @Override
    public void updateUser(Users user) {
        em.merge(user);
    }

    @Override
    public void deleteUser(Users user) {
        em.merge(user);
        em.remove(user);
    }

}
