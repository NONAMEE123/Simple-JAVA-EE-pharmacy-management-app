<%-- 
    Document   : index
    Created on : 23 janv. 2019, 13:43:01
    Author     : KHALID-RAMI
--%>

<%@page import="com.pharma.entites.admin"%>
<%@page import="com.pharma.dao.AdminDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Area | Account Login</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
  </head>
  <body>

    <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">AdminStrap</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">

        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <h1 class="text-center"> Utilisateurs <small>Ajouter un utilisateur</small></h1>
          </div>
        </div>
      </div>
    </header>
    
    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-4 col-md-offset-4">
            <form  action="modifier_users" class="well" method="post"> 
                <div class="form-group">
                    <label>id</label>
                    <input type="text" class="form-control" name="id" placeholder="Enter Nom" value=""> 
                  </div>
                 <div class="form-group">
                    <label>Nom</label>
                    <input type="text" class="form-control" name="nom" placeholder="Enter Nom" value="" >
                  </div> 
                 <div class="form-group">
                    <label>Prénom</label>
                    <input type="text" class="form-control" name="prenom" placeholder="Enter Prenom" value="" >
                  </div>
                <div class="form-group">
                    <label>Email Address</label>
                    <input type="text" class="form-control" name="email" placeholder="Enter Email" value="" >
                  </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" class="form-control" name="password" placeholder="Enter mdp" value=""  >
                  </div>
                  <div class="form-group">
                  <button type="submit" class="btn btn-default btn-block">Modifier</button>

              </form>
          </div>
        </div>
      </div>
    </section>

    <footer id="footer">
      <p>Copyright AdminStrap, &copy; 2017</p>
    </footer>

  <script>
     CKEDITOR.replace( 'editor1' );
 </script>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
