/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.util;

/**
 *
 * @author Leticia
 */
public class CafeCappuccinoBuilder extends BuilderAbstrato{
    
    public CafeCappuccinoBuilder()
    {
        this.fabrica = new FabricaCafeCappuccino();
    }

    
}
