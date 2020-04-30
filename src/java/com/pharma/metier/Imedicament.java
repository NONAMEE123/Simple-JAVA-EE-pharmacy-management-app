/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharma.metier;

import com.pharma.entites.fourniseur;
import com.pharma.entites.medicament;
import java.util.Collection;

/**
 *
 * @author KHALID-RAMI
 */
public interface Imedicament {
    
     public medicament find(int id);
	public void add(medicament medicamentt);
	public boolean update(medicament medicamentt);
	public boolean delete(int id);
	public Collection<medicament> findAll();
    
}
