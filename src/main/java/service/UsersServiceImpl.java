package service;


import dao.UsersDao;
import model.Users;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class UsersServiceImpl implements UsersService {

    @Inject
    private UsersDao userDao;

    @Override
    public List<Users> listUsers() {
        return userDao.findAllUsers();
    }

    @Override
    public Users findUserById(Users user) {
        return userDao.findUserById(user);
    }

    @Override
    public void registerUser(Users user) {
        userDao.insertUser(user);
    }

    @Override
    public void modifyUser(Users user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(Users user) {
        userDao.deleteUser(user);
    }

}
