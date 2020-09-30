/*

Chain of responsibility is useful when we have different implementations
of an abstract class with different responsibilities. A node in the chain
takes the responsibility and applies its business regarding to its contract.

The pattern promotes loose coupling.


*/

public class DemoApplication {
  public static void main(String[] args) {

    FinanceEmployee accountant = new Accountant();
    FinanceEmployee manager = new BudgetManager();
    FinanceEmployee president = new President();
    accountant.setAdministrator(manager);
    manager.setAdministrator(president);

    Payment payment1 = new Payment(150);
    accountant.approve(payment1);

    Payment payment2 = new Payment(1500);
    accountant.approve(payment2);

    Payment payment3 = new Payment(15000);
    accountant.approve(payment3);
  }
}
