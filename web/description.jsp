 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About us</title>
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
                        <li><a href="Login.jsp">Login/Register</a></li>

                    </ul>
                </nav>

            </div>
        </header>
        <section class="prodc">
            <div class="name">
                <div class="size">
                    <h2><span class="marker">Brown</span> Bread</h2>
                </div>
                <div class="sizer">
                    <h4>Price: 49.99</h4>
                </div>
                <div class="qty">
                    <select dropzone="" name="dropdown">
                        <option>Quantity</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                        <option>6</option>
                    </select>
                    <div class="description">
                        <p>This is our freshly made Brown Bread </p>
                        <p>straight from the oven just for you</p>

                    </div>
                </div>
            </div>
            <div class="row">
                <div class="prodpic">
                    <img src="./img/bread.jpeg">
                </div>
            </div>
            <button class="button" value="Add To Cart">Add To Cart</button>

            <!--            <div class="warnnings">
                            <h2>Warnings<p>This Products contains A lot of wheat which some may be allergic to(Stay Safe)</p></h2>
                        </div>-->


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
    </body>
</html>
