/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaatm1;

/**
 *
 * @author Alisson
 */
public class JavaATM1 {

    public static void main(String[] args) {
         int amountinicial = 187423;
         int amount = amountinicial; 
        
       
         System.out.println("Dividindo R$"+amountinicial+" em notas de R$ 100,"
        // conectação
                + "R$ 50, R$ 20, R$ 10, R$ 5, R$ 2 e R$ 1") ;                     
        // Arranjo dos valores das notas  
         int [] billvalues = {100,50,20,10,2,1};  
         
        //Número de notas, iniciado com valor vazio com mesmo tamanho billvalues
        
         int [] numberofbills = new int [billvalues.length];    
         
        // loop for com contador i         
         for (int i=0; i < billvalues.length; i++) {       
                     numberofbills [i] = amount /billvalues [i];
                     amount %= billvalues [i];
           
                     System.out.println("Notas de R$" + billvalues [i]+ ":" 
                     + numberofbills [i]);
         
         }
    }
}
