/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Arrays;

/**
 *
 * @author erik_
 */
public class Array {
    
    private double [] M1 = new double[50];
    private double [] M2 = new double[20];

    public Array() {
        
        System.out.println("El vector A es :");
        for (int i = 0; i < 50; i++) {
            M1[i]= Math.random()*100;
            System.out.print("["+String.format("%.1f", M1[i])+"]");
        }
        System.out.println(" ");
        
    }
     
     public String ordenar(){
         
         Arrays.sort(M1);
  
        for (int i = 0; i < 50; i++) {
         
            System.out.print(String.format("%.2f", M1[i]));
          
        }
         
        
        return "0";
         
     }
    
    
    
}
