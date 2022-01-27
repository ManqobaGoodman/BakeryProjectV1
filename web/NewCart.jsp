

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width,user-scalable=no,initial-scale=1.0,maximum-scale1.0,minimum-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="./styles/newcart.css">
    </head>
    <body>
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
                                                <img src="./img/brownie.jpeg" width="5%">
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
