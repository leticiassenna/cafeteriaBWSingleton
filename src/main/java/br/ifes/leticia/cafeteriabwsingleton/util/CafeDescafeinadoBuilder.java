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
public class CafeDescafeinadoBuilder extends BuilderAbstrato{
    public CafeDescafeinadoBuilder()
    {
        this.fabrica = new FabricaCafeDescafeinado();
    }
    
}
