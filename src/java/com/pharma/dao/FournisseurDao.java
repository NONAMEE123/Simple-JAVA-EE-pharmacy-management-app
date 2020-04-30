/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharma.dao;

import com.pharma.entites.facture;
import com.pharma.entites.fourniseur;
import com.pharma.metier.Ifournisseur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author KHALID-RAMI
 */
public class FournisseurDao implements Ifournisseur{

    @Override
    public fourniseur find(int id) {
Connection connection = ConfigDB.getInstance().getConnection();
	
			try {
				PreparedStatement stmt;
				stmt = connection.prepareStatement("SELECT * FROM fourniseur WHERE id = ?");
				stmt.setInt(1, id);
				ResultSet result = stmt.executeQuery();
				result.next();
				String nom_societe = result.getString("nom_societe");
				String adress = result.getString("adress");
				String email = result.getString("email");
                                String tel = result.getString("tel");
                                fourniseur t = new fourniseur(id, nom_societe, adress, email, tel);
                                return t;
			} catch (SQLException e) {
				System.out.println("Erreur SQL " + e.getMessage());
			}
	
			return null;    }

    @Override
    public void add(fourniseur fournisseur) {
Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("INSERT INTO fourniseur VALUES (NULL, ?, ?, ?,?)");
			stmt.setString(1, fournisseur.getNom_societe());
			stmt.setString(2, fournisseur.getAdress());
			stmt.setString(3, fournisseur.getEmail());
			stmt.setString(4, fournisseur.getTel());
                        stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}    }

    @Override
    public boolean update(fourniseur fournisseur) {
Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("UPDATE fourniseur SET nom_societe=?,adress=?,email=?,tel=? WHERE id = ?");
			stmt.setString(1, fournisseur.getNom_societe());
			stmt.setString(2, fournisseur.getAdress());
			stmt.setString(3, fournisseur.getEmail());
			stmt.setString(4, fournisseur.getTel());
			stmt.setInt(5, fournisseur.getId());
			return stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}
		return false;    }

    @Override
    public boolean delete(int id) {
        Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("DELETE FROM fourniseur WHERE id = ?");
			stmt.setInt(1, id);
			return stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}
		return false;
    }

    @Override
    public Collection<fourniseur> findAll() {
        Connection connection = ConfigDB.getInstance().getConnection();
		Collection<fourniseur> fournisseur = new ArrayList<fourniseur>();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("SELECT * FROM fourniseur");
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				int id = result.getInt("id");
				String nom_societe = result.getString("nom_societe");
				String adress = result.getString("adress");
				String email = result.getString("email");
                                String tel = result.getString("tel");
                                 fourniseur ff = new fourniseur(id, nom_societe, adress, email, tel);
                                 fournisseur.add(ff);
                        }
			return fournisseur;
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

		return null;    }
    }
    

