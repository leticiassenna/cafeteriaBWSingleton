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
public class Cafe {
    private String nome;
    private Agua agua;
    private PoCafe poCafe;
   // private Ingrediente ingrediente;
    private float preco;
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();



    public Agua getAgua() {
        return agua;
    }

    public void setAgua(Agua agua) {
        this.agua = agua;
    }

    public PoCafe getPoCafe() {
        return poCafe;
    }

    public void setPoCafe(PoCafe poCafe) {
        this.poCafe = poCafe;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

   
    public void setIngredientes(ArrayList<Ingrediente> ingrediente) {
        this.ingredientes = ingrediente;
    }
    
    public void getInformacao() {
        System.out.println("Cafe {" + "tipo = " + getNome() + ", po de cafe = " + getPoCafe().getTipo() + 
                 ", preco = " + getPreco() + '}');
        System.out.println("Ingredientes: ");
        for (Ingrediente ingrediente: ingredientes)
            System.out.println( ingrediente.getNome()+ " qtd = "+ ingrediente.getQuantidade());
    }
    
     
    
}
