<%@page import="za.co.bigone.model.Producttype"%>
<%@page import="java.util.List"%>
<%@page import="za.co.bigone.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    //Product viewProduct = (Product) request.getAttribute("product");
    List<Product> products = (ArrayList<Product>) request.getAttribute("products");
    Producttype producttype = (Producttype) request.getAttribute("producttype");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bread/Pies</title>
        <link rel="stylesheet"  href="./styles/bread.css"> 

    </head>
    <body>
        <header>
            <div class="container">
                <div id="branding">
                    <div id="cart">
                        <a href="cart.jsp"><img src="./img/shopp.png"></a>
                        <li class="current"><a href="cart.jsp">View Cart</a></li>
                    </div>
                    <h1 style="border-style: groove">Mrs <span class="highlight"> Pats</span> Cake</h1>
                </div>

                <nav>
                    <ul>
                        <li><a href="index.jsp">Home</a></li> 
                        <li><a href="about.jsp">About us</a></li> 
                        <li> <a href="products.jsp">Products</a></li>
                        <li><a href="contact.jsp">Contact us</a></li>
                        <li><a href="Login.jsp">Login/Register</a></li>

                    </ul>
                </nav>

            </div>
        </header>


        <section class="prodc">
            <div class="cater">
                <h1 style="border-style: double"><span class="highlight"> <%= producttype.getProductTypeDesc() %></span></h1>
            </div>


            <div class="row">

                <% for (Product viewProduct : products) {%>  

                <div class="prodpic">
                    <form method="GET">
                        <a href="http://localhost:8080/BakeryProjectV1/ProductDescServlet?productId=<%= viewProduct.getProductId() %>"><img src="<%= viewProduct.getPicture()%>"></a>   
                        
                        <div class="pichead">
                            <h3> <%= viewProduct.getNameOfProduct()%></h3>
                        </div>
                        <div class="price">
                            <h4> <%= viewProduct.getProductPrice()%></h4>
                        </div>
                        <div class="carthead">
                            <h3 style="border-style: ridge"><span class="highlight">Add To Cart</span></h3>

                        </div>
                        <input type="hidden" value=<%= viewProduct.getProductId()    %> name="productType" />

                    </form>
                </div>
                        

                <%}%>
            </div>


        </section>


        <footer  id="Foot">
            <div class="footer">
                <h2>Hours : </h2>
            </div>
            <div class="Footer">
                <p>
                    Monday-Friday (08h00-14h00)</p>
                <p> Saturday (08h00-13h00)</p>
                <p>Sunday (Closed)</p>
            </div>
            <div class="contact">
                <h2><span class="highlight">Contact Us</span></h2>
                <p>012 234 8673</p>
            </div>
        </footer>
    </body>
</html>
