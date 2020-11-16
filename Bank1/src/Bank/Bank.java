package Bank;

import Account.Account;
import Account.*;
import BankTools.UI;

import java.util.HashMap;


public class Bank {
    private String name;
    private int safeAmt;
    private HashMap<String, Client> clients;
    private HashMap<Integer, Account> accounts;
    private Integer clientCount = 0;
    private Integer accountCount = 0;

    public Bank(String name) {
        this.name = name;
        clients = new HashMap<>();
        accounts = new HashMap<>();
    }

    public void addClient(String firstName, String lastName) {
        clientCount++;
        clients.put(clientCount.toString(), new Client(firstName, lastName, clientCount.toString()));
    }

    public void addAccount(Account account, String clientId) {
        //TODO: get client
        //TODO: create account and give it to client
        accounts.put(account.getAccountNumber(), account);
        for (Client client : clients.values()) {
            if (client.getClientId() == clientId) {
                client.addAccount(account);
            }
        }

    }

    public Account createAccount(int acctNumber, int initialBalance, Client owner, String acctType, UI ui) {
        switch (acctType) {
            case "Checking" :
                return new CheckingAccount(acctNumber, initialBalance, owner);
            case "Savings" :
                int interest = ui.requestInt("Please enter an interest rate:");
                int txLimit = ui.requestInt("Please enter a savings account transaction limit:");
                return new SavingsAccount(acctNumber, initialBalance, owner, interest, txLimit);
            case "Investment" :
                int interestInvestment = ui.requestInt("Please enter an interest rate:");
                int period = ui.requestInt("Please input a period length:");
                String periodType = ui.requestString("Please input a period type:");
                return new InvestmentAccount(initialBalance, acctNumber, owner, interestInvestment, period, periodType);
            case "CD" :
                int interestCD = ui.requestInt("Please enter an interest rate:");
                int periodCD = ui.requestInt("Please input a period length:");
                int timeFrame = ui.requestInt("Please input a time frame: ");
                return new CDInvestment(acctNumber, initialBalance, owner, interestCD, periodCD, timeFrame);
            default: return new BankAccount(acctNumber, initialBalance, owner, acctType);
        }
    }

    public void displayClients() {
        for (var client: clients.keySet()) {
            System.out.println(clients.get(client));
        }
    }

    public Account getAccount(int accountId) {
        return accounts.get(accountId);
    }

}
