package service;

import model.Users;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UsersService {

    List<Users> listUsers();

    Users findUserById(Users user);

    void registerUser(Users user);

    void modifyUser(Users user);

    void deleteUser(Users user);

}
