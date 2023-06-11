
/**

The User class represents a user of the banking system.

It contains the user's personal information such as name, address, phone number, age, date of birth, and PIN.
*/
public class User {
private String name; // Stores the name of the user
private String address; // Stores the address of the user
private String phoneNumber; // Stores the phone number of the user
private int age; // Stores the age of the user
private String dateOfBirth; // Stores the date of birth of the user
private int pin; // Stores the PIN of the user

/**

Constructs a User object with the specified personal information.
@param name the name of the user
@param address the address of the user
@param phoneNumber the phone number of the user
@param age the age of the user
@param dateOfBirth the date of birth of the user
@param pin the PIN of the user
*/
public User(String name, String address, String phoneNumber, int age, String dateOfBirth, int pin) {
  this.name = name;
  this.address = address;
  this.phoneNumber = phoneNumber;
  this.age = age;
  this.dateOfBirth = dateOfBirth;
  this.pin = pin;
}
/**

Retrieves the name of the user.
@return the name of the user
*/
public String getName() {
  return name;
}
/**

Retrieves the address of the user.
@return the address of the user
*/
public String getAddress() {
  return address;
}
/**

Retrieves the phone number of the user.
@return the phone number of the user
*/
public String getPhoneNumber() {
  return phoneNumber;
}
/**

Retrieves the age of the user.
@return the age of the user
*/
public int getAge() {
  return age;
}
/**

Retrieves the date of birth of the user.
@return the date of birth of the user
*/
public String getDateOfBirth() {
  return dateOfBirth;
}
/**

Retrieves the PIN of the user.
@return the PIN of the user
*/
public int getPin() {
  return pin;
}
}