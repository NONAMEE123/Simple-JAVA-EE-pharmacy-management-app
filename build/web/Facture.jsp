<%-- 
    Document   : users
    Created on : 23 janv. 2019, 15:42:24
    Author     : KHALID-RAMI
--%>

<%@page import="com.pharma.entites.facture"%>
<%@page import="com.pharma.metier.Iadmin"%>
<%@page import="com.pharma.entites.admin"%>
<%@page import="java.util.Collection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Area | Users</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

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
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="index.jsp">Dashboard</a></li>
            <li><a href="Affiche_users">Utilisateurs</a></li>
            <li><a href="Affiche_medicament">Medicament</a></li>
            <li><a href="Affiche_fournissuer">Fournisseur</a></li>
            <li class="active"><a href="Affiche_facture">Facture</a></li>

          </ul>
          <ul class="nav navbar-nav navbar-right">
<%
    if ((session.getAttribute("email") == null) || (session.getAttribute("email") == "")) {
response.sendRedirect("login.jsp");
%>
You are not logged in<br/>
<a href="login.jsp">Please Login</a>
<%} else {
%>
<li><a> Welcome : <%=session.getAttribute("email")%></a></li>
<%
    }
%>            <li><a href="login.jsp">Logout</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-10">
            <h1><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Medicaments <small>Gérer Votre Site</small></h1>
          </div>
          <div class="col-md-2">
            <div class="dropdown create">
              <button  class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                  <a class="glyphicon glyphicon-user"> Utilisateurs</a>
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                <li><a class="glyphicon glyphicon-alert" href="login.jsp">Déconnecter</a></li>
                <li><a class="glyphicon glyphicon-edit" href="Edit_account.jsp">Modifier Compte</a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </header>

    <section id="breadcrumb">
      <div class="container">
        <ol class="breadcrumb">
          <li><a href="index.jsp">Dashboard</a></li>
          <li class="active">Facture</li>
        </ol>
      </div>
    </section>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-3">
            <div class="list-group">
                
              <a href="index.jsp" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Dashboard
              </a>
               </a>
             <a href="Affiche_users" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Utilisateurs <span class="badge">12</span></a>
              <a href="Affiche_medicament" class="list-group-item"><span class="glyphicon glyphicon-heart" aria-hidden="true"></span> Medicaments<span class="badge">33</span></a>
              <a href="Affiche_fournissuer" class="list-group-item"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Fournisseurs<span class="badge">203</span></a>
               <a href="Affiche_facture" class="list-group-item"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Factures<span class="badge">203</span></a>
            </div>

                            
            <div class="well">
                <p> Calendrier</p>
             <script type="text/javascript">
<!--
var d = new Date();
var dm = d.getMonth() + 1;
var dan = d.getYear();
if(dan < 999) dan+=1900;
calendrier(dm,dan);
 
function calendrier(mois,an) {
nom_mois = new Array
("Janvier","F&eacute;vrier","Mars","Avril","Mai","Juin","Juillet",
"Ao&ucirc;t","Septembre","Octobre","Novembre","D&eacute;cembre");
jour = new Array ("Lu","Ma","Me","Je","Ve","Sa","Di");
 
var police_entete = "Verdana,Arial"; /* police entête de calendrier  */
var taille_pol_entete = 4;           /* taille de police 1-7 entête de calendrier  */
var couleur_pol_entete = "";     /* couleur de police entête de calendrier  */
var arrplan_entete = "";        /* couleur d'arrière plan entête de calendrier  */
var police_jours = "Verdana,Arial"; /* police affichage des jours  */
var taille_pol_jours = 4;           /* taille de police 1-7 affichage des jours  */
var coul_pol_jours = "#000000";     /* couleur de police affichage des jours  */
var arrplan_jours = "#D0F0F0";        /* couleur d'arrière plan affichage des jours  */
var couleur_dim = "blue";        /* couleur de police pour dimanches  */
var couleur_cejour = "#FFFF00";        /* couleur d'arrière plan pour aujourd'hui  */
 
var maintenant = new Date();
var ce_mois = maintenant.getMonth() + 1;
var cette_annee = maintenant.getYear();
if(cette_annee < 999) cette_annee+=1900;
var ce_jour = maintenant.getDate();
var temps = new Date(an,mois-1,1);
var Start = temps.getDay();
if(Start > 0) Start--;
else Start = 6;
var Stop = 31;
if(mois==4 ||mois==6 || mois==9 || mois==11 ) --Stop;
if(mois==2) {
 Stop = Stop - 3;
 if(an%4==0) Stop++;
 if(an%100==0) Stop--;
 if(an%400==0) Stop++;
}
document.write('<table border="3" cellpadding="1" cellspacing="1">');
var entete_mois = nom_mois[mois-1] + " " + an;
inscrit_entete(entete_mois,arrplan_entete,couleur_pol_entete,taille_pol_entete,police_entete);
var nombre_jours = 1;
for(var i=0;i<=5;i++) {
  document.write("<tr>");
  for(var j=0;j<=5;j++) {
    if((i==0)&&(j < Start))
     inscrit_cellule("&#160;",arrplan_jours,coul_pol_jours,taille_pol_jours,police_jours);
    else {
      if(nombre_jours > Stop)
        inscrit_cellule("&#160;",arrplan_jours,coul_pol_jours,taille_pol_jours,police_jours);
      else {
        if((an==cette_annee)&&(mois==ce_mois)&&(nombre_jours==ce_jour))
         inscrit_cellule(nombre_jours,couleur_cejour,coul_pol_jours,taille_pol_jours,police_jours);
        else
         inscrit_cellule(nombre_jours,arrplan_jours,coul_pol_jours,taille_pol_jours,police_jours);
        nombre_jours++;
        }
      }
    }
    if(nombre_jours > Stop)
      inscrit_cellule("&#160;",arrplan_jours,couleur_dim,taille_pol_jours,police_jours);
    else {
      if((an==cette_annee)&&(mois==ce_mois)&&(nombre_jours==ce_jour))
        inscrit_cellule(nombre_jours,couleur_cejour,couleur_dim,taille_pol_jours,police_jours);
      else
        inscrit_cellule(nombre_jours,arrplan_jours,couleur_dim,taille_pol_jours,police_jours);
      nombre_jours++;
    }
    document.write("<\/tr>");
  }
document.write("<\/table>");
}
 
