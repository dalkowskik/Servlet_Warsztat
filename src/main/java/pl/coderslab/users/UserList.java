package pl.coderslab.users;

import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/UserList")
public class UserList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        getServletContext().getRequestDispatcher("/users/list.jsp")
//                .forward(request, response);
//
//        UserDao userDao = new UserDao();
//        request.setAttribute("users", userDao.findAll());

        UserDao userDAO = new UserDao();
        List<User> userList = userDAO.findAll();
        request.setAttribute("users", userList);
        getServletContext().getRequestDispatcher("/users/list.jsp").forward(request, response);

    }
}
