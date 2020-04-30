/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharma.dao;

import com.pharma.entites.fourniseur;
import com.pharma.entites.medicament;
import com.pharma.metier.Imedicament;
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
public class MedicamentDao implements Imedicament {

    @Override
    public medicament find(int id) {
Connection connection = ConfigDB.getInstance().getConnection();
	
			try {
				PreparedStatement stmt;
				stmt = connection.prepareStatement("SELECT * FROM medicament WHERE id = ?");
				stmt.setInt(1, id);
				ResultSet result = stmt.executeQuery();
				result.next();
				String nom = result.getString("nom");
				String date_exp = result.getString("date_exp");
				String prix_achat = result.getString("prix_achat");
                                String qte = result.getString("qte");
                                String image = result.getString("image");
                                medicament m = new medicament(id, nom, date_exp, prix_achat, prix_achat, qte, image);
                                return m;
			} catch (SQLException e) {
				System.out.println("Erreur SQL " + e.getMessage());
			}
	
			return null;     }

    @Override
    public void add(medicament medicamentt) {
        
       Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("INSERT INTO medicament VALUES (NULL, ?,?,?,?,?,?)");
			stmt.setString(1, medicamentt.getNom());
                        stmt.setString(2, medicamentt.getDate_exp());
			stmt.setString(3, medicamentt.getPrix_achat());
			stmt.setString(4, medicamentt.getPrix_vendre());
			stmt.setString(5, medicamentt.getQte());
			stmt.setString(6, medicamentt.getImage());

			stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

    }

    @Override
    public boolean update(medicament medicamentt) {
        Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("UPDATE medicament SET nom = ?, date_exp = ?,prix_achat = ?,prix_vendre = ?,qte= ?,image = ? WHERE id = ?");
			stmt.setString(1, medicamentt.getNom());
                        stmt.setString(2, medicamentt.getDate_exp());
			stmt.setString(3, medicamentt.getPrix_achat());
			stmt.setString(4, medicamentt.getPrix_vendre());
			stmt.setString(5, medicamentt.getQte());
			stmt.setString(6, medicamentt.getImage());
                        stmt.setInt(7, medicamentt.getId());
			return stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}
		return false;
    }

    @Override
    public boolean delete(int id) {
Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("DELETE FROM medicament WHERE id = ?");
			stmt.setInt(1,id);
			return stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}
		return false;    }

    @Override
    public Collection<medicament> findAll() {
        Connection connection = ConfigDB.getInstance().getConnection();
		Collection<medicament> medi = new ArrayList<medicament>();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("SELECT * FROM medicament");
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				int id = result.getInt("id");
				String nom = result.getString("nom");
				String date_exp = result.getString("date_exp");
				String prix_achat = result.getString("prix_achat");
                                String qte = result.getString("qte");
                                String image = result.getString("image");
                                medicament me = new medicament(id, nom, date_exp, prix_achat, prix_achat, qte, image);
                                medi.add(me);
			}
			return medi;
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

		return null;
	}
    }
    
