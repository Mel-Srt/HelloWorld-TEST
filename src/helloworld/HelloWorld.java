/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author cesi
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello Word");
        Scanner sc = new Scanner (System.in);
        System.out.println("Saisir un caractère pour terminer le programme: ");
        String str = sc.nextLine();
        //Test : ajout d'un commentaire
    }
    
}
