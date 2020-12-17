/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *

 */
public class Calculos {
    
    
     double subt, isv, desc;
    
    
    public double impuesto(double subt){
 
        isv = subt * 0.15;
        
        return isv;
        
    }

    public double total(double subt){
        
        double total = (subt+isv);
        
        return total;
    }
    
    
}
