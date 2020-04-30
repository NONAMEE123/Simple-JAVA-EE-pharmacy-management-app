/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharma.entites;

/**
 *
 * @author KHALID-RAMI
 */
public class facture {
    
    private int id;
    private String prix_totla;
    private String date_facture;
    private String medicament;

    public facture(int id, String prix_totla, String date_facture, String medicament) {
        this.id = id;
        this.prix_totla = prix_totla;
        this.date_facture = date_facture;
        this.medicament = medicament;
    }
public facture( String prix_totla, String date_facture, String medicament) {
        this.id = id;
        this.prix_totla = prix_totla;
        this.date_facture = date_facture;
        this.medicament = medicament;
    }
    
    
    @Override
    public String toString() {
        return "facture{" + "id=" + id + ", prix_totla=" + prix_totla + ", date_facture=" + date_facture + ", medicament=" + medicament + '}';
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrix_totla() {
        return prix_totla;
    }

    public void setPrix_totla(String prix_totla) {
        this.prix_totla = prix_totla;
    }

    public String getDate_facture() {
        return date_facture;
    }

    public void setDate_facture(String date_facture) {
        this.date_facture = date_facture;
    }

    public String getMedicament() {
        return medicament;
    }

    public void setMedicament(String medicament) {
        this.medicament = medicament;
    }
    
    
    
    
}
