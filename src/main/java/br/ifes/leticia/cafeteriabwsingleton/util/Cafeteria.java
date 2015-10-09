/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.util;

import br.ifes.leticia.cafeteriabwsingleton.cdp.Cafe;

/**
 *
 * @author 20111bsi0161
 */
public class Cafeteria {
    private Cafeteria instance;
    Cafe cafe ;
    Fabrica fabrica;
    
    private Cafeteria(){
        
    }

   
    public synchronized static Cafeteria getInstance(Cafeteria instance) {
        if(instance==null){
            instance = new Cafeteria();
        }
        return instance;
    }
    
    
    public synchronized Cafe getCafeNormal(){
        fabrica = new FabricaCafeNormal();
        cafe = fabrica.criarCafe();
        
        cafe.setNome("CAFE NORMAL");
        cafe.setPreco(2);
        cafe.setAgua(fabrica.criarAgua());
        cafe.setPoCafe(fabrica.criarPoCafe());
        cafe.setIngredientes(fabrica.criarIngrediente());
        
        return cafe;
        
    }
    
    public synchronized Cafe getCafeDescafeinado(){
        fabrica = new FabricaCafeDescafeinado();
        cafe = fabrica.criarCafe();
        
        cafe.setNome("CAFE DESCAFEINADO");
        cafe.setPreco(3);
        cafe.setAgua(fabrica.criarAgua());
        cafe.setPoCafe(fabrica.criarPoCafe());
        cafe.setIngredientes(fabrica.criarIngrediente());
        
        return cafe;
        
    }
    
    public synchronized Cafe getCafeCappuccino(){
        fabrica = new FabricaCafeCappuccino();
        cafe = fabrica.criarCafe();
        
        cafe.setNome("CAFE CAPPUCCINO");
        cafe.setPreco(5);
        cafe.setAgua(fabrica.criarAgua());
        cafe.setPoCafe(fabrica.criarPoCafe());
        cafe.setIngredientes(fabrica.criarIngrediente());
        
        return cafe;
        
    }
    
    
    
}
