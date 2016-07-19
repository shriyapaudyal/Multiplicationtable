/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.multiplication;
import java.util.Scanner;
/**
 *
 * @author Shriya Paudyal
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number to print its multiplication table: ");
       int a =input.nextInt();
       System.out.println("Enter the number upto which multiplication is to be done: ");
       int b = input.nextInt();
      int c=1;
        for ( c = 1 ; c <= b ; c++ )
        {
         System.out.println(a+"*"+c+" = "+(a*c));
         }
      
       
        
    }
    
}
