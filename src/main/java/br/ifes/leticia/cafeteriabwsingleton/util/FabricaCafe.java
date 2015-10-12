package br.ifes.leticia.cafeteriabwsingleton.util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.leticia.cafeteriabwsingleton.util.FabricaCafeNormal;
import br.ifes.leticia.cafeteriabwsingleton.cdp.Cafe;
import br.ifes.leticia.cafeteriabwsingleton.cdp.Ingrediente;
import br.ifes.leticia.cafeteriabwsingleton.cdp.PoCafe;
import br.ifes.leticia.cafeteriabwsingleton.util.FabricaAbstrata;
import br.ifes.leticia.cafeteriabwsingleton.util.FabricaCafeCappuccino;
import br.ifes.leticia.cafeteriabwsingleton.util.FabricaCafeDescafeinado;
import java.util.ArrayList;

/**
 *
 * @author Leticia
 */
public class FabricaCafe extends FabricaAbstrata{
    
    private Cafe cafe;
    private FabricaAbstrata fabrica;
    
    @Override
    public  Cafe criarCafe(String nome){
        
        if ("CafeNormal".equals(nome)){
            FabricaCafeNormal fabricaCN = new FabricaCafeNormal();
            cafe = fabricaCN.criarCafe(nome);
            cafe.setIngredientes(fabricaCN.criarIngrediente());
            cafe.setPoCafe(fabricaCN.criarPoCafe(nome));
            
        }

        if ("CafeDescafeinado".equals(nome)){
            FabricaCafeDescafeinado fabricaCD = new FabricaCafeDescafeinado();
            cafe = fabricaCD.criarCafe(nome);
            cafe.setIngredientes(fabricaCD.criarIngrediente());
            cafe.setPoCafe(fabricaCD.criarPoCafe(nome));
            
        }
        if ("CafeCappuccino".equals(nome)){
            FabricaCafeCappuccino fabricaCC = new FabricaCafeCappuccino();
            cafe = fabricaCC.criarCafe(nome);
            cafe.setIngredientes(fabricaCC.criarIngrediente());
            cafe.setPoCafe(fabricaCC.criarPoCafe(nome));
        }
        
        return cafe;
    }

    

    @Override
    public PoCafe criarPoCafe(String tipo) {
        return new PoCafe(tipo);
    }

    @Override
    public ArrayList<Ingrediente> criarIngrediente() {
        return fabrica.criarIngrediente();
        
    }
    
}