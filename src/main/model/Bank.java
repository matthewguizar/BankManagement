package src.main.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import src.main.model.Transaction.Type;
import src.main.model.account.Account;

public class Bank {

    private ArrayList<Account> accounts;
    private ArrayList<Transaction> transactions;
  

    public Bank(){
        accounts = new ArrayList<Account>();
        transactions = new ArrayList<Transaction>();
    }

    public void addAccount(Account account){
        accounts.add(account.clone());
    }
    //other classes shouldn't have access to this method. only bank can add transaction
    private void addTransaction(Transaction transaction){
        transactions.add(new Transaction(transaction));
    }

    private void withdrawTransaction(Transaction transaction){
        if (getAccount(transaction.getId()).withdraw(transaction.getAmount())) {
            addTransaction(transaction);
        }
    }

    private void depositTransaction(Transaction transaction){
        getAccount(transaction.getId()).deposit(transaction.getAmount());
            addTransaction(transaction);
        
    }

    public void excecuteTransaction(Transaction transaction){
        switch(transaction.getType()) {
            case WITHDRAW: withdrawTransaction(transaction); break;
            case DEPOSIT: depositTransaction(transaction); break;
        }
    }

    //creating array that gets a specific accounts transactions 
    public Transaction[] getTransactions(String accountId){ //placed into an array
        //
        List<Transaction> list =this.transactions.stream() //streaming all elements in transaction
        .filter((transaction ) -> transaction.getId().equals(accountId)) //filtering through accountIds that match one passed in
        .collect(Collectors.toList());//getting as list using collectors class
        return list.toArray(new Transaction[list.size()]); //using toArray and putting in what type to cast it into and size

    }

    public Account getAccount(String transactionId){
        return accounts.stream()
        .filter((account) -> account.getId().equals(transactionId))
        .findFirst()
        .orElse(null);
    };

}
