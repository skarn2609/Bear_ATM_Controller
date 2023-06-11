/**

The Card class represents a bank card.

It holds information about the card ID, associated account ID, and card type.
*/
public class Card {
private int cardId; // the unique identifier for the card
private int accountId; // the ID of the account associated with the card
private String cardType; // the type of the card

/**

Constructs a Card object with the specified card ID, account ID, and card type.
@param cardId the card ID for the card
@param accountId the account ID associated with the card
@param cardType the type of the card
*/
public Card(int cardId, int accountId, String cardType) {
  this.cardId = cardId;
  this.accountId = accountId;
  this.cardType = cardType;
}
/**

Returns the card ID of the card.
@return the card ID
*/
public int getCardId() {
  return cardId;
}
/**

Returns the account ID associated with the card.
@return the account ID
*/
public int getAccountId() {
  return accountId;
}
/**

Returns the type of the card.
@return the card type
*/
public String getCardType() {
  return cardType;
}
}