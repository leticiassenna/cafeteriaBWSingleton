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
public abstract class BuilderAbstrato implements Builder {
    
    protected Cafe cafe = new Cafe();
    
    protected FabricaAbstrata fabrica;
    protected FabricaCafe fabricaCafe;
    
    
    @Override
    public void prepararPoCafe(String tipo){
        cafe.setPoCafe(fabricaCafe.criarPoCafe(tipo));
    }
    
    @Override
    public void prepararIngredientes(){
        cafe.setIngredientes(fabricaCafe.criarIngrediente());
    }
    @Override
    public Cafe servirCafe(String nomeCafe){
        cafe = fabricaCafe.criarCafe(nomeCafe);
        return cafe;
    }
    
    @Override
    public void prepararAgua() {
        
    }
    
}
