/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.util;

/**
 *
 * @author 1998547
 */
public enum CodeMakerMagic {
    
    CAR, BUS;
    
    private int code;
    
    public synchronized int getCodeCar(){
        code = code + 1;
        return code;
    }
    
}
