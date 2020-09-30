public abstract class PaymentHandler {
  protected PaymentHandler nextHandler;

  public void setNextHandler(PaymentHandler paymentHandler) {
    nextHandler = paymentHandler;
  }

  public abstract void handle(Payment payment);
}
