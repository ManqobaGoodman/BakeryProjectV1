/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Product;
import za.co.bigone.model.Producttype;
import za.co.bigone.service.ProductService;
import za.co.bigone.service.ProductServiceImplementation;

/**
 *
 * @author Student24
 */
@WebServlet(name = "ProductDescServlet", urlPatterns = {"/ProductDescServlet"})
public class ProductDescServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = request.getServletContext();
        DBPoolManagerBasic dbpool = (DBPoolManagerBasic) context.getAttribute("dbconn");
        ProductService productService = new ProductServiceImplementation(dbpool);

        int productId = 0;
        try {
            productId = Integer.parseInt(request.getParameter("productId"));
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
        
      
        Product viewProduct = productService.viewProduct(productId);
       
        request.setAttribute("product", viewProduct);
        RequestDispatcher dispatcher = request.getRequestDispatcher("description.jsp");
        dispatcher.forward(request, response);
    }

}
