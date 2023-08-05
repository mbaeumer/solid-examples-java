package se.mbaeumer.solidexample;

public class RewardCard extends PaymentInstrument{
    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public void runFraudCheck() {

    }
}
