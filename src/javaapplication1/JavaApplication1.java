/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author AJM
 */
//https://www.youtube.com/watch?v=fqTGczXq-kk
        //Trabajo Colaborativo con Netbeans y GitHub
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner dato = new Scanner(System.in);
        int a;
        int b;
        int suma;
       
        System.out.println("Escribe el primer numero");
        a = dato.nextInt();
        
        System.out.println("Dame el segundo Número");
        b = dato.nextInt();
        suma=a+b;
        System.out.println ( "Este es el resultado:"+"\n"+suma) ;
        
        
        
        
    }
    
}
