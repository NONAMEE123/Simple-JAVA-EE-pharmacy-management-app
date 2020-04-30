/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharma.metier;

import com.pharma.entites.admin;
import com.pharma.entites.facture;
import java.util.Collection;

/**
 *
 * @author KHALID-RAMI
 */
public interface Ifacture {
    
    public facture find(int id);
	public void add(facture facturee);
	public boolean update(facture  facturee);
	public boolean delete(int id);
	public Collection<facture> findAll();
    
}
