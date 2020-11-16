package Account;

import Bank.Client;

public class CheckingAccount extends BankAccount {
    private boolean hasDebitCard;
    private int txCount;

    public CheckingAccount(int accountNumber, int balance, Client owner) {
        super(accountNumber, balance, owner, "Checking");
    }

    public int showTxCount() {
        System.out.println("Your current amount of checking account transactions is: " + txCount);
        return txCount;
    }

    @Override
    public void withdraw(int amt) {
        txCount++;
        super.withdraw(amt);
    }

    public int getBalance() {
        return balance;
    }
}
