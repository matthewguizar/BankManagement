package src.main.model.account;

public class Chequing extends Account{ 

    public Chequing(String id, String name, double balance){
        super(id, name, balance);
    }

    public Chequing(Chequing source){
       super(source); 
    }

    @Override
    public void deposit(double amount) {
        
    
    }

    @Override
    public boolean withdraw(double amount) {
        // TODO Auto-generated method stub
        return false;
    }
}
