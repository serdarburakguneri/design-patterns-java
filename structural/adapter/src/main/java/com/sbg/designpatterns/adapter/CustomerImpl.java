package com.sbg.designpatterns.adapter;

public class CustomerImpl implements Customer {

  private String id;
  private String name;
  private String lastName;

  public CustomerImpl(String id, String name, String lastName) {
    this.id = id;
    this.name = name;
    this.lastName = lastName;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getLastName() {
    return lastName;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
