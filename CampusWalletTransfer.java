/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campustransfer;

/**
 *
 * @author GOC-ONG_CPE113
 */
public class CampusWalletTransfer {
    private String owner;
    private int balance;
    
    public CampusWalletTransfer(String owner, int balance) {
        this.owner = owner;
        this.balance = (balance < 0) ? 0 : balance;
    }
    public CampusWalletTransfer(String owner) {
        this(owner, 0);
    }
    public boolean deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
    public boolean transferTo(CampusWalletTransfer recipient, int amount) {
        if (recipient == null || recipient == this || amount <= 0 || balance < amount) {
            return false;
        }
        balance -= amount;
        recipient.balance += amount;
        return true;
    }

    // 6. Getter: reads balance safely without a public setter
    public int getBalance() {
        return balance;
    }
}
            




