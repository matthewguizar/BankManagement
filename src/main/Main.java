package src.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import src.main.model.Bank;
import src.main.model.account.Account;


public class Main {

   static String ACCOUNTS_FILE = "src/main/data/accounts.txt";            
   static String TRANSACTIONS_FILE = "src/main/data/transactions.txt";
   private static Bank bank = new Bank();

    public static void main(String[] args) {
        try {
            ArrayList<Account> accounts = returnAccounts();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static Account createObject(String[] values) {
        try {
            return (Account) Class.forName("src.main.model.account." + values[0])
              .getConstructor(String.class, String.class, double.class)
              .newInstance(values[1], values[2], Double.parseDouble(values[3]));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void loadAccounts(ArrayList<Account> accounts) {
        for (Account account : accounts) {
            bank.addAccount(account);
        }
    }

    public static ArrayList<Account> returnAccounts() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(ACCOUNTS_FILE);
        Scanner scan = new Scanner(fis);
        ArrayList<Account> accounts = new ArrayList<Account>();

        while (scan.hasNextLine()) {
            accounts.add(createObject(scan.nextLine().split(",")));
        }
        scan.close();
        return accounts;
    }

    /**
     * Function name: wait
     * @param milliseconds
     * 
     * Inside the function:
     *  1. Makes the code sleep for X milliseconds.
     */

     public static void wait(int milliseconds) {
         try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
     }

}
