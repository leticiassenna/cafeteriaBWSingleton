/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.util;

import br.ifes.leticia.cafeteriabwsingleton.cdp.Cafe;

/**
 *
 * @author Leticia
 */
public interface Builder {
    
    public void prepararAgua();
    public void prepararPoCafe(String tipo);
    public void prepararIngredientes();
    public Cafe servirCafe(String nomeCafe);
    
}
