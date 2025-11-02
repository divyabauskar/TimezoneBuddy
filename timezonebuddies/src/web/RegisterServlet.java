package com.project.web;






import java.io.IOException;


import jakarta.servlet.*;


import jakarta.servlet.annotation.WebServlet;


import jakarta.servlet.http.*;


import com.project.dao.UserDao;


import com.project.model.User;



@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
     private static final long serialVersionUID = 1L;
    private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String country = request.getParameter("country");
        String timezone = request.getParameter("timezone");
         User user = new User(name, email, username, password);

        user.setTimezone(timezone);
           
         try {

            userDao.registerUser(user);


            response.sendRedirect("login.html");


        } catch (Exception e) {


            e.printStackTrace();


        }

        userDao.saveUser(fullname, email, password, country);
        response.sendRedirect("login.html");
    }
}