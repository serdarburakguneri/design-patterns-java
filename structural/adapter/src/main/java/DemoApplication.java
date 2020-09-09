/*
Adapter pattern is useful for converting objects to desired contracts (interfaces)

This example demonstrates using a Customer object of a legacy system with the new one.
*/

import com.sbg.designpatterns.adapter.Customer;
import com.sbg.designpatterns.adapter.CustomerAdapterLegacy;
import com.sbg.designpatterns.adapter.CustomerImpl;
import com.sbg.designpatterns.adapter.CustomerLegacy;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class DemoApplication {
  public static void main(String[] args) throws CloneNotSupportedException {

    Customer newCustomer = new CustomerImpl("2002", "Fernando", "Muslera");

    CustomerLegacy oldCustomer = new CustomerLegacy("100", "Harry", "Kewell", "Yellow");

    List<Customer> customerList = new ArrayList<>();
    customerList.add(newCustomer);
    customerList.add(new CustomerAdapterLegacy(oldCustomer));

    customerList.forEach(
        c ->
            System.out.println(
                MessageFormat.format(
                    "Customer id: {0}, Customer Name: {1}, Customer Last Name: {2}",
                    c.getId(), c.getName(), c.getLastName())));
  }
}
