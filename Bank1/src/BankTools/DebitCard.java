package BankTools;

import Account.Account;

import java.util.*;
import Account.*;

public class DebitCard {
    private String pin;
    private CheckingAccount primary;
    private String cvv;
    private String cardOwner;
    private String cardNumber;
    private List<Account> atmAccounts;//should actually make an interface

    public DebitCard(String cardNumber, String pin, String cvv, String cardOwner, CheckingAccount primary) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.cvv = cvv;
        this.cardOwner = cardOwner;
        this.primary = primary;
        this.atmAccounts = new ArrayList<>();
    }

    public boolean charge(int amt, String pin) {
        if (this.pin == pin && primary.getBalance() >= amt) {
            primary.withdraw(amt);
            return true;
        }
        return false;
    }

    public void addAccount(Account account) {
        //we created an account with the bank
        //and now the bank is linking the account to the card
        atmAccounts.add(account); //we can add any type of account with this
        //because all of our accounts implement Account interface
    }

    public String toString() {
        return "cardNum " + cardNumber;
    }

}
