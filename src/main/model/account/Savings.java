package src.main.model.account;

public class Savings extends Account {
    private static final double WITHDRAWAL_FEE = 5;

    public Savings(String id, String name, double balance){
        super(id, name, balance);
        }

    public Savings(Savings source){
        super(source);
    }

    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean withdraw(double amount) {
        super.setBalance(super.round(super.getBalance() - amount - WITHDRAWAL_FEE));
       return true;
    }

}
