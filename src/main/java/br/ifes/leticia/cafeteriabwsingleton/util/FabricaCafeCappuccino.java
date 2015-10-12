/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.util;


import br.ifes.leticia.cafeteriabwsingleton.cdp.Cafe;
import br.ifes.leticia.cafeteriabwsingleton.cdp.Ingrediente;
import br.ifes.leticia.cafeteriabwsingleton.cdp.PoCafe;
import java.util.ArrayList;

/**
 *
 * @author Leticia
 */
public class FabricaCafeCappuccino extends FabricaAbstrata{



    @Override
    public PoCafe criarPoCafe(String tipo) {
        return new PoCafe("Cafe Soluvel");
    }

    @Override
    public ArrayList<Ingrediente> criarIngrediente() {
        Cafe cafe = new Cafe();
        ArrayList<Ingrediente> ingredienteCN = new ArrayList<> ();
              
        Ingrediente ingrediente = new Ingrediente("Cafe Soluvel", "100g");
        ingredienteCN.add(ingrediente);
        
        ingrediente = new Ingrediente("Acucar", "200g");
        ingredienteCN.add(ingrediente);
        
        ingrediente = new Ingrediente("Leite", "100ml");
        ingredienteCN.add(ingrediente);
        
        ingrediente = new Ingrediente("Agua", "100ml");
        ingredienteCN.add(ingrediente);
        
        ingrediente = new Ingrediente("Bicarbonato", "1g");
        ingredienteCN.add(ingrediente);
        
        ingrediente = new Ingrediente("Chocolate", "50g");
        ingredienteCN.add(ingrediente);
        
        ingrediente = new Ingrediente("Canela", "1g");
        ingredienteCN.add(ingrediente);
        
        cafe.setIngredientes(ingredienteCN);
        
        return cafe.getIngredientes();
    }

    @Override
    public Cafe criarCafe(String nome) {
        Cafe cafe = new Cafe();
        cafe.setNome(nome);
        cafe.setNome("Cappuccino");
        cafe.setPreco(5);
        return cafe;
    }
    
}
