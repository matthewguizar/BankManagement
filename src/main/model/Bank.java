package src.main.model;

import java.util.ArrayList;

import src.main.model.account.Account;

public class Bank {

    private ArrayList<Account> accounts;
    private ArrayList<Transaction> transactions;
  

    public Bank(){
        accounts = new ArrayList<Account>();
        transactions = new ArrayList<Transaction>();
    }
}
