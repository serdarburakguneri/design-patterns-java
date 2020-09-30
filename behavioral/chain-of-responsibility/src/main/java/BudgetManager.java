import java.text.MessageFormat;

public class HighBudgetFinanceEmployee extends FinanceEmployee {

  @Override
  public void approve(Payment payment) {

    System.out.println(
        MessageFormat.format("Getting permissions for amount {0} ... Done!", payment.getAmount()));
  }
}
