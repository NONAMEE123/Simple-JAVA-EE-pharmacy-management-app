/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharma.metier;

import com.pharma.entites.admin;
import java.util.Collection;

/**
 *
 * @author KHALID-RAMI
 */
public interface Iadmin {
    public admin find(int id);
	public void add(admin adminn);
	public boolean update(admin adminn);
	public boolean delete(int id);
	public Collection<admin> findAll();
    public admin findd(String email,String password);
    
}
