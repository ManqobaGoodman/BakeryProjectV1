

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="./styles/checkout.css">
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


                    </div>
                    <div class="pay">
                   
                        <select style="font-family: sans-serif; font-size: 20px; margin-left: 8px;" dropzone="Drop">Payment Method
                            <option>Select Payment</option>
                            <option>Card Payment</option>
                            <option>Cash on Delivery</option>
                        </select>
                    </div>




                    <table id="myTable" class="table">
                        <thead>
                            <tr>
                                <th>Product</th>
                               
                                <th>Qty</th>
                                <th>Price</th>
                                <th class="text-right"><span id="amount" class="amount">Amount</span></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>

                                <td>
                                    <p>Chocolate Brownie</p>
                                </td>
                                <td>
                                    <div class="button-container">
                                        
                                        <input type="text" name="qty" min="0" class="qty form-control" value="0"/>
                                        
                                    </div>
                                </td>
                                <td>
                                    <input type="text" value="72" class="price form-control" disabled>
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





                    <input type="button" value="Complete purchase">

                </form>
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

        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <script>

            $(document).ready(function () {
                update_amounts();
                $(".qty, .price").on("keyup keypress blur change",
                        function (e) {
                            update_amounts();
                        });
            });

            function update_amounts() {
                var sum = 0.0;
                $("#myTable > tbody > tr").each(function () {
                    var qty = $(this).find(".qty").val();
                    var price = $(this).find(".price").val();
                    var amount = (qty * price)
                    sum += amount;
                    $(this).find(".amount").text("" + amount);

                });
                $(".total").text(sum);
            }




            var incrementQty;
            var decrementQty;
            var plusBtn = $(".cart-qty-plus");
            var minusBtn = $(".cart-qty-minus");
            var incrementQty = plusBtn.click(function () {
                var $n = $(this).parent(".button-container").find(".qty");
                $n.val(Number($n.val()) + 1);
                update_amounts();
            });


            var decrementQty = minusBtn.click(function () {
                var $n = $(this).parent(".button-container").find(".qty");
                var QtyVal = Number($n.val());
                if (QtyVal > 0) {
                    $n.val(QtyVal - 1);

                }
                update_amounts();

            });
        </script>

    </body>
</html>
