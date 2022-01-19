/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
import za.co.bigone.model.Product;
import za.co.bigone.service.ProductService;
import za.co.bigone.service.ProductServiceImplementation;

/**
 *
 * @author Student24
 */
@WebServlet(name = "ProductServlet", urlPatterns = {"/ProductServlet"})
public class ProductServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
        ProductService productService = new ProductServiceImplementation(dbpool);
        
       
        
       //Product product = productService.viewProduct("red velvet");            //(product.getProductId());
        List<Product> productList = productService.viewProducts("bread");
        
        for (Product product : productList) {
            System.out.println(product.getNameOfProduct());
        }
      
       // request.setAttribute("product", product);
       request.setAttribute("products", productList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("productCat.jsp");
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
