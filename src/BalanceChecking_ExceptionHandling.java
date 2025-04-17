import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient Balance, Available: " + balance + ", You cannot withdraw : " + amount
            );
        } else {
            balance -= amount;
            System.out.println("Withdraw amount " + amount + " successful.");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}

public class BalanceChecking_ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int initialBalance = sc.nextInt();

        BankAccount account = new BankAccount(initialBalance);

        boolean running = true;

        while (running) {
            System.out.println("\n----- Options -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    int depositAmt = sc.nextInt();
                    account.deposit(depositAmt);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmt = sc.nextInt();
                    try {
                        account.withdraw(withdrawAmt);
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Exception: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Current Balance: ₹" + account.getBalance());
                    break;

                case 4:
                    running = false;
                    System.out.println("Thank you ");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}
