package models;

public class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 1000.0;

    public CurrentAccount(String accountNumber, double balance, Customer customer) {
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
        if (amount > 0 && (getBalance() - amount) >= -OVERDRAFT_LIMIT) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Current (Overdraft up to $1000)");
    }
}
