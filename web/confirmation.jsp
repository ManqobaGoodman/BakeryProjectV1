

<%@page import="za.co.bigone.model.Address"%>
<%@page import="za.co.bigone.model.Person"%>
<%@page import="java.util.List"%>
<%@page import="za.co.bigone.model.OrderLineItem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    List<OrderLineItem> orderLineItemList = (List<OrderLineItem>) session.getAttribute("cart");
    Person person = (Person) session.getAttribute("person");
    Address address = (Address) request.getAttribute("getAddress");

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmation-Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width,user-scalable=no,initial-scale=1.0,maximum-scale1.0,minimum-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="./styles/checkPayment.css">
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
            <section class="bod">
                <div class="form-container">
                    <h2 class="form-title">Payment details</h2>
                    <form action="" class="checkout-form">
                        <div class="input-line">
                            <label for="name">Name</label>
                            <input type="text" name="name" id="name" value="<%= person.getFirstname() + " " + person.getLastname()%>" disabled>
                        </div>
                        <div class="input-line">
                            <label for="email">E-mail</label>
                            <input type="text" name="email" id="email" value="<%= person.getEmail()%>"disabled>
                        </div>
                        <div class="input-line">
                            <label for="number">Contact-Number</label>
                            <input type="text" name="number" id="number" value="<%= person.getTelephone()%>" disabled>
                        </div>
                        <%
                            if (address == null) {
                        %>
                        <div class="input-container">

                            <div class="input-line">
                                <label for="address">Address</label>
                                <input type="text" name="address" id="address" placeholder="Your Address">
                            </div>


                            <div class="input-line">
                                <label for="town">Town/City</label>
                                <input type="text" name="town" id="address" placeholder="Your Town/City">
                            </div>
                            <div class="input-line">
                                <label for="postCode">Postal-Code</label>
                                <input type="text" name="postCode" id="address" placeholder="Your Postal-Code">
                            </div>
                        </div>

                        <%
                        } else {

                        %>


                        <div class="input-container">

                            <div class="input-line">
                                <label for="address">Address</label>
                                <input type="text" name="address" id="address" value="<%= address.getAddress1()%>" >
                            </div>

                            <div class="input-line">
                                <label for="town">Town/City</label>
                                <input type="text" name="town" id="address" value="<%= address.getTown()%>">
                            </div>
                            <div class="input-line">
                                <label for="postCode">Postal-Code</label>
                                <input type="text" name="postCode" id="address" value="<%= address.getPostalCode()%>">
                            </div>
                        </div>
                        <%
                            }
                        %>
                    </form>
            </section>


            <div class="row justify-content-center">
                <div class="col-md-8">
                    <div class="table-responsive">
                        <table id="myTable" class="table">
                            <thead>
                                <tr>
                                    <th>Name</th>
                                    <th>Qty</th>
                                    <th>Price</th>
                                    <th class="text-right"><span id="amount" class="amount">Amount</span></th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    for (OrderLineItem orderLineItem : orderLineItemList) {

                                %>
                                <tr>
                                    <td>
                                        <p><%= orderLineItem.getProduct().getNameOfProduct()%></p>
                                    </td>
                                    <td>
                                        <div class="button-container">

                                            <input type="text" name="qty" min="0" max="5" class="qty form-control" value="<%= orderLineItem.getQuantity()%>" disabled/>

                                        </div>
                                    </td>
                                    <td>
                                        <input style="margin-bottom: 48px;"type="text" value="<%= orderLineItem.getProduct().getProductPrice()%>" class="price form-control" disabled>
                                    </td>
                                    <td align="right">R <span id="amount" class="amount">0</span>
                                    </td>
                                </tr>
                                <%
                                    }
                                %>
                            </tbody>
                            <tfoot>
                                <tr>
                                    <td colspan="3"></td>
                                    <td align="right">
                                        <strong>Total = R <span id="total" class="total">0</span>
                                        </strong>

                                        <div class="boton">
                                            <button> <a href="payment.jsp" class="href">Complete-Payment</a></button>
                                        </div>
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
        <script>
            function myFunction() {
                location.replace("/Login.jsp")
            }
        </script>

    </body>
</html>
