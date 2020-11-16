package Account;


import Bank.Client;

public class SavingsAccount extends BankAccount implements Account {
    private int interest;
    private int txLimit;
    private int txCount;

    public SavingsAccount(int accountNumber, int balance, Client owner, int interest, int txLimit) {
        super(accountNumber, balance, owner, "Savings");
        this.interest = interest;
        this.txLimit = txLimit;
    }

    public void compoundInterest() {
        balance += (balance * ((float) interest / 100.0));
    }

    @Override
    public void withdraw(int amt) {
        incrementTxCount();
        if (txCount > txLimit) {
            System.out.println("Transaction limit reached for savings account! Try again next month.");
            return;
        }
        super.withdraw(amt);
    }


    public void incrementTxCount() {
        txCount++;
    }

    public void setTxCount(int newTxCount) {
        txCount = newTxCount;
    }

}
