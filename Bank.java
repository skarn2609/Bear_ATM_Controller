
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private Map<Integer, User> users;
    private Map<Integer, Account> accounts;
    private List<Card> cards;
    private int lastUserId;
    private int lastAccountId;
    private int lastCardId;

    /**
    * Constructs a Bank object.
    * Initializes the data structures and counters.
    */
    public Bank() {
        this.users = new HashMap<>();
        this.accounts = new HashMap<>();
        this.cards = new ArrayList<>();
        this.lastUserId = 0;
        this.lastAccountId = 0;
        this.lastCardId = 0;
    }

    /**
     * Registers a new user in the bank.
     * 
     * @param name        the name of the user
     * @param address     the address of the user
     * @param phoneNumber the phone number of the user
     * @param age         the age of the user
     * @param dateOfBirth the date of birth of the user
     * @param pin         the PIN of the user
     * @return the ID of the registered user
     */
    public int registerUser(String name, String address, String phoneNumber, int age, String dateOfBirth, int pin) {
        lastUserId++;
        User user = new User(name, address, phoneNumber, age, dateOfBirth, pin);
        users.put(lastUserId, user);
        return lastUserId;
    }

    /**
     * Opens a new account for a user.
     * 
     * @param userId the ID of the user
     * @return the ID of the opened account
     */
    public int openAccount(int userId) {
        lastAccountId++;
        Account account = new Account(lastAccountId);
        accounts.put(lastAccountId, account);
        return lastAccountId;
    }

    /**
     * Issues a new card for an account.
     * 
     * @param accountId the ID of the account
     * @param cardType  the type of the card
     * @return the ID of the issued card
     */
    public int issueCard(int accountId, String cardType) {
        lastCardId++;
        Card card = new Card(lastCardId, accountId, cardType);
        cards.add(card);
        return lastCardId;
    }

    /**
     * Retrieves a card object based on the card ID.
     * 
     * @param cardId the ID of the card
     * @return the Card object if found, null otherwise
     */
    public Card getCard(int cardId) {
        for (Card card : cards) {
            if (card.getCardId() == cardId) {
                return card;
            }
        }
        return null;
    }

    /**
     * Retrieves a user object based on the user ID.
     * 
     * @param userId the ID of the user
     * @return the User object if found, null otherwise
     */
    public User getUser(int userId) {
        return users.get(userId);
    }

    /**
     * Retrieves an account object based on the account ID.
     * 
     * @param accountId the ID of the account
     * @return the Account object if found, null otherwise
     */
    public Account getAccount(int accountId) {
        return accounts.get(accountId);
    }
}