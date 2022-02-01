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
import za.co.bigone.model.OrderLineItem;
import za.co.bigone.model.Product;
import za.co.bigone.model.Producttype;
import za.co.bigone.service.CartService;
import za.co.bigone.service.CartServiceImpl;
import za.co.bigone.service.ProductService;
import za.co.bigone.service.ProductServiceImplementation;

/**
 *
 * @author Student24
 */
@WebServlet(name = "CartServlet", urlPatterns = {"/CartServlet"})
public class CartServlet extends HttpServlet {

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
        ProductService productService = new ProductServiceImplementation(dbpool);
        int productId = 0;
        int productTypeId = 0;
        int quantity = 0;

        try {
            productId = Integer.parseInt(request.getParameter("productId"));
            productTypeId = Integer.parseInt(request.getParameter("productTypeId"));
            System.out.println(productTypeId);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

       
        CartService cartService = new CartServiceImpl();
        OrderLineItem orderLineItem = new OrderLineItem(productId);

        if (orderLineItem != null) {
            HttpSession session = request.getSession();
            List<OrderLineItem> orderLineItemList = (List<OrderLineItem>) session.getAttribute("cart");
            if (orderLineItemList == null) {
                orderLineItemList = new ArrayList<>();
            }
            System.out.println(productId);
            orderLineItemList.add(orderLineItem);
            session.setAttribute("cart", orderLineItemList);

            for (OrderLineItem orderLineItem1 : orderLineItemList) {
                System.out.print(orderLineItem1.getProductid() + " ");
            }
            System.out.println("");
            
        }

        List<Product> productList = productService.viewProducts(productTypeId);
        for (Product product : productList) {
            System.out.println(product.getNameOfProduct());
        }
        Producttype producttype = productService.getProducttype(productTypeId);
        
        // request.setAttribute("product", product);
        request.setAttribute("products", productList);
        request.setAttribute("producttype", producttype);
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
