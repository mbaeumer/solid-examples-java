package se.mbaeumer.solidexample;

public class RewardCard implements PaymentInstrument{
    @Override
    public boolean validate() {
        return false;
    }
}
