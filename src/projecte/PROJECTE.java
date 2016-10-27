/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PROJECTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent= new Scanner(System.in);
        String rasa;
        int edat;
        String color;
        boolean sexe;
        double pes;
        //char tipo='';
        
        do {
            System.out.println("\n\nmenu del programa.");
            System.out.println("0.Sortir.");
            System.out.println("1.Introduir gos.");
            System.out.println("2.Borrar gos");
            System.out.println("3.Modificar gos.");
            System.out.println("Llistar gos.");
           
            System.out.println("Introdueix la raça:");
            rasa=ent.next();
            System.out.println("la raça és "+rasa);
        } while (true);
    
    
    
    
    }
    
}
