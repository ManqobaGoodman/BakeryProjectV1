<%@page import="za.co.bigone.model.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width">
        <title>Home-Page</title>
        <link rel="stylesheet"  href="./styles/style.css"> 

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

        <section id="showcase">

            <div class="container1">
                <h1>You’ve tried the rest, now try the best!</h1>
            </div>
        </section>
        <section id="Headerprod">
            <h1 style="border-style: double">Sample Products</h1>
        </section>
        <section class="prodc">

            <div class="row">
                <div class="prodpic">
                    <a href="http://localhost:8080/BakeryProjectV1/ProductServlet?productTypeId=1"><img src="./img/bread.jpeg"></a>
                    <div class="layer">
                        <h3>Freshly Baked Bread</h3>
                    </div>
                    <div class="para">
                        <p> Our Freshly Baked Bread Just For You</p>
                    </div>
                </div>

                <div class="prodpic">
                    <a href="http://localhost:8080/BakeryProjectV1/ProductServlet?productTypeId=2"><img src="./img/prod20.jpeg"></a>
                    <div class="layer">
                        <h3>Chocolate Brownie</h3>
                    </div>
                    <div class="para">
                        <p>Try Our New Chocolate Brownie</p>
                    </div>
                </div>

                <div class="prodpic">
                    <a href="http://localhost:8080/BakeryProjectV1/ProductServlet?productTypeId=3"><img src="./img/cake.jpg"></a>
                    <div class="layer">
                        <h3>Chocolate Cake</h3>
                    </div>
                    <div class="para">
                        <p> Indulge Yourself With Our Lovely Chocolate Cake </p>
                    </div>
                </div>

            </div>

        </section>

        <section id="boxes">
            <div class="container">
                <div style="border-style: outset"class="box">
                    <h3>Reviews</h3>
                    <p>I really like the cakes at To Pie A lot</p>
                </div>
                <div style="border-style: outset"class="box">
                    <h3>Reviews</h3>
                    <p>Amazing service at To Pie A lot</p>
                </div>
                <div style="border-style: outset"class="box">
                    <h3>Reviews</h3>
                    <p>I really am happy with what I have received.</p>
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
                <h2><span class="highlight">Contact Us</span></h2>
                <p>012 234 8673</p>
            </div>
        </footer>

    </body>
</html>








