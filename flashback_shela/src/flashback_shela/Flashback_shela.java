/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashback_shela;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Flashback_shela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, kelas, hobi;
        Scanner inputan = new Scanner(System.in);
        System.out.println(".....");
        
        for (int i=1;i<3;i++)
        
        System.out.print("Nama");
        nama=inputan.nextLine();
        System.out.print("Kelas");
        kelas=inputan.nextLine();
        System.out.print("Hobi");
        hobi=inputan.nextLine();
        
        System.out.print("Terimakasih telah menginput nama");
        nama=inputan.nextLine();
        
        System.out.print("Kelas");
        kelas=inputan.nextLine();
        
       switch (hobi) {
           case "ban":
           System.out.print("band");
           break;
           case "bas":
           System.out.print("basket");
           break; 
           case "mad":
           System.out.print("mading");
           break;
       
           default:
           System.out.print("tidak tersedia");
           break;
               
        
  
        
        
        
       }
       
    }
    
}
