package models;

public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.05; // 5% interest

    public SavingsAccount(String accountNumber, double balance, Customer customer) {
        super(accountNumber, balance, customer);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }

    public void applyInterest() {
        double interest = getBalance() * INTEREST_RATE;
        setBalance(getBalance() + interest);
        System.out.println("Interest applied: $" + interest);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings (5% interest)");
    }
}
