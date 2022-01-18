/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Person;
import za.co.bigone.service.LoginRegisterServiceImplementation;
import za.co.bigone.service.LoginRegisterService;

/**
 *
 * @author Student24
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = request.getServletContext();
        DBPoolManagerBasic dbpool = (DBPoolManagerBasic) context.getAttribute("dbconn");
        LoginRegisterService loginService = new LoginRegisterServiceImplementation(dbpool);
        
        HttpSession session = request.getSession();
        Person person = new Person();
        
        String msg = " ";
        String loadingPage = "/Login.jsp";
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        person = loginService.login(email, password);
        
        if (person == null) {
            msg = "Incorect Email or Password";
        } else {
            loadingPage = "index.jsp";
        }
        request.setAttribute("msg", msg);
        session.setAttribute("person", person);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(loadingPage);
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = request.getServletContext();
        DBPoolManagerBasic dbpool = (DBPoolManagerBasic) context.getAttribute("dbconn");
        LoginRegisterService loginService = new LoginRegisterServiceImplementation(dbpool);

        String msg = " ";
        String loadingPage = "/Login.jsp";
        String name = request.getParameter("firstName");
        String lastname = request.getParameter("lastname");
        String title = request.getParameter("title");
        String telephone = request.getParameter("telephone");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        
        Person person = new Person();

        if (loginService.isEmailAvailable(email)) {
            msg = "The user is already on the system. Please Login";
        } else {
            person = loginService.register(name, lastname, title, telephone, email, password);
            if (person == null) {
                msg = "Internal error! We are working on it.";
            } else {
                loadingPage = "/index.jsp"; 
            }

        }
        
        session.setAttribute("person", person);
        request.setAttribute("msg", msg);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(loadingPage);
        requestDispatcher.forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
