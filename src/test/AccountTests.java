package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

import src.main.model.account.Account;
import src.main.model.account.Chequing;
import src.main.model.account.Loan;
import src.main.model.account.Savings;


public class AccountTests {

   Account[] accounts;
    

   @Before
   public void setup() {
      accounts = new Account[] {
         new Chequing("1", "Michael Scott", 1524.51),
         new Savings("2", "Saul Goodman", 2241.60),
         new Loan("3", "Pheobe Buffay", 2537.31)
      };
   }

   @Test
   public void withdrawal(){
      accounts[0].withdraw(1440);
      assertEquals(84.51, accounts[0].getBalance());
   }

   @Test
   public void overdraft(){
      accounts[0].withdraw(1534.43);
      assertEquals(-15.42, accounts[0].getBalance());
   }

   @Test
   public void overdraftLimit(){
      accounts[0].withdraw(1726);
      assertEquals(1524.51, accounts[0].getBalance());
   }

   @Test
   public void withdrawalFee(){
      accounts[1].withdraw(100);
      assertEquals(2136.60, accounts[1].getBalance());

    }

   @Test
   public void withdrawalInterest(){
      accounts[2].withdraw(2434.31);
      assertEquals(5020.31, accounts[2].getBalance());
   }

   @Test
   public void withdrawalLimit(){
      accounts[2].withdraw(7463.69);
      assertEquals(2537.31, accounts[2].getBalance());
   }

   @Test
   public void desposit(){
      accounts[0].deposit(5000);
      assertEquals(6524.51, accounts[0].getBalance());

   }

   @Test
   public void loanDeposit(){
      accounts[2].deposit(1000);
      assertEquals(1537.31, accounts[2].getBalance());
   }


 

}
