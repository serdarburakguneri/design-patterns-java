import java.text.MessageFormat;

public class BudgetManager extends FinanceEmployee {
  private static final double MAX_BUDGET = 10000;

  @Override
  public void approve(Payment payment) {

    if (payment.getAmount() <= MAX_BUDGET) {
      System.out.println(
          MessageFormat.format("Manager: We can afford {0}. Payment done!", payment.getAmount()));
    } else {
      administrator.approve(payment);
    }
  }
}
