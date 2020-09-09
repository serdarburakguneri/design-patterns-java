package com.sbg.designpatterns.adapter;

public class CustomerLegacy {

  private String id;
  private String firstName;
  private String lastName;
  private String favoriteColour;

  public CustomerLegacy(String id, String firstName, String lastName, String favoriteColour) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.favoriteColour = favoriteColour;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFavoriteColour() {
    return favoriteColour;
  }

  public void setFavoriteColour(String favoriteColour) {
    this.favoriteColour = favoriteColour;
  }
}
