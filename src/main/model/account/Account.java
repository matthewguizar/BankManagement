package src.main.model.account;

public abstract class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(Account account){
        this.id = account.id;
        this.name = account.name;
        this. balance = account.balance;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
