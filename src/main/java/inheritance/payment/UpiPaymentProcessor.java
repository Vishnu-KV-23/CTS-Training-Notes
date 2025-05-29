package inheritance.payment;

public class UpiPaymentProcessor implements PaymentProcessor{

  @Override
  public void authenticate(String authToken) {
  }

  @Override
  public void processPayment(double amount) {
  }

  @Override
  public void sendReceipt(String email) {
  }

}
