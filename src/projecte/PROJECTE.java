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
            System.out.println("4.Llistar gos.");
           
            System.out.println("tria una opcio;");
            opcio = entNum.nextInt();
            
            switch (opcio) {
                    
                case 1:
                    if(!omplit){
                        System.out.println("introdueix dades:");
                        System.out.println("Introdueix la rasa:");
                        rasa=entText.nextLine();                 
//                        if (rasa=="labrador") System.out.println("Es labrador;");
//                        else System.out.println("No es labrador;");
                        
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
                        break;       
                    
                    
                    }
                    
                case 2:
                    if(!omplit){
                        System.out.println("No hi ha dades, introdueix-ne:");
                        
                    } else {
                        System.out.println("Vols veure les dades del gos? (S/N)");
                        char c=entText.nextLine().toUpperCase().charAt(0);
                        if (c=='S'){
                            System.out.println("Introdueix dades del gos:");
                            System.out.println("Rasa: "+rasa);
                            System.out.println("Germans: "+germans);
                            System.out.println("Color: "+color);
                            System.out.println("Pes:"+pes);
                            if (esmascle=='M') System.out.println("És mascle");
                            else System.out.println("És femella");
                            
                            System.out.println("\nVols borrar les dades? (S/N)");
                            c=entText.nextLine().toUpperCase().charAt(0);
                            if (c=='S'){
                                rasa=" ";
                                germans=0;
                                color=" ";
                                pes=0;
                            }
                            break;
                            
                        }
                    }  
                case 3:
                    if(!omplit){
                        System.out.println("No hi ha dades, introdueix-ne:");
                        
                    } else {
                        System.out.println("Vols veure les dades del gos? (S/N)");
                        char c=entText.nextLine().toUpperCase().charAt(0);
                        if (c=='S'){
                            System.out.println("Rasa: "+rasa);
                            System.out.println("Germans: "+germans);
                            System.out.println("Color: "+color);
                            System.out.println("Pes:"+pes);
                            if (esmascle=='M') System.out.println("És mascle");
                            else System.out.println("És femella");
                            
                            System.out.println("\nVols modificar les dades del gos? (S/N)");
                            c=entText.nextLine().toUpperCase().charAt(0);
                            if (c=='S'){
                                System.out.println("Rasa: "+rasa);
                                System.out.println("Vols modificar la rasa?");
                                c=entText.nextLine().toUpperCase().charAt(0);
                                if (c=='S'){
                                    System.out.format("Nova rasa:");
                                    rasa=entText.nextLine();                                    
                                }
                                System.out.println("Germans: "+germans);
                                System.out.println("Vols modificar el nombre de germans? (S/N)");
                                c=entText.nextLine().toUpperCase().charAt(0);
                                if (c=='S'){
                                    System.out.format("Nou nombre de germans:");
                                    germans=entNum.nextInt();                                    
                                }
                                System.out.println("Color: "+color);
                                System.out.println("Vols modificar el color:");
                                c=entText.nextLine().toUpperCase().charAt(0);
                                if (c=='S'){
                                    System.out.format("Nou color:");
                                    color=entText.nextLine();
                                }
                                System.out.println("pes: "+pes);
                                System.out.println("Vols modificar el pes:");
                                c=entText.nextLine().toUpperCase().charAt(0);
                                if (c=='S'){
                                    System.out.format("Nou pes:");
                                    pes=entNum.nextInt();
                                }
                                
                                if (esmascle=='M') System.out.println("És mascle");
                                else System.out.println("És femella");
                                
                                System.out.println("Vols modificar gènere:");
                                c=entText.nextLine().toUpperCase().charAt(0);
                                if (c=='S'){
                                    System.out.format("Nou gènere:");
                                    do{
                                        esmascle=entText.nextLine().toUpperCase().charAt(0);
                                    }while(esmascle !='m'&& esmascle !='F');
                                    mascle=(esmascle== 'M');
                                }
                                
                            
                            }
                            break;
                            
                        }
                    }  
                case 4:
                    System.out.println("Rasa: "+rasa);
                    System.out.println("Germans: "+germans);
                    System.out.println("Color: "+color);
                    System.out.println("Pes:"+pes);
                        
                        break;
                default:
                    System.out.println("Adèu");
                    break;
            }
        } while (opcio!=0);
    
    
    
    }
    
}
