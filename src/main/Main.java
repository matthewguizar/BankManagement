package src.main;

import java.util.concurrent.TimeUnit;

import src.main.model.Bank;
import src.main.model.account.Account;


public class Main {

   static String ACCOUNTS_FILE = "src/main/data/accounts.txt";            
   static String TRANSACTIONS_FILE = "src/main/data/transactions.txt";
   private static Bank bank = new Bank();

    public static void main(String[] args) {
        try {
            createObject(new String[] {"Chequing","f84c43f4-a634-4c57-a644-7602f8840870","Michael Scott","1524.51"});
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static Account createObject(String[] values) throws Exception{
        return (Account) Class.forName("src.main.model.account." + values[0])
          .getConstructor(String.class, String.class, double.class)
          .newInstance(values[1], values[2], Double.parseDouble(values[3]));
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
