/**

The Account class represents a bank account.

It holds information about the account number and balance.
*/
public class Account {
  private int accountNumber; // the unique identifier for the account
  private int balance; // the current balance of the account

  /**

  Constructs an Account object with the specified account number.
  The initial balance is set to 0.
  @param accountNumber the account number for the account
  */
  public Account(int accountNumber) {
    this.accountNumber = accountNumber;
    this.balance = 0;
  }
  /**

  Returns the account number of the account.
  @return the account number
  */
  public int getAccountNumber() {
    return accountNumber;
  }
  /**

  Returns the balance of the account.
  @return the balance
  */
  public int getBalance() {
    return balance;
  }
  /**

  Deposits the specified amount into the account.
  @param amount the amount to be deposited
  */
  public void deposit(int amount) {
    balance += amount;
  }
  /**

  Withdraws the specified amount from the account.
  If the balance is insufficient, an error message is displayed.
  @param amount the amount to be withdrawn
  */
  public void withdraw(int amount) {
    if (balance >= amount) {
      balance -= amount;
    } else {
      System.out.println("Insufficient balance");
    }
  }
  /**

  Transfers the specified amount from this account to the recipient account.
  If the balance is insufficient, an error message is displayed.
  @param recipient the recipient account
  @param amount the amount to be transferred
  */
  public void transfer(Account recipient, int amount) {
    if (balance >= amount) {
      balance -= amount;
      recipient.deposit(amount);
    } else {
      System.out.println("Insufficient balance");
    }
  }
}