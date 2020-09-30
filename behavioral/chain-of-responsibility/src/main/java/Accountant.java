import java.text.MessageFormat;

public class LowBudgetFinanceEmployee extends FinanceEmployee {
  private static final double MAX_BUDGET = 1000;

  @Override
  public void approve(Payment payment) {

    if (payment.getAmount() <= MAX_BUDGET) {
      System.out.println(
          MessageFormat.format("We can afford {0}. Payment done!", payment.getAmount()));
    } else {
      nextHandler.approve(payment);
    }
  }
}
