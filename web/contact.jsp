
<%@page import="za.co.bigone.model.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact US</title>
        <link rel="stylesheet"  href="./styles/contact.css"> 

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


        <section class="location">
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3587.161109616862!2d28.131023851142572!3d-25.96275606042649!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x1e956f08d1b860d5%3A0x8917a5f7b9ed3510!2sMecer%20Inter-ED%20(Pty)%20Ltd!5e0!3m2!1sen!2sza!4v1644320047358!5m2!1sen!2sza" width="800" height="600" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
        </section>

        <section class="contact-us">
            <div class="row">
                <div class="contact-coll">
                    <div>
                        <i class="fa fa-home"></i>
                        <span>
                            <h5>322 Fifteenth Road</h5>
                            <p>Randjespark, Midrand, 1685</p>
                        </span>
                    </div>

                    <div>
                        <i class="fa fa-phone"></i>
                        <span>
                            <h5>012 234 8673</h5>
                            <p> Monday-Friday (08h00-14h00)</p>
                        </span>
                    </div>

                    <div>
                        <i class="fa fa-envelope-o"></i>
                        <span>
                            <h5>BRLdevelopers@gmail.com</h5>
                            <p>Emails For Query</p>
                        </span>
                    </div>
                </div>

                <div class="contact-col">
                    <form action="formhandler.php" method="post">
                        <input type="text" name="name" placeholder="Enter Your Name" required />
                        <input type="email" name="email" placeholder="Enter Your Email" required />
                        <input type="text" name="subject" placeholder="Enter Your Subject" required />
                        <textarea rows="8" name="message" placeholder="Message" required></textarea>
                    </form>
                </div>
                <div class="boton">
                    <button>Send</button>
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

