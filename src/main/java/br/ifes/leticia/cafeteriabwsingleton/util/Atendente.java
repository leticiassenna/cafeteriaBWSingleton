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
public class Atendente implements Director{

    @Override
    public Cafe fazerCafe(BuilderAbstrato atendente, String nomeCafe) {
        Cafe cafe;
        
        FabricaCafe fabricaCafe = new FabricaCafe();
        cafe = fabricaCafe.criarCafe(nomeCafe);
       
        
        
        
        return cafe;
    }
    
}
