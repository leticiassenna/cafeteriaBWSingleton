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
    private Cafe cafe ;
    private final FabricaCafe fabrica = new FabricaCafe();
    
    private Cafeteria(){
        
    }

   
    public synchronized static Cafeteria getInstance(Cafeteria instance) {
        if(instance==null){
            instance = new Cafeteria();
        }
        return instance;
    }
    
    
    public synchronized Cafe getCafeNormal(){
       
        
        cafe = fabrica.criarCafe("CafeNormal");
        
        return cafe;
        
    }
    
    public synchronized Cafe getCafeDescafeinado(){
        
        cafe = fabrica.criarCafe("CafeDescafeinado");
        
        return cafe;
        
    }
    
    public synchronized Cafe getCafeCappuccino(){
        
        cafe = fabrica.criarCafe("CafeCappuccino");
        
        return cafe;
        
    }
    
    
    
}
