/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharma.controllers;
import com.pharma.dao.DBconnection;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KHALID-RAMI
 */
@WebServlet(name = "newpdf", urlPatterns = {"/newpdf"})
public class newpdf extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String file_name="C:\\Users\\KHALID-RAMI\\Desktop\\test02.pdf";
            Document document = new Document();
            	  PdfPTable table = new PdfPTable(new float[] { 2, 1, 2 });
	List list = new List(List.ORDERED);
        
list.setAutoindent(false);
        list.setSymbolIndent(42);
                PdfWriter.getInstance(document, new FileOutputStream(file_name));
                document.open();                
                DBconnection cnn = new DBconnection();
                Connection con = cnn.getConnection();
                PreparedStatement ps = null;
                ResultSet rs=null;
                String query="select prix_total,date_facture,medicament,sum(prix_total) from facture";
            try {
                ps=con.prepareStatement(query);
            } catch (SQLException ex) {
ex.getMessage();
            }
            try {
                rs=ps.executeQuery();
            } catch (SQLException ex) {
ex.getMessage();            }
            try {   	  

   document.add(Image.getInstance("C:\\Users\\KHALID-RAMI\\Desktop\\conference.jpg"));
                System.out.println("<br>");
                while(rs.next()){
         table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
	  table.addCell("Prix total");
          table.addCell("date facture");
          table.addCell("Medicament");
	  table.setHeaderRows(1);
	  PdfPCell[] cells = table.getRow(0).getCells(); 
	  for (int j=0;j<cells.length;j++){
	     cells[j].setBackgroundColor(BaseColor.GRAY);
	  }
          for (int i=1;i<5;i++){
             table.addCell(""+rs.getString("prix_total"));
             table.addCell(""+rs.getString("date_facture"));
             table.addCell(""+rs.getString("medicament"));
          }      
              document.add(table);
         list.add(new ListItem("le Total des Sommes est :"+rs.getString("sum(prix_total)")+"DH"));	
         document.add(list);
        
                }
                                    response.sendRedirect("Affiche_facture");

            } catch (SQLException ex) {
ex.getMessage();            }
                
                
                document.close();
            } catch (DocumentException ex) {
                ex.getMessage();
            }
    }
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
