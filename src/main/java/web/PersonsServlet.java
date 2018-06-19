package web;

import model.Person;
import service.PersonService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/persons")
public class PersonsServlet extends HttpServlet {

    @EJB
    PersonService personServiceEjbLocal;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Person> persons = personServiceEjbLocal.listPersons();
        System.out.println("persons:" + persons);
        request.setAttribute("persons", persons);
        request.getRequestDispatcher("/listPersons.jsp").forward(request, response);
    }
}
