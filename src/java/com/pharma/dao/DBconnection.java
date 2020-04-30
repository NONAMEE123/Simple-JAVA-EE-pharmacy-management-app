/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharma.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author KHALID-RAMI
 */
public class DBconnection {
    public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/pharmacien", "root", "");
		} catch (Exception e) {
			System.out.println("Erreur " + e.getMessage());
		}
		return connection;
	}
    
    
}