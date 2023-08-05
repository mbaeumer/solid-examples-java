package se.mbaeumer.solidexample;

public class DebitCard extends BaseBankCard implements FraudChecker{
    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public void runFraudCheck() {

    }
}
