/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Address;
import za.co.bigone.model.OrderLineItem;
import za.co.bigone.model.Person;
import za.co.bigone.service.AddressService;
import za.co.bigone.service.AddressServiceImplement;

/**
 *
 * @author Student24
 */
@WebServlet(name = "ConfirmationServlet", urlPatterns = {"/ConfirmationServlet"})
public class ConfirmationServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = request.getServletContext();
        DBPoolManagerBasic dbpool = (DBPoolManagerBasic) context.getAttribute("dbconn");
        AddressService addressService = new AddressServiceImplement(dbpool);

        HttpSession session = request.getSession();
        List<OrderLineItem> orderLineItemList = (List<OrderLineItem>) session.getAttribute("cart");

        //loop through cart and see if qty is the same in not update to new qty
        Person person = (Person) session.getAttribute("person");

        if (person == null) {
            String msg = "Please Login or Register before Purchase";
            request.setAttribute("msg", msg);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Login.jsp");
            requestDispatcher.forward(request, response);
        }

        Address getAddress = addressService.viewAddress1(person.getPersonId());

        request.setAttribute("getAddress", getAddress);
        RequestDispatcher dispatcher = request.getRequestDispatcher("checkPayment.jsp");
        dispatcher.forward(request, response);

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
