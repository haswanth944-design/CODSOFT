import java.util.*;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } 
        else {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("\n===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Choose option: ");
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
public class ATMInterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial Balance
        ATM atm = new ATM(account);
        atm.start();
    }
}
