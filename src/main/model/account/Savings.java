package src.main.model.account;

public class Savings extends Account {

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
        super.setBalance(super.round(super.getBalance() - amount));
       return true;
    }

}
