/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.cafeteriabwsingleton.view;

import java.util.Scanner;

/**
 *
 * @author 20111bsi0161
 */
public class TelaCafe {
    String tipoCafe;
     
    Scanner in = new Scanner(System.in);
     
    public String telaCafe(){
        System.out.println("Tipo de cafe (normal, cappuccino ou descafeinado): ");
         
        tipoCafe = in.nextLine();
        return tipoCafe;
    }
}
