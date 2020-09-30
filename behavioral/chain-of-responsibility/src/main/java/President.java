import java.text.MessageFormat;

public class President extends FinanceEmployee {

  @Override
  public void approve(Payment payment) {
    System.out.println(
        MessageFormat.format("President: We can afford {0}. Payment done!", payment.getAmount()));
  }
}
