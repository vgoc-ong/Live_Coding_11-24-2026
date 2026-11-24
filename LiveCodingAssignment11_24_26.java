/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecodingassignment11_24_26;

/**
 *
 * @author GOC-ONG_CPE113
 */
public class LiveCodingAssignment11_24_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CampusPrintingAccount mia = new CampusPrintingAccount("Mia", 10);
       CampusPrintingAccount luis = new CampusPrintingAccount("Luis", 0);
       
       // Nag print si mia og 4 ka page!
       System.out.println(mia.printPages(4) + "; Mia: " + mia.getCredits());
       
       // Nag print si mia og 7 ka page!
       System.out.println(mia.printPages(7) + "; Mia: " + mia.getCredits());
       
       // Nag add si mia og -3 credits!
       System.out.println(mia.addCredits(-3) + "; Mia: " + mia.getCredits());
       
       // Nag si mia og 4 ka credits!
       System.out.println(mia.addCredits(4) + "; Mia: " + mia.getCredits() + ", Luis: " + luis.getCredits());
    }
    
}
