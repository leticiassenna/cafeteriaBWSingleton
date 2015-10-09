/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.cdp;


import br.ifes.leticia.cafeteriabwsingleton.util.Cafeteria;
import br.ifes.leticia.cafeteriabwsingleton.view.TelaPromocao;
import java.util.ArrayList;


/**
 *
 * @author Leticia
 */
public class Promocao {
    TelaPromocao telaProm = new TelaPromocao();
    private int diaSemana;
    Cafeteria cafeteria;
     
     
    public Cafeteria promocao(int dia) {
        cafeteria = Cafeteria.getInstance(cafeteria) ;
        setDiaSemana(dia);
        //System.out.println("entrou");
        try{
            if(getDiaSemana() == 1 || getDiaSemana() == 3 || getDiaSemana() == 5){
                
                 Cafe cafeFeito =  cafeteria.getCafeNormal();
                float novoPreco = cafeteria.getCafeNormal().getPreco()/2;
                cafeFeito.setPreco(novoPreco);
                cafeFeito.getInformacao();
                
            }
            if(getDiaSemana() == 2 || getDiaSemana() == 4 || getDiaSemana() == 6){
                Cafe cafeFeito = cafeteria.getCafeDescafeinado();
                float novoPreco = cafeteria.getCafeDescafeinado().getPreco()/2;
                cafeFeito.setPreco(novoPreco);
                cafeFeito.getInformacao();
                 
            }
            if(getDiaSemana() == 7){
                Cafe cafeFeito = cafeteria.getCafeCappuccino();
                float novoPreco = cafeteria.getCafeCappuccino().getPreco()/2;
                cafeFeito.setPreco(novoPreco);
                cafeFeito.getInformacao();
            }
            return cafeteria;
        }
        catch (Exception e) {
            System.out.println("exception");
            //throw new Exception("Invalido");
        }
        return cafeteria;
    }
 
    /**
     * @return the diaSemana
     */
    public int getDiaSemana() {
        return diaSemana;
    }
 
    /**
     * @param diaSemana the diaSemana to set
     */
    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }
}
