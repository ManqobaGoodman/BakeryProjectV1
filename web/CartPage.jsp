

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./styles/CartStyle.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
      
    </head>
    <body>
<header>
            <div class="container1">
                <div id="branding">
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
           
      
        <div class="small-container" cart-page>
            <table>
                <tr>
                    <th>Product</th>
                    <th>Quantity</th>
                    <th>SubTotal</th>
                </tr>
                <tr>
                    <td>
                        <div class="crt-info">
                            <img src="./img/brownie.jpeg" >
                            <div>
                                <p>Chocolate Brownie</p>
                                <small>Price: R500.00</small>
                                <br>
                                <a href="">Remove</a>
                            </div>
                        </div>
                    </td>
                    <td><input type="number" value="1"></td>
                    <td>R500.00</td>
                </tr>
                <tr>
                    <td>
                        <div class="crt-info">
                            <img src="./img/bread.jpeg" >
                            <div>
                                <p>Chocolate Brownie</p>
                                <small>Price: R500.00</small>
                                <br>
                                <a href="">Remove</a>
                            </div>
                        </div>
                    </td>
                    <td><input type="number" value="1"></td>
                    <td>R500.00</td>
                </tr>
                <tr>
                    <td>
                        <div class="crt-info">
                            <img src="./img/cake.jpg" >
                            <div>
                                <p>Chocolate Brownie</p>
                                <small>Price: R500.00</small>
                                <br>
                                <a href="">Remove</a>
                            </div>
                        </div>
                    </td>
                    <td><input type="number" value="1"></td>
                    <td>R500.00</td>
                </tr>
            </table>

            <div class="total-price">
                <table>
                    <tr>
                        <td>SubTotal</td>
                        <td>R1400.00</td>
                    </tr>
                    <tr>
                        <td>tax</td>
                        <td>R35.00</td>
                    </tr>
                    <tr>
                        <td>SubTotal</td>
                        <td>R1500.00</td>
                    </tr>
                    
                    <tr>
                        <td><button style="margin-right: 250px; ; font-size: 16px; color: #e8491d"  name="CheckOut" type="submit">Check-Out</button></td>
                    </tr>
                 
                </table>
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
        
    </body>
</html>
