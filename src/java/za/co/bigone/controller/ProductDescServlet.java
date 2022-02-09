/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.co.bigone.DAO.RecipeDAO;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Ingredients;
import za.co.bigone.model.Product;
import za.co.bigone.model.Producttype;
import za.co.bigone.model.Recipe;
import za.co.bigone.service.IngredientsService;
import za.co.bigone.service.IngredientsServiceImplementation;
import za.co.bigone.service.ProductService;
import za.co.bigone.service.ProductServiceImplementation;
import za.co.bigone.service.RecipeService;
import za.co.bigone.service.RecipeServiceImplementation;

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
//        RecipeService recipeService = new RecipeServiceImplementation(dbpool);
//        IngredientsService ingredientService = new IngredientsServiceImplementation(dbpool);

        int productId = 0;
        try {
            productId = Integer.parseInt(request.getParameter("productId"));
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
        //------------------get recipe -----------------------------
        int recipeId = 1;
        try {
            recipeId = Integer.parseInt(request.getParameter("recipeid"));
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
        //--------------get ingredient-----------------------------------

        int ingredientID =1 ;
         try {
            ingredientID = Integer.parseInt(request.getParameter("ingredientid"));
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
        
        Product viewProduct = productService.viewProduct(productId);
        //Recipe viewRecipe = recipeService.viewRecipe(recipeId);
//        IngredientsService viewIngredient = (IngredientsService) IngredientsServiceImplementation.viewIngredient(ingredientid);
        //ArrayList<Ingredients> viewIngredient =ingredientService.viewIngredient(recipeId);

        //request.setAttribute("recipe", viewRecipe);
        request.setAttribute("product", viewProduct);
        //request.setAttribute("ingredient", viewIngredient);
        RequestDispatcher dispatcher = request.getRequestDispatcher("description.jsp");
        dispatcher.forward(request, response);
    }

}
