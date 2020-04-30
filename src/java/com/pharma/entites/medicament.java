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
public class medicament {
    private int id;
    private String nom;
    private String date_exp;
    private String prix_achat;
    private String prix_vendre;
    private String qte;
    private String image;

    public medicament(int id, String nom, String date_exp, String prix_achat, String prix_vendre, String qte, String image) {
        this.id = id;
        this.nom = nom;
        this.date_exp = date_exp;
        this.prix_achat = prix_achat;
        this.prix_vendre = prix_vendre;
        this.qte = qte;
        this.image = image;
    }
    public medicament( String nom, String date_exp, String prix_achat, String prix_vendre, String qte, String image) {
        this.id = id;
        this.nom = nom;
        this.date_exp = date_exp;
        this.prix_achat = prix_achat;
        this.prix_vendre = prix_vendre;
        this.qte = qte;
        this.image = image;
    }

    
    @Override
    public String toString() {
        return "medicament{" + "id=" + id + ", nom=" + nom + ", date_exp=" + date_exp + ", prix_achat=" + prix_achat + ", prix_vendre=" + prix_vendre + ", qte=" + qte + ", image=" + image + '}';
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate_exp() {
        return date_exp;
    }

    public void setDate_exp(String date_exp) {
        this.date_exp = date_exp;
    }

    public String getPrix_achat() {
        return prix_achat;
    }

    public void setPrix_achat(String prix_achat) {
        this.prix_achat = prix_achat;
    }

    public String getPrix_vendre() {
        return prix_vendre;
    }

    public void setPrix_vendre(String prix_vendre) {
        this.prix_vendre = prix_vendre;
    }

    public String getQte() {
        return qte;
    }

    public void setQte(String qte) {
        this.qte = qte;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}
