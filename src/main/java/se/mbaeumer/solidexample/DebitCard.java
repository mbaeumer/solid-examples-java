package se.mbaeumer.solidexample;

public class DebitCard extends PaymentInstrument{
    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public void runFraudCheck() {

    }
}
