public abstract class FinanceEmployee {
  protected FinanceEmployee administrator;

  public void setAdministrator(FinanceEmployee financeEmployee) {
    administrator = financeEmployee;
  }

  public abstract void approve(Payment payment);
}
