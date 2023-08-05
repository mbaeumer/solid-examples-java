package se.mbaeumer.solidexample;

public class CreditCard extends PaymentInstrument{
    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public void runFraudCheck() {

    }
}
