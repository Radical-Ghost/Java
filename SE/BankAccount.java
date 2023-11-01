import java.util.Scanner;

class BankAccount {
    String ownerName;
    int accountNumber;
    double balance;
    String accountType;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.\nBalance: " + balance);
        }
    }

    void display() {
        System.out.println("Owner name: " + ownerName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account type: " + accountType);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter owner name: ");
        account.ownerName = sc.nextLine();

        System.out.print("Enter account number: ");
        account.accountNumber = sc.nextInt();

        System.out.print("Enter balance: ");
        account.balance = sc.nextDouble();

        System.out.print("Enter account type (saving/current): ");
        account.accountType = sc.next();

        System.out.println("Account created successfully.");

        int choice;
        double amount;

        while (true) {
            System.out.println("Enter your choice:\n1. Deposit\n2. Withdraw\n3. Display\n4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    account.deposit(amount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    account.withdraw(amount);
                    break;
                case 3:
                    account.display();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}