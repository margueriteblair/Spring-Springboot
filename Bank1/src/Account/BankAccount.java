package Account;

import Bank.Client;

public class BankAccount implements Account {
    private int accountNumber;
    private Client owner;
    protected int balance;
    private String acctType;

    public BankAccount(int accountNumber, int balance, Client owner, String acctType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
        this.acctType = acctType;
    }

    public void deposit(int amt) {
        if (amt < 0) {
            System.out.println("Cannot accept negative deposit amount.");
            return;
        }
        balance += amt;
    }

    @Override
    public Client getOwner() {
        return owner;
    }


    public void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
            return;
        }
        System.out.println("Insufficient funds to make this transaction.");
        return;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getDetails() {
        return acctType + " Account\nOwner: " + owner + "\nAccount Number: " + accountNumber + "\nBalance: " + balance;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    public double convertToDollars() {
        System.out.println(balance / 100D);
        return balance / 100D;

    }
}
