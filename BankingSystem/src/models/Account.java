package models;

public abstract class Account {
    private String accountNumber;
    private double balance;
    private Customer customer;

    // Constructor
    public Account(String accountNumber, double balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    // Getters
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public Customer getCustomer() { return customer; }

    // Setter (protected for controlled access)
    protected void setBalance(double balance) { this.balance = balance; }

    // Abstract methods (must be implemented by child classes)
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void displayAccountType();
}
