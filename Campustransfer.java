/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campustransfer;

/**
 *
 * @author GOC-ONG_CPE113
 */
public class Campustransfer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    CampusWalletTransfer aly = new CampusWalletTransfer("Aly", 100);
    CampusWalletTransfer ben = new CampusWalletTransfer("Ben");
        System.out.println("Start > Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        // Test 2
        System.out.println("Transfer 35: " + aly.transferTo(ben, 35) + " | Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Test 3
        System.out.println("Transfer 70: " + aly.transferTo(ben, 70) + " | Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Test 4
        System.out.println("Self transfer: " + aly.transferTo(aly, 10) + " | Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Test 5
        System.out.println("Ben deposit 15: " + ben.deposit(15) + " | Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Test 6
        System.out.println("Transfer 65: " + aly.transferTo(ben, 65) + " | Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Test 7 
        System.out.println("Zero transfer: " + ben.transferTo(aly, 0) + " | Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Test 8 
        System.out.println("Null transfer: " + ben.transferTo(null, 10) + " | Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
    }
}