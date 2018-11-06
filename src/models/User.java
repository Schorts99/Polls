package models;

public class User {
  String name;
  String last_name;
  String email;
  String password;

  public User(String name, String last_name, String email, String password) {
  }

  private validatesLength(String attribute, byte minLength, byte maxLength) {
    if(attribute.length() >= minLength && attribute.length() <= maxLength) return true;
    return false;
  }

  private validatesCharset(String attribute, String regex) {
    
  }
}