public class Account {
    private double balance;
    private String name ;
    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public void deposits(double amount){
        this.balance = this.balance + amount;
    }
    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }
    public String toString() {
        return this.name + " balance: " + this.balance;
    }
}
