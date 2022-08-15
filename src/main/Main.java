package src.main;

import java.util.concurrent.TimeUnit;

import src.main.model.account.Chequing;
import src.main.model.account.Loan;
import src.main.model.account.Savings;

public class Main {

   static String ACCOUNTS_FILE = "src/main/data/accounts.txt";            
   static String TRANSACTIONS_FILE = "src/main/data/transactions.txt";

    public static void main(String[] args) {
        Chequing chequing = new Chequing("1", "Michael Scott", 1524.51);
        Savings savings = new Savings("2", "Saul Goodman", 2241.60);
        Loan loan = new Loan("3", "Pheobe Buffay", 2537.31);
        System.out.println(loan);
        System.out.println(savings);
        System.out.println(chequing);


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
