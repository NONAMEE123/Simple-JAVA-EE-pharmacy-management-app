<%-- 
    Document   : index
    Created on : 23 janv. 2019, 13:43:01
    Author     : KHALID-RAMI
--%>

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
            <h1 class="text-center"> Medicament <small>Ajouter un Medicament</small></h1>
          </div>
        </div>
      </div>
    </header>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-4 col-md-offset-4">
            <form  action="ajoute_medicament" class="well" method="post">
                 <div class="form-group">
                    <label>Nom</label>
                    <input type="text" class="form-control" name="nom" placeholder="Enter Nom">
                  </div> 
                 <div class="form-group">
                    <label>date Expiration</label>
                    <input type="date" class="form-control" name="date_exp" placeholder="Enter un Date ">
                  </div>
                <div class="form-group">
                    <label>Prix Achat</label>
                    <input type="text" class="form-control" name="prix_achat" placeholder="Enter prix d'achat">
                  </div>
                 <div class="form-group">
                    <label>Prix Vendre</label>
                    <input type="text" class="form-control" name="prix_vendre" placeholder="Enter prix de vendre">
                  </div>
                 <div class="form-group">
                    <label>Quantité</label>
                    <input type="text" class="form-control" name="qte" placeholder="Enter quantite">
                  </div>
                  <div class="form-group">
                    <label>Image</label>
                    <input type="file"  name="image" class="form-control" placeholder="Password">
                  </div>
                  <button type="submit" class="btn btn-default btn-block">Ajouter</button>
                  <button type="reset" class="btn btn-default btn-block">Anuler</button>

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
