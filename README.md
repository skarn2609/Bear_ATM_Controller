# Bear_ATM_Controller

Bear_ATM_Controller Application

The ATM Application is a simple ATM Controller that allows basic ATM Controller Operations such as Insert Card => PIN number => Select Account => See Balance/Deposit/Withdraw.
To accomodate these operations, the controller allows new users to register a new user, open a saving/checking account associated with a user, and issue new debit/credit cards. 
The ATM controller consists of several Java classes that interact with each other to provide the ATM functionality.

Classes
1. Account.java
The Account class represents a bank account. It holds information about the account number and balance.

Constructors
Account(int accountNumber): Constructs an Account object with the specified account number. The initial balance is set to 0.
Methods
int getAccountNumber(): Returns the account number of the account.
int getBalance(): Returns the balance of the account.
void deposit(int amount): Deposits the specified amount into the account.
void withdraw(int amount): Withdraws the specified amount from the account. If the balance is insufficient, an error message is displayed.
void transfer(Account recipient, int amount): Transfers the specified amount from this account to the recipient account. If the balance is insufficient, an error message is displayed.

2. Card.java
The Card class represents an ATM card (checking or debit). It holds information about the card ID, associated account ID, and card type.

Constructors
Card(int cardId, int accountId, String cardType): Constructs a Card object with the specified card ID, account ID, and card type.
Methods
int getCardId(): Returns the card ID of the card.
int getAccountId(): Returns the account ID associated with the card.
String getCardType(): Returns the type of the card.

3. User.java
The User class represents a user of the ATM. It contains the user's personal information such as name, address, phone number, age, date of birth, and PIN.

Constructors
User(String name, String address, String phoneNumber, int age, String dateOfBirth, int pin): Constructs a User object with the specified personal information.
Methods
String getName(): Retrieves the name of the user.
String getAddress(): Retrieves the address of the user.
String getPhoneNumber(): Retrieves the phone number of the user.
int getAge(): Retrieves the age of the user.
String getDateOfBirth(): Retrieves the date of birth of the user.
int getPin(): Retrieves the PIN of the user.

4. Bank.java
The Bank class represents the ATM banking system that oversees and handles operations such as user registration, account opening, and card issuance.

Constructors
Bank(): Constructs a Bank object. Initializes the data structures and counters.
Methods
int registerUser(String name, String address, String phoneNumber, int age, String dateOfBirth, int pin): Registers a new user in the bank.
int openAccount(int userId): Opens a new account for a user.
int issueCard(int accountId, String cardType): Issues a new card for an account.
Card getCard(int cardId): Retrieves a card object based on the card ID.
User getUser(int userId): Retrieves a user object based on the user ID.
Account getAccount(int accountId): Retrieves an account object based on the account ID.
5. Main.java
The Main class is the entry point of the Bank Application. It allows users to register, open accounts, and issue cards.

Methods
main(String[] args): The main method of the application where the user interaction and flow is implemented.


-------------------------------------------------------------------------------------------------------------
Getting Started

To run the ATM Application, follow these steps:

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. GIT Clone or Download Zip of this repo 
3. Compile the Java files using the Java compiler (javac)
4. Run the Main class (java) 
5. Alternatively for convenience, run the app.sh shell script:
   bash app.sh
   OR 
   ./app.sh

Usage
Upon running the application, you will be prompted to enter the necessary information to register a user, open an account, and issue a card. 
The application will display the user information, account information, and card information after the registration process.

\Make sure to provide valid inputs and follow the on-screen instructions.
