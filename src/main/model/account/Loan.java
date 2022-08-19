package src.main.model.account;

public class Loan extends Account{
    private static final double INTEREST_RATE = 0.02;
    private static final double DEBT_LIMIT = 10000;
    public Loan(String id, String name, double balance){
        super(id, name, balance);
    }

    public Loan(Loan source){
        super(source);  
    }

    @Override
    public void deposit(double amount) {
       super.setBalance(super.round(super.getBalance() - amount));
        
    }

    @Override
    public boolean withdraw(double amount) {
        if(super.getBalance() + amount > DEBT_LIMIT) {
            return false;
        }
        //a loan withdraw gets balance of account adds the amount to it and then adding the interest rate (0.02) to get total.
        super.setBalance(super.round(super.getBalance() + amount + (amount * INTEREST_RATE)));
       return true;
    }
    @Override
    public Account clone() {
        return new Loan(this);
    }

}
