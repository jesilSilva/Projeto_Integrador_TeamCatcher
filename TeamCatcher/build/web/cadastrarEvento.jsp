<%-- 
    Document   : cadastrarEvento
    Created on : 10/10/2018, 12:36:26
    Author     : Jesiel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar evento</title>
        <link  rel="stylesheet" type="text/css" href="css/formularioCadastro.css"/>
        <link  rel="stylesheet" type="text/css" href="css/menuu.css"/>
       

    </head>
    <body>
     


            <div id="mySidenav" class="sidenav">
                <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
                <br>
                <a href="#">Categorias</a>
               
                <a href="#">Meus eventos</a>
                <a href="#">Conta</a>
                <a href="#">Configuração</a>
                <br><br><br><br><br><br>
                 <a href="#">Sair</a>
                
               
            </div>
 
            <div id="maiin">

                <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; </span>

                <script src="js/menu.js" type="text/javascript"></script></script>
                <form method="POST" name="form " action="cadastra-exame" >

                    <br><br><br>
                    <fieldset style="width: 60%; margin: 0px auto;">

                        <legend><h2 ><font color="blue" > Cadastro de Evento </font></h2></legend>


                        <br><br>
                        <label for="nome">Nome:</label>
                        <br>
                        <input type="text" name="nome" size="20" maxlenght="90" placeholder="nome" alt="Informe o tipo do exame" title="Informe o tipo do exame" required name=nome/>
                        <br>
                        <label for="horaInicio">Hora Inicio:</label><br>
                        <input type="time" name="horaInicio" size="30"  />
                        <br>

                        <label for="horaFim">Hora Fim:</label><br>
                        <input type="time" name="horaFim" size="30" required name=horaFim />
                        <br>
                        <label for="dataInicio">Data de inicio:</label><br>
                        <input type="date" name="dataInicio" size="30" required name=dataInicio />
                        <br>
                        <label for="dataFim">Data Fim:</label><br>
                        <input type="date" name="dataFim" size="30" required name=dataFim />
                        <br>
                        <label for="custo">Custo R$:</label><br>
                        <input type="text" name="custo" size="20" required name=custo />
                        <br>
                        <label for="capacidade">Capacidade:</label><br>
                        <input type="number" name="capacidade" size="30" required name=capacidade />
                        <br>
                        <br>
                        <br>



                        <input type="submit" value="Cadastrar" onclick="funcao1()"  />

                        <input type="reset" value ="Limpar"/>

                        <br>


                    </fieldset>
                </form>
            
    </body>
</html>
