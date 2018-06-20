package web;

import model.Users;
import service.UsersService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/users")
public class UsersServlet extends HttpServlet {

    @EJB
    UsersService userServiceEjbLocal;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Users> users = userServiceEjbLocal.listUsers();
        System.out.println("users:" + users);
        request.setAttribute("users", users);
        request.getRequestDispatcher("/listUsers.jsp").forward(request, response);
    }
}

