/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadevoto;

import java.util.Scanner;

/**
 *
 * @author Breno
 */
public class IdadeVoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner i = new Scanner (System.in);
        
        int idade ;
        
        System.out.println("Digite sua idade :");
        
             idade = i.nextInt();
        
           if ( idade < 0 && idade > 150) {
           
              System.out.println("numeros inválidos");
               
           
           
           } else if (idade >0 && idade < 16) {
               
               System.out.println("Voto proibido");
           
           
           
           } else if (idade >18 && idade <60 ) {
               
               System.out.println("Voto obrigatorio");
               
              
           } else if (idade >=16 && idade <=18 ) {
               
               System.out.println("Voto opcional");
           
           }
           
      
                
        
        
        //System.out.printf("Sua idade é %2d:", i);
        
       
    }
    }
    

