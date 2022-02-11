
<%@page import="za.co.bigone.model.Person"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="za.co.bigone.model.OrderLineItem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    List<OrderLineItem> orderLineItemList = (ArrayList<OrderLineItem>) session.getAttribute("cart");
    int quantity = 0;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View-Cart</title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="./styles/newcart.css">


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


        <div class="container-fluid mt-5">
            <h2 class="mb-5 text-center">Shopping Cart</h2>
            <div class="row justify-content-center">
                <div class="col-md-8">
                    <div class="table-responsive">
                        <table id="myTable" class="table">
                            <thead>
                                <tr class="move">
                                    <th>Product</th>
                                    <th>Name</th>
                                    <th>Qty</th>
                                    <th>Price</th>
                                    <td style="">Amount</td>
                                    <th class="text-right"><span id="amount" class="amount">Remove</span></th>
                                </tr>
                            </thead>

                            
                                <tbody>


                                    <%
                                        if (orderLineItemList != null) {
                                            for (OrderLineItem orderLineItem : orderLineItemList) {


                                    %>
                                    <tr>
                                        <td>
                                            <div class="product-img">
                                                <div class="img-prdct">
                                                    <img src="<%= orderLineItem.getProduct().getPicture()%>" width="15%" >
                                                </div>
                                            </div>

                                        </td>
                                        <td>
                                            <p><%= orderLineItem.getProduct().getNameOfProduct()%></p>
                                        </td>
                                        <td>
                                            <div class="button-container">
                                                <button class="cart-qty-plus" type="button" value="+">+</button>
                                                <input type="text" name="quantity" min="0" max="10" class="qty form-control" value="<%= orderLineItem.getQuantity()%>"/>
                                                <button class="cart-qty-minus" type="button" value="+">-</button>
                                            </div>

                                            </div>
                                        </td>

                                        <td>
                                            <input type="text" value="<%= orderLineItem.getProduct().getProductPrice()%>" class="price form-control" disabled>

                                        </td>
                                        <td align="right">R <span id="amount" class="amount">0</span>
                                        </td>

                                        <td class="src">
                                            <a href="http://localhost:8080/BakeryProjectV1/CartServlet?productId=<%= orderLineItem.getProduct().getProductId() %>&function=delete"><img src="./img/bin.jpg" width="8%" style="float: right; margin-right: 18px;"></a>
                                        </td>
                                    </tr>
                                    <% }

                                        }%>

                                </tbody>
                                <tfoot>
                                    <tr>
                                        <td colspan="5"></td>
                                        <td align="right">
                                            <strong>Total = R<span id="total" class="total">0</span>
                                            </strong>



                                            <!--<button style= border-radius: 3px; "margin-top: 10px; margin-right: -4.5px; font-size: 15px; font-family: sans-serif"type="submit"><span class="highlight">Check</span>-Out</button>-->
                                            <div class="boton">
                                                <button> <a href="http://localhost:8080/BakeryProjectV1/ConfirmationServlet" class="href">Check-Out</a></button>
                                            </div>
                                        </td>
                                    </tr>

                                </tfoot>
                            </form>

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
        <script type="text/javascript">
            function jsonString() {
                var productId = $('#productId').val();
                var quantity = $('#quantity').val();
                var obj = new Object();
                obj.prodyuctId = 1;
                obj.quantity =2;
//convert object to json string
                var string = JSON.stringify(obj);
//convert string to Json Object
                console.log(JSON.parse(string));



//                
//                var productId = $('#productId').val();
//                var quantity = $('#quantity').val();
//                var jsonData="[{
//                'prodyuctId':' " + productId+ "',
//                'quantity':'" + quantity;
//                }
//                ]
//
//                $.ajax(){
//                         url: 'ConfirmationServlet',
//                        type: 'POST',
//                        data: 'para=' + myVar, //sending json data
//                        dataType: 'json',
//                }
            }
        </script>
    </body>
</html>
