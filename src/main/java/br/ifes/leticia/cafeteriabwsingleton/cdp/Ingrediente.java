/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.cdp;

import java.util.ArrayList;

/**
 *
 * @author Leticia
 */
public class Ingrediente {
   
    private String nome;
    public String quantidade;

    public Ingrediente(String nome, String quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public String getQuantidade() {
        return quantidade;
    }

   
   
    
}
