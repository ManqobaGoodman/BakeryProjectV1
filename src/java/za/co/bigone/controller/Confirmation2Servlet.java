/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import za.co.bigone.model.Address;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Person;
import za.co.bigone.service.AddressService;
import za.co.bigone.service.AddressServiceImplement;

/**
 *
 * @author Student24
 */
@WebServlet(name = "Confirmation2Servlet", urlPatterns = {"/Confirmation2Servlet"})
public class Confirmation2Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        AddressService addressService = new AddressServiceImplement(dbpool);
        
        String page= "/index.jsp";
        HttpSession session = request.getSession();
        Person person = (Person) session.getAttribute("person");
        String address1 =  request.getParameter("address");
        String town = request.getParameter("town");
        int postalCode =0;
        try {
            postalCode = Integer.parseInt(request.getParameter("postCode"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        Address addres = addressService.viewAddress1(postalCode);
        
        if(addres != null){
            if (addressService.updateAddress1(postalCode, address1, town, postalCode)) {
               page = "/payment.jsp";
            }
            
        }else{
            if (person != null){
                if (addressService.insertAddress1(person.getPersonId(), address1, town, postalCode)){
                     page = "/payment.jsp";
                } 
            }
            else{
                page ="/Error.jsp";
            }
            
        }
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
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
