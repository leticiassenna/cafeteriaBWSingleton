/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.cdp;


import br.ifes.leticia.cafeteriabwsingleton.util.Cafeteria;
import br.ifes.leticia.cafeteriabwsingleton.view.TelaPromocao;

/**
 *
 * @author 20111bsi0161
 */
public class CtrlCafeteria {
    
    public void CtrlCafeteria(){
        
        Promocao promocao = new Promocao();
        TelaPromocao telaProm = new TelaPromocao();
        
        telaProm.telaPromocao();
        
        promocao.promocao(1);
        
        promocao.promocao(4);
        
        promocao.promocao(7);
        
       
        
        
    }
}
