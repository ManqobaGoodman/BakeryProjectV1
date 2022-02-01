
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About us</title>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="./styles/newcart.css">


    </head>
    <body>
        <header>
            <div class="container1">
                <div id="branding">
                    <div id="cart1">
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







        <div class="container-fluid mt-5">
            <h2 class="mb-5 text-center">Shopping Cart</h2>
            <div class="row justify-content-center">
                <div class="col-md-8">
                    <div class="table-responsive">
                        <table id="myTable" class="table">
                            <thead>
                                <tr>
                                    <th>Product</th>
                                    <th>Name</th>
                                    <th>Qty</th>
                                    <th>Price</th>
                                    <th class="text-right"><span id="amount" class="amount">Amount</span></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>
                                        <div class="product-img">
                                            <div class="img-prdct">
                                                <img src="./img/brownie.jpeg" width="5%" >
                                            </div>
                                        </div>
                                    </td>
                                    <td>
                                        <p>Chocolate Brownie</p>
                                    </td>
                                    <td>
                                        <div class="button-container">
                                            <button class="cart-qty-plus" type="button" value="+">+</button>
                                            <input type="text" name="qty" min="0" class="qty form-control" value="0"/>
                                            <button class="cart-qty-minus" type="button" value="+">-</button>
                                        </div>
                                    </td>
                                    <td>
                                        <input type="text" value="72" class="price form-control" disabled>
                                    </td>
                                    <td align="right">R <span id="amount" class="amount">0</span>
                                    </td>
                                </tr>
                                <!--------------------Product2---------------------->
                                <tr>
                                    <td>
                                        <div class="product-img">
                                            <div class="img-prdct">
                                                <img src="./img/bread.jpeg" width="5%">
                                            </div>
                                        </div>
                                    </td>
                                    <td>
                                        <p>Fresh Bread</p>
                                    </td>
                                    <td>
                                        <div class="button-container">
                                            <button class="cart-qty-plus" type="button" value="+">+</button>
                                            <input type="text" name="qty" min="0" class="qty form-control" value="0"/>
                                            <button class="cart-qty-minus" type="button" value="+">-</button>
                                        </div>
                                    </td>
                                    <td>
                                        <input type="text" value="125" class="price form-control" disabled>
                                    </td>
                                    <td align="right">R <span id="amount" class="amount">0</span>
                                    </td>
                                </tr>
                                <!-------------------Prodyct 3---------------------------------->
                                <tr>
                                    <td>
                                        <div class="product-img">
                                            <div class="img-prdct">
                                                <img src="./img/cake.jpg" width="5%">
                                            </div>
                                        </div>
                                    </td>
                                    <td>
                                        <p>Chocolate Cake</p>
                                    </td>
                                    <td>
                                        <div class="button-container">
                                            <button class="cart-qty-plus" type="button" value="+">+</button>
                                            <input type="text" name="qty" min="0" class="qty form-control" value="0"/>
                                            <button class="cart-qty-minus" type="button" value="+">-</button>
                                        </div>
                                    </td>
                                    <td>
                                        <input type="text" value="250" class="price form-control" disabled>
                                    </td>
                                    <td align="right">R <span id="amount" class="amount">0</span>
                                    </td>
                                </tr>
                            </tbody>
                            <tfoot>
                                <tr>
                                    <td colspan="4"></td>
                                    <td align="right">
                                        <strong>Total = R <span id="total" class="total">0</span>
                                        </strong>
                                        
                                        <!--<button style= border-radius: 3px; "margin-top: 10px; margin-right: -4.5px; font-size: 15px; font-family: sans-serif"type="submit"><span class="highlight">Check</span>-Out</button>-->
                                        <button></button>
                                    
                                    
                                    </td>
                                </tr>
                            </tfoot>
                        </table>
                    </div>
                </div>
            </div>
        </div>















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
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <script src="./JS/script.js"></script>
    </body>
</html>
