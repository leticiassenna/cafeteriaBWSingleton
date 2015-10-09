/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.util;

import br.ifes.leticia.cafeteriabwsingleton.cdp.Agua;
import br.ifes.leticia.cafeteriabwsingleton.cdp.Cafe;
import br.ifes.leticia.cafeteriabwsingleton.cdp.Ingrediente;
import br.ifes.leticia.cafeteriabwsingleton.cdp.PoCafe;
import java.util.ArrayList;

/**
 *
 * @author Leticia
 */
public interface Fabrica {
    
    public Agua criarAgua();
    public PoCafe criarPoCafe();
    public ArrayList<Ingrediente> criarIngrediente();
    public Cafe criarCafe();
    
}
