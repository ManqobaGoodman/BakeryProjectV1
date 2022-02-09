
<%@page import="za.co.bigone.model.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About us</title>
        <link rel="stylesheet"  href="./styles/about.css"> 

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
                    <img src="./img/theShop.jpeg" />
                </div>
                <div class="aboutUs-col">
                    <h1>TO PIE FOR</h1>
                    <p>I am Mrs Pat Cake ,I am a 97 year old women that had Covid 7 times ,due to the fact that I give my cake to everyone,hence the need for a website that will help customers view all products and place orders .From humble yet solid foundations, we’ve expanded into more than just a bakery.
                        We’re now a bakery, a caterer and a food market.
                        Many things have changed but one thing has remained the same. The love and passion that is present in every single delicious cake and experience we create.
                        In celebration of Industry’s evolution and the deep pride we feel for what it has become, we have upgraded our logo to reflect our ownership of the brand.
                        It honours the past, present and future in a design that we believe is authentic, real and expressive of who we are.
                        We’d love to hear your thoughts</p>

                </div>
            </div>
        </section>
        <section class="bottom">
            <h4>Social Media</h4>
            <p> Please subscribe and follow me for updates on new products</p>
            <div class="icons">
                <i class="fa fa-facebook-square"></i>
                <i class="fa fa-twitter"></i>
                <i class="fa fa-address-book-o"></i>
                <i class="fa fa-instagram"></i>
                <i class="fa fa-linkedin"></i>
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

