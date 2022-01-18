

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./styles/LoginPage.css" media="screen">
        <title>Login/Register Page</title>
    </head>
    <body>
        <div class="login-wrap">
            <div class="login-html">
                <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">LogIn</label>
                <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Register</label>
                <div class="login-form">
                    <div class="sign-in-htm">
                        <form method="GET" action="Login" class="">
                        <div class="group">
                            <label for="user" class="label">Email</label>
                            <input id="user" type="text" name="email" class="input">
                        </div>
                        <div class="group">
                            <label for="pass" class="label">Password</label>
                            <input id="pass" type="password" name="password" class="input" data-type="password">
                        </div>
                        <div class="group">
                            <input id="check" type="checkbox" class="check" checked>
                            <label for="check"><span class="icon"></span> Keep me Signed in</label>
                        </div>
                        <div class="group">
                            <input type="submit" class="button" value="Sign In">
                        </div>
                        <div class="hr"></div>
                        <div class="foot-lnk">
                            <a href="#forgot">Forgot Password?</a>
                        </div>
                        </form>
                    </div>
                    
                    <div class="sign-up-htm">
                        <form method="POST" action="Login" class="">
                        <div class="group">
                            <label for="user"  class="label">First Name</label>
                            <input id="user" type="text" name="firstName" class="input">
                        </div>
                        <div class="group">
                            <label for="user" class="label">Last Name</label>
                            <input id="user" type="text" name="lastname" class="input">
                        </div>
                        <div class="group">
                            <label for="user" class="label">Username</label>
                            <select name="title" class="input">
                                <option value="Mr">Mr</option>
                                <option value="Mrs">Mrs</option>
                                <option value="Miss">Miss</option>
                                <option value="Dr">Dr</option>
                                <option value="Prof">Prof</option>
                            </select>

                            <div class="group">
                                <label for="user" class="label">Telephone Number</label>
                                <input id="user" type="text" name="telephone" class="input">
                            </div>
                            <div class="group">
                                <label for="pass" class="label">Email Address</label>
                                <input id="pass" type="email" name="email" class="input">
                            </div>
                            <div class="group">
                                <label for="pass" class="label">Password</label>
                                <input id="pass" type="password" name="password" class="input" data-type="password">
                            </div>
                            <div class="group">
                                <label for="pass" class="label">Repeat Password</label>
                                <input id="pass" type="password" name="password1" class="input" data-type="password">
                            </div>
                            <div class="group">
                                <input type="submit" class="button" value="Sign Up">
                            </div>
                            <div class="hr"></div>
                            <div class="foot-lnk">
                                <label for="tab-1">Already Member?</a>
                            </div>
                        </div>
                        </form>
                    </div>
                </div>
            </div>
    </body>
</html>
