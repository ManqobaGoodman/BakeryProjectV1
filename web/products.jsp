

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width">
        <title>Products</title>
        <link rel="stylesheet"  href="./styles/prods.css"> 

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
                <h1 style="border-style: double"> Select<span class="highlight"> Category</span></h1>
            </div>

            <div class="row">

                <div class="prodpic">
                    <form method="GET">
                        <div class="pichead">
                            <h3>Baked Bread</h3>
                        </div>
                        <a href="http://localhost:8080/BakeryProjectV1/ProductServlet"><img src="./img/bread.jpeg"></a>
                        <input type="hidden" value="1" name="productType" />
                    </form>
                </div>




                <div class="prodpic">
                    <form method="GET">

                        <div class="pichead">
                            <h3>Brownie/Pies</h3>
                        </div>
                        <a href="http://localhost:8080/BakeryProjectV1/ProductServlet"><img src="./img/prod20.jpeg"></a>
                        <input type="hidden" value="2" name="productType" />

                    </form>
                </div>
                <div class="prodpic">
                    <form method="GET">

                        <div class="pichead">
                            <h3>Cakes</h3>
                        </div>
                        <a href="http://localhost:8080/BakeryProjectV1/ProductServlet"><img src="./img/prod2.jpeg"></a>
                        <input type="hidden" value="3" name="productType" />

                    </form>

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
                <h2><span class="highligh">Contact Us</span></h2>
                <p>012 234 8673</p>
            </div>
        </footer>
    </body>
</html>
