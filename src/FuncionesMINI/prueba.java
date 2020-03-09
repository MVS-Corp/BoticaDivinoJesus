/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesMINI;

import java.text.DecimalFormat;

/**
 *
 * @author Ernesto
 */
public class prueba {
    private static DecimalFormat df2 = new DecimalFormat("0.00");
    
    public static void main(String[] args) {
        
         double var1 = 30.0;
     double var2 = 26.9;
     double cambio = var1 - var2;
        System.out.println(df2.format(cambio));
    }
}
