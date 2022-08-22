package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.intellij.lang.annotations.JdkConstants.TabLayoutPolicy;
import org.junit.Before;
import org.junit.Test;

import src.main.model.Bank;
import src.main.model.Transaction;
import src.main.model.account.Chequing;

public class BankTest {
    
    private Bank bank;

    @Before
    public void setup(){
        bank = new Bank();
        bank.addAccount(new Chequing("f84c43f4-a634-4c57-a644-7602f8840870", "Michael Scott", 1524.51));
    }

    @Test
    public void successfulTransaction() {
        this.bank.withdrawTransaction(new Transaction(Transaction.Type.WITHDRAW, 1546905600, "f84c43f4-a634-4c57-a644-7602f8840870", 624.99));
        this.bank.depositTransaction(new Transaction(Transaction.Type.DEPOSIT, 1578700800, "f84c43f4-a634-4c57-a644-7602f8840870", 441.93));
        assertEquals(2, bank.getTransactions("f84c43f4-a634-4c57-a644-7602f8840870").length);
    }
}