import models.*;

public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("C001", "Alice Johnson", "alice@example.com");

        // Create accounts (Polymorphism)
        Account savings = new SavingsAccount("SA001", 1000.0, customer);
        Account current = new CurrentAccount("CA001", 500.0, customer);

        // Test operations
        savings.displayAccountType();
        savings.deposit(200);
        savings.withdraw(50);
        ((SavingsAccount) savings).applyInterest(); // Cast to access subclass method
        System.out.println("Savings Balance: $" + savings.getBalance());

        current.displayAccountType();
        current.withdraw(600); // Within overdraft limit
        current.withdraw(1000); // Exceeds limit
        System.out.println("Current Balance: $" + current.getBalance());
    }
}
