/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.cdp;

/**
 *
 * @author Leticia
 */
public class PoCafe {
    private String tipo;
    
    public PoCafe(String nome){
        this.setTipo(nome);
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
