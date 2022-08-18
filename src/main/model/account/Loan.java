package src.main.model.account;

public class Loan extends Account{
    public Loan(String id, String name, double balance){
        super(id, name, balance);
    }

    public Loan(Loan source){
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
