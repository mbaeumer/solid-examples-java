package se.mbaeumer.solidexample;

public class CreditCard extends BaseBankCard implements FraudChecker{
    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public void runFraudCheck() {

    }
}
