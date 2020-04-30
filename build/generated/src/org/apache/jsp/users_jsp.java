package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pharma.metier.Iadmin;
import com.pharma.entites.admin;
import java.util.Collection;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Admin Area | Users</title>\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js\"></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-default\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"collapse navbar-collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav\">\n");
      out.write("            <li><a href=\"index.jsp\">Dashboard</a></li>\n");
      out.write("            <li class=\"active\"><a href=\"Affiche_users\">Utilisateurs</a></li>\n");
      out.write("            <li><a href=\"Affiche_medicament\">Medicament</a></li>\n");
      out.write("            <li><a href=\"Affiche_fournissuer\">Fournisseur</a></li>\n");
      out.write("            <li><a href=\"Affiche_facture\">Facture</a></li>\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");

    if ((session.getAttribute("email") == null) || (session.getAttribute("email") == "")) {
response.sendRedirect("login.jsp");

      out.write("\n");
      out.write("You are not logged in<br/>\n");
      out.write("<a href=\"login.jsp\">Please Login</a>\n");
} else {

      out.write("\n");
      out.write("<li><a> Welcome : ");
      out.print(session.getAttribute("email"));
      out.write("</a></li>\n");

    }

      out.write("            <li><a href=\"login.jsp\">Logout</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div><!--/.nav-collapse -->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <header id=\"header\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-10\">\n");
      out.write("            <h1><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> Utilisateurs <small>Gérer Votre Site</small></h1>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-2\">\n");
      out.write("            <div class=\"dropdown create\">\n");
      out.write("              <button  class=\"btn btn-default dropdown-toggle\" type=\"button\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\">\n");
      out.write("                  <a class=\"glyphicon glyphicon-user\"> Utilisateurs</a>\n");
      out.write("                <span class=\"caret\"></span>\n");
      out.write("              </button>\n");
      out.write("              <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenu1\">\n");
      out.write("                <li><a class=\"glyphicon glyphicon-alert\" href=\"login.jsp\">Déconnecter</a></li>\n");
      out.write("                <li><a class=\"glyphicon glyphicon-edit\" href=\"Edit_account.jsp\">Modifier Compte</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <section id=\"breadcrumb\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <ol class=\"breadcrumb\">\n");
      out.write("          <li><a href=\"index.html\">Dashboard</a></li>\n");
      out.write("          <li class=\"active\">Users</li>\n");
      out.write("        </ol>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section id=\"main\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-3\">\n");
      out.write("            <div class=\"list-group\">\n");
      out.write("                \n");
      out.write("              <a href=\"index.jsp\" class=\"list-group-item active main-color-bg\">\n");
      out.write("                <span class=\"glyphicon glyphicon-cog\" aria-hidden=\"true\"></span> Dashboard\n");
      out.write("              </a>\n");
      out.write("               </a>\n");
      out.write("             <a href=\"Affiche_users\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> Utilisateurs <span class=\"badge\">12</span></a>\n");
      out.write("              <a href=\"Affiche_medicament\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-heart\" aria-hidden=\"true\"></span> Medicaments<span class=\"badge\">33</span></a>\n");
      out.write("              <a href=\"Affiche_fournissuer\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span> Fournisseurs<span class=\"badge\">203</span></a>\n");
      out.write("               <a href=\"Affiche_facture\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-list-alt\" aria-hidden=\"true\"></span> Factures<span class=\"badge\">203</span></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("            <div class=\"well\">\n");
      out.write("                <p> Calendrier</p>\n");
      out.write("             <script type=\"text/javascript\">\n");
      out.write("<!--\n");
      out.write("var d = new Date();\n");
      out.write("var dm = d.getMonth() + 1;\n");
      out.write("var dan = d.getYear();\n");
      out.write("if(dan < 999) dan+=1900;\n");
      out.write("calendrier(dm,dan);\n");
      out.write(" \n");
      out.write("function calendrier(mois,an) {\n");
      out.write("nom_mois = new Array\n");
      out.write("(\"Janvier\",\"F&eacute;vrier\",\"Mars\",\"Avril\",\"Mai\",\"Juin\",\"Juillet\",\n");
      out.write("\"Ao&ucirc;t\",\"Septembre\",\"Octobre\",\"Novembre\",\"D&eacute;cembre\");\n");
      out.write("jour = new Array (\"Lu\",\"Ma\",\"Me\",\"Je\",\"Ve\",\"Sa\",\"Di\");\n");
      out.write(" \n");
      out.write("var police_entete = \"Verdana,Arial\"; /* police entête de calendrier  */\n");
      out.write("var taille_pol_entete = 4;           /* taille de police 1-7 entête de calendrier  */\n");
      out.write("var couleur_pol_entete = \"\";     /* couleur de police entête de calendrier  */\n");
      out.write("var arrplan_entete = \"\";        /* couleur d'arrière plan entête de calendrier  */\n");
      out.write("var police_jours = \"Verdana,Arial\"; /* police affichage des jours  */\n");
      out.write("var taille_pol_jours = 4;           /* taille de police 1-7 affichage des jours  */\n");
      out.write("var coul_pol_jours = \"#000000\";     /* couleur de police affichage des jours  */\n");
      out.write("var arrplan_jours = \"#D0F0F0\";        /* couleur d'arrière plan affichage des jours  */\n");
      out.write("var couleur_dim = \"blue\";        /* couleur de police pour dimanches  */\n");
      out.write("var couleur_cejour = \"#FFFF00\";        /* couleur d'arrière plan pour aujourd'hui  */\n");
      out.write(" \n");
      out.write("var maintenant = new Date();\n");
      out.write("var ce_mois = maintenant.getMonth() + 1;\n");
      out.write("var cette_annee = maintenant.getYear();\n");
      out.write("if(cette_annee < 999) cette_annee+=1900;\n");
      out.write("var ce_jour = maintenant.getDate();\n");
      out.write("var temps = new Date(an,mois-1,1);\n");
      out.write("var Start = temps.getDay();\n");
      out.write("if(Start > 0) Start--;\n");
      out.write("else Start = 6;\n");
      out.write("var Stop = 31;\n");
      out.write("if(mois==4 ||mois==6 || mois==9 || mois==11 ) --Stop;\n");
      out.write("if(mois==2) {\n");
      out.write(" Stop = Stop - 3;\n");
      out.write(" if(an%4==0) Stop++;\n");
      out.write(" if(an%100==0) Stop--;\n");
      out.write(" if(an%400==0) Stop++;\n");
      out.write("}\n");
      out.write("document.write('<table border=\"3\" cellpadding=\"1\" cellspacing=\"1\">');\n");
      out.write("var entete_mois = nom_mois[mois-1] + \" \" + an;\n");
      out.write("inscrit_entete(entete_mois,arrplan_entete,couleur_pol_entete,taille_pol_entete,police_entete);\n");
      out.write("var nombre_jours = 1;\n");
      out.write("for(var i=0;i<=5;i++) {\n");
      out.write("  document.write(\"<tr>\");\n");
      out.write("  for(var j=0;j<=5;j++) {\n");
      out.write("    if((i==0)&&(j < Start))\n");
      out.write("     inscrit_cellule(\"&#160;\",arrplan_jours,coul_pol_jours,taille_pol_jours,police_jours);\n");
      out.write("    else {\n");
      out.write("      if(nombre_jours > Stop)\n");
      out.write("        inscrit_cellule(\"&#160;\",arrplan_jours,coul_pol_jours,taille_pol_jours,police_jours);\n");
      out.write("      else {\n");
      out.write("        if((an==cette_annee)&&(mois==ce_mois)&&(nombre_jours==ce_jour))\n");
      out.write("         inscrit_cellule(nombre_jours,couleur_cejour,coul_pol_jours,taille_pol_jours,police_jours);\n");
      out.write("        else\n");
      out.write("         inscrit_cellule(nombre_jours,arrplan_jours,coul_pol_jours,taille_pol_jours,police_jours);\n");
      out.write("        nombre_jours++;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("    if(nombre_jours > Stop)\n");
      out.write("      inscrit_cellule(\"&#160;\",arrplan_jours,couleur_dim,taille_pol_jours,police_jours);\n");
      out.write("    else {\n");
      out.write("      if((an==cette_annee)&&(mois==ce_mois)&&(nombre_jours==ce_jour))\n");
      out.write("        inscrit_cellule(nombre_jours,couleur_cejour,couleur_dim,taille_pol_jours,police_jours);\n");
      out.write("      else\n");
      out.write("        inscrit_cellule(nombre_jours,arrplan_jours,couleur_dim,taille_pol_jours,police_jours);\n");
      out.write("      nombre_jours++;\n");
      out.write("    }\n");
      out.write("    document.write(\"<\\/tr>\");\n");
      out.write("  }\n");
      out.write("document.write(\"<\\/table>\");\n");
      out.write("}\n");
      out.write(" \n");
      out.write("function inscrit_entete(titre_mois,couleurAP,couleurpolice,taillepolice,police) {\n");
      out.write("document.write(\"<tr>\");\n");
      out.write("document.write('<td align=\"center\" colspan=\"7\" valign=\"middle\" bgcolor=\"'+couleurAP+'\">');\n");
      out.write("document.write('<font size=\"'+taillepolice+'\" color=\"'+couleurpolice+'\" face=\"'+police+'\"><b>');\n");
      out.write("document.write(titre_mois);\n");
      out.write("document.write(\"<\\/b><\\/font><\\/td><\\/tr>\");\n");
      out.write("document.write(\"<tr>\");\n");
      out.write("for(var i=0;i<=6;i++)\n");
      out.write("  inscrit_cellule(jour[i],couleurAP,couleurpolice,taillepolice,police);\n");
      out.write("document.write(\"<\\/tr>\");\n");
      out.write("}\n");
      out.write(" \n");
      out.write("function inscrit_cellule(contenu,couleurAP,couleurpolice,taillepolice,police) {\n");
      out.write("document.write('<td align=\"center\" valign=\"middle\" bgcolor=\"'+couleurAP+'\">');\n");
      out.write("document.write('<font size=\"'+taillepolice+'\" color=\"'+couleurpolice+'\" face=\"'+police+'\"><b>');\n");
      out.write("document.write(contenu);\n");
      out.write("document.write(\"<\\/b><\\/font><\\/td>\");\n");
      out.write("}\n");
      out.write("//-->\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-9\">\n");
      out.write("                    <!-- BUTTONS-->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("              <ul class=\"pager\" style=\"margin-top:0;\">\n");
      out.write("                                <li class=\"previous\" style=\"cursor:pointer\">\n");
      out.write("                                <a  href=\"form_users.jsp\" type=\"button\" ><span class=\"glyphicon glyphicon-plus\"> Ajouter Un Utilisateur</span></a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                    </div>\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("              <div class=\"panel-heading main-color-bg\">\n");
      out.write("                <h3 class=\"panel-title\">Users</h3>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"panel-body\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-12\">\n");
      out.write("                                <input class=\"form-control\" id=\"myInput\" onkeyup=\"myFunction()\" type=\"text\" placeholder=\"Filter By Names\"/>\n");
      out.write("                      </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <table class=\"table table-striped table-hover\">\n");
      out.write("                      <tr>\n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <th>Nom</th>\n");
      out.write("                        <th>Prenom</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Action</th>\n");
      out.write("                      </tr>\n");
      out.write("                      ");

	Collection<admin> users = (Collection<admin>)request.getAttribute("users");
	for(admin adminn : users){

      out.write("\n");
      out.write("\t<tr><td>");
      out.print(adminn.getId() );
      out.write("</td><td>");
      out.print( adminn.getNom() );
      out.write("</td><td>");
      out.print(adminn.getPrenom() );
      out.write("</td><td>");
      out.print(adminn.getEmail() );
      out.write("</td><td><a href=\"edit_users.jsp?id=");
      out.print(adminn.getId() );
      out.write("\" class=\"btn btn-sm btn-success\">Modifier</a> <a href=\"delete_users?id=");
      out.print(adminn.getId() );
      out.write("\" class=\"btn btn-sm btn-danger\">Supprimer</a></td></tr>\n");

	}

      out.write("\n");
      out.write("                    </table>\n");
      out.write("              </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <footer id=\"footer\">\n");
      out.write("      <p>Copyright AdminStrap, &copy; 2017</p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <!-- Modals -->\n");
      out.write("\n");
      out.write("    <!-- Add Page -->\n");
      out.write("    <div class=\"modal fade\" id=\"addPage\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <form>\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("        <h4 class=\"modal-title\" id=\"myModalLabel\">Add Page</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Page Title</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Page Title\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Page Body</label>\n");
      out.write("          <textarea name=\"editor1\" class=\"form-control\" placeholder=\"Page Body\"></textarea>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"checkbox\">\n");
      out.write("          <label>\n");
      out.write("            <input type=\"checkbox\"> Published\n");
      out.write("          </label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Meta Tags</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Add Some Tags...\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Meta Description</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Add Meta Description...\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("     CKEDITOR.replace( 'editor1' );\n");
      out.write(" </script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script> \n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
