/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharma.dao;

import com.pharma.entites.admin;
import com.pharma.metier.Iadmin;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import javax.ws.rs.core.Response;

/**
 *
 * @author KHALID-RAMI
 */
public class AdminDao implements Iadmin{
    

    @Override
    public admin find(int id) {
        Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("SELECT * FROM admin WHERE id = ?");
			stmt.setInt(1,id);
			ResultSet result = stmt.executeQuery();
			result.next();
			String nom = result.getString("nom");
			String prenom = result.getString("prenom");
			String email = result.getString("email");
                        String password=result.getString("password");
			admin adminn = new admin(id, nom, prenom, email,password);
			return adminn;
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

		return null;
    }

    @Override
    public void add(admin adminn) {
        
        Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("INSERT INTO admin VALUES (NULL, ?, ?, ?, ?)");
			stmt.setString(1, adminn.getNom());
			stmt.setString(2, adminn.getPrenom());
			stmt.setString(3, adminn.getEmail());
                        stmt.setString(4, adminn.getPassword());
			stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

    }

    @Override
    public boolean update(admin adminn) {
        
        Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("UPDATE admin SET nom=?,prenom=?,email=?,password=? WHERE id = ?");
			stmt.setString(1, adminn.getNom());
			stmt.setString(2, adminn.getPrenom());
			stmt.setString(3, adminn.getEmail());
			stmt.setString(4, adminn.getPassword());
                        stmt.setInt(5,adminn.getId());
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
			stmt = connection.prepareStatement("DELETE FROM admin WHERE id = ?");
			stmt.setInt(1,id);
			return stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}
		return false;
        
    }

    @Override
    public Collection<admin> findAll() {
        Connection connection = ConfigDB.getInstance().getConnection();
		Collection<admin> adminnn = new ArrayList<admin>();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("SELECT * FROM admin");
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				int id = result.getInt("id");
				String nom = result.getString("nom");
				String prenom = result.getString("prenom");
				String email = result.getString("email");
                                String password = result.getString("password");
				admin adminn = new admin(id, nom, prenom, email,password);
				adminnn.add(adminn);
			}
			return adminnn;
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

		return null;
    }
    
    public admin findd(String email,String password){
          Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("SELECT * FROM admin WHERE email=? and password=?");
			stmt.setString(4, email);
                        stmt.setString(5, password);
                        ResultSet result = stmt.executeQuery();
			result.next();
			admin adminn = new admin(email,password);
			return adminn;
                        
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

		return null;
    }
    

    
    
}
