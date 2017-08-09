/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */

public class Taller {
    
    public static double calcularsalario(int horas, double valor){
     double totalsalario=0;
     if (horas<=40){ totalsalario= horas*valor;}
     if(horas>40 && horas<48){
         
         
             int b=horas-40;
             totalsalario=(valor*40)+(valor*b*2);
            
             }
     if(horas>48){
     int b=8;
     int c=horas-48;
     totalsalario=(valor*8*2)+(valor*40)+(valor*c*3);
     
     }
     
    
    
    return totalsalario;
    };

  
    public static void main(String[] args) {
        int numerohoras=0;
        
        String nombre=null;
         
        double valorhora=0;
       
         Scanner entrada = new Scanner(System.in);
         System.out.println("Como se llama el señor?");
         nombre=entrada.next();
         System.out.println("Cuantas horas trabajó?");
         numerohoras=entrada.nextInt();
                System.out.println("A cuanto la hora?");
         valorhora=entrada.nextDouble();
         
     double totalsalario=calcularsalario(numerohoras,valorhora);
     System.out.println("Nombre");
     System.out.print(nombre);
     System.out.println("Horas");
         System.out.print(+numerohoras);
         System.out.println("Trabajo");
           System.out.print(+totalsalario);
                 
              
    }
    
}
