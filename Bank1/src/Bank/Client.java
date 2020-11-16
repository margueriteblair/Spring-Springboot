package Bank;

import Bank.*;
import Account.*;

import BankTools.DebitCard;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Client {
    private String name;
    private String firstname;
    private String lastName;
    private String middleName;
    private String clientId;
    private HashMap<Integer, Account> accounts;
    private List<DebitCard> debitCards;
    private Account linkedAccount;


    public Client(String firstname, String lastName, String clientId) {
        this.name = firstname + " " + lastName;
        this.firstname = firstname;
        this.lastName = lastName;
        this.clientId = clientId;
        accounts = new HashMap<>();
        debitCards = new ArrayList<>();
     }

        public void addAccount(Account account) {
            accounts.put(account.getAccountNumber(), account);
        }

        public void addDebitCard(int accountNum) {
            Account account = accounts.get(accountNum);
            if (account instanceof CheckingAccount) {
                DebitCard newCard = new DebitCard("7277272", "1234", "888", this.name, (CheckingAccount) account);
                debitCards.add(newCard);
            } else {
                System.out.println("Invalid Account");
            }
        }

        @Override
        public String toString() {
        String output = "";
        for (int accountNum : accounts.keySet()) {
            output += accounts.get(accountNum).getDetails() + "\n";
        }
        String cardsOutput = "";
        for (var debitCard : debitCards) {
            cardsOutput += debitCard.toString();
        }
        return "Accounts of " + name + "\n" + output + "Cards\n" + cardsOutput;
        }

        public String getClientId() {
            return clientId;
        }

        public String getName() {
            return firstname + " " + lastName;
        }


}
