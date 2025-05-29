package inheritance.payment;

// While inherting from an interface all the interface methods must be overridden.
public class CreditCardPaymentProcessor implements PaymentProcessor {  

  @Override
  public void authenticate(String authToken) {
    someAction();
  }

  @Override
  public void processPayment(double amount) {
    PaymentProcessor.convertToCurrency("USD", "INR", amount);
  }

  @Override
  public void sendReceipt(String email) {

  }

}
