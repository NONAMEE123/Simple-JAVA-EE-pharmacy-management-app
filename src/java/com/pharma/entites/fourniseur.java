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
public class fourniseur {
    private int id;
    private String nom_societe;
    private String adress;
    private String email;
    private String tel;

    public fourniseur(int id, String nom_societe, String adress, String email, String tel) {
        this.id = id;
        this.nom_societe = nom_societe;
        this.adress = adress;
        this.email = email;
        this.tel = tel;
    }

    public fourniseur(String nom_societe, String adress, String email, String tel) {
        this.id = id;
        this.nom_societe = nom_societe;
        this.adress = adress;
        this.email = email;
        this.tel = tel;
    }
    
    
    @Override
    public String toString() {
        return "fourniseur{" + "id=" + id + ", nom_societe=" + nom_societe + ", adress=" + adress + ", email=" + email + ", tel=" + tel + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_societe() {
        return nom_societe;
    }

    public void setNom_societe(String nom_societe) {
        this.nom_societe = nom_societe;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    
    
}
