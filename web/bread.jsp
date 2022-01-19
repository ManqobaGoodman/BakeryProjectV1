

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <h1 style="border-style: double"> Select<span class="highlight"> Product</span></h1>
            </div>

            <div class="row">
                <div class="prodpic">

                    <a href="description.jsp"><img src="./img/brownBread.jpeg"></a>
                    <div class="pichead">
                        <h3>Brown  <span class="highlight">Bread</span></h3>
                    </div>
                    <div class="price">
                        <h4>Price: R49.99</h4>
                    </div>
                    <div class="carthead">
                        <h3 style="border-style: ridge"><span class="highlight">Add To Cart</span></h3>
                    </div>
                </div>

                <div class="prodpic">

                    <a href="description.jsp"><img src="./img/scbread.jpeg"></a>
                    <div class="pichead">
                        <h3>Freshly <span class="highlight"> Made</span> Scones</h3>
                    </div>
                    <div class="price">
                        <h4>Price: R59.99</h4>
                    </div>
                    <div class="carthead">
                        <h3 style="border-style: ridge"><span class="highlight">Add To Cart</span></h3>

                    </div>
                </div>

                <div class="prodpic">

                    <a href="description.jsp"><img src="./img/bread.jpeg"></a>
                    <div class="pichead">
                        <h3>Freshly  <span class="highlight">Baked</span> Bread</h3>
                    </div>
                    <div class="price">
                        <h4>Price: R39.99</h4>
                    </div>
                    <div class="carthead">
                        <h3 style="border-style: ridge"><span class="highlight">Add To Cart</span></h3>

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
