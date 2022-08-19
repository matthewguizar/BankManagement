package src.main.model;

public class Transaction {
    private enum Type{WITHDRAW, DEPOSIT;}
    private Type type;
    private long timestamp;
    private String id;
    private double amount;

    public Transaction(Type type, long timestamp, String id, double amount){
        this.type = type;
        this.timestamp = timestamp;
        this.id = id;
        this.amount = amount;
    }
    public Transaction(Transaction source){
        this.type = source.type;
        this.timestamp = source.timestamp;
        this.id = source.id;
        this.amount = source.amount;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
  

}
