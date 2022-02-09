 
<%@page import="za.co.bigone.model.Person"%>
<%@page import="za.co.bigone.model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Product product = (Product) request.getAttribute("product");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Description-page</title>
        <link rel="stylesheet"  href="./styles/description.css"> 

        
        
        
        
        

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
                            <% Person p = (Person) session.getAttribute("person");
                                if (p == null) {
                            %>

                        <li><a href="Login.jsp">Login/Register</a></li> 

                        <%
                            }
                        %>
                        <%
                            if (p != null) {
                        %>
                        <div class="dropdown">
                            <button class="dropbtn">MyAccount</button>
                            <div class="dropdown-content">
                                <a href="#">Profile</a>
                                <a href="#">Order</a>
                                <a href="#">LogOut</a>
                            </div>
                        </div>

                        <%
                            }
                        %>
                    </ul>
                </nav>
            </div>
        </header>








        <section class="about-us">

            <div class="row">


                <div class="aboutUs-col">
                     <img src="<%= product.getPicture()%>">
                </div>
                <div class="aboutUs-col">
                    <h2><span class="marker"> <%= product.getNameOfProduct()%> </span></h2>
                    <p><%= product.getProductDescription()%></p>
                    
                     <div class="sizer">
                    <h4>R<%= product.getProductPrice()%></h4>
                </div>

                    <div class="button-container">
                        <button class="cart-qty-plus" type="button" value="+">+</button>
                        <input type="text" name="quantity" min="0" max="10" class="qty form-control"/>
                        <button class="cart-qty-minus" type="button" value="+">-</button>
                    </div>

                    <div class="name">
                        <button class="btn" value="Add To Cart">Add To Cart</button>
                    </div>
                </div>
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
                <h2><span class="marker">Contact Us</span></h2>
                <p>012 234 8673</p>
            </div>
        </footer>
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <script src="./JS/script.js"></script>
    </body>
</html>




<!--                <div class="description">
                    <p><%= product.getProductDescription()%></p>

                </div>-->


<!--                <div class="sizer">
                    <h4><%= product.getProductPrice()%></h4>
                </div>-->

<!--                <div class="size">
                    <h2><span class="marker"> <%= product.getNameOfProduct()%> </span></h2>
                </div>-->