function inscrit_entete(titre_mois,couleurAP,couleurpolice,taillepolice,police) {
document.write("<tr>");
document.write('<td align="center" colspan="7" valign="middle" bgcolor="'+couleurAP+'">');
document.write('<font size="'+taillepolice+'" color="'+couleurpolice+'" face="'+police+'"><b>');
document.write(titre_mois);
document.write("<\/b><\/font><\/td><\/tr>");
document.write("<tr>");
for(var i=0;i<=6;i++)
  inscrit_cellule(jour[i],couleurAP,couleurpolice,taillepolice,police);
document.write("<\/tr>");
}
 
function inscrit_cellule(contenu,couleurAP,couleurpolice,taillepolice,police) {
document.write('<td align="center" valign="middle" bgcolor="'+couleurAP+'">');
document.write('<font size="'+taillepolice+'" color="'+couleurpolice+'" face="'+police+'"><b>');
document.write(contenu);
document.write("<\/b><\/font><\/td>");
}
//-->
</script>
            </div>
          </div>
          <div class="col-md-9">
                    <!-- BUTTONS-->
                    <div class="row">
              <ul class="pager" style="margin-top:0;">
                                <li class="previous" style="cursor:pointer">
                                <a  href="form_facture.jsp" type="button"><span class="glyphicon glyphicon-plus"> Ajouter Une Facture </span></a>
                                 <form action="newpdf">
                                    <input type="submit"  class="btn-primary" value="Génerer Une liste de Facture" />
                                    </form>
</li>
                            </ul>
                    </div>
            <div class="panel panel-default">
              <div class="panel-heading main-color-bg">
                <h3 class="panel-title">Users</h3>
              </div>
              <div class="panel-body">
                <div class="row">
                      <div class="col-md-12">
                          <input class="form-control" type="text" placeholder="Filter Users...">
                      </div>
                </div>
                <br>
                <table class="table table-striped table-hover">
                      <tr>
                        <th>Id</th>
                        <th>Prix total</th>
                        <th>date_facture</th>
                        <th>medicament</th>
                        <th>Action</th>
                      </tr>
                             <%
	Collection<facture> Facture = (Collection<facture>)request.getAttribute("Facture");
	for(facture adminn : Facture){
%>
	<tr><td><%=adminn.getId() %></td><td><%= adminn.getPrix_totla() %></td><td><%=adminn.getDate_facture() %></td><td><%=adminn.getMedicament() %></td><td><a href="edit_facture.jsp?id=<%=adminn.getId() %>" class="btn btn-sm btn-success">Modifier</a> <a href="delete_facture?id=<%=adminn.getId() %>" class="btn btn-sm btn-danger">Supprimer</a></td></tr>
<%
	}
%>
                    </table>
              </div>
              </div>

          </div>
        </div>
      </div>
    </section>

    <footer id="footer">
      <p>Copyright AdminStrap, &copy; 2017</p>
    </footer>

    <!-- Modals -->

    <!-- Add Page -->
    <div class="modal fade" id="addPage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form>
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Add Page</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>Page Title</label>
          <input type="text" class="form-control" placeholder="Page Title">
        </div>
        <div class="form-group">
          <label>Page Body</label>
          <textarea name="editor1" class="form-control" placeholder="Page Body"></textarea>
        </div>
        <div class="checkbox">
          <label>
            <input type="checkbox"> Published
          </label>
        </div>
        <div class="form-group">
          <label>Meta Tags</label>
          <input type="text" class="form-control" placeholder="Add Some Tags...">
        </div>
        <div class="form-group">
          <label>Meta Description</label>
          <input type="text" class="form-control" placeholder="Add Meta Description...">
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Save changes</button>
      </div>
    </form>
    </div>
  </div>
</div>

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
