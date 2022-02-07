
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About us</title>
        <link rel="stylesheet"  href="./styles/checkout.css"> 

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







        <section class="bod">


            <div class="form-container">
                <h2 class="form-title">Payment details</h2>
                <form action="" class="checkout-form">
                    <div class="input-line">
                        <label for="name">Name</label>
                        <input type="text" name="name" id="name" placeholder="Your name and Surname">
                    </div>
                    <div class="input-line">
                        <label for="email">E-mail</label>
                        <input type="text" name="email" id="email" placeholder="Your e-mail address">
                    </div>
                    <div class="input-container">

                        <div class="input-line">
                            <label for="number">Contact-Number</label>
                            <input type="text" name="number" id="number" placeholder="Your Contact-Number">
                        </div>

                        <div class="input-line">
                            <label for="address">Delivery-Address</label>
                            <input type="text" name="address" id="address" placeholder="Delivery-Address">
                        </div>

                        <section class="bodd">
                    </div>

                    </section>

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
                                    </td>
                                </tr>
                            </tfoot>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <script src="./JS/script.js"></script>

                    </body>
                    </html>
