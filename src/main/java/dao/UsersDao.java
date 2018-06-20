package dao;

import model.Users;

import java.util.List;

public interface UsersDao {

    List<Users> findAllUsers();

    Users findUserById(Users user);

    void insertUser(Users user);

    void updateUser(Users user);

    void deleteUser(Users user);

}
