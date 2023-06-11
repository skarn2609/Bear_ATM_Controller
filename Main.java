import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        
        System.out.println("----------------------------------------");
        System.out.println("Welcome to Bear Robotics ATM Controller");
        
        System.out.println("You Must First Register Your Account and Have Your Card Issued Before Using the ATM");
        
        System.out.println("----------------------------------------");
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your address:");
        String address = scanner.nextLine();

        System.out.println("Enter your phone number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your date of birth:");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Enter your PIN:");
        int pin = scanner.nextInt();
        scanner.nextLine();

        int userId = bank.registerUser(name, address, phoneNumber, age, dateOfBirth, pin);

        System.out.println("User registered with ID: " + userId);

        int accountId = bank.openAccount(userId);

        System.out.println("Account opened with ID: " + accountId);

        System.out.println("Select a card type (debit/credit):");
        String cardType = scanner.nextLine();

        int cardId = bank.issueCard(accountId, cardType);

        System.out.println("Card issued with ID: " + cardId);
        
        System.out.println("----------------------------------------" + "\n");
        System.out.println("Your " + cardType + " card has been successfully issued");

        System.out.println("BEAR ROBOTICS ATM" + "\n");
        System.out.println("----------------------------------------" + "\n");
        System.out.println("Insert your card into the ATM");

        System.out.println("Enter your PIN:");
        int enteredPin = scanner.nextInt();
        scanner.nextLine();

        Card card = bank.getCard(cardId);

        if (card != null) {
            if (enteredPin == bank.getUser(card.getAccountId()).getPin()) {
                Account account = bank.getAccount(card.getAccountId());

                System.out.println("Select an account (checking/saving):");
                String selectedAccount = scanner.next();

                if (selectedAccount.equalsIgnoreCase("checking")) {
                    performCheckingOperations(scanner, account, bank);
                } else if (selectedAccount.equalsIgnoreCase("saving")) {
                    performSavingOperations(scanner, account, bank);
                } else {
                    System.out.println("Invalid account selection");
                }
            } else {
                System.out.println("Invalid PIN");
            }
        } else {
            System.out.println("Invalid card");
        }
    }

    private static void performCheckingOperations(Scanner scanner, Account account, Bank bank) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    int depositAmount = scanner.nextInt();
                    scanner.nextLine();
                    account.deposit(depositAmount);
                    System.out.println("Amount deposited: $" + depositAmount);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw:");
                    int withdrawAmount = scanner.nextInt();
                    scanner.nextLine();
                    account.withdraw(withdrawAmount);
                    System.out.println("Amount withdrawn: $" + withdrawAmount);
                    break;
                case 4:
                    System.out.println("Enter the recipient account number:");
                    int recipientAccountId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the amount to transfer:");
                    int transferAmount = scanner.nextInt();
                    scanner.nextLine();
                    Account recipientAccount = bank.getAccount(recipientAccountId);
                    if (recipientAccount != null) {
                        account.transfer(recipientAccount, transferAmount);
                        System.out.println("Amount transferred: $" + transferAmount);
                    } else {
                        System.out.println("Invalid recipient account");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private static void performSavingOperations(Scanner scanner, Account account, Bank bank) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    int depositAmount = scanner.nextInt();
                    scanner.nextLine();
                    account.deposit(depositAmount);
                    System.out.println("Amount deposited");
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw:");
                    int withdrawAmount = scanner.nextInt();
                    scanner.nextLine();
                    account.withdraw(withdrawAmount);
                    System.out.println("Amount withdrawn");
                    break;
                case 4:
                    System.out.println("Enter the recipient account number:");
                    int recipientAccountId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the amount to transfer:");
                    int transferAmount = scanner.nextInt();
                    scanner.nextLine();
                    Account recipientAccount = bank.getAccount(recipientAccountId);
                    if (recipientAccount != null) {
                        account.transfer(recipientAccount, transferAmount);
                        System.out.println("Amount transferred");
                    } else {
                        System.out.println("Invalid recipient account");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
