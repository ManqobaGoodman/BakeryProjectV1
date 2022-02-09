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
import za.co.bigone.model.Card;
import za.co.bigone.model.OrderLineItem;
import za.co.bigone.model.Person;
import za.co.bigone.service.AddressService;
import za.co.bigone.service.AddressServiceImplement;
import za.co.bigone.service.PaymentServceImp;
import za.co.bigone.service.PaymentService;

/**
 *
 * @author Student24
 */
@WebServlet(name = "payment", urlPatterns = {"/payment"})
public class PaymentServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext context = request.getServletContext();
        DBPoolManagerBasic dbpool = (DBPoolManagerBasic) context.getAttribute("dbconn");
        PaymentService paymentService = new PaymentServceImp(dbpool);
        HttpSession session = request.getSession();
        Person person = (Person) session.getAttribute("person");
        List<OrderLineItem> lineitems = (List<OrderLineItem>) session.getAttribute("cart");
        Card card = new Card(request.getParameter("owner"), request.getParameter("cvv"), request.getParameter("cardNumber"));
        boolean isPayment = paymentService.confirmPayment(card, 8765);
        if (isPayment) {
            if(paymentService.createOrder(person,lineitems)){
                //generate invoice
                //email client order + invoice
            }
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Login.jsp");
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
