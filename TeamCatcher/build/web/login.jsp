<%-- 
    Document   : login
    Created on : 15/10/2018, 09:33:42
    Author     : Jesiel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link  rel="stylesheet" type="text/css" href="css/login.css"/>
    </head>
    <body  >
        <h1 align="center">Bem vindo ao Team Catcher</h1>

        <br>
        <form method="POST" name="form " action="cadastra-exame" >
            <fieldset style="width: 35%; margin: 0px auto;" bgcolor="white">

                <legend><h2 ><font color="blue" > Login </font></h2></legend>
                <br><br><br>
                

                <div class="input-container">
                    <i class="fa fa-envelope icon"></i>
                    <input class="input-field" type="text" placeholder="Email" name="email">
                </div>
                <br>
                <div class="input-container">
                    <i class="fa fa-key icon"></i>
                    <input class="input-field" type="password" placeholder="Senha" name="senha">
                </div>
                <h5 ><b>Esqueceu a senha?</b> <a href="">Clique aqui</a></h5>
                <br>
                <input type="submit" value ="Entrar"/>
            </fieldset>
            <h5 align="center"> Não possui uma conta? Crie agora mesmo</h5>

            <input type="submit" value="Criar conta >>>" style="width: 250px; height:45px" >

        </form>
    </body>
</html>
