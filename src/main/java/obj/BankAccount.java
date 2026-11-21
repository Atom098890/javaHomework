package obj;

public class BankAccount {
    double balance;
    String owner;

    BankAccount(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void printBalance() {
        System.out.println("Account: " + this.owner + ", Balance: " + this.balance);
    }
}
