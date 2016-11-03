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
        Scanner entNum= new Scanner(System.in);
        Scanner entText= new Scanner(System.in);
        String rasa=null;
        int germans=0;
        String color=null;
        boolean mascle=false;
        boolean omplit = false;
        char esmascle=' ';
        double pes=0.0;
        //char tipo='';
        int opcio=10;
        do {
            System.out.println("\n\nmenu del programa.");
            System.out.println("0.Sortir.");
            System.out.println("1.Introduir gos.");
            System.out.println("2.Borrar gos");
            System.out.println("3.Modificar gos.");
            System.out.println("Llistar gos.");
           
            System.out.println("tria una opcio;");
            opcio = entNum.nextInt();
            
            switch (opcio) {
                    
                case 1:
                    if(!omplit){
                        System.out.println("introdueix dades:");
                        System.out.println("Introdueix la rasa:");
                        rasa=entText.nextLine();                 
                        if (rasa=="labrador") System.out.println("Es labrador;");
                        else System.out.println("No es labrador;");
                        
                        System.out.println("Quants germans que té?:");
                        germans=entNum.nextInt();
                        System.out.println("De quin color es?:");
                        color=entText.nextLine();
                        System.out.println("Quin es el seu pes?:");
                        pes=entNum.nextDouble();
                        System.out.println("Es mascle o femella? (M/F):");
                        do{
                            esmascle=entText.nextLine().toUpperCase().charAt(0);
                        }while(esmascle !='m'&& esmascle !='F');
                        mascle=(esmascle== 'M');
                        
                        omplit=true;
                                
                    
                    
                    }
                    
                    
                    
                    if(!omplit){
                        System.out.println("");
                    }
                        
                        
                        
                        break;
                default:
                    throw new AssertionError();
            }
        } while (opcio!=0);
    
    
    
    }
    
}
