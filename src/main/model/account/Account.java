package src.main.model.account;

import java.text.DecimalFormat;

public abstract class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name, double balance){
        checkString(id);
        checkString(name);
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
        checkString(name);
        this.name = name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return (this.getClass().getSimpleName()) + "    " +
        "\t" + this.getId() + "" +
        "\t" + this.getName() + "" +
        "\t$" + this.getBalance() + "";
    }

    public void checkString(String string){
        if (string.isBlank() || string == null){
            throw new IllegalArgumentException("CANNOT BE NULL OR BLANK");
        }
    }

    public abstract void deposit(double amount);

    public abstract boolean withdraw(double amount);

    protected double round(double amount) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        return Double.parseDouble(formatter.format(amount));
    }
 

}
