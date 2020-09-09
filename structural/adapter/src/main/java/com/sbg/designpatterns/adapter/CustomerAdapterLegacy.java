package com.sbg.designpatterns.adapter;

public class CustomerAdapterLegacy implements Customer {

  private CustomerLegacy customerLegacy;

  public CustomerAdapterLegacy(CustomerLegacy customerLegacy) {
    this.customerLegacy = customerLegacy;
  }

  @Override
  public String getId() {
    return customerLegacy.getId();
  }

  @Override
  public String getName() {
    return customerLegacy.getFirstName();
  }

  @Override
  public String getLastName() {
    return customerLegacy.getLastName();
  }
}
