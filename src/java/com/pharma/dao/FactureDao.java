/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharma.dao;

import com.pharma.entites.facture;
import com.pharma.entites.medicament;
import com.pharma.metier.Ifacture;
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
public class FactureDao implements Ifacture{

    @Override
    public facture find(int id) {
Connection connection = ConfigDB.getInstance().getConnection();
	
			try {
				PreparedStatement stmt;
				stmt = connection.prepareStatement("SELECT * FROM facture WHERE id = ?");
				stmt.setInt(1, id);
				ResultSet result = stmt.executeQuery();
				result.next();
				String prix_total = result.getString("prix_total");
				String date_facture = result.getString("date_facture");
				String medicament = result.getString("medicament");
                                 facture f = new facture(id, prix_total, date_facture, medicament);
                                return f;
			} catch (SQLException e) {
				System.out.println("Erreur SQL " + e.getMessage());
			}
	
			return null;
    }

    @Override
    public void add(facture facturee) {
Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("INSERT INTO facture VALUES (NULL, ?, ?, ?)");
			stmt.setString(1, facturee.getPrix_totla());
			stmt.setString(2, facturee.getDate_facture());
			stmt.setString(3, facturee.getMedicament());
			stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}
    }

    @Override
    public boolean update(facture facturee) {
        Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("UPDATE facture SET prix_total = ?, date_facture = ?, medicament = ? WHERE id = ?");
			stmt.setString(1, facturee.getPrix_totla());
			stmt.setString(2, facturee.getDate_facture());
			stmt.setString(3, facturee.getMedicament());
			stmt.setInt(4, facturee.getId());
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
			stmt = connection.prepareStatement("DELETE FROM facture WHERE id = ?");
			stmt.setInt(1, id);
			return stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}
		return false;
    }

    @Override
    public Collection<facture> findAll() {
Connection connection = ConfigDB.getInstance().getConnection();
		Collection<facture> facturee = new ArrayList<facture>();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("SELECT * FROM facture");
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				int id = result.getInt("id");
				String prix_total = result.getString("prix_total");
				String date_facture = result.getString("date_facture");
				String medicament = result.getString("medicament");
                                facture d = new facture(id, prix_total, date_facture, medicament);
                                facturee.add(d);
			}
			return facturee;
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

		return null;    }
    
    
}
